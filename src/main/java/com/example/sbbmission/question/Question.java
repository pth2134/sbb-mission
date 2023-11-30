package com.example.sbbmission.question;

import com.example.sbbmission.answer.Answer;
import com.example.sbbmission.user.SiteUser;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

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

    @OneToMany(mappedBy = "question",cascade = CascadeType.REMOVE)
    //mappedBy = 누구의 키를 외래키로 사용할지 + Question에서는 관계를 관리하지 않겠다.(Question Table에는 Answer가 없음)
    private List<Answer> answerList;

    @ManyToOne
    private SiteUser author;

    private LocalDateTime modifyDate;

    @ManyToMany
    Set<SiteUser> voter;
}
