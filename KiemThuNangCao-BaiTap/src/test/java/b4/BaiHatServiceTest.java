package b4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class BaiHatServiceTest {
    private BaiHatService service;

    @BeforeEach
    void setUp() {
        service = new BaiHatService();
    }

    @Test
    void testThemBaiHat() {
        BaiHat baiHat = new BaiHat("1", "Bai hat A", "Ca si A", 300, "Nhac si A");
        service.themBaiHat(baiHat);
        assertNotNull(service.timKiemBaiHat("1"));
    }

    @Test
    void testXoaBaiHat() {
        BaiHat baiHat = new BaiHat("1", "Bai hat A", "Ca si A", 300, "Nhac si A");
        service.themBaiHat(baiHat);
        service.xoaBaiHat("1");
        assertNull(service.timKiemBaiHat("1"));
    }

    @Test
    void testTimKiemBaiHat() {
        BaiHat baiHat = new BaiHat("1", "Bai hat A", "Ca si A", 300, "Nhac si A");
        service.themBaiHat(baiHat);

        BaiHat result = service.timKiemBaiHat("1");
        assertNotNull(result);
        assertEquals("Bai hat A", result.getTen());
    }

    @Test
    void testThemBaiHatSai() {
        BaiHat baiHat = new BaiHat("", "", "Ca si A", -300, "Nhac si A");
        service.themBaiHat(baiHat);
        BaiHat result = service.timKiemBaiHat("");
        assertNotNull(result);
        assertEquals("", result.getTen(), "Ten bai hat should be empty but is not.");
        assertTrue(result.getDoDai() < 0, "Do dai bai hat should be negative but is not.");
    }

    @Test
    void testXoaBaiHatSai() {
        BaiHat baiHat = new BaiHat("1", "Bai hat A", "Ca si A", 300, "Nhac si A");
        service.themBaiHat(baiHat);
        service.xoaBaiHat("999");
        assertNotNull(service.timKiemBaiHat("1"), "Bai hat with ID 1 should still exist but is not.");
    }

    @Test
    void testTimKiemBaiHatSai() {
        BaiHat result = service.timKiemBaiHat("999");
        assertNull(result, "Bai hat with ID 999 should not exist but is found.");
    }
}
