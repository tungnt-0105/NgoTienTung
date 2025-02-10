package b3;
import java.util.ArrayList;
import java.util.List;
public class EmployeeService {
    private List<Employee> employeeList = new ArrayList<>();

    public void themEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void suaEmployee(int id, Employee employeeMoi) {
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                employee.setFirstName(employeeMoi.getFirstName());
                employee.setLastName(employeeMoi.getLastName());
                employee.setEmail(employeeMoi.getEmail());
            }
        }
    }

    public void xoaEmployee(int id) {
        employeeList.removeIf(employee -> employee.getId() == id);
    }

    public Employee timKiemEmployee(int id) {
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

}
