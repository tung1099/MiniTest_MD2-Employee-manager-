package model;

import java.util.Scanner;

public class FullTimeEmployee extends Employee{
    private double bonus;
    private double fine;
    private double basicSalary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(double bonus, double fine, double basicSalary) {
        this.bonus = bonus;
        this.fine = fine;
        this.basicSalary = basicSalary;
    }

    public FullTimeEmployee(String employeeId, String name, int age, int numberPhone,
                            String email, double bonus, double fine, double basicSalary) {
        super(employeeId, name, age, numberPhone, email);
        this.bonus = bonus;
        this.fine = fine;
        this.basicSalary = basicSalary;
    }

    @Override
    public void information() {
        super.information();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tiền thưởng: ");
        bonus = scanner.nextDouble();
        System.out.print("Tiền phạt: ");
        fine = scanner.nextDouble();
        System.out.print("Mức lương cơ bản: ");
        basicSalary = scanner.nextDouble();

    }

    @Override
    public double getSalary(){
        double result = basicSalary + bonus - fine;
        return result;
    }

    @Override
    public String toString() {
        return "Nhân viên Full time{" +
                super.toString() +
                ", Tiền thưởng = " + bonus +
                ", Tiền phạt = " + fine +
                ", Lương cơ bản = " + basicSalary +
                ", Số lương thực lĩnh = " + getSalary() +
                '}';
    }
}
