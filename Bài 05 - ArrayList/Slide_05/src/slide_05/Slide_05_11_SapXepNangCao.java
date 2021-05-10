/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author dzboy
 */
public class Slide_05_11_SapXepNangCao {
    public static void main(String[] args) {
        // Có 2 cách sử dụng Collections.sort() để sắp xếp ArrayList<Object>
        // Cách 1: Collections.sort(ArrayList) đối với các phần tử có khả năng 
        // so sánh (Integer, Double, String…)
        // Cách 2: Collections.sort(ArrayList, Comparator) bổ sung tiêu chí so 
        // sánh cho các phần tử. Cách này thường áp dụng cho các lớp do người 
        // dùng định nghĩa (NhanVien, SinhVienPoly…)
        
        // CÁCH 2
        // Tiêu chí so sánh được chỉ ra để thực hiện việc sắp xếp. Trong bài này 
        // tiêu chí so sánh 2 SVPoly là so sánh theo điểm.
        ArrayList<SVPoly> list = new ArrayList<SVPoly>();
        Comparator<SVPoly> comp = new Comparator<SVPoly>() {
            @Override
            public int compare(SVPoly o1, SVPoly o2) {
                return o1.getDiemTB().compareTo(o2.getDiemTB());
            }
        };
        Collections.sort(list, comp);
        
        // Kết quả của compare() được sử dụng để
        // sắp xếp o1 và o2. Có 3 trường hợp xảy ra:
        //       = 0: o1 = o2
        //       > 0: o1 > o2
        //       < 0: o1 < o2
    }
}
