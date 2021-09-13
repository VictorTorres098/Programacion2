package inscripcionMaterias;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		String[] arrayString = {"uno","dos", "tres"};
		HashMap<String, String[]> dicc = new HashMap<String, String[]>();
		HashMap x = new HashMap();
		dicc.put("matemica",arrayString);
		System.out.println(dicc.get("matemica")[1]);

	}

}
