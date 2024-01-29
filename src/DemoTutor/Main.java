/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DemoTutor;

import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.transform.OutputKeys;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<SinhVien> list = new ArrayList<>();

        QLSV qlsv = new QLSV();

        Scanner sc = new Scanner(System.in);

        int chon;

        while (true) {

            System.out.println("\n==============MENU================");
            System.out.println("1.Dừng chương trình.");
            System.out.println("2.Nhập danh sách nhân viên.");
            System.out.println("3.Xuất danh sách nhân viên.");
            System.out.println("4.Tìm và sửa nhân viên theo mã.");
            System.out.println("5.Sắp xếp nhân viên theo điểm.");
            System.out.print("Nhập vào lựa chọn: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    System.exit(0);
                    break;

                case 2:
                    qlsv.nhapThongTin();
                    break;

                case 3:
                    qlsv.xuatThongTin();
                    break;

                case 4:
                    System.out.print("Nhập vào mã muốn sửa: ");
                    String ma = sc.nextLine();
                    qlsv.sua(ma);
                    break;

                case 5:
                    qlsv.sapxep();
                    break;
                default:
                    System.out.println("Mời nhập lại.");
            }
        }
    }
}
