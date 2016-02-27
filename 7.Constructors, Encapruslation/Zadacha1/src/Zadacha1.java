
public class Zadacha1 {
	
		public static void main(String[] args) {
			Computer toshiba = new Computer(2010, 999.99, 600, 64);
			toshiba.name="Toshiba";
						
			Computer apple = new Computer(2013, 1987.36, 250, 101);
			apple.name="Apple";
			
			Computer hp = new Computer(2008, 1587.36, 598, 59);
			hp.name="HP";
						
					
			toshiba.priceComparePrint(apple);
			hp.priceComparePrint(toshiba);
			hp.priceComparePrint(apple);
			
			
		}

	

}
