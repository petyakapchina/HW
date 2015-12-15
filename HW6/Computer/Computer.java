
public class Computer {
	short year;
	float price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem; 
	
	void changeOpeartionSystem (String newOperationSystem){
	this.operationSystem = newOperationSystem;	
	}
	
    void useMemory (int memory){
    	if (memory>this.freeMemory){
    		System.out.println("Not enough free memory!");
    	}
    	else {
    	this.freeMemory-=memory;
    	}
    }
     void printDetails (){
    	 System.out.println("Year of production: "+this.year);
    	 System.out.println("Price: " + this.price);
    	 System.out.println("It is portable: "+this.isNotebook);
    	 System.out.println("Hard diks memory: "+this.hardDiskMemory);
    	 System.out.println("Free memory: "+this.freeMemory);
    	 System.out.println("Oprational system: "+this.operationSystem);
     }
    
    
}
