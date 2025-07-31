package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import io.swagger.v3.oas.annotations.Parameter;

@SpringBootApplication
public class Uno9Application {

	public static void main(String[] args) {
		SpringApplication.run(Uno9Application.class, args);
	}

}

@RestController
class RC
{
	
	@Operation(summary = "Get item by ID", description = "Retrieve an item using its unique ID")
    @GetMapping("hi/{x}")
	public String hello(
			 @Parameter(description = "ID of the item to retrieve", example = "123") 
			@PathVariable int x)
	{
		return "hello";
	}
	
	@Operation(summary = "Get item by ID", description = "Retrieve an item using its unique ID")
	 @ApiResponses(value = {
		        @ApiResponse(responseCode = "200", description = "Item found")
	 })
	@GetMapping("hello")
	public String hello2(
			 @Parameter(description = "name of person", example = "prachi") 
			@RequestParam String name)
	{
		return "hello"+name;
	}
}