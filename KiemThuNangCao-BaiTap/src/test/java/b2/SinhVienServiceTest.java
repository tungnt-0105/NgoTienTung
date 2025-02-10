package b2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SinhVienServiceTest {
    private SinhVienService service;

    @BeforeEach
    void setUp() {
        service = new SinhVienService();
    }

    @Test
    void testThemSinhVien() {
        SinhVien sv = new SinhVien(1, "Nguyen Van A", "12A", "2023", "Toán");
        service.themSinhVien(sv);
        assertEquals(1, service.timKiemSinhVien(1).getMaSV());
    }

    @Test
    void testSuaSinhVien() {
        SinhVien sv = new SinhVien(1, "Nguyen Van A", "12A", "2023", "Toán");
        service.themSinhVien(sv);

        SinhVien svMoi = new SinhVien(1, "Nguyen Van B", "12B", "2024", "Lý");
        service.suaSinhVien(1, svMoi);

        assertEquals("Nguyen Van B", service.timKiemSinhVien(1).getTenSV());
    }

    @Test
    void testXoaSinhVien() {
        SinhVien sv = new SinhVien(1, "Nguyen Van A", "12A", "2023", "Toán");
        service.themSinhVien(sv);
        service.xoaSinhVien(1);
        assertNull(service.timKiemSinhVien(1));
    }

    @Test
    void testTimKiemSinhVien() {
        SinhVien sv = new SinhVien(1, "Nguyen Van A", "12A", "2023", "Toán");
        service.themSinhVien(sv);

        SinhVien result = service.timKiemSinhVien(1);
        assertNotNull(result);
        assertEquals("Nguyen Van A", result.getTenSV());
    }
}
