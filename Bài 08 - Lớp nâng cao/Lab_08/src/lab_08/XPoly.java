/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_08;

/**
 *
 * @author dzboy
 */
final public class XPoly {
    public static final double sum(double...x){
        double sum=0;
        for (double s : x) {
            sum += s;
        }
        return sum; 
    }
    public static final double min(double...x){
        double min = x[0];
        for (double s : x) {
            if(min > s){
                min = s;
            }
        }
        return min;
    }
    public static final double max(double...x){
        double max = x[0];
        for (double s : x) {
            if(max < s){
                max = s;
            }
        }
        return max;
    }
    public static final String toUpperFirstChar(String s){
        String[] words = s.split(" "); // Tách chuỗi tham số theo ký tự trắng 
        for (int i = 0; i < words.length; i++) {
            char firstChar = words[i].charAt(0); // lấy ký tự đầu tiên của mỗi từ
            // đổi sang ký tự hoa
            char upperFirstChar = String.valueOf(firstChar).toUpperCase().charAt(0); 
            words[i] = upperFirstChar + words[i].substring(1);
        }
        String ss = String.join(" ", words); // nối mảng các từ thành chuỗi
        return ss; 
    }
}