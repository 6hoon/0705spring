package com.member.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Member {
	private int no;
	private String id;
	private String passwd;
	private String name;
	private Date reg_date;
}
