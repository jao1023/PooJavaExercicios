package aprendendo.projetoSistemaDeRH.operations;

import aprendendo.projetoSistemaDeRH.hr.Employee;

public class Project {
    private String projectName;
    private Employee projectResponsable;
    private int teamMax = 0;
    private int[] employeeIdTeam = new int[10];
    private int projectMembers = 1;
    private double projectValue;

    public Project(String projectName, double projectValue, Employee projectResponsable) {
        this.projectName = projectName;
        this.projectValue = projectValue;
        this.projectResponsable = projectResponsable;;
    }

    public void addEmployee(Employee id_employe){
        if(projectMembers < 10) {
            employeeIdTeam[projectMembers] = id_employe.getEmployeeId();
            projectMembers++;
        }else{
            System.out.println("Max project members");
        }
    }



    public String toString(){
        return "[PROJECT_NAME = " + projectName + "] " +
                "[VALUE = " + projectValue + "]" +
                "[RESPONSABLE = " + projectResponsable.getEmployeeName() + "]"+
                "[TEAM TOTAL MEMBERS = " + projectMembers + "]";

    };

    }












    

