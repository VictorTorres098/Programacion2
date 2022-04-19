package tads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap <> ();
		map.put(1, "uno");
		map.put(2, "dos");
		
		for(Integer claves : map.keySet()) {
			System.out.println(map.get(claves));
		}
		

	}

}
