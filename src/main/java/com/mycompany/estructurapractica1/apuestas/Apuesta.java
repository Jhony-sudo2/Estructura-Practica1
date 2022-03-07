/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructurapractica1.apuestas;


public class Apuesta {
    private String Nombre;
    private int Puntaje = 0;

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    private int Monto;
    private int Pos1;
    private int Pos2;
    private int Pos3;
    private int Pos4;
    private int Pos5;
    private int Pos6;
    private int Pos7;
    private int Pos8;
    private int Pos9;
    private int Pos10;

    public Apuesta(String Nombre, int Monto, int Pos1, int Pos2, int Pos3, int Pos4, int Pos5, int Pos6, int Pos7, int Pos8, int Pos9, int Pos10) {
        this.Nombre = Nombre;
        this.Monto = Monto;
        this.Pos1 = Pos1;
        this.Pos2 = Pos2;
        this.Pos3 = Pos3;
        this.Pos4 = Pos4;
        this.Pos5 = Pos5;
        this.Pos6 = Pos6;
        this.Pos7 = Pos7;
        this.Pos8 = Pos8;
        this.Pos9 = Pos9;
        this.Pos10 = Pos10;
    }

    public String getNombre() {
        return Nombre;
    }
    
    public void setPuntaje(int Pos){
        this.Puntaje = Pos;
    }
    
    public int getPuntaje(){
        return Puntaje;
    }

    public int getMonto() {
        return Monto;
    }

    public int getPos1() {
        return Pos1;
    }

    public int getPos2() {
        return Pos2;
    }

    public int getPos3() {
        return Pos3;
    }

    public int getPos4() {
        return Pos4;
    }

    public int getPos5() {
        return Pos5;
    }

    public int getPos6() {
        return Pos6;
    }

    public int getPos7() {
        return Pos7;
    }

    public int getPos8() {
        return Pos8;
    }

    public int getPos9() {
        return Pos9;
    }

    public int getPos10() {
        return Pos10;
    }
    
   @Override
   public String toString(){
    return getNombre() + "," + getPos1()+"," + getPos2()+"," + getPos3()
    +"," + getPos4()+"," + getPos5()+"," + getPos6()+"," + getPos7()
            +"," + getPos8()+"," + getPos9()+"," + getPos10();
   }
    
}
