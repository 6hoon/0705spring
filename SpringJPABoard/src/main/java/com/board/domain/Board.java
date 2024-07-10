package com.board.domain;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity // 내가 여기 쓴 것이 곳 table이다 -> 내부적으로 hashMap mapping
@SequenceGenerator(name = "JPABOARD_SEQ_GEN", sequenceName = "JPABOARD_SEQ", initialValue = 1, allocationSize = 1)
@Table(name = "jpaboard")	// 안써주면 클래스 이름과 같은 걸 찾음
public class Board {
	@Id // -> pk 와 같음
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "JPABOARD_SEQ_GEN")
	@Column(name = "board_No")
	private int boardNo;
	@Column(name = "title")
	private String title;
	@Column(name = "content")
	private String content;
	@Column(name = "writer")
	private String writer;
	@CreationTimestamp
	@Column(name = "reg_Date")
	private Date regDate;
}
