/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_08;

/**
 *
 * @author dzboy
 */
public class Slide_08_05_DemoThamSoBienDoi {
    public static void main(String[] args) {
        int s1 = sum(2,7);
        int s2 = sum(3,8,3,7,4);
        System.out.println(s1);
        System.out.println(s2);
        
        String s3 = ghepChuoi("N","g","u","y","e","n");
        System.out.println(s3);
    }
    public static int sum(int...x){
        int s = 0;
        for(int a : x){
            s += a;
        }
        return s;
    }
    
    public static String ghepChuoi(String...str){
        String s = "";
        for (String x : str) {
            s+=x; 
        }
        return s;
    }
}
