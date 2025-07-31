package com.example.demo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class GreetingControllerTest {

    @Mock
    private GreetingService greetingService;

    @InjectMocks
    private GreetingController greetingController;

    @BeforeAll
    static void initAll() {
        System.out.println("Running setup before all tests");
    }

    @BeforeEach
    void init() {
        // Can include per-test setup here if needed
    }

    @Test
    void shouldReturnGreetingForGivenName() {
        // Given
        String name = "Alice";
        String expectedGreeting = "Hello, Alice!";
        given(greetingService.greet(name)).willReturn(expectedGreeting);

        // When
        String result = greetingController.greet(name);

        // Then
        assertThat(result).isEqualTo(expectedGreeting);
    }

    @Test
    void shouldReturnGreetingForDefaultName() {
        // Given
        String defaultName = "World";
        given(greetingService.greet(defaultName)).willReturn("Hello, World!");

        // When
        String result = greetingController.greet(defaultName);

        // Then
        assertThat(result).isEqualTo("Hello, World!");
    }
}
