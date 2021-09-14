package inscripcionMaterias;

public class Materia {
	private String materia;
	private String comision;
	
	public Materia(String materia, String comision) {
		this.materia=materia;
		this.comision=comision;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getComision() {
		return comision;
	}

	public void setComision(String comision) {
		this.comision = comision;
	}
	

}
