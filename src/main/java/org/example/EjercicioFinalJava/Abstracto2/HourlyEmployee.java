package org.example.EjercicioFinalJava.Abstracto2;

public class HourlyEmployee extends Employee {
    private double tarifaPorHora;
    private int horasTrabajadas;

    public HourlyEmployee(String nombre, String cargo, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, cargo);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calculateWeeklyPay() {
        return tarifaPorHora * horasTrabajadas;
    }
}
