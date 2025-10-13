package org.example.EjercicioFinalJava.Abstracto2;

public class SalaryEmployee extends Employee{
    private double salarioSemanal;

    public SalaryEmployee(String nombre, String cargo, double salarioSemanal) {
        super(nombre, cargo);
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double calculateWeeklyPay() {
        return salarioSemanal;
    }
}
