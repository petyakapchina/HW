package musicShop;

import java.util.Comparator;

public class ASCPriceComparator implements Comparator<Instrument> {
	
	@Override
	public int compare(Instrument i1, Instrument i2) {
		return i1.getPrice() - (i2.getPrice());
	}
}
