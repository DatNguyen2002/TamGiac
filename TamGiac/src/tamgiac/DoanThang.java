/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tamgiac;

import java.util.Scanner;

/**
 *
 * @author datnd
 */
public class DoanThang extends Diem{
    private Diem A, B, C;
    private float AB, BC, CA;
    
    public void InputDiem()
    {
        System.out.print("Nhap Diem A");
        A =new Diem();
        A.InputCoordinates();
        System.out.print("Nhap Diem B");
        B =new Diem();
        B.InputCoordinates();
        System.out.print("Nhap Diem C");
        C =new Diem();
        C.InputCoordinates();
    }
    public void OutputDiem()
    {
        System.out.print("Diem A co toa do: ");
        A.OutputCoordinates();
        System.out.print("Diem B co toa do: ");
        B.OutputCoordinates();
        System.out.print("Diem C co toa do: ");
        C.OutputCoordinates();
    }
    public void TinhDoanThang()
    {   //tinh do dai doan thang
        AB = (float)Math.sqrt(Math.pow((B.x - A.x),2)+ Math.pow((B.y - A.y),2));
        BC = (float)Math.sqrt(Math.pow((C.x - B.x),2)+ Math.pow((C.y - B.y),2));
        CA = (float)Math.sqrt(Math.pow((A.x - C.x),2)+ Math.pow((A.y - C.y),2));   
    }
    //tinh chu vi tam giac
    public float TinhChuVi()
    {
        return AB + BC + CA;
    }
    public float TinhDienTich()
    {
        float p = (float)(AB + BC + CA)/2;
        return (float)Math.sqrt(p*(p-AB)*(p-BC)*(p-CA));
    }
}
