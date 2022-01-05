package daythreebatch1.solid.isp;

public class OnlineClientImpl implements RestaurantInterfcae {

	@Override
	public void acceptOnlineOrder() {
		//logic for accepting online order

	}

	@Override
	public void takeTelephoneOrder() {
		//Not applicable
		throw new UnsupportedOperationException();

	}

	@Override
	public void payOnline() {
		// logic for paying online

	}

	@Override
	public void walkInCustomerOrder() {
		// NA
		throw new UnsupportedOperationException();

	}

	@Override
	public void payInPerson() {
		// NA
		throw new UnsupportedOperationException();

	}

}
