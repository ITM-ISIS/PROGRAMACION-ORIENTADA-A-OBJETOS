package empresa;
import java.util.Scanner;
public class Empresa {
	public String[] meses;
	public float ventas[];
	
	public Empresa() {
		meses = new String[]{ "invalido", "Enero","Febrero","Marzo","Abril","Mayo","Junio","julio","agosto","Septiembre","Octubre","Noviembre","Diciembre" };;
		ventas = new float[13];
		System.out.println("Se Creo el Vector desde el constructor Empresa\n");
		
	}
	public int capturAño() {
		int num=0;
		Scanner leer = new Scanner(System.in);
	
		System.out.println("Porfavor introdusca el año actual: ");
		num=leer.nextInt();
	
	return num;
	}	
	public void llenar(int año) {
		
		Scanner leer = new Scanner(System.in);
		for (int i=1;i<13;i++) {
			System.out.println("\tPorfavor introdusca las ventas del mes de " + meses[i] + " del año "+ año+"\n");
			ventas[i]=leer.nextFloat();
		}
		
	}
	public String mayor() {
		float mayor=0;
		int index=0;
		for (int i=1;i<13;i++) {
			if (ventas[i]>mayor) {
				mayor=ventas[i];
				index=i;
			}
		}
	return "El mes con mayor ventas fue "+ meses[index] +" con "+ mayor + "en ventas\n";
	}
	public String menor() {
		float menor=ventas[1];
		int index=1;
		for (int i=1;i<13;i++) {
			if (ventas[i]<menor) {
				menor=ventas[i];
				index=i;
			}
		}
	return "El mes con menor ventas fue "+ meses[index] +" con "+ menor + "en ventas\n";
		
}
	public float promedio() {
		
		float prom=0;
		for (int i=1;i<13;i++) {
			prom+=ventas[i];
		}
	return prom/12;
	}
	
}
