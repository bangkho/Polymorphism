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
public class Rectangle extends Shape{
    private int lenght;
    private int width;
    public Rectangle(String color, int lenght, int width) {
        super(color);
        this.lenght=lenght;
        this.width=width;
    }
    public String toString(){
        return "Rectangle[Lenght="+lenght+", Width="+width+","+super.toString()+"]";
    }
    public double getArea(){
        return lenght*width;
    }
}
