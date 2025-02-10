package b1;
import java.util.ArrayList;
import java.util.List;
public class OtoService {
    private List<Oto> otoList = new ArrayList<>();

    public void themOto(Oto oto) {
        otoList.add(oto);
    }

    public void suaOto(int ma, Oto otoMoi) {
        for (Oto oto : otoList) {
            if (oto.getId() == ma) {
                oto.setTen(otoMoi.getTen());
                oto.setGia(otoMoi.getGia());
                oto.setGhiChu(otoMoi.getGhiChu());
            }
        }
    }

    public void xoaOto(int ma) {
        otoList.removeIf(oto -> oto.getId() == ma);
    }

    public Oto timKiemOto(int ma) {
        for (Oto oto : otoList) {
            if (oto.getId() == ma) {
                return oto;
            }
        }
        return null;
    }

}
