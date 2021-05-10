/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_05;

import java.util.ArrayList;

/**
 *
 * @author dzboy
 */
public class Slide_05_01_ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // ArrayList có thể được xem như mảng động, có thể thêm bớt các phần tử 
        // một cách mềm dẻo. ArrayList còn cho phép thực hiện các phép toán
        // tập hợp như hợp, giao, hiệu
        
        ArrayList a = new ArrayList();
        a.add("Cường");
        a.add(true);
        a.add(1);
        a.add(2.5);
        
        // Khi add thêm số nguyên thủy thì tự động chuyển sang đối tượng kiểu 
        // wrapper
        //  Khi truy xuất các phần tử, cần ép về kiểu gốc của phần tử để xử lý
        Integer x = (Integer)a.get(2);
    }
    
}
