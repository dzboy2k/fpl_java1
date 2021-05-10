/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_08._01_demoConstructor;

/**
 *
 * @author dzboy
 */
public class Child extends Parent{
    // Parent không có constructor không tham số nên gây lỗi lúc dịch
    public Child(int x) {
        super(x);
    }
    
}
