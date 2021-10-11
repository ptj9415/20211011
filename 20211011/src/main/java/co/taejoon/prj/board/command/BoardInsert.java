package co.taejoon.prj.board.command;

import java.sql.Date;
import java.util.Scanner;

import co.taejoon.prj.board.service.BoardVO;

public class BoardInsert implements Command {
//	dao 객체는 interface에서 상속받아 사용한다.
	private Scanner scb = new Scanner(System.in);

	@Override
	public void execute() {
		BoardVO vo = new BoardVO();
		System.out.println("작성자를 입력하세요.");
		vo.setBWriter(scb.nextLine());
		vo.setBWriteDate(Date.valueOf("2021-10-11"));
		System.out.println("제목을 입력하세요.");
		vo.setBTitle(scb.nextLine());
		System.out.println("내용을 입력하세요.");
		vo.setBContents(scb.nextLine());
		int n = dao.boardInsert(vo);
		if (n != 0) {
			System.out.println("정상적으로 등록되었습니다.");
		} else {
			System.out.println("등록에 실패하였습니다.");
		}

	}

}
