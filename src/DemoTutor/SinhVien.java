/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DemoTutor;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class SinhVien {

    private String hoTen;

    private String maSV;

    private Double diem;

    Scanner sc = new Scanner(System.in);

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public Double getDiem() {
        return diem;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }

    public SinhVien(String hoTen, String maSV, Double diem) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.diem = diem;
    }

    public SinhVien() {
    }

    public void nhap() {
        System.out.println("Nhập tên: ");
        hoTen = sc.nextLine();
        System.out.println("Nhập mã SV: ");
        maSV = sc.nextLine();
        System.out.println("Nhập điểm: ");
        diem = Double.parseDouble(sc.nextLine());

    }

    public void xuat() {
        System.out.println("Tên: " + hoTen);
        System.out.println("Mã: " + maSV);
        System.out.println("Điểm: " + diem);
    }
}
