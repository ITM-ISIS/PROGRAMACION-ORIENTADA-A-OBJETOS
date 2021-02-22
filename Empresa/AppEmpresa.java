package empresa;

public class AppEmpresa {

	public int año;
	
	
	public void inicio() {
		Empresa objEmpresa = new Empresa();
		año=objEmpresa.capturAño();
		objEmpresa.llenar(año);
		System.out.println(" "+objEmpresa.mayor());
		System.out.println(" "+objEmpresa.menor());
		System.out.println(" el promedio de ventas para el año "+ año +" es: " +objEmpresa.promedio() );
	}
	
	
	public static void main(String[] args) {
		AppEmpresa app = new AppEmpresa() ;
		app.inicio();

	}

}
