package org.word.domain;

public class Word {

	private String desc;
	private String answer;

	public Word(String desc, String answer) {
		super();
		this.desc = desc;
		this.answer = answer;
	}
	public String getDesc() {
		return desc;
	}
	public String getAnswer() {
		return answer;
	}
	@Override
	public String toString() {
		return "Word [desc=" + desc + ", answer=" + answer + "]";
	}
	public boolean checkAnswer(String userStr) {
//		return userStr.toLowerCase().equals(answer);
		return userStr.toLowerCase().equals(answer);
	}
}
