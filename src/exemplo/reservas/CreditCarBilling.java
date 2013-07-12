package exemplo.reservas;

import net.compor.frameworks.jcf.api.Component;
import net.compor.frameworks.jcf.api.Service;

public class CreditCarBilling extends Component {

	public CreditCarBilling() {
		super("Credit card billing component");
	}

	@Service(name="IBilling")
	public void processCreditCard(Double value) {
		System.out.println("Credit card billing " + value);
	}
}
