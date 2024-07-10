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
	private BoardService service;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model model) throws Exception {
		log.info("home");
		return "board/home";
	}
	@RequestMapping(value = "/registerForm", method = RequestMethod.GET)
	public String registerForm(Board board, Model model) throws Exception {
		log.info("registerForm");
		return "board/register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(Board board, Model model) throws Exception {
		log.info("register");
		service.register(board); // DB로
		model.addAttribute("msg", "등록이 완료되었습니다.");
		return "board/success";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void list(Model model) throws Exception {
		log.info("list");
		model.addAttribute("list", service.list());
	}

	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void read(Board board, Model model) throws Exception {
		log.info("read");
		model.addAttribute(service.read(board.getBoardNo()));
	}

	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public void modifyForm(Board board, Model model) throws Exception {
		log.info("modifyForm");
		model.addAttribute(service.read(board.getBoardNo()));
	}

	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modify(Board board, Model model) throws Exception {
		log.info("modify");
		service.modify(board);
		model.addAttribute("msg", "수정이 완료되었습니다.");
		return "board/success";
	}

	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String remove(Board board, Model model) throws Exception {
		log.info("remove");
		service.remove(board.getBoardNo());
		model.addAttribute("msg", "삭제가 완료되었습니다.");
		return "board/success";
	}
}
