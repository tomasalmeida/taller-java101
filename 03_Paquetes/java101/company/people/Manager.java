package java101.company.people;

public class Manager {

  public Employee empleado;

  public void setEmployee(Employee empleado) {
    this.empleado = empleado;
  }

  public void verifyWorkTable() {
    empleado.printWorkTable();
  }

  public void orderProducts() {
    empleado.produce("jabon", 2, "verde");
    empleado.produce("jabon", 1, "amarillo");
    empleado.produce("jabon", 3, "rosa");
  }
}
