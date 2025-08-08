package com.wipro.radhi.quizapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.radhi.quizapp.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
