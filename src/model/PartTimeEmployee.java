package model;

import java.util.Scanner;

public class PartTimeEmployee extends Employee{
    public static final int HOURLY_SALARY = 100000;
    private double workHour;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(double workHour) {
        this.workHour = workHour;
    }

    public PartTimeEmployee(String employeeId, String name, int age, int numberPhone,
                            String email, double workHour) {
        super(employeeId, name, age, numberPhone, email);
        this.workHour = workHour;
    }

    public double getWorkHour() {
        return workHour;
    }

    public void setWorkHour(double workHour) {
        this.workHour = workHour;
    }

    @Override
    public void information() {
        super.information();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số giờ làm : ");
        workHour = scanner.nextInt();
    }

    @Override
    public double getSalary() {
        double result = workHour * HOURLY_SALARY;
        return result;
    }

    @Override
    public String toString() {
        return "Nhân viên Part time{" +
                super.toString() +
                ", Số giờ làm việc =" + workHour +
                ", Lương thực lĩnh = " + getSalary() +
                '}';
    }
}
