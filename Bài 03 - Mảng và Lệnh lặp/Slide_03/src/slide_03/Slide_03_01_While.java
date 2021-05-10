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
public class Slide_03_01_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Cú pháp
        // while (<<điều kiện>>) {
            // công việc
        // }
        
        // Thực hiện công việc trong khi biểu thức điều kiện có giá trị là true.
        
        int i = 1;
        while (i < 20) {
            System.out.println("Hello World !");
            i++;
        }
        // Đoạn mã trên xuất 19 dòng Hello World ra màn hình
    }

}
