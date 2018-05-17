package jrout.tutorial.corejava.classesExample;

import jrout.tutorial.corejava.pojo.Employee;

public class ConstructorExample {
    public static void main(String[] args) {
        ConstructorExample ce = new ConstructorExample();

//        Employee employee = new Employee("Raja", 34567,"IT");
//        employee.printEmpDetail();
//
//        System.out.println(employee);




//        ce.printEmpDetail(employee);
//        ce.totalNumberOfLeaves(employee);

//        employee = new Employee("Roja",23456,"Finance");
//        ce.printEmpDetail(employee);

//        Employee tom = new Employee("Tom",3333,"Accounting");
//        ce.printEmpDetail(tom);

        Employee employee = new Employee("Adi");
        System.out.println(employee);


    }

    public void totalNumberOfLeaves(Employee employee) {
        int noOfLeaves = 0;

        /*if(employee.getDepartment() != null && "IT".equals(employee.getDepartment())){
            noOfLeaves = 10;
        }else if(employee.getDepartment() != null && "Finance".equals(employee.getDepartment())) {
            noOfLeaves = 7;
        }else if(employee.getDepartment() != null && "Accounting".equals(employee.getDepartment())) {
            noOfLeaves = 5;
        }*/

        String department = employee.getDepartment();

        if(department != null) {
            if("IT" == department){
                noOfLeaves = 10;
            }else if("Finance" == department){
                noOfLeaves = 7;
            }else if("Accounting" == department){
                noOfLeaves = 5;
            }

            /*if("IT".equals(department)){
                noOfLeaves = 10;
            }else if("Finance".equals(department)){
                noOfLeaves = 7;
            }else if("Accounting".equals(department)){
                noOfLeaves = 5;
            }*/
        }
        System.out.println("No Of leaves for : "+ employee.getName() +" is "+ noOfLeaves);

    }


}