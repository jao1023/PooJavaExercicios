package aprendendo.poo.abstracao.ex02;

public  class CommissionedEmployee extends Employee{
    double BASE_SALARY = 2500;
    double salesComission;

    public CommissionedEmployee(String name, String enrollment, double salesComission) {
        super(name, enrollment);
        this.salesComission = salesComission;
    }

    @Override
    double calculateSalary() {
        double salary = BASE_SALARY + salesComission;
        System.out.println("Salary: " + salary);
        return salary;
    }


}
