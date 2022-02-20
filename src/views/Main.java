package views;

import model.Employee;
import model.FullTimeEmployee;
import model.PartTimeEmployee;

import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static Employee[] employees;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng nhân viên trong công ty: ");
        int numberOfEmployee = scanner.nextInt();
        Employee[] employees = new Employee[numberOfEmployee];

        for (int i = 0; i < numberOfEmployee; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ": ");
            System.out.print("Chọn loại nhân viên (1- Full time, 2- Part time): ");
            int choose = scanner.nextInt();

            if (choose == 1){
                employees[i] = new FullTimeEmployee();
        } else if (choose == 2){
                employees[i] = new PartTimeEmployee();
            }
            employees[i].information();
        }
        System.out.println("Thông tin nhân viên: ");

        for (int i = 0; i < numberOfEmployee; i++) {
            System.out.println(employees[i].toString());
        }
        System.out.println("Danh sách nhân viên Full time có mức lương thấp hơn mức lương trung bình là: ");
        double totalSalary = 0;
        double averageSalary;
        for (int i = 0; i < numberOfEmployee; i++) {
            totalSalary += employees[i].getSalary();
        }
        averageSalary = totalSalary/numberOfEmployee;

        for (int i = 0; i < numberOfEmployee; i++) {
            if (employees[i] instanceof FullTimeEmployee)
                if (employees[i].getSalary() < averageSalary){
                    System.out.println(employees[i].toString());
                }

        }

        System.out.print("Tổng số tiền lương phải trả cho nhân viên Part time là: ");
        double totalPartTimeEmployeeSalary = 0;
        for (int i = 0; i < numberOfEmployee; i++) {
            if (employees[i] instanceof PartTimeEmployee)
                totalPartTimeEmployeeSalary += employees[i].getSalary();
        }
        System.out.println(totalPartTimeEmployeeSalary);

    }
}
