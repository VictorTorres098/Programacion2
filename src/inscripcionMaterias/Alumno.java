package inscripcionMaterias;

import java.util.ArrayList;

public class Alumno {
	private Integer nroLibreta;
	private String nombre;
	private String apellido;
	private ArrayList<Materia> materias;
	
	public Alumno(Integer nroLibreta, String nombre, String apellido) {
		this.nroLibreta = nroLibreta;
		this.nombre = nombre;
		this.apellido = apellido;
		this.materias = new ArrayList<Materia>();
	}
	public Integer getNroLibreta() {
		return nroLibreta;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	
}
