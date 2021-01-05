import java.util.Scanner;

import org.word.dao.WordDAO;
import org.word.service.WordProvider;
import org.word.ui.WordExamUI;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		WordDAO dao = new WordDAO();
		
		WordProvider provider = new WordProvider(dao);
		
		WordExamUI ui = new WordExamUI( scanner , provider );
		
		ui.exam();
		
		
		
	}
}
