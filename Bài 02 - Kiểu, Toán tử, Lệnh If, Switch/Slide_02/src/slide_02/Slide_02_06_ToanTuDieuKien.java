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
public class Slide_02_06_ToanTuDieuKien {

    public static void main(String[] args) {
        // Toán tử điều kiện là toán tử 3 ngôi duy nhất trong ngôn ngữ Java
        // Cú pháp: <điều kiện> ? <giá trị đúng> : <giá trị sai>
        // Nếu biểu thức <điều kiện> có giá trị là true thì kết quả của biểu thức 
        // là <giá trị đúng>, ngược lại là <giá trị sai>
        int a = 1, b = 9;
        int max = a > b ? a : b;
        System.out.println(max);
    }
}
