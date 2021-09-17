package inscripcionMaterias;

import java.util.HashMap;

public class Alumno {
	private Integer nroLibreta;
	private String nombre;
	private String apellido;
	private HashMap<String, String> materias;
	
	public Alumno(Integer nroLibreta, String nombre, String apellido) {
		this.nroLibreta = nroLibreta;
		this.nombre = nombre;
		this.apellido = apellido;
		this.materias = new HashMap<>();
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
	public void agregarMateria(String materia, String comision) {
		if(!(materiaYaIngresada(materia))) {
			materias.put(materia, comision);
		}
	}
	public boolean materiaYaIngresada(String materia) {
		return materias.containsKey(materia);
	}
	public String comision(String materia) {
		String com = "";
		com = materias.get(materia);
		return com;
	}
	public void modificarCom(String materia, String com) {
		if(materiaYaIngresada(materia)) {
			materias.put(materia, com);
		}else {
			throw new RuntimeException("No esta inscripto a materia");
		}
	}
	public int cantidadDeMaterias() {
		return materias.size();
	}
	
	
}
