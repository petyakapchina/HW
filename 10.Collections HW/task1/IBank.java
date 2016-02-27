package task1;

public interface IBank {
	void takeDeposit(Deposit d, Client c);
	void payIntrestToAllDeposits();
	Credit giveCredit(Client who, Credit c);
}
