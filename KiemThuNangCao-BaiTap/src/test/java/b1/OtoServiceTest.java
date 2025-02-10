package b1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OtoServiceTest {
    private OtoService service;

    @BeforeEach
    void setUp() {
        service = new OtoService();
    }

    @Test
    void testThemOto() {
        Oto oto = new Oto(1, "Toyota", 50000, "SUV");
        service.themOto(oto);
        assertEquals(1, service.timKiemOto(1).getId());
    }

    @Test
    void testSuaOto() {
        Oto oto = new Oto(1, "Toyota", 50000, "SUV");
        service.themOto(oto);

        Oto otoMoi = new Oto(1, "Honda", 45000, "Sedan");
        service.suaOto(1, otoMoi);

        assertEquals("Honda", service.timKiemOto(1).getTen());
    }

    @Test
    void testXoaOto() {
        Oto oto = new Oto(1, "Toyota", 50000, "SUV");
        service.themOto(oto);
        service.xoaOto(1);
        assertNull(service.timKiemOto(1));
    }

    @Test
    void testTimKiemOto() {
        Oto oto = new Oto(1, "Toyota", 50000, "SUV");
        service.themOto(oto);

        Oto result = service.timKiemOto(1);
        assertNotNull(result);
        assertEquals("Toyota", result.getTen());
    }
}