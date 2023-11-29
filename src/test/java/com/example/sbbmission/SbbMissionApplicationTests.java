package com.example.sbbmission;

import com.example.sbbmission.answer.AnswerRepository;
import com.example.sbbmission.question.QuestionRepository;
import com.example.sbbmission.question.QuestionService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbbMissionApplicationTests {
    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private QuestionService questionService;

    @Test
    @DisplayName("300개 추가")
    void t1(){
        for (int i = 0; i < 300; i++) {
            String subject = String.format("테스트 데이터입니다:[%03d]",i);
            String content = "내용무";
            this.questionService.create(subject,content,null);
        }
    }

    //    @Test
//    void createQuestion() {
//        Question q1 = new Question();
//        q1.setSubject("sbb가 무엇인가요?");
//        q1.setContent("sbb에 대해서 알고 싶습니다.");
//        q1.setCreateDate(LocalDateTime.now());
//        this.questionRepository.save(q1);
//
//        Question q2 = new Question();
//        q2.setSubject("스프링부트 모델 질문입니다.");
//        q2.setContent("id는 자동으로 생성되나요?");
//        q2.setCreateDate(LocalDateTime.now());
//        ;
//        this.questionRepository.save(q2);
//    }
//
//    @Test
//    void findAll() {
//        List<Question> all = this.questionRepository.findAll();
//        assertEquals(2,all.size());
//
//        Question q = all.get(0);
//        assertEquals("sbb가 무엇인가요?", q.getSubject());
//    }
//
//    @Test
//    void findById() {
//        Optional<Question> oq = this.questionRepository.findById(1);
//        if(oq.isPresent()){
//            Question q = oq.get();
//            assertEquals("sbb가 무엇인가요?",q.getSubject());
//        }
//    }
//
//    @Test
//    void findBySubject() {
//        Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
//        assertEquals(1,q.getId());
//    }
//
//    @Test
//    void findBySubjectLike() {
//        List<Question> qList = this.questionRepository.findBySubjectLike("sbb%");
//        Question q = qList.get(0);
//        assertEquals("sbb가 무엇인가요?",q.getSubject());
//    }
//
//    @Test
//    void delete() {
//        Optional<Question> oq = this.questionRepository.findById(1);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//        this.questionRepository.delete(q);
//        assertEquals(1,this.questionRepository.count());
//    }
//
//    @Test
//    void createAnswer(){
//        Optional<Question> oq = this.questionRepository.findById(2);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//
//        Answer a = new Answer();
//        a.setContent("네 자동으로 생성됩니다.");
//        a.setQuestion(q); //외래키로 사용하는 Question객체
//        a.setCreateDate(LocalDateTime.now());
//        this.answerRepository.save(a);
//    }
//
//    @Test
//    void findAnswer(){
//        Optional<Answer> oa = this.answerRepository.findById(1);
//        assertTrue(oa.isPresent());
//        Answer a = oa.get();
//        assertEquals(2,a.getQuestion().getId());
//    }
//
//    @Test
//    @Transactional
//    void answerAboutQuestion() {
//        Optional<Question> oq = this.questionRepository.findById(2);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//
//        List<Answer> answerList = q.getAnswerList();
//
//        assertEquals(1, answerList.size());
//        assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
//    }
}
