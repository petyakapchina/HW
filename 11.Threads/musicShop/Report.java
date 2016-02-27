package musicShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Report implements IReport{

	private IMusicShop shop;
	private Map<Instrument, Integer> myMap;
	
	public Report(IMusicShop shop) {
		if(shop!=null){
			this.shop=shop;
			this.myMap= shop.getSoldItems();
		}
	}

	@Override
	public void profitReport() {
		System.out.println("Current profit: "+shop.getMoney()+" BGN");
	}

	public void getBestSellingInstrument() {
		int max = 0;
		List<Instrument> mostPopulare = null;
		for (Instrument i : myMap.keySet()) {
			if (myMap.get(i) >= max) {
				if (myMap.get(i) == max) {
					mostPopulare.add(i);
				} else {
					max = myMap.get(i);
					mostPopulare = new ArrayList<Instrument>();
					mostPopulare.add(i);
				}
			}
		}
		System.out.println("Best selling with " + max + " pieces sold is/are ");
		for (Instrument i : mostPopulare) {
			System.out.print(i.getName() + ", ");
		}
		System.out.println();
	}

	
	@Override
	public void getSoldInstruments() {
		Map<Integer, List<Instrument>> sortedBySell = new TreeMap<Integer, List<Instrument>>();

		for (Instrument i : myMap.keySet()) {
			if (!sortedBySell.containsKey(myMap.get(i))) {
				List<Instrument> instruments = new ArrayList<Instrument>();
				instruments.add(i);
				sortedBySell.put(myMap.get(i), instruments);
			} else {
				sortedBySell.get(myMap.get(i)).add(i);
			}
		}

		for (Integer i : sortedBySell.keySet()) {
			for (Instrument ins : sortedBySell.get(i)) {
				System.out.println(ins.getName() + " " + i + " pieces sold.");
			}
		}
	}

	@Override
	public void wostSellingInstrument() {
		int min = 10;
		List<Instrument> mostUnpopulare = null;
		for (Instrument i : myMap.keySet()) {
			if (myMap.get(i) <= min) {
				if (myMap.get(i) == min) {
					mostUnpopulare.add(i);
				} else {
					min = myMap.get(i);
					mostUnpopulare = new ArrayList<Instrument>();
					mostUnpopulare.add(i);
				}
			}
		}
		System.out.println("Worst selling with " + min + " pieces sold is/are ");
		for (Instrument i : mostUnpopulare) {
			System.out.print(i.getName() + ", ");
		}
		System.out.println();
	}

	@Override
	public void bestSellingInstrumentType() {
		int electronni = 0;
		int duhovi = 0;
		int udarni = 0;
		int strunni = 0;
		int klavishni = 0;
	
		Map<InstrumentType, Integer> byType = new TreeMap<InstrumentType, Integer>();

		for (Instrument i : myMap.keySet()) {
			if (i.getType().equals(InstrumentType.DUHOVI)) {
				duhovi += myMap.get(i);
			}
			if (i.getType().equals(InstrumentType.STRUNNI)) {
				strunni += myMap.get(i);
			}
			if (i.getType().equals(InstrumentType.ELEKTRONNI)) {
				electronni += myMap.get(i);
			}
			if (i.getType().equals(InstrumentType.KLAVISHNI)) {
				klavishni += myMap.get(i);
			}
			if (i.getType().equals(InstrumentType.UDARNI)) {
				udarni += myMap.get(i);
			}
		}
		byType.put(InstrumentType.DUHOVI, duhovi);
		byType.put(InstrumentType.STRUNNI, strunni);
		byType.put(InstrumentType.ELEKTRONNI, electronni);
		byType.put(InstrumentType.KLAVISHNI, klavishni);
		byType.put(InstrumentType.UDARNI, udarni);

		int max = 0;
		List<InstrumentType> mostPopulare = new ArrayList<InstrumentType>();
		for (InstrumentType t : byType.keySet()) {
			if (byType.get(t) == max) {
				mostPopulare.add(t);
			}
			if (byType.get(t) > max) {
				max = byType.get(t);
				mostPopulare = new ArrayList<InstrumentType>();
				mostPopulare.add(t);
			}

		}

		System.out.println("Best selling type(s): " + mostPopulare + " - " + max + " pieces by type.");
	}

	@Override
	public void mostProfitableType() {
		int electronni = 0;
		int duhovi = 0;
		int udarni = 0;
		int strunni = 0;
		int klavishni = 0;
		
		Map<InstrumentType, Integer> byType = new TreeMap<InstrumentType, Integer>();

		for (Instrument i : myMap.keySet()) {
			if (i.getType().equals(InstrumentType.DUHOVI)) {
				duhovi += i.getPrice()*myMap.get(i);
			}
			if (i.getType().equals(InstrumentType.STRUNNI)) {
				strunni += i.getPrice()*myMap.get(i);
			}
			if (i.getType().equals(InstrumentType.ELEKTRONNI)) {
				electronni += i.getPrice()*myMap.get(i);
			}
			if (i.getType().equals(InstrumentType.KLAVISHNI)) {
				klavishni += i.getPrice()*myMap.get(i);
			}
			if (i.getType().equals(InstrumentType.UDARNI)) {
				udarni += i.getPrice()*myMap.get(i);
			}
		}

		byType.put(InstrumentType.DUHOVI, duhovi);
		byType.put(InstrumentType.STRUNNI, strunni);
		byType.put(InstrumentType.ELEKTRONNI, electronni);
		byType.put(InstrumentType.KLAVISHNI, klavishni);
		byType.put(InstrumentType.UDARNI, udarni);

		int max = 0;
		List<InstrumentType> mostPopulare = new ArrayList<InstrumentType>();
		for (InstrumentType t : byType.keySet()) {
			if (byType.get(t) == max) {
				mostPopulare.add(t);
			}
			if (byType.get(t) > max) {
				max = byType.get(t);
				mostPopulare = new ArrayList<InstrumentType>();
				mostPopulare.add(t);
			}

		}

		System.out.println("Most profitable type(s): " + mostPopulare + " - " + max + " profit per type.");

	}
	
	

}
