package warehouse;

import java.util.List;

public class Shop extends ShoppingCenter implements Runnable {
	private static final int NUM_OF_STOCK = 5;
	private Warehouse warehouse;
	
	public Shop(Warehouse wh) {
		if(wh!=null){
			this.warehouse=wh;
		}
	}
		
	@Override
	public void run() {
		while (true) {
			List<Product> assortment = getProductsNeeded();
			try {
				Thread.sleep(9000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("Shop "+Thread.currentThread()+" is checking stock.");
			if (assortment.size() > 0) {
				for (Product product : assortment) {
					try {
						warehouse.sellProduct(product, NUM_OF_STOCK);
						this.addProduct(product, NUM_OF_STOCK);
						System.out.println("$$$ Shop "+Thread.currentThread().getName()+" has stored "+NUM_OF_STOCK+" pieces of "+product.getName()+" $$$");
					} catch (InvalidProductException e) {
						e.getMessage();
					}
				}
			}
		}
	}
	
	


}
