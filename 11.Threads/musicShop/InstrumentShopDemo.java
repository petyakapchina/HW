package musicShop;

public class InstrumentShopDemo {

	public static void main(String[] args) throws Exception {
		Supplier supplier = new Supplier();
		IMusicShop shop = new MusicShop(supplier);
		supplier.setShop(shop);
		IReport report = new Report(shop);
		
		Thread shopThread = new Thread((Runnable) shop);
		shopThread.start();
		
		Instrument kitara = new Instrument(InstrumentType.STRUNNI, "Kitara", 150);
		Instrument baraban = new Instrument(InstrumentType.UDARNI, "Baraban",500);
		Instrument klarinet = new Instrument(InstrumentType.DUHOVI, "Klarinet", 300); 
		Instrument sintezator = new Instrument(InstrumentType.ELEKTRONNI, "Sintezator", 350);
		
		shop.addInstrument(kitara, 3);
		shop.addInstrument(baraban, 2);
		shop.addInstrument(klarinet, 5);

		shop.sortByPriceDESC();
		System.out.println(shop.getMoney());

		shop.sellInstrument(kitara, 3);
		shop.sellInstrument(baraban, 1);
		shop.sellInstrument(klarinet, 5);
		
		shop.sellInstrument(sintezator, 3);

//		shop.getAvailableInstruments();
//				
//		report.mostProfitableType();
//		report.bestSellingInstrumentType();
//		report.profitReport();
	}

}
