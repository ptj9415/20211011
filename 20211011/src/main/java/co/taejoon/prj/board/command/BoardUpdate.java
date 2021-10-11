package co.taejoon.prj.board.command;

import java.util.Scanner;

import co.taejoon.prj.board.service.BoardVO;

public class BoardUpdate implements Command {
	private Scanner scb = new Scanner(System.in);

	@Override
	public void execute() {
		BoardVO vo = new BoardVO();
		System.out.println("공지사항 수정 메뉴입니다.");
		System.out.println("수정할 글의 번호를 입력하세요.");
		vo.setBId(scb.nextInt());
		scb.nextLine();
		System.out.println("수정할 글의 내용을 입력하세요.");
		vo.setBContents(scb.nextLine());
		int n = dao.boardUpdate(vo);
		if (n != 0) {
			System.out.println("정상적으로 수정되었습니다.");
		} else {
			System.out.println("수정에 실패하였습니다.");
		}
	}
}
