package kadai_026; 

import java.util.HashMap;
import java.util.Scanner;

public class jyanken_Chapter26 {
	
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
		
			String input = scanner.next();
		
			if(input.equals("r") || input.equals("s") || input.equals("p")) {
				scanner.close();
				
				return input;
			}
		}
		
		
		
	}
	 public String getRandom() {
		 String[] jyankenArray = { "r", "s", "p" };
		 
		int index = (int) Math.floor(Math.random()*3);
		 
		return jyankenArray[index];
		 
	 }
	 
	 public void playGame(String myChoice, String randomChoice) {
		 HashMap<String,String> jyankenMap = new HashMap<String,String>();
		 
		 jyankenMap.put("r","グー");
		 jyankenMap.put("s","チョキ");
		 jyankenMap.put("p","パー");
		 
		 System.out.println("自分の手は" + myChoice + "、対戦相手の手は" + randomChoice);
		 
		 if((myChoice.equals("r")&&randomChoice.equals("r"))
				 ||(myChoice.equals("s")&&randomChoice.equals("s"))
				 ||(myChoice.equals("p")&&randomChoice.equals("p"))) {
			 System.out.println("あいこです");
		 }
		 if((myChoice.equals("r")&&randomChoice.equals("s"))
				 ||(myChoice.equals("s")&&randomChoice.equals("p"))
				 ||(myChoice.equals("p")&&randomChoice.equals("r"))) {
			 System.out.println("自分の勝ちです");
		 }
		 if((myChoice.equals("r")&&randomChoice.equals("p"))
				 ||(myChoice.equals("s")&&randomChoice.equals("r"))
				 ||(myChoice.equals("p")&&randomChoice.equals("s"))) {
			 System.out.println("自分の負けです");
		 }
		 
		 
	 }
}
