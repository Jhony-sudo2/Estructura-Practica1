/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructurapractica1.archivos;

import com.mycompany.estructurapractica1.apuestas.Manejador;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JTextArea;

/**
 *
 * @author jhony
 */
public class Archivo {
    
    public static void LeerArchivo(String Direccion){
        try{
        Manejador n = new Manejador();
        File Archivo = new File(Direccion);
        FileReader fr = new FileReader(Archivo);
        BufferedReader br = new BufferedReader(fr);
        Manejador.Iniciar((int)br.lines().count());
        Archivo = new File(Direccion);
        fr = new FileReader(Archivo);
        br = new BufferedReader(fr);
        String Linea;
       
        br = new BufferedReader(fr);
        while((Linea = br.readLine())!=null){
             
            System.out.println(Linea);
            n.Create(Linea);
          
        }
        }
        catch(Exception e){
        }
    
    }
    
    public static void Escribir(String n,String Nombre,String Encabezado){
        String Direccion = System.getProperty("user.dir") + "/ArchivosReportes/"+Nombre;
        System.out.println(Direccion);
        File f;
        FileWriter fichero;
        BufferedWriter br;
        PrintWriter pw;
        try{
            
            f = new File(Direccion);
            fichero = new FileWriter(f);
            br = new BufferedWriter(fichero);
            pw = new PrintWriter(br);
            
            pw.write(Encabezado + "\n");
           
                pw.write(n);
            
            pw.close();
            br.close();
            
            
        
        }catch(Exception e){
            
        }
        
    
    }
    
    
}
