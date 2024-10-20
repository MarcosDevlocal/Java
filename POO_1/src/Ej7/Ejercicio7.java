package Ej7;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Persona Jamon = new Persona();
        Persona Bebidas = new Persona();
        Persona Otros = new Persona();
        String tipo_de_regalo = "null";
        Scanner entrada = new Scanner(System.in);
        while (!"fin".equals(tipo_de_regalo)) {
            System.out.println("Introduzca el tipo de regalo que desee recibir");
            System.out.println("Opciones disponibles: Jamon Iberico, Bebidas, Otros");
            System.out.println("Si no desea seguir con las operaciones escriba 'fin'");
            tipo_de_regalo = entrada.nextLine();
            if ("fin".equals(tipo_de_regalo)) {
                System.out.println("Fin del programa");
                
            }
            if (!"Jamon Iberico".equals(tipo_de_regalo) && 
                !"Bebidas".equals(tipo_de_regalo) && 
                !"Otros".equals(tipo_de_regalo)) {
                System.out.println("Error: Tipo de regalo no valido. Intente de nuevo.");
                
            }
            if ("Jamon Iberico".equals(tipo_de_regalo)) {
                Jamon.setEdad(); 
                Jamon.setNumeroPersonas(); 
                Jamon.setEdadMedia(); 
            } else if ("Bebidas".equals(tipo_de_regalo)) {
                Bebidas.setEdad();
                Bebidas.setNumeroPersonas();
                Bebidas.setEdadMedia();
            } else if ("Otros".equals(tipo_de_regalo)) {
                Otros.setEdad();
                Otros.setNumeroPersonas();
                Otros.setEdadMedia();
            }
        }
        int totalPersonas = Jamon.getNumeroPersonas() + Bebidas.getNumeroPersonas() + Otros.getNumeroPersonas();
        int edadMediaTotal = (Jamon.getEdadMedia() + Bebidas.getEdadMedia() + Otros.getEdadMedia()) / totalPersonas;
        
        System.out.println("TIPO DE REGALO \t \t      NUMERO PERSONAS \t \t  EDAD MEDIA \t \t   PORCENTAJE");
        System.out.println("Jamon Iberico \t \t \t \t" + Jamon.getNumeroPersonas() + "\t \t \t " + Jamon.getEdadMedia() + "\t \t \t " + Jamon.calcularPorcentaje(totalPersonas) + "%");
        System.out.println("Bebidas       \t \t \t \t" + Bebidas.getNumeroPersonas()+"\t \t \t " + Bebidas.getEdadMedia()+"\t \t \t " + Bebidas.calcularPorcentaje(totalPersonas) + "%");
        System.out.println("Otros         \t \t \t \t" + Otros.getNumeroPersonas() + "\t \t \t " + Otros.getEdadMedia() + "\t \t \t " + Otros.calcularPorcentaje(totalPersonas) + "%");
        System.out.println("Resumen       \t \t \t \t" + totalPersonas +             "\t \t \t "  + edadMediaTotal);
        if (Jamon.getNumeroPersonas()> Bebidas.getNumeroPersonas() && Jamon.getNumeroPersonas() > Otros.getNumeroPersonas()){
            System.out.println("El regalo mas solicitado es el Jamon Iberico");
        }
        else {
             if (Bebidas.getNumeroPersonas()> Jamon.getNumeroPersonas() && Bebidas.getNumeroPersonas() > Otros.getNumeroPersonas()){
             System.out.println("El regalo mas solicitado son las Bebidas");
        }
             else {
                  if (Otros.getNumeroPersonas()> Jamon.getNumeroPersonas() && Otros.getNumeroPersonas() > Bebidas.getNumeroPersonas()){
                  System.out.println("El regalo mas solicitado son Otros");
        }
                  else System.out.println("No hay regalo mas solicitado");
             }
        }
    }
}

    


