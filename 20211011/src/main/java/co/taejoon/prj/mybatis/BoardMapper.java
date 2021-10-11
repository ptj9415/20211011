package co.taejoon.prj.mybatis;

import java.util.List;

import co.taejoon.prj.board.service.BoardVO;

public interface BoardMapper {
	List<BoardVO> boardSelectList();
	BoardVO boardSelect(BoardVO board);
	int boardInsert(BoardVO board);
	int boardUpdate(BoardVO board);
	int boardDelete(BoardVO board);

}
