/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author BangKho
 */
public class TestShape {
    public static void main(String []args){
        Shape s1 = new Rectangle("Blue",10,29);
        System.out.println(s1);
        System.out.println("Area is "+s1.getArea());
        
        Shape s2 = new Triangle("Violet",30,10);
        System.out.println(s2);
        System.out.println("Area is "+s2.getArea());
    }
}
