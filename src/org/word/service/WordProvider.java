package org.word.service;

import org.word.dao.WordDAO;
import org.word.domain.Word;

public class WordProvider {

	private WordDAO dao;

	public WordProvider(WordDAO dao) {
		super();
		this.dao = dao;
	}
	
	public Word getNext() {
		Word result = dao.selectNext();
		
		return result;
	}
	
}
