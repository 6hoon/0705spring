package com.zeus.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.java.Log;

@Log
@Controller
public class HomeController {
	@Autowired
	private MessageSource messageSource;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		log.info("환영합니다. 클라이언트 지역은 " + locale + "이다.");
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		String[] argks = { "제우스" };
		String[] arges = { "zeus" };

		// 스프링 프레임워크로부터 MessageSource를 주입 받은 다음 getMessage 메서드를 호출한다.
		String message = messageSource.getMessage("welcome.message", argks, Locale.KOREAN);
		String message2 = messageSource.getMessage("welcome.message", arges, Locale.ENGLISH);
		log.info("Welcome message : " + message);
		log.info("Welcome message2 : " + message2);
		model.addAttribute("serverTime", formattedDate);
		return "home";
	}

}
