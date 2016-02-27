package warehouse;

import java.util.List;

public interface Shopable {

	void addProduct(Product p, int quantity) throws InvalidProductException;

	void sellProduct(Product p, int quantity)
			throws InvalidProductException, NotEnoughStockExeption;

	List<Product> getProductsNeeded();

}