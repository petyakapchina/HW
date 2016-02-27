package musicShop;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Supplier {
	private static final int DEFAULT_SUPPLY = 5;
	private IMusicShop shop;
	private Map<Instrument, Integer> instruments;

	public Supplier() {
		instruments = new TreeMap<Instrument, Integer>();
		this.fillWarehouse();
	}

	private void fillWarehouse() {
		instruments.put(new Instrument(InstrumentType.STRUNNI, "Kitara", 150), 3);
		instruments.put(new Instrument(InstrumentType.DUHOVI, "Klarinet", 300), 2);
		instruments.put(new Instrument(InstrumentType.UDARNI, "Baraban", 500), 5);
		instruments.put(new Instrument(InstrumentType.KLAVISHNI, "Piano", 3000), 6);
		instruments.put(new Instrument(InstrumentType.ELEKTRONNI, "Sintezator", 350), 1);
	}

	public void setShop(IMusicShop shop) {
		if (shop != null) {
			this.shop = shop;
		}
	}

	public Map<Instrument, Integer> getInstruments() {
		return Collections.unmodifiableMap(instruments);
	}

	public void order(Instrument in, int quantity) {
		for (Instrument i : instruments.keySet()) {
			if (i.equals(in)) {
				System.out.println("Delivery of " + i.getName() + " will take " + instruments.get(i) + " days.");
			}
		}
	}
	
	public void giveThisInstrument(Instrument in) throws Exception{
		for(Instrument i:instruments.keySet()){
			if(i.equals(in)){
				shop.addInstrument(in, DEFAULT_SUPPLY);
				System.out.println(DEFAULT_SUPPLY+" pieces of "+i.getName()+" have been delieverd!");
			}
		}
	}

}
