package com.aj.Hibernate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

/**
 * Created by AB on 27-Jul-17.
 */

@Entity
public class Answer {

    @Id
    @GeneratedValue
    @Column(name = "ANSWER_ID")
    private Integer answerId;

    private String answer;

    @ManyToMany(mappedBy = "answer")
    private List<Question> question;

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

//    public Question getQuestion() {
//        return question;
//    }
//
//    public void setQuestion(Question question) {
//        this.question = question;
//    }


    public List<Question> getQuestion() {
        return question;
    }

    public void setQuestion(List<Question> question) {
        this.question = question;
    }
}
