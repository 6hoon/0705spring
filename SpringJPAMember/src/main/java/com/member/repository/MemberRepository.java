package com.member.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.member.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {
	Member findByIdAndPasswd(String id, String passwd);

}
