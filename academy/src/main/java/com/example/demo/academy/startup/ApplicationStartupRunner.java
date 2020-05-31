package com.example.demo.academy.startup;

import com.example.demo.academy.domain.Coach;
import com.example.demo.academy.domain.Student;
import com.example.demo.academy.repository.CoachRepository;
import com.example.demo.academy.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@RequiredArgsConstructor
@Component
public class ApplicationStartupRunner implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;
    @Autowired
    CoachRepository coachRepository;

    @Override
    public void run(String... args) throws Exception {
        final String studentUserId = "testStudentUser@programmerworld.onmicrosoft.com";
        final String coachUsername = "testCoachUser@programmerworld.onmicrosoft.com";
        createStudent(studentUserId);
        createCoach(coachUsername);

    }

    private void createCoach(String coachUsername) {
        Coach coach = Coach.builder()
                .username(coachUsername)
                .build();
        coachRepository.save(coach);

    }

    private void createStudent(String studentUserId) {
        Student student = Student.builder()
                .userId(studentUserId)
                .build();
        studentRepository.save(student);

    }
}
