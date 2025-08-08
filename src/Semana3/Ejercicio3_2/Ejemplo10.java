//package Semana3.Ejercicio3_2;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class Ejemplo10 {
//
//    public static void main(String[] args){
//        String archivo = "../personas (fijo).txt";
//
//        try(BufferedReader lector = new BufferedReader(new FileReader(archivo))){
//            String linea;
//
//            while((linea = lector.readLine() != null)){
//                //Extrae campos por posiciones fijas
//                String nombre = linea.substring(0,12).trim();
//                String apellido1 = linea.substring(12,24).trim();
//                String apellido2 = linea.substring(24,36).trim();
//                String id = linea.substring(36,45).trim();
//                String ciudad = linea.substring(36,55).trim();
//                int edad = Integer.parseInt(linea.substring(57, 60).trim());
//                String genero = linea.substring(60,70).trim();
//
//                Persona1 p = new Persona1(nombre, apellido1, apellido2, id, ciudad, edad, genero);
//                System.out.println(p);
//            }
//        } catch(IOException e){
//            System.err.printf("Error al leer el archivo: '%a'%n", e.getMessage());
//        }
//    }
//}
