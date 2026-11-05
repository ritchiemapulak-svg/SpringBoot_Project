package com.spring.spring_demo;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;

@Component
@Lazy
public class JuniorHighStudent implements Student {

        public JuniorHighStudent(){
            System.out.println("In constructor: " + getClass().getSimpleName());
        }
         @Override
        public String getDailyAssignment(){
            return "Have to complete junior high school";
        }

}
