/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_03;

/**
 *
 * @author dzboy
 */
public class Slide_03_08_DuyetMang {
    public static void main(String[] args) {
        // FOR EACH
        // Cú pháp
        // for (<<kiểu >> x : <<tập hợp>>){
            // Xử lý phần tử x
        //}
        // => For each được sử dụng để duyệt tập hợp. Mỗi lần lấy 1 phần tử từ 
        // tập hợp và xử lý phần tử đó.
        
        // DUYỆT MẢNG
        // 2 vòng lặp thường được sử dụng để duyệt mảng là for và for-each.
        // for
        int[] a1 = {4, 3, 5, 9};
        for(int i=0; i<a1.length; i++){
            System.out.println(a1[i]);
        }
        System.out.println("+-------------+");
        
        // for-each
        int[] a2 = {4, 3, 5, 9};
        for (int x : a2){
            System.out.println(x);
        }
    }
}
