import java.util.*;
public class Ejercicio5{
	public static void main(String[] args) {
		//declaramos variables e inicializamos scanner
		Scanner scanner = new Scanner(System.in);
		double n;
		double x;
		double masculino;
		double femenino;
		double edad;
		double sexo;
		//solicitamos la informacion
		System.out.println("Ingrese la cantidad de personas a registrar: ");
		n = scanner.nextDouble();
		x = 1;
		masculino = 0;
		femenino = 0;
		while(x<=n){
			System.out.println("Ingrese la edad: ");
			edad = scanner.nextDouble();
			System.out.println("Ingrese un numero dependiendo de su sexo: 1 = masculino o 2 = femenino: ");
			sexo = scanner.nextDouble();
			if (sexo == 1) {
				if (edad < 18) {
					masculino = masculino+1;
				}
			} else{
				if (sexo == 2) {
					if (edad >= 18) {
						femenino = femenino+1;					
					}
				} else{
					System.out.println("Escribe un numero correcto");
					x = x-1;
				}
			}
			x = x+1;
		}
		System.out.println("Las mujeres mayores de edad son: "+femenino);
		System.out.println("Los hombres menores de edad son: "+masculino);
	}
}