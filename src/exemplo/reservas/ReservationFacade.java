package exemplo.reservas;

import net.compor.frameworks.jcf.api.ComporFacade;

public class ReservationFacade extends ComporFacade {

	@Override
	protected void addComponents() {
		add(new LoyaltyProgram());
		add(new CreditCarBilling());
		add(new HotelRes());
		add(new AirRes());
		add(new CarRes());
		add(new HolidayReservationSession());
	}

	public void confirm(Reservation r) {
		requestService("confirmReservation", r);
	}

}
