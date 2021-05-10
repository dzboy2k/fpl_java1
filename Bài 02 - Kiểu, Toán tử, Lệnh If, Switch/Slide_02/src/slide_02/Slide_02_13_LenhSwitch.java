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
public class Slide_02_13_LenhSwitch {

    public static void main(String[] args) {
        // Cú pháp
        // switch (<<biểu thức>>) 
        // {
            // case <<giá trị 1>>:
                // Công việc 1
            // break;
            // case <<giá trị 2>>:
                // Công việc 2
            // break;
                // …
            // default:
                // Công việc N+1
            // break;
        // }
        // So sánh giá trị của biểu thức switch với giá trị của các case. Nếu bằng với 
        // giá trị của case nào thì sẽ thực hiện công việc của case đó, ngược lại sẽ 
        // thực hiện công việc của default.
        // Nếu công việc của case không chứa lệnh break thì case tiếp sau sẽ được
        // thực hiện
        // default là tùy chọn
        
        double a = 5, b = 7, c = -1;
        char op = '+';
        switch (op) {
            case '+':
                c = a + b;
                break;
            case '-':
                c = a - b;
                break;
            case 'x':
            case ':':
                System.out.println("Đang xây dựng");
                break;
            default:
                System.out.println("Vui lòng chọn +, -, x và :");
                break;
        }
    }
}
