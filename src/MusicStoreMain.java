
public class MusicStoreMain {

	public static void main(String[] args) {
		Instrument guitar = new Instrument("Guitar", 150.0, 10);
		Instrument piano = new Instrument("Piano", 1000.0, 5);
		Instrument drums = new Instrument("Drums", 500.0, 3);
		Instrument violin = new Instrument("Violin", 300.0, 7);
		
		Customer customer = new Customer("Engin", 2000.0);
		
		MusicStoreGui frame = new MusicStoreGui(guitar, piano,  drums,  violin,  customer);
		frame.setVisible(true);
		
		
		
	}

}
