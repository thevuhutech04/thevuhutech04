package BT1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        QuanLySinhVien list = new QuanLySinhVien();
        byte chon;
        Scanner sc = new Scanner(System.in);

        SinhVien sv;
        do {
            System.out.println("1: Them sinh vien vao danh sach.");
            System.out.println("2: Kiem tra danh sach co rong hay khong.");
            System.out.println("3: Lay ra so luong sinh vien trong danh sach.");
            System.out.println("4: Lam rong danh sach sinh vien.");
            System.out.println("5: Xoa 1 sinh vien ra khoi danh sach dua tren ma sinh vien.");
            System.out.println("6: Kiem tra sinh vien co ton tai trong danh sach hay khong.");
            System.out.println("7: Tim kiem mot sinh vien dua tren Ten.");
            System.out.println("8: Xuat ra danh sach sinh vien theo ma so tu thap den cao.");
            System.out.println("0: Thoat");
            System.out.print("Nhap lua chon: ");

            chon = sc.nextByte();
            sc.nextLine(); // consume newline

            switch (chon) {
                case 1:
                    sv = new SinhVien();
                    sv.nhapsv();
                    list.themsv(sv);
                    break;
                case 2:
                    list.isEmpty();
                    break;
                case 3:
                    System.out.println("So luong sinh vien trong danh sach: " + list.getSoLuong());
                    break;
                case 4:
                    list.clear();
                    break;
                case 5:
                    System.out.print("Nhap ma sinh vien can xoa: ");
                    String ma = sc.nextLine();
                    list.xoama(ma);
                    break;
                case 6:
                    System.out.print("Nhap ma sinh vien can kiem tra: ");
                    ma = sc.nextLine();
                    if (list.kiemTraTonTai(ma)) {
                        System.out.println("Sinh vien co ton tai trong danh sach.");
                    } else {
                        System.out.println("Sinh vien khong ton tai trong danh sach.");
                    }
                    break;
                case 7:
                    System.out.print("Nhap ten sinh vien can tim: ");
                    String ten = sc.nextLine();
                    list.timten(ten);
                    break;
                case 8:
                    list.sapxepgiamdan();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Tuy chon khong hop le. Vui long chon lai.");
            }
        } while (chon != 0);
    }
}
