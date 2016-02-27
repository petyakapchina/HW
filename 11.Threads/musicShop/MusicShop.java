package musicShop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MusicShop implements IMusicShop, Runnable {

	private Map<Instrument, Integer> cataloge;
	private Map<Instrument, Integer> soldItems = new TreeMap<Instrument, Integer>();

	private int money;
	private Supplier supplier;

	public MusicShop(Supplier supplier) {
		if (supplier != null) {
			this.supplier = supplier;
		}
		this.cataloge = new TreeMap<Instrument, Integer>();
	}

	@Override
	public void addInstrument(Instrument in, Integer quantity) throws Exception {
		if (in != null && (quantity > 0) && (isAvaliableInWarehouse(in))) {
			cataloge.put(in, quantity);
		} else {
			throw new Exception("Invalid parameters");
		}
	}

	@Override
	public void sellInstrument(Instrument in, int quantity) throws Exception {
		if (in != null) {
			if (cataloge.containsKey(in)) {
				for (Instrument i : cataloge.keySet()) {
					if (i.equals(in)) {
						if (cataloge.get(i) >= quantity) {
							cataloge.put(i, (cataloge.get(i) - quantity));
							this.money += i.getPrice() * quantity;
							System.out.println(quantity + " piece of " + i.getName() + ",type " + i.getType()
									+ " have/has been sold.");
							break;
						} else {
							supplier.order(in, quantity);
						}
					} else {
						continue;
					}
				}
			} else {
				if (!isAvaliableInWarehouse(in)) {
					throw new Exception("We do not support this product!");
				} else {
					supplier.order(in, quantity);
				}
			}
		}
	}

	@Override
	public void getAvailableInstruments() {
		System.out.println("Availbale products:");
		for (Instrument i : cataloge.keySet()) {
			if (cataloge.get(i) > 0) {
				System.out.println(i.getName() + ", " + i.getType() + " price: " + i.getPrice()
						+ " available quantity: " + cataloge.get(i));
			}
		}
	}

	@Override
	public void instrumentsByType() {
		InstrumentType types[] = InstrumentType.values();
		for (int index = 0; index < 5; index++) {
			InstrumentType type = types[index];
			System.out.println(type);
			for (Instrument i : cataloge.keySet()) {
				if (i.getType().equals(type)) {
					System.out.println(
							i.getName() + ", price: " + i.getPrice() + " available quantity: " + cataloge.get(i));
				}
			}
		}
	}

	@Override
	public void instrumentsAlphabetic() {
		List<Instrument> ordered = new ArrayList<Instrument>();
		ordered.addAll(cataloge.keySet());
		Collections.sort(ordered, (instrument1, instrument2) -> cataloge.get(instrument1) - cataloge.get(instrument2));
		for (Iterator<Instrument> it = ordered.iterator(); it.hasNext();) {
			Instrument key = it.next();
			Integer value = cataloge.get(key);
			System.out.println(key.getName() + "; " + value + " pices; " + key.getPrice() + " BGN");
		}
	}

	@Override
	public void sortByPriceASC() {
		List<Instrument> ordered = new ArrayList<Instrument>();
		ordered.addAll(cataloge.keySet());
		ASCPriceComparator i = new ASCPriceComparator();
		Collections.sort(ordered, i);
		for (Iterator<Instrument> it = ordered.iterator(); it.hasNext();) {
			Instrument key = it.next();
			Integer value = cataloge.get(key);
			System.out.println(key.getName() + "; " + value + " pices; " + key.getPrice() + " BGN");
		}
	}

	@Override
	public void sortByPriceDESC() {
		List<Instrument> ordered = new ArrayList<Instrument>();
		ordered.addAll(cataloge.keySet());
		DESCPriceComparator i = new DESCPriceComparator();
		Collections.sort(ordered, i);
		for (Iterator<Instrument> it = ordered.iterator(); it.hasNext();) {
			Instrument key = it.next();
			Integer value = cataloge.get(key);
			System.out.println(key.getName() + "; " + value + " pices; " + key.getPrice() + " BGN");
		}
	}

	public int getMoney() {
		return this.money;
	}

	public Map<Instrument, Integer> getSoldItems() {
		return Collections.unmodifiableMap(soldItems);
	}

	private boolean isAvaliableInWarehouse(Instrument in) {
		if (in != null) {
			Map<Instrument, Integer> myMap = supplier.getInstruments();
			for (Instrument i : myMap.keySet()) {
				if (i.equals(in)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void run() {
		while (true) {
			for (Instrument i : cataloge.keySet()) {
				if (cataloge.get(i) == 0) {
					try {
						supplier.giveThisInstrument(i);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
