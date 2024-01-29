/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DemoTutor;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class QLSV {

    ArrayList<SinhVien> listSinhVien = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void nhapThongTin() {
        String check;
        do {
            SinhVien sinhVien = new SinhVien();
            sinhVien.nhap();
            listSinhVien.add(sinhVien);
            System.out.println("Bạn có muốn nhập nữa không? (y/n)");
            check = sc.nextLine();
        } while (check.equalsIgnoreCase("y"));
    }

    public void xuatThongTin() {
        for (SinhVien sinhVien : listSinhVien) {
            sinhVien.xuat();
        }
    }

    public SinhVien timKiemTheoMa(String ma) {
        for (SinhVien sinhVien : listSinhVien) {
            if (sinhVien.getMaSV().equalsIgnoreCase(ma)) {
                return sinhVien;
            }
        }
        return null;
    }

    public void sua(String ma) {
        if (timKiemTheoMa(ma) != null) {
            SinhVien sinhVien = timKiemTheoMa(ma);
            System.out.println("sinh vien có mã: " + ma);
            System.out.print("Nhap vao ten: ");
            String hoTen = sc.nextLine();
            System.out.print("Nhap vao diem: ");
            Double diem = sc.nextDouble();
            sinhVien.setDiem(diem);
            sinhVien.setHoTen(hoTen);
        } else {
            System.out.println("Khong co sinh vien nao co ma: " + ma);
        }

    }

    public void sapxep() {
        listSinhVien.sort((o1, o2) -> {
            return Double.compare(o1.getDiem(), o2.getDiem());
        });
    }

}
