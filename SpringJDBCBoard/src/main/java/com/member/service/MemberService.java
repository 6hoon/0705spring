package com.member.service;

import com.member.domain.Member;

public interface MemberService {

	// c
	public void register(Member member) throws Exception;

	// r
	public Member read(Integer no) throws Exception;

	// u
	public void modify(Member member) throws Exception;

	// d
	public void remove(Integer no) throws Exception;

}
