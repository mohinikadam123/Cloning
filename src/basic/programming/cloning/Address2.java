package basic.programming.cloning;

public class Address2 {
	String city;
	String country;
	int pin;
	
	public Address2()
	{
		
	}

	public Address2(String city, String country, int pin) {
		super();
		this.city = city;
		this.country = country;
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address2 [city=" + city + ", country=" + country + ", pin=" + pin + "]";
	}

	
}
