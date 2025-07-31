package com.entity.onetomany;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepositary extends JpaRepository<Book, Integer>{

}
