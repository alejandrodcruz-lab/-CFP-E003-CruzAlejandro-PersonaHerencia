/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruzalejandro.archivos;

import java.io.File;
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

        System.out.println("Iniciando escritura...");

        try {
            File f = new File("numeros.txt");
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);

            for (int i = 0; i < 20; i++) {

                pw.println(i);
                System.out.println(i);
            }

            fw.close();
            System.out.println("Escritura finalizada");

        } catch (IOException e) {
            System.out.println("Error");
        }
    }

}
