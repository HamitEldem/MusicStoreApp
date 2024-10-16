
public class Instrument {
	private String name;
	private double price;
	private int stockQuantity;
	
	Instrument(String name, double price, int stockQuantity){
		this.name = name;
		this.price = price;
		this.stockQuantity = stockQuantity;
	}
	
	
	public double getPrice() {
		return price;
	}
	
	public int getStockQuantity() {
		return stockQuantity;
	}
	
	public boolean sellInstrument(int quantity) {
		if(stockQuantity > quantity) {
			stockQuantity -= quantity;
			
			return (true);
		}
		
		
		return (false);
	}
	
	public String toString() {
		return name;
		
	}
	
	
	
	
}
