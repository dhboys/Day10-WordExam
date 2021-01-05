package org.word.ui;

import java.util.Scanner;

import org.word.domain.Word;
import org.word.service.WordProvider;

public class WordExamUI {

	private Scanner scanner;
	private WordProvider provider;
	
	public WordExamUI(Scanner scanner, WordProvider provider) {
		super();
		this.scanner = scanner;
		this.provider = provider;
	}
	
	// 진행 시키는 메서드
	public void exam() {
		// 엔터 입력하면 시험 시작
		System.out.println("Enter를 입력하세요");
		scanner.nextLine();
		// 문제는 가져왔어
		Word word = provider.getNext();
		// 질문해야지
		System.out.println(word.getDesc());
		String userAnswer = scanner.nextLine();
		boolean correct = word.checkAnswer(userAnswer);
		
		if ( correct ) {
			System.out.println("정답");
		}else {
			System.out.println("오답입니다.");
			return;
		}
		exam();
	}
	
}
