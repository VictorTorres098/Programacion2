package inscripcionMaterias;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		String[] arrayString = {"uno","dos", "tres"};
		HashMap<String, String[]> dicc = new HashMap<String, String[]>();
		HashMap x = new HashMap();
		dicc.put("matemica",arrayString);
		dicc.containsKey(x);
		//System.out.println(dicc.get("matemica")[1]);
		InscripcionMaterias nuevoTrimestre = new InscripcionMaterias();
		nuevoTrimestre.ingresar(1, "fulanito", "menganito");
		//System.out.println(nuevoTrimestre.alumnoExiten(1));
//		x.put("uno", "matematica");
//		x.put("uno", "lecto");
		nuevoTrimestre.ingresar(2, "magnus", "mefisto");
		nuevoTrimestre.ingresar(3, "carolina", "gatica");
		nuevoTrimestre.inscribirse(2, "mat", "com2");
		nuevoTrimestre.inscribirse(2, "lecto", "com2");
		nuevoTrimestre.inscribirse(2, "utilitarios", "com2");
		nuevoTrimestre.inscribirse(2, "discreta", "com2");
		nuevoTrimestre.inscribirse(2, "ORGA", "com2");
		nuevoTrimestre.inscribirse(3, "tec", "com2");
		nuevoTrimestre.inscribirse(3, "ip", "com2");
		nuevoTrimestre.inscribirse(3, "ultili", "com2");
		nuevoTrimestre.inscribirse(3, "discreta", "com2");
		nuevoTrimestre.inscribirse(3, "sor", "com2");
		nuevoTrimestre.inscribirse(3, "ORGA", "com2");
		System.out.println(nuevoTrimestre.cantAlumnosInscriptosConMas4());
	}

}
