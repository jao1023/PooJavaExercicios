package aprendendo.projetoSistemaDeRH.operations;

import aprendendo.projetoSistemaDeRH.hr.Employee;

public interface Allocable {

    void addEmployee(Employee employee);
    void remEmployee(Employee employee);
    int getAllocatedEmployees();
    boolean isFull();

}
