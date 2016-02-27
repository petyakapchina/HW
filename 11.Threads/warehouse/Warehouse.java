package warehouse;

public class Warehouse extends ShoppingCenter {

	private Supplier supplier;

	public boolean isDeliveryNeeded(){
		return !getProductsNeeded().isEmpty();
	}

	public void setProvider(Supplier s) {
		if (s != null) {
			this.supplier = s;
		}
	}
	
	
}
