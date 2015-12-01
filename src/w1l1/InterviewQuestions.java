package w1l1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InterviewQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String answer = null;
		QuestionRepository qr = new QuestionRepository();
		for(int i = 1; i <= 2; i++)
		{
			System.out.println(qr.getQuesiton(i));
			try {
				answer = in.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if((i == 1) && Integer.parseInt(answer) == QuestionRepository.ANSWER1)
				System.out.println(" Answer to qn 1 is Correct");
			else if((i == 2) && Integer.parseInt(answer) == QuestionRepository.ANSWER2)
				System.out.println(" Answer to qn 2 is Correct");
			else
				System.out.println(" Incorrect");
		}

	}

}
class QuestionRepository{
	private int qNo;
	private int aNo;
	
	
	
	static final int ANSWER1 = 2;
	static final int ANSWER2 = 2;
	
	
	public String getQuesiton(int i){
		String qn = null;
		switch(i){ 
		case 1 :
			qn= "[1 + 1 is 3 ] 1) yes 2) No ";
			break;
		case 2 :
			qn = " [3 + 1 is 4]  1) yes 2) No ";
			break;
		}
		return qn;
	}
}
