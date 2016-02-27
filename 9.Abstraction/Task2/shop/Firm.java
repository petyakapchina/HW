package shop;

public class Firm {
	private String name;
	private String country;
	private String address;
	private String phone;
	private String faks;
	
	Firm (String name, String country, String address, String phone, String faks){
		setAddress(address);
		setCountry(country);
		setFaks(faks);
		setName(name);
		setPhone(phone);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && !name.equals("")) {
			this.name = name;
		}
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		if (country != null && !country.equals("")) {
			this.country = country;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (address != null && !address.equals("")) {
			this.address = address;
		}
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		if (phone != null && !phone.equals("")) {
			this.phone = phone;
		}
	}

	public String getFaks() {
		return faks;
	}

	public void setFaks(String faks) {
		if (faks != null && !faks.equals("")) {
			this.faks = faks;
		}
	}

}
