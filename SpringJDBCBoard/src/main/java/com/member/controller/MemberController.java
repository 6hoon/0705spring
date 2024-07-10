package com.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.member.domain.Member;
import com.member.service.MemberService;

import lombok.extern.java.Log;

@Log
@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberService service;

	@RequestMapping("/main")
	public String mainForm(Member member, Model model) throws Exception {
		log.info("main");
		return "member/main";
	}

	// c
	@RequestMapping(value = "/registerForm", method = RequestMethod.GET)
	public String registerForm(Member member, Model model) throws Exception {
		log.info("registerForm");
		return "member/register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(Member member, Model model) throws Exception {
		log.info("register");
		service.register(member);
		model.addAttribute("check", "가입 완료");
		return "member/result";
	}

	// r
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(Member member, Model model) throws Exception {
		log.info("read");
		model.addAttribute(service.read(member.getNo()));
	}

	// u

	// d

}
