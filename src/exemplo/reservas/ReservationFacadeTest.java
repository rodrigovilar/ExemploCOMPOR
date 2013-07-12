package exemplo.reservas;

import org.junit.Test;

public class ReservationFacadeTest {

	@Test
	public void test() {
		Hotel hotel = new Hotel();
		hotel.setBonus(100);
		hotel.setName("Copacabana palace");
		hotel.setValue(500.00);
		
		Reservation reservation = new Reservation();
		reservation.setAir("TAM");
		reservation.setCar("Ferrari");
		reservation.setHotel(hotel);
		
		ReservationFacade facade = new ReservationFacade();
		facade.confirm(reservation);
		
	}

}
