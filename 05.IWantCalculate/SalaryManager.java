public class SalaryManager {
    public static void main(String [] args) {
        SalaryManager manager = new SalaryManager();

        System.out.println("세후 연봉 : " + manager.getMonthlySalary(20000000));
    }

    public double getMonthlySalary(int yearlySalary) {
        double monthlySalary = yearlySalary / 12.0;

        double tax = calculateTax(monthlySalary);
        double pension = calculateNationalPension(monthlySalary);
        double healthInsurance = calculateNationalInsurance(monthlySalary);

        System.out.println("근로소득세: " + tax);
        System.out.println("국민 연금" + pension);
        System.out.println("건강 보험료" + healthInsurance);

        double total = tax + pension + healthInsurance;

        monthlySalary-=total;

        return monthlySalary;
    }

    public double calculateTax(double monthlySalary) {
        double tax = monthlySalary * 0.125;
        return tax;
    }

    public double calculateNationalPension(double monthlySalary) {
        double pension = monthlySalary * 0.081;
        return pension;
    }

    public double calculateNationalInsurance(double monthlySalary) {
        double healthInsurance = monthlySalary * 0.135;
        return healthInsurance;
    }
}
