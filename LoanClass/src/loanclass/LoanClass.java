package loanclass;

import java.util.Date;

public class LoanClass {

    public static void main(String[] args) {

        Loan num1 = new Loan(5, 5, 5000);
        Loan num = new Loan();
        Date date = new Date();

        System.out.println("the annual interest rate is: " + num1.getAnnualInterestRate());
        System.out.println("The number of years: " + num1.getNumberOfYears());
        System.out.println("The Loan amount: " + num1.getLoanAmount());
        System.out.println("The loan date: " + date);

        num1.setAnnualInterestRate(2);
        num1.setNumberOfYears(3);
        num1.setLoanAmount(145000);

        System.out.println("The monthly payments are: " + num1.getMonthlyPayment());
        System.out.println("the total payment will be: " + num1.getTotalPayment());
    }

}
