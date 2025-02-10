package b3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServiceTest {
    private EmployeeService service;

    @BeforeEach
    void setUp() {
        service = new EmployeeService();
    }

    @Test
    void testThemEmployee() {
        Employee employee = new Employee(1, "John", "Doe", "john.doe@example.com");
        service.themEmployee(employee);
        assertEquals(1, service.timKiemEmployee(1).getId());
    }

    @Test
    void testSuaEmployee() {
        Employee employee = new Employee(1, "John", "Doe", "john.doe@example.com");
        service.themEmployee(employee);

        Employee employeeMoi = new Employee(1, "Jane", "Smith", "jane.smith@example.com");
        service.suaEmployee(1, employeeMoi);

        assertEquals("Jane", service.timKiemEmployee(1).getFirstName());
    }

    @Test
    void testXoaEmployee() {
        Employee employee = new Employee(1, "John", "Doe", "john.doe@example.com");
        service.themEmployee(employee);
        service.xoaEmployee(1);
        assertNull(service.timKiemEmployee(1));
    }

    @Test
    void testTimKiemEmployee() {
        Employee employee = new Employee(1, "John", "Doe", "john.doe@example.com");
        service.themEmployee(employee);

        Employee result = service.timKiemEmployee(1);
        assertNotNull(result);
        assertEquals("John", result.getFirstName());
    }

    @Test
    void testThemEmployeeSai() {
        Employee employee = new Employee(1, "", "Doe", "john.doe@example.com");
        service.themEmployee(employee);
        Employee result = service.timKiemEmployee(1);
        assertNotNull(result);
        assertEquals("", result.getFirstName(), "First name should be empty but is not.");
    }

    @Test
    void testSuaEmployeeSai() {
        Employee employee = new Employee(1, "John", "Doe", "john.doe@example.com");
        service.themEmployee(employee);

        Employee employeeMoi = new Employee(1, null, "Smith", "jane.smith@example.com");
        service.suaEmployee(1, employeeMoi);

        assertNull(service.timKiemEmployee(1).getFirstName(), "First name should be null but is not.");
    }

    @Test
    void testTimKiemEmployeeSai() {
        Employee result = service.timKiemEmployee(999);
        assertNull(result, "Employee with ID 999 should not exist but is found.");
    }
}