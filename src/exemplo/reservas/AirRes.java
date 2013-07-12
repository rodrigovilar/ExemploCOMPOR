package exemplo.reservas;

import net.compor.frameworks.jcf.api.Component;
import net.compor.frameworks.jcf.api.Service;

public class AirRes extends Component {

	public AirRes() {
		super("Air reservation component");
	}

	@Service(name="IAirRes")
	public void buyAirPlaneFlight(String company) {
		System.out.println("Buying flight: " + company);
	}
}
