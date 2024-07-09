package com.board.service;

import java.util.List;

import com.board.domain.Board;

// @Service --> 인터페이스는 객체가 될 수 없기에 불가!
public interface BoardService {

	// --> 실무에서는 메소드 이름 바꿔 사용
	// --> public : 추상메소드 접근 제어자 세팅
	// --> 이 인터페이스를 기준으로 만든 모든 객체를 컨트롤이 받으려고
	// create
	public void register(Board board) throws Exception;

	// read
	public Board read(Integer boardNo) throws Exception;

	// update
	public void modify(Board board) throws Exception;

	// delete
	public void remove(Integer boardNo) throws Exception;

	// list 전체글
	public List<Board> list() throws Exception;

}