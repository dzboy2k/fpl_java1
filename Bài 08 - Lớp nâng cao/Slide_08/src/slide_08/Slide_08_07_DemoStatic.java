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
public class Slide_08_07_DemoStatic {

    public static void main(String[] args) {
        MyClass o = new MyClass();
        o.X += 300;
        MyClass.X += 500;
        MyClass.method();
        System.out.println(MyClass.X);
        System.out.println(o.X);
    }
}
