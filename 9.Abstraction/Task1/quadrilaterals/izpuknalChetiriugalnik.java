package quadrilaterals;

public abstract class izpuknalChetiriugalnik implements IChetiriugalnik {
	private int hight;
	
	public izpuknalChetiriugalnik(int hight) {
		setHight(hight);
	}

	@Override
	public abstract void printName();

	@Override
	public void printNumberOfSides() {
		System.out.println("This figure has " + NUMBER_OF_SIDES + " sides.");
	}

	@Override
	public abstract int calculateArea();
	

	public abstract int calculatePerimetar();
	
	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		if (hight>0){
		this.hight = hight;
		}
	}

}
