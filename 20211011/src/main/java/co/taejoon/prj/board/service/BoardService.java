package co.taejoon.prj.board.service;

import java.util.List;

public interface BoardService {
	List<BoardVO> boardSelectList(); // 전체 목록 가져오기

	BoardVO boardSelect(BoardVO board); // 하나의 글 조회

	int boardInsert(BoardVO board); // 글 작성

	int boardUpdate(BoardVO board); // 글 수정

	int boardDelete(BoardVO board); // 글 삭제

}
