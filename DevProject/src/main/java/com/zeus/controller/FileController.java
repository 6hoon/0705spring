package com.zeus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.zeus.domain.FileMember;
import com.zeus.domain.Member;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/file")
public class FileController {
	@RequestMapping(value = "/registerFileUpForm", method = RequestMethod.GET)
	public String registerFileUpForm() {
		log.info("registerFileUpForm");
		return "file/registerFileUpForm";
	}

	@RequestMapping(value = "/registerFileUp04", method = RequestMethod.POST)
	public String registerFileUp04(FileMember fileMember) throws Exception {
		log.info("registerFileUp04");
		log.info("userId = " + fileMember.getUserId());
		log.info("password = " + fileMember.getPassword());
		MultipartFile picture = fileMember.getPicture();
		log.info("originalName: " + picture.getOriginalFilename());
		log.info("size: " + picture.getSize());
		log.info("contentType: " + picture.getContentType());
		return "success";
	}

}
