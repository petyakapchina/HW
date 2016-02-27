package musicShop;

import java.util.Map;

public interface IMusicShop {

	void addInstrument(Instrument in, Integer quantity) throws Exception;

	void sellInstrument(Instrument in, int quantity) throws Exception;

	void getAvailableInstruments();

	void instrumentsByType();

	void instrumentsAlphabetic();

	void sortByPriceASC();

	void sortByPriceDESC();
	
	int getMoney();
			
	Map<Instrument, Integer> getSoldItems();

}