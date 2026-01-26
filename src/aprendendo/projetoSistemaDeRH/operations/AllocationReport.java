package aprendendo.projetoSistemaDeRH.operations;

import aprendendo.projetoSistemaDeRH.hr.Employee;

public record AllocationReport(
        String projectName,
        int employeeId,
        String employeeName,
        double salary,
        ProjectStatus status) {}

