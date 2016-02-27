package warehouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class ShoppingCenter implements Shopable {

	private static final int DEFAULT_STOCK = 15;
	private static final int MIN_QUANTITY = 5;

	private Map<Product, Integer> products= new ConcurrentHashMap<Product, Integer>();

	public ShoppingCenter() {
		for (String productName : new String[] { "Banana", "Orange", "Apple" })
			products.put(new Product(ProductType.FRUITS, productName), DEFAULT_STOCK);

		for (String productName : new String[] { "Pork", "Beef", "Chicken" })
			products.put(new Product(ProductType.MEATS, productName), DEFAULT_STOCK);

		for (String productName : new String[] { "Potato", "Eggplant", "Cucumber" })
			products.put(new Product(ProductType.VEGETABLES, productName), DEFAULT_STOCK);
	}

	@Override
	public void addProduct(Product product, int quantity) throws InvalidProductException {
		if (product != null && products.containsKey(product)) {
			int newQuantity = products.get(product);
			newQuantity += quantity;
			products.put(product, newQuantity);
		} else {
			throw new InvalidProductException("Product is not supported!");
		}

	}


	private boolean canIBuyThisProduct(Product p, int quantity) {
		return products.get(p) >= quantity;
	}
	
	@Override
	public void sellProduct(Product p, int quantity) throws InvalidProductException  {
		if (p != null && products.containsKey(p)) {
			while (!canIBuyThisProduct(p, quantity)) {
				try {
					synchronized (products) {
						products.wait();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			int newQuantity = products.get(p);
			newQuantity -= quantity;
			
			products.put(p, newQuantity);
		}
		else {
			throw new InvalidProductException("Product not supported!");
		}
	}

	@Override
	public List<Product> getProductsNeeded() {
		List<Product> productsToDeliver = new ArrayList<Product>();
		for (Product p : products.keySet()) {
			if (products.get(p) < MIN_QUANTITY)
				productsToDeliver.add(p);
		}
		return productsToDeliver;
	}
	
	
	public void getProducts(){
		for(Product p:products.keySet()){
			System.out.println(p.getName()+" "+products.get(p));
		}
	}

}
