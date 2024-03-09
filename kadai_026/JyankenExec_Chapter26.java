package kadai_026;

public class JyankenExec_Chapter26 {
	
	public static void main(String[] args) {
		
		jyanken_Chapter26 jyanken = new jyanken_Chapter26();
		
		String myChoice = jyanken.getMyChoice();
		
		String randomChoice = jyanken.getRandom();
		
		jyanken.playGame(myChoice,randomChoice);
	}
}