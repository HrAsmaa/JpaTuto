package com.tuto.jpa;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {


    @Modifying
    @Transactional
     @Query("update Author set age =:age where id =:id")
     void updateAuthorAge(int age, int id);

     List<Author> findByFirstName(String name);

     List<Author> findByFirstNameIgnoreCase(String name);
}
