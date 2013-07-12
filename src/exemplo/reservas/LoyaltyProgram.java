package exemplo.reservas;

import net.compor.frameworks.jcf.api.Component;
import net.compor.frameworks.jcf.api.Service;

public class LoyaltyProgram extends Component {

	public LoyaltyProgram() {
		super("Loyalty program component");
	}

	@Service(name="ILoyaltyProgram")
	public void increaseBonus(Integer bonus) {
		System.out.println("Increasing bonus " + bonus);
	}
}
