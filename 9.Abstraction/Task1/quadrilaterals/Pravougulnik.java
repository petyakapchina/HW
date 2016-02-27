package quadrilaterals;

public class Pravougulnik extends izpuknalChetiriugalnik{
	private int side1;
	private int side2;
	
	public Pravougulnik(int side1, int side2) {
		super(side1);
		setSide1(side1);
		setSide2(side2);
		
	}

	@Override
	public void printName() {
		System.out.println("Pravougalnik");
	}

	@Override
	public int calculatePerimetar() {
		return 2*(this.side1+this.side2);
	}

	@Override
	public int calculateArea() {
		return this.side1*this.side2;
	}
	
	@Override
	public void printNumberOfSides(){
		System.out.println("Pravougalnik has 4 sides.");
	}
	
	public int getSide1() {
		return side1;
	}

	public void setSide1(int side1) {
		if (side1 > 0) {
			this.side1 = side1;
		}
	}

	public int getSide2() {
		return side2;
	}

	public void setSide2(int side2) {
		if (side2 > 0) {
			this.side2 = side2;
		}
	}

}
