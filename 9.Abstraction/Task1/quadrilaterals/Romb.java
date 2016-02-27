package quadrilaterals;

public class Romb extends izpuknalChetiriugalnik {
	int side1;

	public Romb(int hight, int side1) {
		super(hight);
		setSide1(side1);
	}

	@Override
	public void printName() {
		System.out.println("Romb");
	}

	@Override
	public int calculateArea() {
		return this.side1*getHight();
	}

	@Override
	public int calculatePerimetar() {
		return 4*this.side1;
	}
	
	@Override
	public void printNumberOfSides(){
		System.out.println("Romb has 4 sides.");
	}

	public int getSide1() {
		return side1;
	}

	public void setSide1(int side1) {
		if (side1>0){
		this.side1 = side1;
		}
	}

}
