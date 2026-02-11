package aprendendo.poo.projetoSistemaDeRH.operations;

import aprendendo.poo.projetoSistemaDeRH.hr.Employee;

public interface Allocable {

    void addEmployee(Employee employee);
    void remEmployee(Employee employee);
    int getAllocatedEmployees();
    boolean isFull();

}
