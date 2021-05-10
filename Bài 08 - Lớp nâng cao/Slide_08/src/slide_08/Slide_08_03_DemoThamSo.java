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
public class Slide_08_03_DemoThamSo {

    public static void main(String[] args) {
        int x=3, X[]={3};
        m(x);
        m(X);
        System.out.println(x);
        System.out.println(X[0]);
        
        Object o = new Object();
        o.x = 3;
        m(o);
        System.out.println(o.x);
    }

    public static void m(int x) {
        x += 5;
    }
    
    public static void m(int[] x){
        x[0] += 5;
    }

    public static void m(Object o){
        o.x += 5;
    }
}
