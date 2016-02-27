package shop;

public class CarList {
	private static int numberOfModels;
	
	private static final int MAX_PRODUCTON_YEAR = 1990;
	private String brand;
	private String model;
	private int yearOfProduction;
	private Firm firmProducer;
	
	public CarList(){
		
	}
	
	public CarList(String brand, String model, int yearOfProduction) {
		setBrand(brand);
		setModel(model);
		setYearOfProduction(yearOfProduction);
		
		numberOfModels++;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		if (brand != null && !brand.equals("")) {
			this.brand = brand;
		}
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if (model != null && !model.equals("")) {
			this.model = model;
		}
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		if (yearOfProduction > MAX_PRODUCTON_YEAR) {
			this.yearOfProduction = yearOfProduction;
		}
	}

	public Firm getFirmProducer() {
		return firmProducer;
	}

	public void setFirmProducer(Firm firmProducer) {
		if (firmProducer != null) {
			this.firmProducer = firmProducer;
		}
	}

	public static int getNumberOfModels() {
		return numberOfModels;
	}
	
	
	

}
