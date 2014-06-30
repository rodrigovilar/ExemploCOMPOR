package exemplo.reservas;

import net.compor.frameworks.jcf.api.Component;
import net.compor.frameworks.jcf.api.Service;

public class HotelRes extends Component {

	public HotelRes() {
		super("Hotel reservation component");
	}

	@Service(name="IHotelRes")
	public void reserveHotel(Hotel h) {
		System.out.println("Hotel: " + h.getName());
		requestService("IBilling", h.getValue());
		requestService("ILoyaltyProgram", h.getBonus());
	}
}
