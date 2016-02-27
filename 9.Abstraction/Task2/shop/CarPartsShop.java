package shop;

public class CarPartsShop {
	public static void main(String[] args) {
		
		Firm bmw = new Firm("BMW", "Germany", "Berlin", "+597511", "+8785");
		Firm greatWall = new Firm("Great Wall", "China", "Sofia, Bulagria","+35984", "+35983");
		
		CarList bmwX5 = new CarList("BMW", "X5", 2006);
		bmwX5.setFirmProducer(bmw);
		
		CarList gwC30 = new CarList("Great Wall", "C30", 2011);
		gwC30.setFirmProducer(greatWall);
		
		CarPart tapiceriazaSedalki = new CarPart(102, "Tapiceria za sedalki", 40, 60, 4);
		tapiceriazaSedalki.setCarList(bmwX5);
		
		CarPart zimnaGuma = new CarPart(205, "Zimna guma", 50, 8, 2);
		zimnaGuma.setCarList(bmwX5);
		zimnaGuma.setCarList(gwC30);
		
		CarPart maslo = new CarPart(305, "Maslo", 10, 15, 3);
		maslo.setCarList(gwC30);
		
		System.out.println(gwC30.getFirmProducer().getName());
		System.out.println(zimnaGuma.getCatergory());
		zimnaGuma.printMatchingModels();
		
	}

}
