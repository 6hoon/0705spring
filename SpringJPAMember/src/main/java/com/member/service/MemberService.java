package com.member.service;

import java.util.List;

import com.member.domain.Member;

public interface MemberService {
	// create
	public void register(Member member) throws Exception;

	// read : key 값의 경우 repository에 맞춰 가야함
	public Member read(Integer no) throws Exception;

	// update
	public void modify(Member member) throws Exception;

	// delete
	public void remove(Integer no) throws Exception;

	// list 전체글
	public List<Member> list() throws Exception;

	// login 체크
	public int check(Member member) throws Exception;
}
