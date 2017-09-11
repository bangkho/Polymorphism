/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author BangKho
 */
public class Staf extends Pegawai{
    private static int gajiStaf=50000;
    private static int bonusStaf=10000;
    
    public int gaji(){
        return gajiStaf;
    }
    public int Bonus(){
        return bonusStaf;
    }
}
