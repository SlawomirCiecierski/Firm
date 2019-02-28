package pl.sdacademy.company;

import java.util.ArrayList;
import java.util.Collection;


public class InMemoryCompany implements Company {

  private Collection<Employee> employees = new ArrayList<>();

  @Override
  public void addEmployee(Employee employee) {
    employees.add(employee);
    System.out.println("Dodano pracownika " + employee);
  }

  @Override
  public Collection<Employee> findEmployees(String lastName) {
    Collection<Employee> result = new ArrayList<>();
    for (Employee employee : employees
    ) {
      if (employee.getLastName().equals(lastName)) {
        result.add(employee);

      }

    }

    return result;
  }
}
