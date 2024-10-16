
public class Customer {
	String customerName;
	double walletBalance;
	int loyaltyPoints;
	
	Customer(String customerName, double walletBalance){
		this.customerName = customerName;
		this.walletBalance = walletBalance;
	}
	
	public double getWalletBalance(){
		return walletBalance;
	}
	
	public boolean purchaseInstrument(Instrument instrument, int quantity) {
		if(walletBalance > instrument.getPrice() * quantity) {
			walletBalance -= instrument.getPrice() * quantity;
			
			return true;
		}
		
		return false;
	}
	
	public void addFunds(double amount) {
		walletBalance += amount;
	}
	
	
}
