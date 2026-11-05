package com.spring.spring_demo.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.spring_demo.Student;

@RestController
public class SampleRestController {

private Student myStudent;
private Student anotherStudent;

// public SampleRestController(Student theStudent){
//         myStudent= theStudent;
// }

// @Autowired 
// public void setStudent(@Qualifier("universityStudent")Student student, @Qualifier("universityStudent") Student student_two){
//     myStudent = student;
//     anotherStudent = student_two;
// }

    public SampleRestController(@Qualifier("elementaryStudent")Student student){
        myStudent = student;
    }

    @GetMapping ("/assignment")
    public String getAssignment(){
        return myStudent.getDailyAssignment();
    }

    @GetMapping ("/check")
    public String checkScope(){
        return "myStudent == anotherStudent? " + (myStudent == anotherStudent);
    }
}
