package com.zeus.domain;

import java.io.Serializable;
import java.util.Date;



public class Board implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
}
