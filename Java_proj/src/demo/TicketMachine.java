package demo;

public class TicketMachine {

	int price1;
	double price2;
	double price3;

	public TicketMachine(int maxPrice) { // Parameterized Constructor
		price1 = maxPrice;
		price2 = maxPrice * (.85);
		price3 = maxPrice * (.5);

	}

	public void printUndiscountedTicket() {
		System.out.println("Undiscounted Price of the Ticket = $" + price1);
	}

	public void printTicketForSeniorCitizens() {
		System.out.println("Discounted ticket for Senior citizens = $" +price2 );
	}

	public void printTicketForChildren() {
		System.out.println("Discounted price for Children = $ " +price3 );
	}

	public static void main(String[] args) {
		TicketMachine trainTickets = new TicketMachine(60);
		trainTickets.printUndiscountedTicket();
		trainTickets.printTicketForSeniorCitizens();

		trainTickets.printTicketForChildren();

	}
	

}
