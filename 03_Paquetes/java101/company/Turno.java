package java101.company;

import java101.company.people.Manager;
import java101.company.people.Employee;

public class Turno {
  public static void main(String[] args) {
    Manager jefe = new Manager();
    Employee empleado = new Employee("Paco", 8, 18);

    jefe.setEmployee(empleado);
    jefe.verifyWorkTable();
    jefe.orderProducts();
  }
}
