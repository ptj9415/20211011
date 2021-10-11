package co.taejoon.prj.board.command;

import java.util.Scanner;

import co.taejoon.prj.board.service.BoardVO;

public class BoardDelete implements Command {
	private Scanner scb = new Scanner(System.in);

	@Override
	public void execute() {
		BoardVO vo = new BoardVO();
		System.out.println("게시글 삭제 메뉴입니다.");
		System.out.println("삭제할 게시글 번호를 입력하세요.");
		vo.setBId(scb.nextInt());
		int n = dao.boardDelete(vo);
		if (n != 0) {
			System.out.println("정상적으로 삭제되었습니다.");
		} else {
			System.out.println("삭제에 실패했습니다.");
		}

	}
}
