package com.zeus.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zeus.domain.Member;

import lombok.extern.java.Log;

@Log
@Controller
public class BackupController {

	@RequestMapping(value = "/home2", method = RequestMethod.GET)
	public String home2(Member member, Model model) {
		member.setUserName("홍길동");
		member.setPassword("123456");
		member.setUserId("qwer1234");
		model.addAttribute("mem", member);
		return "home2";
	}

	@RequestMapping(value = "/home3", method = RequestMethod.GET)
	public String home3(Locale locale, Model model) {
		System.out.println("환영합니다. 여기는 " + locale + " 입니다.");
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 (E) a h시 m분 s초");
		String formattedNow = now.format(formatter);
		model.addAttribute("serverTime", formattedNow);
		return "home3";
	}
}
