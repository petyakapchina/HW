package musicShop;

import java.util.Comparator;

public class DESCPriceComparator implements Comparator<Instrument> {

	@Override
	public int compare(Instrument i1, Instrument i2) {
		return i2.getPrice() - (i1.getPrice());
	}

}
