package inscripcionMaterias;

import java.util.ArrayList;
import java.util.HashMap;

public class InscripcionMaterias {
	private ArrayList<Alumno> alumnos;
	//materias aun no decidi que estructura usar
	private HashMap<Alumno,Materia> inscripcion;
	
	public InscripcionMaterias() {
		alumnos = new ArrayList<Alumno>();
		inscripcion = new HashMap<Alumno,Materia>();
	}

}
