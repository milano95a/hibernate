package com.aj.Hibernate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

/**
 * Created by AB on 27-Jul-17.
 */

@Entity
public class Question {

    @Id
    @GeneratedValue
    @Column(name = "QUESTION_ID")
    private Integer questionId;

    private String question;

//    @OneToMany(mappedBy = "question")
//    @JsonBackReference
//    private List<Answer> answer;

    @ManyToMany
    @JoinTable(name = "QUESTION_ANSWERS",
                joinColumns = {@JoinColumn(name = "QUESTION_ID")},
                inverseJoinColumns = {@JoinColumn(name = "ANSWER_ID")})
    @JsonBackReference
    private List<Answer> answer;

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }
}
