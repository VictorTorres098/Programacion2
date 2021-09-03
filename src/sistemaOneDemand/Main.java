package sistemaOneDemand;

public class Main {

	public static void main(String[] args) {
		Fecha test = new Fecha(2, 10, 2021);
		//System.out.print(test);
		Actor testActor = new Actor("Brad","EEUU",test);
		System.out.println(testActor.getInformacion());
		

	}

}
