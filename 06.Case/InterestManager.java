public class InterestManager {
    public static void main(String [] args) {
        InterestManager manager = new InterestManager();

        for(int day=10;day<=370;day+=10) {
			double amount=manager.calculateAmount(day, 1000000);
			System.out.println(day+":"+amount+" ");
		}
    }

    public double getInterestRate(int day) {
        double interest = 0;
        if (day <=90) {
            interest = 0.005;
        } else if (day>=91 && day<=180) {
            interest = 0.01;
        } else if (day>=181 && day<=364) {
            interest = 0.02;
        } else {
            interest = 0.056;
        }

        return interest;
    }

    public double calculateAmount(int day, long amount) {
        double total;
        double interest = getInterestRate(day) * amount;
        total = amount + interest;
        return total;
    }

}
