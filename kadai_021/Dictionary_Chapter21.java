package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	public static void searchDictionary(String[] word) {
		HashMap<String,String> fruitList = new HashMap<String,String>();
		
		fruitList.put("apple", "りんご");
		fruitList.put("peach", "桃");
		fruitList.put("banana", "バナナ");
		fruitList.put("lemon", "レモン");
		fruitList.put("pear", "梨");
		fruitList.put("kiwi", "キウイ");
		fruitList.put("strawberry", "いちご");
		fruitList.put("grape", "ぶどう");
		fruitList.put("muscat", "マスカット");
		fruitList.put("cherry", "さくらんぼ");
		
		for(int i = 0;  i < word.length; i++) {
			if (fruitList.containsKey(word[i])) {
		        System.out.println(word[i] + "の意味は" + fruitList.get(word[i]) );
		    } else {
		        System.out.println(word[i] + "は存在しません");
		    }
		}
	}
	}

