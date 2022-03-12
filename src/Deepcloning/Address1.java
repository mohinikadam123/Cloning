package Deepcloning;

public class Address1 implements Cloneable
{
String city;
String country;
int pin;
 public Address1()
 {
	 
 }
public Address1(String city, String country, int pin) {
	this.city = city;
	this.country = country;
	this.pin = pin;
}
@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}
@Override
public String toString() {
	return "Address1 [city=" + city + ", country=" + country + ", pin=" + pin + "]";
}

 
}

