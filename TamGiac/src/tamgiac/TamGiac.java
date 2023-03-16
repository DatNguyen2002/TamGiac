/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tamgiac;

/**
 *
 * @author datnd
 */
public class TamGiac {

    /**
     * cho 3 điểm  A,B,C có tọa độ tự nhập
     * tính độ dài các cạnh(AB, BC, CB)
     * từ đó tính chu vi tam giác, diện tích tam giác.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DoanThang SLine = new DoanThang();
        SLine.InputDiem();
        System.out.print("Cac diem tam giac");
        SLine.OutputDiem();
        System.out.print("Chu vi tam giac: "+ SLine.TinhChuVi());
        System.out.print("Dien tich tam giac:" +SLine.TinhDienTich());
        
    }
    
}
