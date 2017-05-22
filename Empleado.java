package ejercicio6;
import java.util.Scanner;
public class Empleado {
private String nombre;
private int sueldo;
private Scanner teclado;

public void ingresar(){
	teclado=new Scanner(System.in);
	System.out.print("Ingrese su nombre: ");
	nombre=teclado.nextLine();
	System.out.print("Ingrese su sueldo:");
	sueldo=teclado.nextInt();
}
public void informacion(){
	System.out.print("Nombre ingresado:"+nombre+"\n");
	System.out.print("Sueldo ingresado:"+sueldo+"\n");
	if(sueldo>3000){
		System.out.print("Excedio el minimo, debe pagar impuestos");
	}else{
		System.out.println("Su sueldo no debe pagar impuestos");
	}
}
public static void main(String[]ar){
	Empleado empleado1;
	empleado1=new Empleado();
	empleado1.ingresar();
	empleado1.informacion();
}
}
