package quadrilaterals;

public class Demo {
	public static void main(String[] args) {
		Trapets trapets = new Trapets(2, 6, 5, 5, 5);
		Usporednik usporednik = new Usporednik(3, 8, 4);
		Romb romb = new Romb(5, 7);
		Pravougulnik pravougalnik = new Pravougulnik(6, 8);
		Kvadrat kvadrat = new Kvadrat(7);

		System.out.println("Trapets area overload "+trapets.calculatePerimetarWithOtherParameters(8, 6));
		usporednik.printNumberOfSides();
		System.out.println("Romb perimeter"+romb.calculatePerimetar());
		pravougalnik.printName();
		System.out.println("Kvadrat area "+kvadrat.calculateArea());
	}

}
