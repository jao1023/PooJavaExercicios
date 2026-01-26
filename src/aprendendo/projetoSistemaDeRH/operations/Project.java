package aprendendo.projetoSistemaDeRH.operations;

import aprendendo.projetoSistemaDeRH.hr.Employee;

public class Project implements Allocable {
    private String projectName;
    private Employee projectResponsable;
    private static final int TEAM_MAX = 10;
    private Employee[] team = new Employee[10];
    private int projectMembers;
    private double projectValue;
    private ProjectStatus status;
    //Project constructor, the project automatic set a new project in the initial phase, and automatic set the responsible in the space zero in the array
    public Project(String projectName, double projectValue, Employee projectResponsable) {
        this.projectName = projectName;
        this.projectValue = projectValue;
        this.projectResponsable = projectResponsable;;
        status = ProjectStatus.IN_PLANING;

        team[0] = projectResponsable;
        projectMembers = 1;
    }
    //Method for go to the next status with validations, finished and canceled
    public void nextStatus(){
        if(status == ProjectStatus.CANCELED){
            throw new IllegalArgumentException("Can't proceed for next status - Project canceled");
        }
        if(status == ProjectStatus.FINISHED){
            throw new IllegalArgumentException("Can't proceed for next status - Project finished");
        }
        status = status.nextStatus();
    }
    //Method for cancel project
    public void cancelProject(){
        if(status == ProjectStatus.CANCELED){
            throw new IllegalArgumentException("Unable to cancel project - Project has already been canceled");
        }
        if(status.canCancel() == false){
            throw new IllegalArgumentException("Unable to cancel project - Project has already been finished");
        }
        status = status.CANCELED;
    }
    //Method for allocate one employee in a project,with validations, employee cant be null, employee is already on the team and max members in a project reached
    @Override
    public void addEmployee(Employee employee){
        if(employee == null){
            throw new IllegalArgumentException("Employee can't be null");
        }
        for(int i = 0; i < team.length; i++){
            if(employee == team[i]){
                throw new IllegalArgumentException("this function is already on the team ");
            }
        }
        for(int i = 0; i < team.length; i++){
            if(team[i] == null){
                team[i] = employee;
                projectMembers++;
                return;
            }
        }
        throw new IllegalStateException("Max team members reached");
    }
    //method for remove one employee off the project, with validations
    @Override
    public void remEmployee(Employee employee) {
        if(employee == null){
            throw new IllegalArgumentException("Employee can't be null");
        }

        for(int i = 0; i < team.length; i++){
            if(team[i].getEmployeeId() == employee.getEmployeeId()){
                team[i] = null;
                projectMembers--;
                return;
            }
        }
        throw new IllegalStateException("this function is not on the team");
    }
    //Method for get the team employees
    @Override
    public int getAllocatedEmployees() {
        return projectMembers;
    }
    //Method using forEach to display team members
    public void displayTeam(){
        for(Employee e : team){
            if(e != null){
                System.out.println(e);
            }
        }
    }
    //Boolean for return if the team is full or not
    @Override
    public boolean isFull() {
        return projectMembers == TEAM_MAX;
    }
    //Method for display the information in the report, same function at a relatory
    public AllocationReport[] generateReport(){
        AllocationReport[] report = new AllocationReport[projectMembers];
        int index = 0;

        for(Employee e : team){
            if(e != null){
                report[index++] = new AllocationReport(
                        projectName,
                        e.getEmployeeId(),
                        e.getEmployeeName(),
                        e.calculateSalary(),
                        status
                );
            }
        }
        return report;
    }

    //toString for display the informations
    public String toString(){
        return "[PROJECT_NAME = " + projectName + "] " +
                "[VALUE = " + projectValue + "]" +
                "[RESPONSABLE = " + projectResponsable.getEmployeeName() + "]"+
                "[TEAM TOTAL MEMBERS = " + projectMembers + "]" +
                "[TEAM IS FULL = " + isFull() + "]" +
                "[PROJECT STATUS = " + status + "]";

    };

    }












    

