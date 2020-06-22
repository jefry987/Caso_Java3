import java.util.Scanner;
public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name , continuacion = "si" , nameNetoMayor =  "", nameNetoMenor ="" , nameMayorTar = "";
		int horTraba, minTar, c =0, cp=0;
		float suelBruto, boni = 0, descuento = 0 , suelNeto , porcenAlcanzado , tarixHora , netoMayor = 0, netoMenor = 9999999 ,mayorMinTar = 0;
		System.out.println("REGISTRO DE EMPLEADOS");
		System.out.println("_____________________");
		System.out.println("");
		
		while(continuacion.equalsIgnoreCase("si")) {
			c++;
			System.out.println("*************************\n*Registro de Empleado #" + c + "*\n*************************" );
			System.out.print("-Nombre del empleado: ");
			name =  sc.nextLine();
			System.out.print("-Horas trabajas del empleado " + name + ": ");
			horTraba = sc.nextInt();
			System.out.print("-Tarifa horaria del empleado " + name + ": ");
			tarixHora = sc.nextFloat();
			System.out.print("-Minutos de tardanza del empleado " + name + ": ");			
			minTar = sc.nextInt();
			
			suelBruto = horTraba * tarixHora;
			
			if(horTraba<=50) {
				boni = 0;
			}else if(horTraba > 50 && horTraba <=60){
				boni = 0.02f * suelBruto;		
			}else if(horTraba > 60 && horTraba <=70){
				boni = 0.08f * suelBruto;
			}else if(horTraba > 70 && horTraba <=80){
				boni = 0.13f * suelBruto;
			}else if(horTraba > 80){
				boni = 0.15f * suelBruto;
			}
			
			if(minTar<=15) {
				descuento = 0;
			}else if(minTar>15 && minTar<30){
				descuento = ((0.3f * suelBruto) * minTar) / 100;
			}else if(minTar > 30){
				descuento = ((0.5f * suelBruto) * minTar) / 100;
			}
			suelNeto = 	(suelBruto + boni) - descuento;
			
			porcenAlcanzado = (float)((horTraba * 100) / 80);
			//sueldo mayor
			if(suelNeto > netoMayor) {
				netoMayor = suelNeto;
				nameNetoMayor = name;
			}
			//sueldo menor
			if(suelNeto < netoMenor) {
				netoMenor = suelNeto;
				nameNetoMenor = name;
			}
			//mayor minutos de tardanza
			if(minTar > mayorMinTar) {
				mayorMinTar = minTar;
				nameMayorTar = name;
			}
			
			//meta alcanzada
			if(porcenAlcanzado>90)
				cp++;

			sc.nextLine();

			System.out.println("\n�Quieres seguir a�adiendo empleados? [SI/NO]");
			continuacion = sc.nextLine();
			
			if(continuacion.equalsIgnoreCase("no")) {
				//resumen
				System.out.println("___________\n \n  RESUMEN   \n___________");
				System.out.println("");
				System.out.println("Numero de empleados registrados: " + c + ".");
				System.out.println("El sueldo neto mayor es de " + netoMayor + " y pertenece a " + nameNetoMayor + ".");
				System.out.println("El sueldo neto menor es de " + netoMenor + " y pertenece a " + nameNetoMenor + ".");
				System.out.println("El empleado con la mayor cantidad de minutos de tardanza es " + nameMayorTar + " con " + mayorMinTar + " minutos.");
				System.out.println("Cantidad de empleados con mas del 90% de la meta: " + cp);
			}else if(continuacion.equalsIgnoreCase("si"))
				System.out.println("");
			else
				System.out.println("\nOPCION INVALIDA \nIngrese solo 'SI' o 'NO'");
 
	}

 }
}
