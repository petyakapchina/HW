package warehouse;

public class Client implements Runnable {

	private Shop shop;

	@Override
	public void run() {
		while (true) {
			int howMany = this.howManyProductsToBuy();
			Product whichProduct = this.whichProductToBuy();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				System.out.println("Client " + Thread.currentThread().getName() + " has bought " + howMany
						+ " pieces of " + whichProduct.getName());
				shop.sellProduct(whichProduct, howMany);
				} catch (InvalidProductException e) {
				e.printStackTrace();
			}
		}
	}

	public Client(Shop shop) {
		this.setShop(shop);
	}

	private void setShop(Shop shop) {
		if (shop != null) {
			this.shop = shop;
		}
	}

	private int howManyProductsToBuy() {
		int how = ((int) (Math.random() * 10));
		if (how <= 2) {
			return 1;
		}
		if (how > 2 && how <= 5) {
			return 2;
		}
		if (how > 5 && how <= 7) {
			return 3;
		} else {
			return 4;
		}
	}

	private Product whichProductToBuy() {
		int which = ((int) (Math.random() * 100));
		if (which <= 10) {
			return new Product(ProductType.FRUITS, "Orange");
		}
		if (which > 10 && which <= 20) {
			return new Product(ProductType.FRUITS, "Apple");
		}
		if (which > 20 && which <= 30) {
			return new Product(ProductType.FRUITS, "Banana");
		}
		if (which > 30 && which <= 40) {
			return new Product(ProductType.VEGETABLES, "Eggplant");
		}
		if (which > 40 && which <= 50) {
			return new Product(ProductType.VEGETABLES, "Potato");
		}
		if (which > 50 && which <= 60) {
			return new Product(ProductType.VEGETABLES, "Cucumber");
		}
		if (which > 60 && which <= 70) {
			return new Product(ProductType.MEATS, "Beef");
		}
		if (which > 70 && which <= 80) {
			return new Product(ProductType.MEATS, "Pork");
		} else {
			return new Product(ProductType.MEATS, "Chicken");
		}
	}
public Shop getShop(){
	return this.shop;
}
}
