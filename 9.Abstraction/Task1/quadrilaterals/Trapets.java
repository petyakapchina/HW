package quadrilaterals;

public class Trapets extends izpuknalChetiriugalnik {
	private int upperSide;
	private int lowerSide;
	private int side1;
	private int side2;
	
	Trapets(int upperSide, int lowerSide, int side1, int side2, int hight){
		super(hight);
		setSide1(side1);
		setSide2(side2);
		setLowerSide(lowerSide);
		setUpperSide(upperSide);
	}

	@Override
	public void printName() {
		System.out.println("Trapets");

	}

	@Override
	public int calculateArea() {
		return (this.upperSide + this.lowerSide) * super.getHight() / 2;
	}

	@Override
	public int calculatePerimetar() {
		return (this.side1 + this.side2 + this.lowerSide + this.upperSide);
	}
	 
	public int calculatePerimetarWithOtherParameters(int upperSide, int lowerSide){
		if (upperSide>0 && lowerSide>0){
			setLowerSide(lowerSide);
			setUpperSide(upperSide);
		}
		return (this.side1 + this.side2 + this.lowerSide + this.upperSide);
	}
	
	@Override
	public void printNumberOfSides(){
		System.out.println("Trapets has 4 sides.");
	}


	public int getUpperSide() {
		return upperSide;
	}

	public void setUpperSide(int upperSide) {
		if (upperSide > 0) {
			this.upperSide = upperSide;
		}
	}

	public int getLowerSide() {
		return lowerSide;
	}

	public void setLowerSide(int lowerSide) {
		if (lowerSide > 0) {
			this.lowerSide = lowerSide;
		}
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
