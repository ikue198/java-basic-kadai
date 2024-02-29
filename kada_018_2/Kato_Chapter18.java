package kadai_018;

public abstract class Kato_Chapter18 {
	String familyName = "加藤";
	String givenName;
	String address = "東京都中野区○×";
	 
	
	public void commonIntroduce(String address) {
		System.out.println("住所は" + address + "です");
	}
	
	abstract void eachIntroduce();
	
	public void execIntroduce() {
		commonIntroduce(address);
		eachIntroduce();
	}

}


	
	