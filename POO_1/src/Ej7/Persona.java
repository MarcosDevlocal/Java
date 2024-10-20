package Ej7;
import java.util.Scanner;

public class Persona {
    Scanner entrada = new Scanner(System.in);
    private String tipo_de_regalo;
    private int numero_de_personas;
    private int edad_media;
    private int edad;
    public Persona(){
       
        
    }
    public void setEdad(){
        System.out.println("Introduzca su edad");
        edad = entrada.nextInt();
        while (edad < 18 || edad >= 67){
        System.out.println("Error");
        System.out.println("Introduzca su edad");
        edad = entrada.nextInt();
        }
    }
    public int getEdad(){
        return edad;
    }
    public void setNumeroPersonas(){
        numero_de_personas++;
    }
    public int getNumeroPersonas(){
        return numero_de_personas;
    }
  
    public void setEdadMedia(){
        edad_media = edad / numero_de_personas;
    }
    public int getEdadMedia(){
        return edad_media;
    }
      public double calcularPorcentaje(int totalPersonas) {
        if (totalPersonas > 0) {
            return (numero_de_personas * 100.0) / totalPersonas;
        }
        return 0.0; // Retorna 0 si el total de personas es 0
    }
   
}
