package quadrilaterals;

public class Kvadrat extends izpuknalChetiriugalnik{
	private int side;
	
	public Kvadrat(int side) {
		super(side);
		setSide(side);
	}

	@Override
	public void printName() {
		System.out.println("Kvadrat");
	}

	@Override
	public int calculateArea() {
		return this.side*this.side;
	}

	@Override
	public int calculatePerimetar() {
		return 4*this.side;
	}
	
	@Override
	public void printNumberOfSides(){
		System.out.println("Kvadrat has 4 sides.");
	}
	
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		if (side > 0) {
			this.side = side;
		}
	}


}
