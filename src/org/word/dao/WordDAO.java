package org.word.dao;

import java.io.File;
import java.util.Scanner;

import org.word.domain.Word;

public class WordDAO {

	//Word객체들
		private Word[] words;
		private int idx;
		
		public WordDAO() {
			try {
			//파일과 연결된 Scanner를 생성 
				File file = new File("C:\\zzz\\test.txt");
				Scanner scanner = new Scanner(file,"UTF-8");
				words = new Word[5];
				
			//5번 라인을 읽는다.
				for(int i = 0; i < 5; i++) {
					//한 라인을 @로 분리해서 문자열의 배열로 만들어
					String line = scanner.nextLine();
					String[] arr = line.split("@");
					//배열을 이용해서 Word객체를 생성
					//생성한 Word 객체를 배열에 보관
					words[i] = new Word(arr[0], arr[1]);
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		public Word selectNext() {
			//배열에서 다음 Word객체를 반환 
			Word word = words[idx++];
			
			return word;
		}
	
}
