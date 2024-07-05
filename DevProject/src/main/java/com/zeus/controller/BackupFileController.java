package com.zeus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.zeus.domain.Member;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/file")
public class BackupFileController {
	@RequestMapping(value = "/registerFileUp01", method = RequestMethod.POST)
	public String registerFileUp01(MultipartFile picture) throws Exception {
		log.info("registerFileUp01");
		log.info("originalName: " + picture.getOriginalFilename());
		log.info("size: " + picture.getSize());
		log.info("contentType: " + picture.getContentType());
		return "success";
	}

	@RequestMapping(value = "/registerFileUp02", method = RequestMethod.POST)
	public String registerFileUp02(String userId, String password, MultipartFile picture) throws Exception {
		log.info("registerFileUp02");
		log.info("userId = " + userId);
		log.info("password = " + password);
		log.info("originalName: " + picture.getOriginalFilename());
		log.info("size: " + picture.getSize());
		log.info("contentType: " + picture.getContentType());
		return "success";
	}

	@RequestMapping(value = "/registerFileUp03", method = RequestMethod.POST)
	public String registerFileUp03(Member member, MultipartFile picture) throws Exception {
		log.info("registerFileUp03");
		log.info("userId = " + member.getUserId());
		log.info("password = " + member.getPassword());
		log.info("originalName: " + picture.getOriginalFilename());
		log.info("size: " + picture.getSize());
		log.info("contentType: " + picture.getContentType());
		return "success";
	}
}
