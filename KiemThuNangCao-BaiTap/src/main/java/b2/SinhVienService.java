package b2;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> sinhVienList = new ArrayList<>();

    public void themSinhVien(SinhVien sv) {
        sinhVienList.add(sv);
    }

    public void suaSinhVien(int maSV, SinhVien svMoi) {
        for (SinhVien sv : sinhVienList) {
            if (sv.getMaSV() == maSV) {
                sv.setTenSV(svMoi.getTenSV());
                sv.setLop(svMoi.getLop());
                sv.setKhoaHoc(svMoi.getKhoaHoc());
                sv.setMonHoc(svMoi.getMonHoc());
            }
        }
    }

    public void xoaSinhVien(int maSV) {
        sinhVienList.removeIf(sv -> sv.getMaSV() == maSV);
    }

    public SinhVien timKiemSinhVien(int maSV) {
        for (SinhVien sv : sinhVienList) {
            if (sv.getMaSV() == maSV) {
                return sv;
            }
        }
        return null;
    }
}

