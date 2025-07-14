package loanclass;
import java.util.Date;

public class Loan {

    double annualInterestRate;
    int numberOfYears;
    double loanAmount;
    Date loanDate;

    Loan() {
        this.annualInterestRate = 0;
        this.numberOfYears = 0;
        this.loanAmount = 0;
    }

    Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate =annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getLoanDate() {

        return loanDate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {

        double emi = (this.loanAmount * (this.annualInterestRate / 12)) / (1 - Math.pow(1 + (this.annualInterestRate / 12), -12));
        return emi;
    }

    public double getTotalPayment() {
        double totalpayment = this.loanAmount * (1 + (this.annualInterestRate * this.numberOfYears));
        return totalpayment;
    }

//    public String toString() {
//        String date = this.day + "/" + this.month + "/" + this.year;
//        return date;
//    }
}
