package Estructurasrepititivas;

import java.util.Scanner;

public class Tablasdemultiplicacion {

	public static void main(String[] args) {
		int numero;
		
		Scanner sc=new Scanner(System.in);
        
		System.out.print("Introduce la tabla que quiere ver: ");  
        numero = sc.nextInt();
        System.out.println("Tabla del " + numero);

        for(int i = 1; i<=numero; i++){
        	for(int j=1;j<=12;j++)
             System.out.println(i + " x " + j + " = " + i*j);     
		
             
        }	
        System.out.println("Fin del programa :)");
	}

}
