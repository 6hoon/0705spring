package com.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.member.dao.MemberDAO;
import com.member.domain.Member;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	public MemberDAO dao;

	@Override
	public void register(Member member) throws Exception {
		dao.create(member);
	}

	@Override
	public Member read(Integer no) throws Exception {
		return dao.read(no);
	}

	@Override
	public void modify(Member member) throws Exception {
		dao.update(member);
	}

	@Override
	public void remove(Integer no) throws Exception {
		dao.delete(no);
	}

}
