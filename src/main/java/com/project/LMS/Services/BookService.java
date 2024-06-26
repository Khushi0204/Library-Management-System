package com.project.LMS.Services;

import com.project.LMS.Models.Book;
import com.project.LMS.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> getBookByStudentId(Integer studentId){
        return this.bookRepository.findByStudentId(studentId);
    }
}
