package com.zeus.controller;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zeus.domain.Member;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
//@RequestMapping(value = "/member") // -> folder로 묶어 작업도 가능 -> (views 에 member folder로)
public class BackupMemberController {
	// 해당 페이지에 대한 컨트롤러 는 해당파트 사람이 꼭 만들어 줘야함 -> 침범 X
	// 해당 페이지에 대한 컨트롤러 는 해당파트 사람이 꼭 만들어 줘야함 -> 침범 X

	// Member 메인페이지를 등록할것!
	@RequestMapping(value = "/registerForm00", method = RequestMethod.GET)
	public String registerForm() {
		log.info("registerForm()");
		return "registerForm";
	}

	@RequestMapping(value = "/register1", method = RequestMethod.POST)
	public String register1(String userId, String password, @DateTimeFormat(pattern = "yyyy/mm/dd") Date dateOfBirth,
			Model model) {
		log.info("register()");
		model.addAttribute("userId", userId);
		model.addAttribute("password", password);
		model.addAttribute("dateOfBirth", dateOfBirth);
		return "success";
	}

	@RequestMapping(value = "/register00", method = RequestMethod.POST)
	public String register(Member member, Model model) {
		log.info("register()");
//			model.addAttribute("userId", userId);
//			model.addAttribute("password", password);
//			model.addAttribute("dateOfBirth", dateOfBirth);
		return "success";
	}

	@RequestMapping(value = "/register/{userId}", method = RequestMethod.GET)
	public String registerByPath(@PathVariable("userId") String userId, Model model) {
		log.info("registerByPath");
		log.info("userId = " + userId);
		model.addAttribute("userId", userId);
		return "success";
	}

	// 1. 하나씩 받기
	@RequestMapping(value = "/register01", method = RequestMethod.POST)
	public String register01(String userId, String password, int coin, Model model) {
		log.info("register01");
		log.info("userId = " + userId);
		model.addAttribute("userId", userId);
		model.addAttribute("password", password);
		model.addAttribute("coin", coin);
		return "success";
	}

	// 2. Member 로 받기
	@RequestMapping(value = "/register02", method = RequestMethod.POST)
	public String register02(Member member, int coin, Model model) {
		log.info("register01");
		log.info("userId = " + member.getUserId());
		member.setUserId("200"); // 받아온 값을 바꿀 수도 있음
		// model.addAttribute("userId", member.getUserId());
		// model.addAttribute("password", member.getPassword());
		// 기본 타입이 아닌 빈즈(Member 는 그냥 넘어감)
		model.addAttribute("member", member); // -> 빈즈는 안 써줘도 넘어감
		model.addAttribute("coin", coin);
		return "success";
	}

	// 3. RequestParam 으로 coinNum 으로 데이터 처리 가능
	@RequestMapping(value = "/register03", method = RequestMethod.POST)
	public String register03(Member member, @RequestParam("coin") int coinNum, Model model) {
		log.info("register03");
		log.info("userId = " + member.getUserId());
		model.addAttribute("member", member); // -> 빈즈는 안 써줘도 넘어감
		model.addAttribute("coin", coinNum);
		return "success";
	}
}
