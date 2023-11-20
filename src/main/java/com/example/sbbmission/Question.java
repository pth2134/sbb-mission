package com.example.sbbmission;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Question {
    @Id //키 선언 index처리?
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //전략 : db에게 맡긴다.
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;
}
