package inscripcionMaterias;

import java.util.ArrayList;
import java.util.HashMap;

public class InscripcionMaterias {
	private ArrayList<Integer> listaNroLibreta;
	//materias aun no decidi que estructura usar
	private HashMap<Integer,Alumno> alumnos;
	
	public InscripcionMaterias() {
		listaNroLibreta = new ArrayList<Integer>();
		alumnos = new HashMap<Integer,Alumno>();
	}
	public void ingresar(Integer nroLibreta, String nombre, String apellido) {
		if(!(alumnoExiten(nroLibreta))) {
			alumnos.put(nroLibreta, new Alumno(nroLibreta, nombre, apellido));
			listaNroLibreta.add(nroLibreta);
		}
	}
	public boolean alumnoExiten(Integer nroLibreta) {
		return alumnos.containsKey(nroLibreta);
	}
	public void inscribirse(Integer nroLibreta, String materia, String comision) {
			alumnos.get(nroLibreta).agregarMateria(materia, comision);
	}
	public String obtenercomision(Integer nroLibreta, String materia) {	
		return alumnos.get(nroLibreta).comision(materia);
	}
	public void cambioDeComision (Integer nroLibreta, String materia, String comision) {
		if(alumnoExiten(nroLibreta)) {
			alumnos.get(nroLibreta).modificarCom(materia, comision);
		}
	}
	public int cantAlumnosInscriptosConMas4() {
		int contAlumnos = 0;
		for(int i = 0 ; i < listaNroLibreta.size() ; i++) {
			if(alumnos.get(listaNroLibreta.get(i)).cantidadDeMaterias() >= 4) {
				contAlumnos++;
			}
		}
		return contAlumnos;
	}
	
	

}
