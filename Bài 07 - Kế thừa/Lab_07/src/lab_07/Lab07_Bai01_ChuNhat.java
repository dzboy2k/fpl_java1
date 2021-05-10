/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_07;

/**
 *
 * @author dzboy
 */
public class Lab07_Bai01_ChuNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ChuNhat cn = new ChuNhat(5, 8);
        ChuNhat vu = new Vuong(6);
        
        cn.xuat();
        vu.xuat();
    }
    
}
