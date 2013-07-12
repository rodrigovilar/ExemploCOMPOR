package exemplo.reservas;

public class Reservation {

	private String car;
	private Hotel hotel;
	private String air;

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	public String getAir() {
		return air;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public void setAir(String air) {
		this.air = air;
	}

	public Hotel getHotel() {
		return hotel;
	}

}
