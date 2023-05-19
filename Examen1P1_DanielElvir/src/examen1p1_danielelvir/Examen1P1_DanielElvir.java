/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_danielelvir;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Examen1P1_DanielElvir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        boolean seguir=true;
        while(seguir){
            System.out.println("1. Sumador Binario");
            System.out.println("2. Estrella de David");
            System.out.println("3. Para salir");
            System.out.println("Ingrese una opción");
            int opcion=leer.nextInt();
            switch(opcion){
                case 1:{
                    System.out.println("Ingrese la primera cadena de binarios");
                    String cadena1=leer.next();
                    System.out.println("Ingrese la segunda cadena de binarios");
                    String cadena2=leer.next();
                    
                    //validaciones
                    boolean iguales=false;
                    if(cadena1.length()==cadena2.length()){
                        iguales=true;
                    }else{
                        iguales=false;
                    }
                    
                    while(!iguales){
                        System.out.println("Los números deben de tener el mismo número de bits.");
                        System.out.println("Ingrese la primera cadena de binarios");
                        cadena1=leer.next();
                        System.out.println("Ingrese la segunda cadena de binarios");
                        cadena2=leer.next();
                    }
                    
                    String acum="";
                    for (int i = 0; i < cadena1.length(); i++) {
                        char letra1=cadena1.charAt(i);
                        if(letra1!='1' || letra1!='0'){
                            acum+=letra1;
                        }
                    }
                    
                    String acum2="";
                    for (int i = 0; i < cadena1.length(); i++) {
                        char letra2=cadena1.charAt(i);
                        if(letra2!='1' || letra2!='0'){
                            acum2+=letra2;
                        }
                    }
                    
                    while(acum!="" || acum2!=""){
                        if(acum!=""){
                            System.out.println("El primer número contiene caracteres distintos de '0' y '1'.");
                            cadena1=leer.next();
                        }else if(acum2!=""){
                            System.out.println("El segundo número contiene caracteres distintos de '0' y '1'.");
                            cadena2=leer.next();
                        }
                    }
                    //suma de binarios
                    String resultado="";
                    char bin='0';
                    char bin1='1';
                    for (int i = cadena1.length(); i < cadena1.length() && i < cadena2.length(); i--) {
                        char letra3=cadena1.charAt(i);
                        char letra4=cadena2.charAt(i);
                        if(letra3=='0' && letra4=='0'){
                            resultado+=bin;
                        }else if(letra3=='0' || letra3=='1' && letra4=='0' || letra4=='1'){
                            resultado+=bin1;
                        }else if(letra3=='1' || letra4=='1'){
                            resultado+=bin1;
                        }
                            }
                    System.out.println(resultado);
                    break;
                }
                case 2:{
                    System.out.println("Ingrese un tamaño");
                    int tamaño=leer.nextInt();
                 
                    //validaciones de que el numero ingresado sea mayor que 9 y que sea impar
                    while(tamaño<9){
                        System.out.println("¡ERROR! SOLO NUMEROS IMPARES Y MAYORES QUE 9");
                        tamaño=leer.nextInt();
                    }
                    while(tamaño%2==0){
                        System.out.println("¡ERROR! SOLO NUMEROS IMPARES Y MAYORES QUE 9");
                        tamaño=leer.nextInt();
                    }
                    

                    //figura
                    for (int i = 1; i <= (tamaño/2)+2; i++) {
                        for (int j = 1; j <= tamaño; j++) {
                            if(i==1 && j<(tamaño/2)+1 && j>=1){
                                System.out.print(" ");
                            }else if(i==1 && j>tamaño/2+1 && j<=tamaño){
                                System.out.print(" ");
                            }else if(i==1 && j==tamaño/2+1){
                                System.out.print("+");
                            }else if(i==2 && j>=1 && j<=tamaño){
                                System.out.print("*");
                            }else if(i==tamaño/2+1 && j>=1 && j<tamaño/2){
                                System.out.print("+");
                            }else if(i==tamaño/2+1 && j>tamaño/2+2 && j<=tamaño){
                                System.out.print("+");
                            }else if(i==tamaño/2+1 && j==tamaño/2){
                                System.out.print("*");
                            }else if(i==tamaño/2+1 && j==tamaño/2+1){
                                System.out.print("+");
                            }else if(i==tamaño/2+1 && j==tamaño/2+2){
                                System.out.print("*");
                            }else if(i==tamaño/2+1 && j>tamaño/2+2 && j<=tamaño){
                                System.out.print("+");
                            }else if(i==tamaño/2+2 && j>=1 && j<=tamaño/2){
                                System.out.print(" ");
                            }else if(i==tamaño/2+2 && j>tamaño/2+1 && j<=tamaño){
                                System.out.print(" ");
                            }else if(i==tamaño/2+2 && j==tamaño/2+1){
                                System.out.print("*");
                            }else if(i>2 && j<tamaño/2){
                                System.out.print("*");
                            }else if(i>2 && i<tamaño/2+1 && j>tamaño/2+1 && j<=tamaño){
                                System.out.print("*");
                            }else if(i>2 && i<tamaño/2+1 && j>tamaño/2-1 && j<tamaño/2+3){
                                System.out.print(" ");
                            }
                        }
                        System.out.println("");
                        }
                      //intento fallido      
                    /*
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if(i==j){
                    System.out.print("*");
                }else if ( j==0){
                                        System.out.print("*");

                }
                else if (i==0){
                    System.out.print("*");
                }else if(i==tamaño-1){
                    System.out.print("*");

                }else if(j==tamaño-i){
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }
                
                
            }
            System.out.println("*");
        }*/
                    break;
   
                }

                case 3:{
                    System.out.println("Gracias por usar el programa");
                    seguir=false;
                }
            }
        }
    }
    
}
