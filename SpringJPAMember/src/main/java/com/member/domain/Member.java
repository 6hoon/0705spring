package com.member.domain;

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
@Entity
@SequenceGenerator(name = "JPAMEMBER_SEQ_GEN", sequenceName = "JPAMEMBER_SEQ", initialValue = 1, allocationSize = 1)
@Table(name = "jpamember")
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "JPAMEMBER_SEQ_GEN")
	@Column(name = "no")
	private int no;
	@Column(name = "id")
	private String id;
	@Column(name = "passwd")
	private String passwd;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@CreationTimestamp
	@Column(name = "regdate")
	private Date regdate;
}
