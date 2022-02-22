package BANK;

public class Bank extends SBI implements CIBIL,PNB {

	public void maximumLoanAmount() {
		System.out.println(" maximumLoanAmount:13,20,316");
		
	}

	public void creditScore() {
		System.out.println("creditScore:900");
		
	}

	public void minimumBalance() {
		System.out.println("minimumBalance:2,000");
		
	}

	public void cibilScore() {
		System.out.println("cibilScore:756");
		
	}

	@Override
	public void bankBalance() {
		System.out.println("bankBalance:45,123");
		
	}
	public static void main(String[] args) {
		Bank a=new Bank();
		a.bankBalance();
		a.cibilScore();
		a.creditScore();
		a.ItLoan();
		a.maximumLoanAmount();
		a.maximumLoanAmount();
		a.minimumBalance();

}
}
