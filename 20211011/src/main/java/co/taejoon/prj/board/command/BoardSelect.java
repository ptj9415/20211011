package co.taejoon.prj.board.command;

import java.util.Scanner;

import co.taejoon.prj.board.service.BoardVO;

public class BoardSelect implements Command {
	Scanner scb = new Scanner(System.in);

	public void execute() {
		BoardVO board = new BoardVO();
		System.out.println("조회할 글 번호를 입력하세요.");
		board.setBId(scb.nextInt());
		scb.nextLine();
		board = dao.boardSelect(board);

		System.out.println("번호 : " + board.getBId());
		System.out.println("작성자 : " + board.getBWriter());
		System.out.println("작성일자 : " + board.getBWriteDate());
		System.out.println("제목 : " + board.getBTitle());
		System.out.println("내용 : " + board.getBContents());
		System.out.println("조회수 : " + board.getBHit());
		

	}
}
