package pl.sdacademy.company;

import java.util.Collection;

public class MainCompany {

  public static void main(String[] args) {
//SpringApplication.run(Configuration.class, args);


    Company firma = createCompany();

    Employee pracownik = new Employee();
    pracownik.setFirstName("Jan");
    pracownik.setLastName("Kowalski");
    firma.addEmployee(pracownik);
    Employee pracownik2 = new Employee();
    pracownik2.setFirstName("Jan");
    pracownik2.setLastName("Abacki");
    firma.addEmployee(pracownik2);

    Collection<Employee> allEmployeesWithJanName =
            firma.findEmployees("Kowalski");

    System.out.println(allEmployeesWithJanName);
  }

  private static Company createCompany() {
    return new InMemoryCompany();
  }

}
