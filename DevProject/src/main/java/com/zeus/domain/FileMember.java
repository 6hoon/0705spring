package com.zeus.domain;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class FileMember {
	private String userId;
	private String password;
	// 파일 업로드시 정보저장하는 클래스
	private MultipartFile picture;
}
