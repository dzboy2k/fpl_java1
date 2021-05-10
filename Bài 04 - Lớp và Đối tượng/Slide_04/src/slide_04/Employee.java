/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_04;

import java.util.Scanner;

/**
 *
 * @author dzboy
 */
public class Employee {
    // Lớp Employee có 2 thuộc tính là fullname và salary và 2 phương thức là 
    // input() và output()
    
    public String fullname; // Trường
    public double salary;
    
    public void input(){ // Phương thức
        Scanner scanner = new Scanner(System.in);
        System.out.print(" >> Full Name: ");
        this.fullname = scanner.nextLine();
        
        System.out.print(" >> Salary: ");
        this.salary = scanner.nextDouble();
    }
    
    public void ouput(){
        System.out.println(this.fullname);
        System.out.println(this.salary);
    }
    
    // Kiểu trả về là void nên thân phương thức không chứa lệnh return giá trị
    public void setinfo(String fullname, double salary){
        this.fullname = fullname;
        this.salary = salary;
    }
    
    // Kiểu trả về là double nên thân phương thức phải chứa lệnh return số thực
    public double incomeTax(){
        if(this.salary < 5000000){
            return 0;
        }
        double tax = (this.salary - 5000000) * 10/100;
        return tax;
    }
}
