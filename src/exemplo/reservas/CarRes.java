package exemplo.reservas;

import net.compor.frameworks.jcf.api.Component;
import net.compor.frameworks.jcf.api.Service;

public class CarRes extends Component {

	public CarRes() {
		super("Car reservation component");
	}

	@Service(name="ICarRe")
	public void rentCar(String car) {
		System.out.println("Renting car " + car);
	}
}
