package StringPrb;

import java.util.HashMap;
import java.util.*;

public class DuplicateCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		duplicateChar();

}


public static void duplicateChar() {
	String s = "prashanth";
	Map<Character,Integer> m=new HashMap<Character,Integer>();
	for(int i=0;i<s.length();i++) {
		if(m.containsKey(s.charAt(i))) {
			m.put(s.charAt(i), m.get(s.charAt(i))+1);
		}else {
			m.put(s.charAt(i), 1);
	}
	} 
	for(Map.Entry<Character, Integer> map:m.entrySet()) {
		if(map.getValue()>1) {
			System.out.println(map.getKey() +":"+ map.getValue());
		}
	}
}
 }
