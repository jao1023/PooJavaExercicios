package aprendendo.poo.projetoSistemaDeRH;

import aprendendo.poo.projetoSistemaDeRH.financial.BankAccount;
import aprendendo.poo.projetoSistemaDeRH.financial.Departament;
import aprendendo.poo.projetoSistemaDeRH.hr.*;
import aprendendo.poo.projetoSistemaDeRH.operations.Project;

public class Main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   SISTEMA DE RH - TESTE COMPLETO");
        System.out.println("========================================\n");

        // 1. CRIAR FUNCIONÁRIOS
        System.out.println("--- CRIANDO FUNCIONÁRIOS ---");
        Manager joao = new Manager("João Silva", "joao@empresa.com");
        Manager maria = new Manager("Maria Santos", "maria@empresa.com");
        MonthlyEmployee carlos = new MonthlyEmployee("Carlos Oliveira", "carlos@empresa.com");
        MonthlyEmployee ana = new MonthlyEmployee("Ana Costa", "ana@empresa.com");
        HourlyEmployee pedro = new HourlyEmployee("Pedro Souza", "pedro@empresa.com", 160, 15.50);
        Internship lucas = new Internship("Lucas Pereira", "lucas@empresa.com");
        System.out.println("✓ 6 funcionários criados\n");

        // 2. CALCULAR BÔNUS E HORAS EXTRAS
        System.out.println("--- CALCULANDO BÔNUS E HORAS EXTRAS ---");
        joao.calculateBonus(50000);
        joao.calculateExtra(20, 25);
        maria.calculateBonus(30000);
        carlos.calculateBonus(20000);
        carlos.calculateExtra(15, 20);
        System.out.println("João - Salário: R$ " + joao.calculateSalary());
        System.out.println("Maria - Salário: R$ " + maria.calculateSalary());
        System.out.println("Carlos - Salário: R$ " + carlos.calculateSalary() + "\n");

        // 3. CRIAR DEPARTAMENTOS
        System.out.println("--- CRIANDO DEPARTAMENTOS ---");
        Departament ti = new Departament("TI", 50000);
        Departament rh = new Departament("RH", 30000);
        Departament vendas = new Departament("Vendas", 40000);
        System.out.println("✓ 3 departamentos criados\n");

        // 4. ALOCAR FUNCIONÁRIOS
        System.out.println("--- ALOCANDO FUNCIONÁRIOS ---");
        ti.addDepartamentResponsable(joao);
        ti.addEmployee(carlos);
        ti.addEmployee(pedro);
        ti.addEmployee(lucas);

        rh.addDepartamentResponsable(maria);
        rh.addEmployee(ana);
        System.out.println("✓ Funcionários alocados\n");

        // 5. EXIBIR DEPARTAMENTOS
        System.out.println("--- INFORMAÇÕES DOS DEPARTAMENTOS ---\n");
        ti.displayEmployees();
        System.out.println();
        rh.displayEmployees();
        System.out.println();
        vendas.displayEmployees();
        System.out.println();

        // 6. CRIAR PROJETOS (ADICIONA SALDO)
        System.out.println("--- CRIANDO PROJETOS ---");
        Project projeto1 = new Project("Sistema Web", 150000, joao, true);
        Project projeto2 = new Project("App Mobile", 80000, maria, true);
        System.out.println("Projeto 1: " + projeto1);
        System.out.println("Projeto 2: " + projeto2);
        System.out.println("\n✓ Projetos criados e pagos\n");

        // 7. VERIFICAR SALDO
        System.out.println("--- SALDO BANCÁRIO ---");
        System.out.println("Saldo atual: R$ " + BankAccount.getBalance() + "\n");

        // 8. PAGAR SALÁRIOS
        System.out.println("--- PAGANDO SALÁRIOS ---");
        try {
            System.out.println("Pagando TI (R$ " + ti.calculateDepartamentSalary() + ")...");
            BankAccount.payDepartmentSalary(ti);

            System.out.println("Pagando RH (R$ " + rh.calculateDepartamentSalary() + ")...");
            BankAccount.payDepartmentSalary(rh);

            System.out.println("Pagando Vendas (R$ " + vendas.calculateDepartamentSalary() + ")...");
            BankAccount.payDepartmentSalary(vendas);

        } catch (IllegalArgumentException e) {
            System.out.println("❌ ERRO: " + e.getMessage());
        }

        // 9. HISTÓRICO
        BankAccount.displayTransactions();

        // 10. TESTAR REMOÇÃO
        System.out.println("--- TESTANDO REMOÇÃO ---");
        System.out.println("Removendo Lucas do TI...");
        ti.remEmployee(lucas);
        System.out.println("Novo total TI: R$ " + ti.calculateDepartamentSalary());
        ti.displayEmployees();

        // 11. RESUMO FINAL
        System.out.println("\n========================================");
        System.out.println("            RESUMO FINAL");
        System.out.println("========================================");
        System.out.println("Saldo final: R$ " + BankAccount.getBalance());
        System.out.println(ti);
        System.out.println(rh);
        System.out.println(vendas);
        System.out.println("========================================\n");

        System.out.println("✓ TESTE COMPLETO FINALIZADO!");
    }
}