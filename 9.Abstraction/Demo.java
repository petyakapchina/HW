
public class Demo {
	public static void main(String[] args) {
		Task designDresses = new Task("designing dresses for the fashion haul", 40.0);
		Task buyFabric = new Task("buying fabrics for the collection", 12.0);
		Task sewModels = new Task("sewing the dresses", 40.0);
		Task shootDresses = new Task("makeing pictures of dresses for the web site", 10.0);

		Task selectModels = new Task("selecting models for the fashion show", 8.0);
		Task inviteGuests = new Task("inviting people to the fashion haul", 16.0);

		Task deliverToShops = new Task("destributing dresses to shops", 24.0);
		Task shootAd = new Task("shooting commercial for the new collection", 18.0);
		Task sentGiftToStar = new Task("selecting and sending  dress to a film star with marketing purpose", 3.0);
		Task arrangeCover = new Task("arranging the dress to be shot for a cover of a magazine", 4.0);

		Employee jorjo = new Employee("Jordjo Armani");
		Employee adam = new Employee("Adam");
		Employee john = new Employee("John");
		Employee sally = new Employee("Sally");

		AllTasks fashionHouse = new AllTasks();
		fashionHouse.addTask(designDresses);
		fashionHouse.addTask(buyFabric);
		fashionHouse.addTask(sewModels);
		fashionHouse.addTask(shootDresses);
		fashionHouse.addTask(selectModels);
		fashionHouse.addTask(inviteGuests);
		fashionHouse.addTask(deliverToShops);
		fashionHouse.addTask(shootAd);
		fashionHouse.addTask(sentGiftToStar);
		fashionHouse.addTask(arrangeCover);

		jorjo.setAllWork(fashionHouse);
		adam.setAllWork(fashionHouse);
		john.setAllWork(fashionHouse);
		sally.setAllWork(fashionHouse);

		// fashionHouse.toString();
		
		
		
		for (int day = 1; !fashionHouse.isAllWorkDone(); day++) {
			System.out.println("Day " + day);

			jorjo.startWorkingDay();
			adam.startWorkingDay();
			john.startWorkingDay();
			sally.startWorkingDay();

			jorjo.work();
			adam.work();
			john.work();
			sally.work();
			System.out.println("End of day "+day);
		
			System.out.println();
		}
		
		if (fashionHouse.isAllWorkDone()){
			System.out.println("All the tasks have been finished in Jorjo Armani's fashion house!");
		}

	}

}
