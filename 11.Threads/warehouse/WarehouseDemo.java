package warehouse;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WarehouseDemo {

	private static final int NUM_OF_SHOPS_VS_CLIENTS_PER_SHOP = 3;

	public static void main(String[] args) {
		Warehouse warehouse = new Warehouse();
		Supplier supplier = new Supplier(warehouse);
		warehouse.setProvider(supplier);
		Thread supplierThread = new Thread(supplier);
		supplierThread.start();

		List<Shop> shops = new ArrayList<Shop>();
		for (int index = 0; index < NUM_OF_SHOPS_VS_CLIENTS_PER_SHOP; index++) {
			shops.add(new Shop(warehouse));
		}

		List<Client> clients = new ArrayList<Client>();
		for (Shop s : shops) {
			for (int index2 = 0; index2 < NUM_OF_SHOPS_VS_CLIENTS_PER_SHOP; index2++) {
				clients.add(new Client(s));
			}
		}
		
				
		ExecutorService shopPool = Executors.newFixedThreadPool(3);
		for (Shop s : shops) {
			shopPool.submit(s);
		}

		ExecutorService clientPool = Executors.newFixedThreadPool(9);
		for (Client c : clients) {
			clientPool.submit(c);
		}
		
		shopPool.shutdown();
		clientPool.shutdown();

	}
}
