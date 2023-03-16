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
public class Diem {
    float x, y;
    
    public void InputCoordinates()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Diem x: ");
        x = sc.nextFloat();
        System.out.print("Nhap Diem y: ");
        y = sc.nextFloat();
        
    }
    public void OutputCoordinates()
    {
        System.out.println("(" + x + ","+y+")");
    }
}
