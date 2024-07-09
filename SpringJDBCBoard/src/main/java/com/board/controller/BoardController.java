package com.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.board.domain.Board;
import com.board.service.BoardService;

import lombok.extern.java.Log;

@Log
@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	// 스프링 컨테이너는 해당 '인터페이스'로 '구현된 객체' 가 있으면 불러와준다!!
	// ㄴ 따라서 한 인터페이스에서 두개의 구현객체는 있을 수 없는 일이다.
	private BoardService service; // C,R,U,D,L

	// insert를 하기 위한 입력화면을 요청한다.
	@RequestMapping(value = "/registerForm", method = RequestMethod.GET)
	public String registerForm(Board board, Model model) throws Exception {
		log.info("registerForm");
		return "board/register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(Board board, Model model) throws Exception {
		log.info("register");
		service.register(board);	// DB로
		model.addAttribute("msg", "등록이 완료되었습니다.");
		return "board/success";
	}

//	@RequestMapping(value = "/home", method = RequestMethod.GET)
//	public String home() throws Exception {
//		log.info("/board/home");
//		return "/board/home";
//	}
}
