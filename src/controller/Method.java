package controller;

import model.Employee;

public class Method {
    public static void displayEmployee(Employee[] employees){
        for (Employee employee:employees
             ) {
            System.out.println(employee);
        }
    }
    //Khai báo mảng mới
    public static Employee[] addNewEmployee(Employee[] employees, Employee newEmployee) {
        Employee[] newEmployeeList = new Employee[employees.length + 1];
        //Copy mảng cũ sang mảng mới
        for (int i = 0; i < employees.length; i++) {
            newEmployeeList[i] = employees[i];
        }
        //gán phần tử mới vào vị trí cuối
        newEmployeeList[employees.length] = newEmployee;
        return newEmployeeList;
    }
}
