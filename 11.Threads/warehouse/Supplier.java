package warehouse;

import java.util.List;

public class Supplier implements Runnable{

	private static final int DEFAULT_SUPPLY = 25;
	
	private Warehouse warehouse;

	Supplier(Warehouse wh){
		this.setWarehouse(wh);
	}
	
	@Override
	public void run() {
		while(true){
			if(warehouse.isDeliveryNeeded()==true){
				List<Product> products = warehouse.getProductsNeeded();
				for(Product p:products){
					try {
						warehouse.addProduct(p, DEFAULT_SUPPLY);
						System.out.println("****Warehouse was stored with "+DEFAULT_SUPPLY+" pieces of "+p.getName()+" ****");
						Thread.sleep(1000);
					} catch (InvalidProductException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	private void setWarehouse(Warehouse warehouse) {
		if (warehouse != null) {
			this.warehouse = warehouse;
		}
	}

}
