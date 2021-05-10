/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_04;

/**
 *
 * @author dzboy
 */
public class Slide_04_06_DacTaTruyXuat {
    public static void main(String[] args) {
        // ĐẶC TẢ TRUY XUẤT
        // Đặc tả truy xuất được sử dụng để định nghĩa khả năng cho phép truy 
        // xuất đến các thành viên của lớp. Trong java có 4 đặc tả khác nhau:
        //      private: chỉ được phép sử dụng nội bộ trong class
        //      public: công khai hoàn toàn
        //      {default}:
        //          Là public đối với các lớp truy xuất cùng gói
        //          Là private với các lớp truy xuất khác gói.
        //      protected: tương tự {default} nhưng cho phép kế thừa dù lớp 
        //      con và cha khác gói.
        // Mức độ che dấu tăng dần theo chiều mũi tên:
        //      public ==> protected ==> {default} ==> private
        
                                // package p1;
                                // public class A{
                                //    public int a;
                                //    protected int b;
                                //    int c;
                                //    private int d;
                                // }
        
    // package p1;                  package p2;                 package p3;             
    // public class B{              public class C{             public class D extends A{
    //      void method(){              void method(){              void method(){
    //          A x = new A();              A x = new A();              a = 1;
    //          x.a = 1;                    x.a = 1;                    b = 1;
    //          x.b = 1;                }                           }    
    //          x.c = 1;            }                           }   
    //      }                                                       
    // }  
    
    
    }
}
