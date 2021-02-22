package temperatura;

public class AppTemperatura {

	public void inicio() {
		
		Temperatura objTemp = new Temperatura();
		objTemp.llenar();
		System.out.println(" La temperatura promedio del dia es: "+ objTemp.promedio() + "\n \t Estuvo mas caliente a las "+objTemp.caliente()+":00 HRs");
		System.out.println("\n \t Estuvo mas frio a las " + objTemp.frio() +":00 HRs");

		
		
	}
	
	public static void main(String[] args) {

		AppTemperatura appTemp = new AppTemperatura();
		appTemp.inicio();
	}

}
