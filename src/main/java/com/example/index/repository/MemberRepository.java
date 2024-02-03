package com.example.index.repository;

import com.example.index.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findByUsername(String username);
    Member findByNickname(String nickname);
}
