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
	public void agregarMateria(String materia, String comision) {
		materias.add(new Materia(materia,comision));
	}
	public String comision(String materia) {
		String com = "";
		for(int i = 0; i < materias.size(); i++) {
			if(materias.get(i).getMateria().equals(materia)) {
				com = materias.get(i).getComision();
			}
		}
		return com;
	}
	public boolean exiteMateria(String materia) {
		boolean exite = false;
		for(int i = 0; i < materias.size(); i++) {
			exite = exite || materias.get(i).getMateria().equals(materia);
		}
		return exite;
	}
	public void modificarCom(String materia, String com) {
		for(int i = 0; i < materias.size(); i++) {
			if(materias.get(i).getMateria().equals(materia)) {
				materias.get(i).setComision(com);
			}
		}
	}
	public int cantidadDeMaterias() {
		return materias.size();
	}
	
	
}
