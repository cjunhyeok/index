package com.example.index.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

@SpringBootTest
public class MemberRepositoryTest {
    @Autowired
    private MemberRepository memberRepository;
    @PersistenceContext
    EntityManager em;

    @Test
    @Rollback(value = false)
    void saveData() {

//        for (int i = 0; i < 100000; i++) {
//            Member member = Member
//                    .builder()
//                    .username("username" + i)
//                    .password("pass")
//                    .nickname("nickname" + i)
//                    .role("role")
//                    .number("number")
//                    .region(RegionType.SEOUL)
//                    .build();
//            memberRepository.save(member);
//        }

        long startTime = System.currentTimeMillis();
        memberRepository.findByNickname("nickname1234");
        long endTime = System.currentTimeMillis();
        System.out.println("인덱스 적용 전 경과시간 : " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        memberRepository.findByUsername("username1925");
        endTime = System.currentTimeMillis();
        System.out.println("인덱스 적용 후 경과시간 : " + (endTime - startTime));
    }
}
