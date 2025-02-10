package b4;

import java.util.ArrayList;
import java.util.List;

public class BaiHatService {
    private List<BaiHat> danhSachBaiHat = new ArrayList<>();

    public void themBaiHat(BaiHat baiHat) {
        danhSachBaiHat.add(baiHat);
    }

    public void xoaBaiHat(String id) {
        danhSachBaiHat.removeIf(baiHat -> baiHat.getId().equals(id));
    }

    public BaiHat timKiemBaiHat(String id) {
        for (BaiHat baiHat : danhSachBaiHat) {
            if (baiHat.getId().equals(id)) {
                return baiHat;
            }
        }
        return null;
    }

}
