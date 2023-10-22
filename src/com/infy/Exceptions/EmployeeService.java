package com.infy.Exceptions;


public class EmployeeService {
        public void checkEmployeeSalary(Employee emp) throws EmpSalaryException{
            if (emp.getEmpSalary()<1000){
                throw new  EmpSalaryException();
            }
            //Write the code here
        }

        public static void main(String[] args) throws  Throwable {
            Employee e1 = new Employee("Joe Smith",20,5345);
            Employee e2 = new Employee("Lewis Jane",21,1345);
            Employee e3 = new Employee("Larry Page",22,245);
            Employee e4 = new Employee("Smith James",23,945);
            Employee e5 = new Employee("Elvis George",25,1425);
            EmployeeService empser=new EmployeeService();
            Employee[] emparray={e1,e2,e3,e4,e5};
                for (Employee employee : emparray) {
                    try {
                        empser.checkEmployeeSalary(employee);
                    } catch (EmpSalaryException e) {
                        System.out.println("Employee " + employee.getEmpName() + " doesn't have enough salary");
                    }

                    //call check employee with appropriate exception handling code
            }


        }

    }


