
public class Zadacha1 {
	public static void main(String[] args) {
		Computer toshiba = new Computer ();
		toshiba.freeMemory=64;
		toshiba.hardDiskMemory=600;
		toshiba.operationSystem="Windows";
		toshiba.price=999.99f;
		toshiba.year=2010;
		toshiba.isNotebook=true;
		
		Computer apple = new Computer();
		apple.freeMemory=101;
		apple.hardDiskMemory=250;
		apple.isNotebook=false;
		apple.operationSystem="Mac OS";
		apple.price=1987.36f;
		apple.year=2013;
		
		toshiba.changeOpeartionSystem("Linux");
		apple.useMemory(100);
		
		System.out.println("Computer: Toshiba");
		toshiba.printDetails();
		System.out.println();
		System.out.println("Computer: Apple");
		apple.printDetails();
		}

}
