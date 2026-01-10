package aprendendo.poo.abstracao.ex02;

public class Main {

    public static void main(String[] args) {
        HoristicEmployee h1 = new HoristicEmployee("Joao", "123",100,40);
        EmployeeSalaryEarner e1 = new EmployeeSalaryEarner("José","1234",3000);
        CommissionedEmployee commissionedEmployee = new CommissionedEmployee("Junior","12345",5000);

        h1.displayData();
        e1.displayData();
        commissionedEmployee.displayData();
    }
}
