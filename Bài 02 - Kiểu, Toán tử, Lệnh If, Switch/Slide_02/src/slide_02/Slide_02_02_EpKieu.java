/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_02;

/**
 *
 * @author dzboy
 */
public class Slide_02_02_EpKieu {

    public static void main(String[] args) {
        int a = 5;
        double b = 9.4;
        b = a; //ép kiểu tự động
        a = (int) b; //ép kiểu tường minh phần thập phân sẽ bị bỏ
    }
}
