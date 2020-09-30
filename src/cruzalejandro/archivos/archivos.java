/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruzalejandro.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*

/*
2- Crear una clase Archivo con los atributos que crean necesarios, la clase tie-
-ne que tener dos métodos leer y escribir , donde leer recibe como argumento el 
archivo que tiene que leer y muestra el contenido por consola , y escribir reci-
-be como argumento el nombre del archivo y el contenido que tiene que almacenar 
en dicho archivo.
 */
/**
 *
 * @author EntornoVM
 */
public class archivos {

    public static void main(String[] args) {

        escribirArchivo("hola.txt");
        leerArchivo("hola.txt");

        escribirFraseArchivo("hola.txt", "Nota al final");
        leerArchivo("hola.txt");

        //Archivo que no existe
        leerArchivo("chau");
    }

    public static void escribirArchivo(String archivo) {

        try {
            File f = new File(archivo);
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);

            for (int i = 0; i < 20; i++) {

                pw.println("Frase n°" + i);
                System.out.println("Escribiendo Frase n:" + i);
            }

            fw.close();
            System.out.println("Escritura finalizada");

        } catch (IOException e) {
            System.out.println("Error al crear el archivo");
        }
    }

    public static void escribirFraseArchivo(String archivo, String frase) {

        try {
            File f = new File(archivo);
            FileWriter fw = new FileWriter(f, true);
            PrintWriter pw = new PrintWriter(fw);

            pw.println("Frase :" + frase);
            System.out.println("Escribiendo Frase :" + frase);

            fw.close();
            System.out.println("Escritura finalizada");

        } catch (IOException e) {
            System.out.println("Error al crear el archivo");
        }
    }

    public static void leerArchivo(String archivo) {

        try {
            File f = new File(archivo);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea = null;

            do {
                linea = br.readLine();
                if (linea != null) {

                    System.out.println("Leyendo :" + linea);
                }
            } while (linea != null);

            fr.close();
            System.out.println("Lectura finalizada");

        } catch (IOException e) {
            System.out.println("Error al leer un archivo");
        }

    }
};
