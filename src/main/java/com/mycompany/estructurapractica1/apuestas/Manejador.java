/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructurapractica1.apuestas;

import javax.swing.JTable;

/**
 *
 * @author jhony
 */
public class Manejador {
    public static Apuesta[] Lista;
    public static int NLinea = 0;
    public static String Error = "";
    
    public Manejador(){
     
    }
    
    public static void Iniciar(int SizeArray){
     Lista = new Apuesta[SizeArray];
        
    }
    
    public  void Create(String Line){
        
        int n = 0;
        int Size = Line.length();
        char L = Line.charAt(0);
        String Descripcion = "Error de estructura";
        String Nombre = "";
         int Monto = 0;
         int Pos1 = 0;
         int Pos2 = 0;
         int Pos3 = 0;
         int Pos4 = 0;
         int Pos5 = 0;
         int Pos6 = 0;
         int Pos7 = 0;
         int Pos8 = 0;
         int Pos9 = 0;
         int Pos10 = 0;
         int Vuelta = 1;
         int Inicio=0;
         int Fin=0;
         
        while(n != Size){
             
             if(Line.charAt(n) == ','){
                 Fin = n;
                
             
             }
             if(Vuelta==12 && n ==(Size-1)){
                 Fin = Size;
             }
             
             if((Inicio != Fin && Line.charAt(n) == ','&&Vuelta!=12)|(Inicio != Fin &&Vuelta ==12 && Fin!=0)){
                
                String Cadena = Line.substring(Inicio,Fin);
                boolean esNumero = Cadena.matches("[+-]?\\d*(d+)?");
                Inicio = n+1;
                Fin = 0;
                
                if(esNumero|Vuelta==1){
                 switch(Vuelta){
                     case 1: 
                     Nombre = Cadena;
                     break;
                 case 2: 
                     Monto = Integer.parseInt(Cadena);
                     break;
                 case 3: 
                     Pos1 = Integer.parseInt(Cadena);
                     break;
                 case 4:
                     Pos2 = Integer.parseInt(Cadena);
                     break;
                 case 5: 
                    Pos3= Integer.parseInt(Cadena);
                     break;
                 case 6: 
                     Pos4 = Integer.parseInt(Cadena);
                     break;
                 case 7: 
                     Pos5 = Integer.parseInt(Cadena);
                     break;
                 case 8: 
                     Pos6 = Integer.parseInt(Cadena);
                     break;
                 case 9: 
                     Pos7 = Integer.parseInt(Cadena);
                     break;
                 case 10: 
                     Pos8 = Integer.parseInt(Cadena);
                     break;
                 case 11: 
                     Pos9 = Integer.parseInt(Cadena);
                     
                     break;
                 case 12: 
                     Pos10 = Integer.parseInt(Cadena);
                     break;
                 default:
                      System.out.println("Error de archivo");
                     break;
                 }
                  Vuelta++;
                } else{
                    
                    Descripcion = "Valor no es un Numero";
                }
                 
             }
            
             
             
             n++;
             
        }
        
       
         if(Vuelta == 13) {
                 
                 Apuesta p = new Apuesta(Nombre,Monto,Pos1,Pos2,Pos3,Pos4,Pos5,Pos6,Pos7,Pos8,Pos9,Pos10);
                 System.out.println("Linea "  + NLinea);
                 Lista[NLinea] =  p;
                 NLinea++;
         }else{
            
            Error+="\n"+Line + "\t" + Descripcion + "\n";
         
         }
        
       
         
      
         
    }
    
    public static void Comprobar(){
        
        Apuesta[] Lista1 = new Apuesta[Lista.length];
        int Posicion = 0;
        boolean tmp = false;
       for(int i=0;i<NLinea;i++){
           int n1 = Lista[i].getPos1();
           int n2 = Lista[i].getPos2();
           int n3 = Lista[i].getPos3();
           int n4 = Lista[i].getPos4();
           int n5 = Lista[i].getPos5();
           int n6 = Lista[i].getPos6();
           int n7 = Lista[i].getPos7();
           int n8 = Lista[i].getPos8();
           int n9 = Lista[i].getPos9();
           int n10 = Lista[i].getPos10();
           
           if(Valido(n1)&&Valido(n2)&&Valido(n3)&&Valido(n4)&&Valido(n5)&&Valido(n6)&&Valido(n7)&&Valido(n8)&&Valido(n9)&&Valido(n10)){
               int fac = n1*n2*n3*n4*n5*n6*n7*n8*n9*n10;
               if(fac == 3628800) tmp =true;
               
           }
           
           if(tmp){
               Lista1[Posicion] = Lista[i];
               Posicion++;
           }else{
               Error+=Lista[i].toString() +"\t"+"Numero repetido o fuera de rango" + "\n";
           }
           tmp = false;
       }
       
       Lista = Lista1;
       NLinea = Posicion;
      
    }
    
