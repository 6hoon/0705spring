package com.member.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.member.domain.Member;
import com.member.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberRepository repo;

	@Override
	@Transactional
	public void register(Member member) throws Exception {
		repo.save(member);
	}

	@Override
	@Transactional(readOnly = true)
	public Member read(Integer no) throws Exception {
		return repo.getOne(no);
	}

	@Override
	@Transactional
	public void modify(Member member) throws Exception {
		Member memberEntity = repo.getOne(member.getNo());
		memberEntity.setPasswd(member.getPasswd());
		memberEntity.setAge(member.getAge());
	}

	@Override
	@Transactional
	public void remove(Integer no) throws Exception {
		repo.deleteById(no);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Member> list() throws Exception {
		return repo.findAll(Sort.by(Direction.DESC, "no"));
	}

	@Override
	public int check(Member member) throws Exception {
		int flag = 0;
		Member check = repo.findByIdAndPasswd(member.getId(), member.getPasswd());
		if (check != null) {
			flag = 1;
		}
		return flag;
	}

}
