package com.project.LMS.dtos;

import com.project.LMS.Models.Book;
import com.project.LMS.Models.Student;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetStudentDetailsResponse {

    private Student student;

    private List<Book> bookList;
}
