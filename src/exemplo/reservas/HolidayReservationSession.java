package exemplo.reservas;

import net.compor.frameworks.jcf.api.Component;
import net.compor.frameworks.jcf.api.Service;

public class HolidayReservationSession extends Component {

	public HolidayReservationSession() {
		super("Holiday reservation session component");
	}

	@Service(name="confirmReservation")
	public void confirm(Reservation r) {
		requestService("ICarRe", r.getCar());
		requestService("IAirRes", r.getAir());
		requestService("IHotelRes", r.getHotel());
	}
}
