package com.project.LMS.Repositories;

import com.project.LMS.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findByStudentId(int studentId);
}
