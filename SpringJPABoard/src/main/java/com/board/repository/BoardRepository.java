package com.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.board.domain.Board;
// < entity, pk >
public interface BoardRepository extends JpaRepository<Board, Integer> {

}
