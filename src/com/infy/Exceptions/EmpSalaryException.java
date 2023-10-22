package com.infy.Exceptions;

import com.infy.StaticModifier.Employee;

public class EmpSalaryException extends Throwable {

    public EmpSalaryException(){

    }

    public EmpSalaryException(String message) {
      super(message);
    }


}
