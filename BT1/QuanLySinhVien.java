package BT1;

import java.util.ArrayList;
import java.util.Comparator;

public class QuanLySinhVien {
    ArrayList<SinhVien> ql = new ArrayList<SinhVien>();

    public void themsv(SinhVien sv) {
        ql.add(sv);
    }

    public void isEmpty() {
        if (ql.isEmpty()) {
            System.out.println("Danh sach rong");
        } else {
            System.out.println("Danh sach khong rong");
        }
    }

    public void xuatdanhsach() {
        for (SinhVien sv : ql) {
            sv.xuatsv();
        }
    }

    public void clear() {
        ql.clear();
        System.out.println("Da xoa toan bo danh sach");
    }

    public void xoama(String MaSv) {
        SinhVien svToRemove = null;
        for (SinhVien sv : ql) {
            if (sv.getMaSV().equals(MaSv)) {
                svToRemove = sv;
                break;
            }
        }
        if (svToRemove != null) {
            ql.remove(svToRemove);
            System.out.println("Da xoa sinh vien co ma " + MaSv);
        } else {
            System.out.println("Khong tim thay sinh vien co ma " + MaSv);
        }
    }

    public void timten(String TenSv) {
        for (SinhVien sv : ql) {
            if (sv.getTenSV().equals(TenSv)) {
                sv.xuatsv();
            }
        }
    }

    public void sapxepgiamdan() {
        if (ql.isEmpty()) {
            System.out.println("Danh sach rong");
            return;
        }
        ql.sort(Comparator.comparing(SinhVien::getMaSV).reversed());
        xuatdanhsach();
    }

    public int getSoLuong() {
        return ql.size();
    }

    public boolean kiemTraTonTai(String MaSv) {
        for (SinhVien sv : ql) {
            if (sv.getMaSV().equals(MaSv)) {
                return true;
            }
        }
        return false;
    }
}
