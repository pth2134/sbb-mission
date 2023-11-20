package com.example.sbbmission.answer;

import com.example.sbbmission.question.Question;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; //Integer는 null이 가능

    @Column(columnDefinition = "TEXT")
    private String content;

    @CreatedDate
    private LocalDateTime createDate;

    @ManyToOne
    private Question question; //외래키 역할
    //answer를 등록하면 question의 키를 가지는 row가 생성됨
    //외래키를 관리하는 쪽 즉,Answer가 연관관계의 주인
}
