package com.project.LMS.Services;

import com.project.LMS.Models.Book;
import com.project.LMS.Models.Student;
import com.project.LMS.Repositories.BookRepository;
import com.project.LMS.Repositories.StudentRepository;
import com.project.LMS.dtos.GetStudentDetailsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    BookRepository bookRepository;

    public GetStudentDetailsResponse getStudentDetails(Integer studentId, boolean requireBookList){
        Student student= this.studentRepository.findById(studentId).orElse(null);
        List<Book> bookList= null;
        if(requireBookList){
            bookList = this.bookRepository.findByStudentId(studentId);
        }

        this.studentRepository.save(Student.builder().build());

        return GetStudentDetailsResponse.builder()
                .student(student)
                .bookList(bookList)
                .build();
    }
}

