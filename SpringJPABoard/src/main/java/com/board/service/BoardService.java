package com.board.service;

import java.util.List;

import com.board.domain.Board;

public interface BoardService {

	// create
	public void register(Board board) throws Exception;

	// read	: key 값의 경우 repository에 맞춰 가야함
	public Board read(Integer boardNo) throws Exception;

	// update
	public void modify(Board board) throws Exception;

	// delete
	public void remove(Integer boardNo) throws Exception;

	// list 전체글
	public List<Board> list() throws Exception;
}
