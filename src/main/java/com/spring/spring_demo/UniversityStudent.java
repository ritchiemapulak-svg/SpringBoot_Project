package com.spring.spring_demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class UniversityStudent implements Student {

        public UniversityStudent(){
            System.out.println("In constructor: " + getClass().getSimpleName());
        }

        @Override
        public String getDailyAssignment(){
            return "Its hard to study all day long.";
        }
}
