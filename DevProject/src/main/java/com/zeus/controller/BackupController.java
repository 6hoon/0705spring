package com.zeus.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zeus.domain.Address;
import com.zeus.domain.Card;
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

	@GetMapping("/home4")
	public String home4(Model model) {
		String[] hobbyArray = { "독서", "자전거", "배드민턴" };
		model.addAttribute("hobbyArray", hobbyArray);

		List<String> hobbyList = Arrays.asList("독서1", "자전거1", "배드민턴1");
		model.addAttribute("hobbyList", hobbyList);

		String[] carArray = { "소나타", "아반테", "그랜저" };
		model.addAttribute("carArray", carArray);

		List<String> carList = Arrays.asList("소나타1", "아반테1", "그랜저1");
		model.addAttribute("carList", carList);

		return "home4";
	}

	@GetMapping("/home0101")
	public String home0101(Model model) {
		Member member = new Member();
		member.setUserId("hongkd");
		member.setPassword("1234");
		member.setEmail("bbb@ccc.com");
		member.setUserName("홍길동");

		LocalDate dateOfBirth = LocalDate.of(1988, 10, 7);
//		member.setDateOfBirth(dateOfBirth);

		model.addAttribute(member);
		return "home0101";
	}

	@GetMapping("/home0102")
	public String home0102(Model model) {
		Member member = new Member();
		String[] hobbyArray = { "Music", "Movie" };

		member.setHobbyArray(hobbyArray);
		List<String> hobbyList = new ArrayList<String>();
		hobbyList.add("Music");
		hobbyList.add("Movie");
		member.setHobbyList(hobbyList);
		model.addAttribute(member);
		return "home0102";
	}

	@GetMapping("/home0103")
	public String home0103(Model model) {
		Member member = new Member();
		Address address = new Address();
		address.setPostCode("080908");
		address.setLocation("seoul");
		member.setAddress(address);

		model.addAttribute(member);
		return "home0103";
	}

	@GetMapping("/home0104")
	public String home0104(Model model) {
		Member member = new Member();
		List<Card> cardList = new ArrayList<Card>();

		Card card1 = new Card();
		card1.setNo("123456");
		YearMonth validMonth = YearMonth.of(2020, 9);
//		card1.setValidMonth(validMonth);
		cardList.add(card1);

		Card card2 = new Card();
		card2.setNo("456789");
		YearMonth validMonth2 = YearMonth.of(2022, 11);
//		card2.setValidMonth(validMonth2);
		cardList.add(card2);

		member.setCardList(cardList);

		model.addAttribute(member);

		return "home0104";
	}

	@GetMapping("/home0105")
	public String home0105(Model model) {
		Map memberMap = new HashMap();

		memberMap.put("userId", "hongkd");
		memberMap.put("password", "1234");
		memberMap.put("email", "bbb@ccc.com");
		memberMap.put("userName", "홍길동");

		LocalDate dateOfBirth = LocalDate.of(1988, 10, 7);
		memberMap.put("dateOfBirth", dateOfBirth);

		model.addAttribute("memberMap", memberMap);
		return "home0105";
	}

	@GetMapping("/home0201")
	public String home0201(Model model) {
		int coin = 1000;
		model.addAttribute("coin", coin);
		return "home0201";
	}

	@GetMapping("/home0202")
	public String home0202(Model model) {
		int coin = 1000;
		model.addAttribute("coin", coin);
		return "home0202";
	}

	@GetMapping("/home0203")
	public String home0203(Model model) {
		String userId = "hongkd";
		model.addAttribute("userId", userId);
		return "home0203";
	}

	@GetMapping("/home0301")
	public String home0301(Model model) {
		return "home0301";
	}

	@GetMapping("/home0302")
	public String home0302(Model model) {
		Member member = new Member();
		model.addAttribute(member);
		return "home0302";
	}

	@GetMapping("/home0303")
	public String home0303(Model model) {
		Member member = new Member();
		member.setUserId("");
		model.addAttribute(member);
		return "home0303";
	}

	@GetMapping("/home0304")
	public String home0304(Model model) {
		Member member = new Member();
		member.setUserId("hongkd");
		model.addAttribute(member);
		return "home0304";
	}

	@GetMapping("/home0305")
	public String home0305(Model model) {
		Member member = new Member();
		String[] hobbyArray = null;
		member.setHobbyArray(hobbyArray);
		model.addAttribute(member);
		return "home0305";
	}

	@GetMapping("/home0306")
	public String home0306(Model model) {
		Member member = new Member();
		String[] hobbyArray = {};
		member.setHobbyArray(hobbyArray);
		model.addAttribute(member);
		return "home0306";
	}

	@GetMapping("/home0307")
	public String home0307(Model model) {
		Member member = new Member();
		String[] hobbyArray = { "Music", "Movie" };
		member.setHobbyArray(hobbyArray);
		model.addAttribute(member);
		return "home0307";
	}

	@GetMapping("/home0308")
	public String home0308(Model model) {
		Member member = new Member();
		model.addAttribute(member);
		return "home0308";
	}

	@GetMapping("/home0309")
	public String home0309(Model model) {
		Member member = new Member();
		List<String> hobbyList = new ArrayList<String>();
		member.setHobbyList(hobbyList);
		model.addAttribute(member);
		return "home0309";
	}

	@GetMapping("/home0310")
	public String home0310(Model model) {
		Member member = new Member();
		List<String> hobbyList = new ArrayList<String>();
		hobbyList.add("Music");
		hobbyList.add("Movie");
		member.setHobbyList(hobbyList);
		model.addAttribute(member);
		return "home0310";
	}

	@GetMapping("/home0401")
	public String home0401(Model model) {
		int coin = 1000;
		String userId = "hongkd";
		Member member = new Member();

		model.addAttribute("coin", coin);
		model.addAttribute("userId", userId);
		model.addAttribute("member", member);
		return "home0401";
	}
}
