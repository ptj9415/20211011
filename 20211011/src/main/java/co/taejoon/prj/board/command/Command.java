package co.taejoon.prj.board.command;

import co.taejoon.prj.board.service.BoardService;
import co.taejoon.prj.board.serviceImpl.BoardServiceImpl;
import co.taejoon.prj.mybatis.BoardMybatisService;

public interface Command {
//	public BoardService dao = new BoardServiceImpl();
	public BoardService dao = new BoardMybatisService();
	public void execute();
	

}
