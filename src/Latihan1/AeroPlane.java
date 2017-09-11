/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author BangKho
 */
public class AeroPlane extends Vehicle {
    public void walk(){
        System.out.println("AeroPlane is Flyinggggg!1!1!1!1");
    }
    public static void main(String[]args){
        AeroPlane garuda = new AeroPlane();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
}
