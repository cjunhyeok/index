package com.example.index.repository;

import com.example.index.domain.Member;
import com.example.index.domain.Post;
import com.example.index.domain.enums.IndependentPostType;
import com.example.index.domain.enums.RegionPostType;
import com.example.index.domain.enums.RegionType;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootTest
public class PostRepositoryTest {
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private MemberRepository memberRepository;
    @PersistenceContext
    EntityManager em;

    @Test
    @Rollback(value = false)
    void saveTest() {
//        for (int i = 0; i < 100; i++) {
//            Member member = Member
//                    .builder()
//                    .username("username" + i)
//                    .password("pass")
//                    .nickname("nickname" + i)
//                    .role("role")
//                    .number("number")
//                    .region(RegionType.SEOUL)
//                    .build();
//
//            Member savedMember = memberRepository.save(member);
//
//            for (int j = 0; j < 100; j++) {
//                Post post = Post.builder()
//                        .title("title" + j)
//                        .views(i)
//                        .content("content" + j)
//                        .independentPostType(IndependentPostType.COOK)
//                        .member(savedMember)
//                        .createdDate(LocalDateTime.now().plusSeconds(Integer.toUnsignedLong(j)))
//                        .build();
//
//                postRepository.save(post);
//            }
//
//            for (int j = 100; j < 200; j++) {
//                Post post = Post.builder()
//                        .title("title" + j)
//                        .views(i)
//                        .content("content" + j)
//                        .independentPostType(IndependentPostType.CLEAN)
//                        .member(savedMember)
//                        .createdDate(LocalDateTime.now().plusSeconds(Integer.toUnsignedLong(j)))
//                        .build();
//
//                postRepository.save(post);
//            }
//
//            for (int j = 200; j < 300; j++) {
//                Post post = Post.builder()
//                        .title("title" + j)
//                        .views(i)
//                        .content("content" + j)
//                        .independentPostType(IndependentPostType.HEALTH)
//                        .member(savedMember)
//                        .createdDate(LocalDateTime.now().plusSeconds(Integer.toUnsignedLong(j)))
//                        .build();
//
//                postRepository.save(post);
//            }
//
//            for (int j = 300; j < 400; j++) {
//                Post post = Post.builder()
//                        .title("title" + j)
//                        .views(i)
//                        .content("content" + j)
//                        .regionType(RegionType.ALL)
//                        .regionPostType(RegionPostType.FREE)
//                        .member(savedMember)
//                        .createdDate(LocalDateTime.now().plusSeconds(Integer.toUnsignedLong(j)))
//                        .build();
//
//                postRepository.save(post);
//            }
//
//            for (int j = 400; j < 500; j++) {
//                Post post = Post.builder()
//                        .title("title" + j)
//                        .views(i)
//                        .content("content" + j)
//                        .regionType(RegionType.PUSAN)
//                        .regionPostType(RegionPostType.RESTAURANT)
//                        .member(savedMember)
//                        .createdDate(LocalDateTime.now().plusSeconds(Integer.toUnsignedLong(j)))
//                        .build();
//
//                postRepository.save(post);
//            }
//
//            for (int j = 500; j < 600; j++) {
//                Post post = Post.builder()
//                        .title("title" + j)
//                        .views(i)
//                        .content("content" + j)
//                        .regionType(RegionType.ULSAN)
//                        .regionPostType(RegionPostType.MARKET)
//                        .member(savedMember)
//                        .createdDate(LocalDateTime.now().plusSeconds(Integer.toUnsignedLong(j)))
//                        .build();
//
//                postRepository.save(post);
//            }
//
//            for (int j = 600; j < 700; j++) {
//                Post post = Post.builder()
//                        .title("title" + j)
//                        .views(i)
//                        .content("content" + j)
//                        .regionType(RegionType.SEOUL)
//                        .regionPostType(RegionPostType.MEET)
//                        .member(savedMember)
//                        .createdDate(LocalDateTime.now().plusSeconds(Integer.toUnsignedLong(j)))
//                        .build();
//
//                postRepository.save(post);
//            }
//
//            for (int j = 700; j < 800; j++) {
//                Post post = Post.builder()
//                        .title("title" + j)
//                        .views(i)
//                        .content("content" + j)
//                        .regionType(RegionType.KYEONGNAM)
//                        .regionPostType(RegionPostType.PLAY)
//                        .member(savedMember)
//                        .createdDate(LocalDateTime.now().plusSeconds(Integer.toUnsignedLong(j)))
//                        .build();
//
//                postRepository.save(post);
//            }
//
//            for (int j = 800; j < 900; j++) {
//                Post post = Post.builder()
//                        .title("title" + j)
//                        .views(i)
//                        .content("content" + j)
//                        .regionType(RegionType.ULSAN)
//                        .regionPostType(RegionPostType.TALK)
//                        .member(savedMember)
//                        .createdDate(LocalDateTime.now().plusSeconds(Integer.toUnsignedLong(j)))
//                        .build();
//
//                postRepository.save(post);
//            }
//
//            for (int j = 900; j < 1000; j++) {
//                Post post = Post.builder()
//                        .title("title" + j)
//                        .views(i)
//                        .content("content" + j)
//                        .regionType(RegionType.PUSAN)
//                        .regionPostType(RegionPostType.FREE)
//                        .member(savedMember)
//                        .createdDate(LocalDateTime.now().plusSeconds(Integer.toUnsignedLong(j)))
//                        .build();
//
//                postRepository.save(post);
//            }
//        }
    }

    @Test
    @Rollback(value = false)
    void indexTest() {

        LocalDateTime now = LocalDateTime.now();
        // 어제
        LocalDateTime yesterday = now.minus(1, ChronoUnit.DAYS);
        // 오늘
        LocalDateTime today = now;

        long startTime = System.currentTimeMillis();
        em.createQuery("select p from Post p" +
                        " where p.createdDate BETWEEN :yesterday AND :today" +
                        " order by p.views DESC", Post.class)
                .setFirstResult(0)
                .setMaxResults(10)
                .setParameter("yesterday", yesterday)
                .setParameter("today", today)
                .getResultList();

        long endTime = System.currentTimeMillis();
        System.out.println("인덱스 적용 전 경과시간 : " + (endTime - startTime));
    }
}
