package com.example.sbbmission;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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

    private LocalDateTime createDate;

    @ManyToOne
    private Question question;
    //answer를 등록하면 question의 키를 가지는 row가 생성됨
    //answer 테이블에 데이터가 추가,삭제 되는지에 따라 question의 list가 변함
    //즉, answer가 연관관계의 주인임
}
