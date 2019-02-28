package pl.sdacademy.company;

import java.util.Collection;

public interface Company {

  void addEmployee(Employee employee);

  Collection<Employee> findEmployees(String lastName);
}

