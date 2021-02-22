package temperatura;
import java.util.Scanner;
public class Temperatura {
	float temp[];
	public Temperatura() {
		temp = new float[24];
		System.out.println("Se Creo el Vector desde el constructor Temperatura\n");
	}
	public void llenar() {
		Scanner leer = new Scanner(System.in);
		for(int i = 0;i<24;i++) {
			if(i<10)
				System.out.println("son las 0" + i +":00 HRs. Favor de ingresar la temperatura\n");
			else
				System.out.println("son las " + i +":00 Hrs. Favor de ingresar la temperatura\n"); 
			
			temp[i]=leer.nextFloat();				
		}
	}
	public float promedio() {
		float prom=0;
		for(int i = 0;i<24;i++) {
			prom+=temp[i];
		}
	return prom/24;
	}
	public int frio() {
		int index=0;
		float menor=temp[0];
		for(int i = 0;i<24;i++) {
			if(menor>temp[i]) {
				menor=temp[i];
				index=i;
			}
		}
		return index;	
	}
	public int caliente() {		
		int index=0;
		float mayor=0;
		for(int i = 0;i<24;i++) {
			if(mayor<temp[i]) {
				mayor=temp[i];
				index=i;
			}
		}
		return index;	
	}
}
