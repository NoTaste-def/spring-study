package com.ll.cicd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    // mappedBy는 참조 엔티티의 속성명을 정의한다.
    // Answer 엔티티에서 Question 엔티티를 참조한 속성인 question을 mappedBy에 전달해야 한다.
    private List<Answer> answerList;
}
