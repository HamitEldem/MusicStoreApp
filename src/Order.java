
public class Order {
	int orderId, quantity;
	Customer customer;
	Instrument instrument;
	
	Order(int orderId, Customer customer, Instrument instrument, int quantity){
		this.orderId = orderId;
		this.customer = customer;
		this.instrument = instrument;
		this.quantity = quantity;
	}
	
	public double calculateTotalPrice() {
		return (instrument.getPrice() * quantity);
	}
	
	public boolean processOrder() {
		if(instrument.sellInstrument(quantity)) {
			customer.purchaseInstrument(instrument, quantity);
			
			return true;
		}
		
		return false;
	}
	
}
