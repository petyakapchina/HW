package task1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BankDemo {
	public static void main(String[] args) {
		Bank bankata = Bank.createTheBank("Bankata", "Sofia");

//		BankProduct shortDeposite = new Deposit(2000.0, 3, 0.03);
//		BankProduct longDeposite = new Deposit(1000.00, 12, 0.05);
//
//		BankProduct homeCredit = new Credit(100000.00, 72, 0.06);
//		BankProduct consumerCredit = new Credit(5000.00, 24, 0.10);

		Set<Client> clients = new HashSet<Client>();
		clients.add(new Client("Pesho", "Samokov", 875.36, 215.36));
		clients.add(new Client("Iliya", "Kocherinovo", 987.26, 5896.36));
		clients.add(new Client("Penka", "Petrich", 365.21, 100.36));
		clients.add(new Client("Panaiot", "Pleven", 775.36, 897.36));
		clients.add(new Client("Paraskeva", "Pernik", 999.99, 999.99));
		clients.add(new Client("Boryan", "Blagoevgrad", 675.36, 4125.39));
		clients.add(new Client("Medeya", "Montana", 475.36, 00.36));
		clients.add(new Client("Branimir", "Burgas", 1896.36, 1587.35));
		clients.add(new Client("Kosara", "Kiten", 1025.96, 15289.24));
		clients.add(new Client("Gospodin", "Sofia", 2536.25, 10258.24));
		clients.add(new Client("Pirina", "Razlog", 585.23, 101.00));

		System.out.println("-----------------");
		System.out.println("START CAPITAL");
		System.out.println("Bank situation: ");
		System.out.println("Available money: " + bankata.getMoneyAvailable());
		System.out.println("Bank reserve: " + bankata.getBankReserve());
		System.out.println("-----------------");

		for (Client c : clients) {
			if ((int) (Math.random() * 10) < 4) {
				bankata.takeDeposit(new Deposit((0.8 * c.getAccountAmount()), 3, 0.03), c);
			}
			if ((int) (Math.random() * 10) >= 4 && (int) (Math.random() * 10) < 7) {
				bankata.takeDeposit(new Deposit((0.9 * c.getAccountAmount()), 12, 0.05), c);
			} else {
				bankata.takeDeposit(new Deposit((c.getAccountAmount()), 3, 0.03), c);
			}
		}

		for (Client c : clients) {
			List<BankProduct> list = c.getMyProducts();
			bankata.addToPortFlio(c, list);
		}

		System.out.println("-----------------");
		System.out.println("LIABILITIES - gained deposits");
		System.out.println("Bank situation: ");
		System.out.println("Available money: " + bankata.getMoneyAvailable());
		System.out.println("Bank reserve: " + bankata.getBankReserve());
		System.out.println("-----------------");

		for (Client c : bankata.getPortfolio().keySet()) {
			if ((int) (Math.random() * 10) < 4) {
				bankata.giveCredit(c, new Credit(100000.00, 72, 0.06));
			}
			if ((int) (Math.random() * 10) >= 4 && (int) (Math.random() * 10) < 7) {
				bankata.giveCredit(c, new Credit(5000.00, 24, 0.10));
			} else {
				bankata.giveCredit(c, new Credit(100000.00, 84, 0.06));
			}
		}

		bankata.payIntrestToAllDeposits();
		bankata.recieveCreditFee();

		System.out.println("-----------------");
		System.out.println("ASSETS - given credits");
		System.out.println("Bank situation: ");
		System.out.println("Available money: " + bankata.getMoneyAvailable());
		System.out.println("Bank reserve: " + bankata.getBankReserve());
		System.out.println("-----------------");

		for (Client c : clients) {
			System.out.println("*** " + c.getName() + " has " + c.getAccountAmount() + " BGN in the bank. ***");
			for (BankProduct b : c.getMyProducts()) {
				if (b instanceof Credit) {
					System.out.println("$ Credit: $");
					System.out.println("IBAN: " + b.getIBAN() + "; interest:" + b.getInterest() + "; pays: "
							+ b.getRealCost());
					System.out.println("monthly fee: " + b.getFee() + "; gets: " + b.getAmount());
					System.out.println();
				}
				if (b instanceof Deposit) {
					System.out.println(" $Deposit:$ ");
					System.out.println("IBAN: " + b.getIBAN() + "; interest:" + b.getInterest() + "; in the end of period: "
							+ b.getRealCost());
					System.out.println("monthly interest: " + b.getFee() + "; int the beggining of period: " + b.getAmount());
					System.out.println();

				}

			}

		}

	}

}
