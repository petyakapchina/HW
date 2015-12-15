
public class Computer {
	String name;
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem; 
	
	Computer (){
		this.isNotebook = false;
		this.operationSystem = "Wind XP";
	}
	
	Computer (int year, double price, double hardDiskMemory, double freeMemory ){
		this();
		this.year=year;
		this.price=price;
		this.hardDiskMemory=hardDiskMemory;
		this.freeMemory=freeMemory;
		
	}
	
	int computerPrice (Computer c){
		if (this.price > c.price){
			return -1;
		}
		if (this.price < c.price){
			return 1;
		}
		return 0;
	}
	
	void priceComparePrint (Computer b){
		int priceIndex=this.computerPrice(b);
		if (priceIndex==0){
			System.out.println("Same prices");
		}
		if (priceIndex==(-1)){
			System.out.println(this.name+" is more expensive than "+b.name);
		}
		if (priceIndex==1){
			System.out.println(this.name+" is cheaper than "+b.name);
		}
	}	
    
}
