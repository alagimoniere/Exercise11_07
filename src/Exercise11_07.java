import java.util.ArrayList;

import java.util.Collections;

public class Exercise11_07 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		shuffle(list);
    
		for (int x = 0; x < list.size(); x++) {
			System.out.print(list.get(x) + " ");
		}
	}
  
	public static void shuffle(ArrayList<Integer> list) {
		Collections.shuffle(list);
	}
	
}