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

	@RequestMapping("/login")
	public String login(Member member, Model model) throws Exception {
		log.info("login");
		model.addAttribute("check", service.check(member));
		return "member/result";
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

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void list(Model model) throws Exception {
		log.info("list");
		model.addAttribute("list", service.list());
	}

	// u
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modifyForm(Member member, Model model) throws Exception {
		log.info("modifyForm");
		model.addAttribute(service.read(member.getNo()));
	}

	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modify(Member member, Model model) throws Exception {
		log.info("modify");
		service.modify(member);
		model.addAttribute("msg", "수정이 완료되었습니다.");
		return "member/result";
	}

	// d
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove(Member member, Model model) throws Exception {
		log.info("remove");
		service.remove(member.getNo());
		model.addAttribute("msg", "삭제가 완료되었습니다.");
		return "member/result";
	}
}
