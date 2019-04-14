package interfaceConcept;

public class Developer implements BankingClient{
	// this class is responsible to implement ALL methods of the interface bankingclient

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer d = new Developer();
		d.checkingBalance();
		d.creditcard();
		d.transferbalance();

	}

	@Override
	public void creditcard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferbalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkingBalance() {
		// TODO Auto-generated method stub
		
	}

}