    public static boolean Valido(int n ){
        if(n==1|n==2|n==3|n==4|n==5|n==6|n==7|n==8|n==9|n==10) return true;
        else return false;
        
    
    }
    
    
    public  void CalculoResultados(int[] Resultados){
        
        for(int i=0;i<NLinea;i++){
            if(Lista[i].getPos1() == Resultados[0]){
                Lista[i].setPuntaje(Lista[i].getPuntaje() + 10);
            }
            
            if(Lista[i].getPos2() == Resultados[1]){
                Lista[i].setPuntaje(Lista[i].getPuntaje() + 9);
            }
            
            if(Lista[i].getPos3() == Resultados[2]){
                Lista[i].setPuntaje(Lista[i].getPuntaje() + 8);
            }
            if(Lista[i].getPos4() == Resultados[3]){
                Lista[i].setPuntaje(Lista[i].getPuntaje() + 7);
            }
            if(Lista[i].getPos5() == Resultados[4]){
                Lista[i].setPuntaje(Lista[i].getPuntaje() + 6);
            }
            if(Lista[i].getPos6() == Resultados[5]){
                Lista[i].setPuntaje(Lista[i].getPuntaje() + 5);
            }
            if(Lista[i].getPos7() == Resultados[6]){
                Lista[i].setPuntaje(Lista[i].getPuntaje() + 4);
            }
            if(Lista[i].getPos8() == Resultados[7]){
                Lista[i].setPuntaje(Lista[i].getPuntaje() + 3);
            }
            if(Lista[i].getPos9() == Resultados[8]){
                Lista[i].setPuntaje(Lista[i].getPuntaje() + 2);
            }
            if(Lista[i].getPos10() == Resultados[9]){
                Lista[i].setPuntaje(Lista[i].getPuntaje() + 1);
            }
        }
    
    
    }
    
    
    public  void Ordenar(Apuesta[] A, int izq, int der) {

        Apuesta pivote=A[izq]; 
        int i=izq;       
        int j=der;         
        Apuesta aux;
 
        while(i < j){                                                             
        while(A[i].getPuntaje() <= pivote.getPuntaje() && i < j) i++; 
            while(A[j].getPuntaje() > pivote.getPuntaje()) j--;           
            if (i < j) {                                            
                aux= A[i];                      
                A[i]=A[j];
                A[j]=aux;
            }
        }
   
        A[izq]=A[j];                                         
        A[j]=pivote;      
   
        if(izq < j-1)
            Ordenar(A,izq,j-1);         
        if(j+1 < der)
        Ordenar(A,j+1,der);          
   
    }
    
    public  void OrdenarS(Apuesta[] A, int izq, int der) {

        Apuesta pivote=A[izq]; 
        int i=izq;       
        int j=der;         
        Apuesta aux;
        
        while(i < j){                                                             
        while(A[i].getNombre().charAt(0) <= pivote.getNombre().charAt(0) && i < j) i++; 
            while(A[j].getNombre().charAt(0) > pivote.getNombre().charAt(0)) j--;           
            if (i < j) {         
                
                aux= A[i];                      
                A[i]=A[j];
                A[j]=aux;
            }
        }
        
        A[izq]=A[j];
        A[j]=pivote;      
        
        
   
        if(izq < j-1) 
            OrdenarS(A,izq,j-1);         
        if(j+1 < der) 
            OrdenarS(A,j+1,der);          
   
    }
    
    
    public void Reiniciar(){
        for(int i=0;i<NLinea;i++){
            Lista[i].setPuntaje(0);
        }
    }
    
    
}
