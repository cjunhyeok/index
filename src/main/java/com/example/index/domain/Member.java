package com.example.index.domain;

import com.example.index.BaseEntity;
import com.example.index.domain.enums.RegionType;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @Column(unique = true)
    private String username; // 사용자 Id, 중복금지
    private String password; // 비밀번호
    private String nickname; // 닉네임, 중복금지
    private String role; // 사용자 권한

    //== 선택 사항 == //
    private String number; // 전화번호
    @Enumerated(EnumType.STRING)
    private RegionType region; // 지역

    @Builder
    public Member(String username, String password, String nickname, String role, String number, RegionType region) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.role = role;
        this.number = number;
        this.region = region;
    }
}
