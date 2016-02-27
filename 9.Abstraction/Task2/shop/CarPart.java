package shop;

public class CarPart extends Category {
	private static final int MAX_NUMBER_OF_CATEGORIES = 4;
	private static final int MIN_NUMBER_OF_CATEGORIES = 1;
	private int code;
	private String name;
	private String catergory;
	private double buyingPrice;
	private double sellingPrice;
	private CarList[] carList=new CarList[new CarList().getNumberOfModels()];;

	

	public CarPart(int code, String name, double buyingPrice, double sellingPrice, int index) {
		setBuyingPrice(buyingPrice);
		setCode(code);
		setName(name);
		setSellingPrice(sellingPrice);
		setCategory(index);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		if (code > 0) {
			this.code = code;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && !name.equals("")) {
			this.name = name;
		}
	}

	public String getCatergory() {
		return catergory;
	}

	public void setCategory(int index) {
		if (index >= MIN_NUMBER_OF_CATEGORIES && index <= MAX_NUMBER_OF_CATEGORIES) {
			switch (index) {
			case 1:
				this.catergory = super.getCategory1();
				break;
			case 2:
				this.catergory = super.getCategory2();
				break;
			case 3:
				this.catergory = super.getCategory3();
				break;
			case 4:
				this.catergory = super.getCategory4();
				break;
			default:
				System.out.println("Unavailable category!");
				break;
			}
		}
	}

	public double getBuyingPrice() {
		return buyingPrice;
	}

	public void setBuyingPrice(double buyingPrice) {
		if (buyingPrice > 0) {
			this.buyingPrice = buyingPrice;
		}
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		if (sellingPrice > 0) {
			this.sellingPrice = sellingPrice;
		}
	}

	public CarList[] getCarList() {
		return carList;
	}

	public void setCarList(CarList carList) {

		for (int index = 0; index < this.carList.length; index++) {
			if (carList != null && this.carList[index] == null) {
				this.carList[index] = carList;
				return;
			}
		}

	}

	public void printMatchingModels() {
		for (int index = 0; index < this.carList.length && this.carList[index] != null; index++) {
			System.out.println(this.carList[index].getBrand() + " " + this.carList[index].getModel());
		}
	}

}
