package com.project.LMS.Controllers;


import com.project.LMS.Services.StudentService;
import com.project.LMS.dtos.GetStudentDetailsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/{studentId}")
    public GetStudentDetailsResponse getStudentDetails(
            @PathVariable("studentId") int studentId,
            @RequestParam(value = "require-book-list",required= false, defaultValue = "false") boolean requireBookList){
            return  this.studentService.getStudentDetails(studentId, requireBookList);
    }

}
