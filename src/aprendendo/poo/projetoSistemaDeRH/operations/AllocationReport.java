package aprendendo.poo.projetoSistemaDeRH.operations;

public record AllocationReport(
        String projectName,
        int employeeId,
        String employeeName,
        double salary,
        ProjectStatus status) {}

