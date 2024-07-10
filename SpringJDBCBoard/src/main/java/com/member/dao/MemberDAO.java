package com.member.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.member.domain.Member;

@Repository
public class MemberDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	// c
	public void create(Member member) throws Exception {
		String query = "insert into jdbcMember(no, id, passwd, name) values (jdbcmember_seq.nextval, ?, ?, ?)";
		jdbcTemplate.update(query, member.getId(), member.getPasswd(), member.getName());
	}

	// r
	public Member read(Integer no) throws Exception {
		String query = "select * from jdbcMember where no = ?";
		List<Member> list = jdbcTemplate.query(query, new RowMapper<Member>() {

			@Override
			public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
				Member member = new Member();
				member.setNo(rs.getInt("no"));
				member.setId(rs.getString("id"));
				member.setPasswd(rs.getString("passwd"));
				member.setName(rs.getString("name"));
				member.setReg_date(rs.getDate("reg_date"));
				return member;
			}
		}, no);
		return list.isEmpty() ? null : list.get(0);
	}

	// u
	public void update(Member member) throws Exception {
		String query = "update jdbcMember set passwd = ?, reg_date = ?";
		jdbcTemplate.update(query, member.getPasswd(), member.getReg_date());
	}

	// d
	public void delete(Integer no) throws Exception {
		String query = "delete from jdbcMebmer where no = ?";
		jdbcTemplate.update(query, no);
	}

	// l
}
