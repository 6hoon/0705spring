package com.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.board.domain.Board;
import com.board.repository.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardRepository repository;

	@Override
	@Transactional
	public void register(Board board) throws Exception {
		repository.save(board);
	}

	@Override
	@Transactional(readOnly = true)
	public Board read(Integer boardNo) throws Exception {
		return repository.getOne(boardNo);
	}

	@Override
	@Transactional
	public void modify(Board board) throws Exception {
		// 수정 -> 중간모드에서 한다(테이블에서 중간단계로 가져온다 = 수정한다 => 테이블에 저장된다)
		// 영속성/비영속성
		Board boardEntity = repository.getOne(board.getBoardNo());
		boardEntity.setTitle(board.getTitle()); // board를 수정하기만해도 DB가 수정되어버림
		boardEntity.setContent(board.getContent());
	}

	@Override
	@Transactional
	public void remove(Integer boardNo) throws Exception {
		repository.deleteById(boardNo);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Board> list() throws Exception {
		return repository.findAll(Sort.by(Direction.DESC, "boardNo"));
	}

}
