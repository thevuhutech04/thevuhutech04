package BT1;

import java.util.Scanner;

public class SinhVien {
    private String MaSV;
    private String TenSV;
    private String NamSinh;
    private String Sdt;
    private String DiaChi;

    public SinhVien() {
        MaSV = null;
        TenSV = null;
        NamSinh = null;
        Sdt = null;
        DiaChi = null;
    }

    public SinhVien(String ma, String ten, String NamSinh, String Sdt, String DiaChi) {
        MaSV = ma;
        TenSV = ten;
        this.NamSinh = NamSinh;
        this.Sdt = Sdt;
        this.DiaChi = DiaChi;                             
    }

    public SinhVien(SinhVien sv) {
        MaSV = sv.MaSV;
        TenSV = sv.TenSV;
        NamSinh = sv.NamSinh;
        Sdt = sv.Sdt;
        DiaChi = sv.DiaChi;
    }

    public void setMaSV(String ma) {
        MaSV = ma;
    }

    public void setTenSV(String ten) {
        TenSV = ten;
    }

    public String getMaSV() {
        return MaSV;
    }

    public String getTenSV() {
        return TenSV;
    }

    public String getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(String namSinh) {
        NamSinh = namSinh;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String sdt) {
        Sdt = sdt;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public void nhapsv() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        MaSV = sc.nextLine();
        System.out.print("Nhap ho ten sinh vien: ");
        TenSV = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        NamSinh = sc.nextLine();
        System.out.print("Nhap so dien thoai: ");
        Sdt = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        DiaChi = sc.nextLine();
    }

    public void xuatsv() {
        System.out.println(MaSV + " - " + TenSV + " - " + NamSinh + " - " + Sdt + " - " + DiaChi);
    }

    @Override
    public String toString() {
        return "SinhVien [MaSV=" + MaSV + ", TenSV=" + TenSV + ", NamSinh=" + NamSinh + ", Sdt=" + Sdt + ", DiaChi="
                + DiaChi + "]";
    } 
}
