package japmavendemo.entities.bidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address_bi")
public class AddressBi {
	@Id
	private Integer addressId;
	private String city;
	private String street;
	private Integer pinCode;
	@OneToOne(mappedBy = "addressBi")
	private StudentBi studentbi;
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Integer getPinCode() {
		return pinCode;
	}
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	public StudentBi getStudentbi() {
		return studentbi;
	}
	public void setStudentbi(StudentBi studentbi) {
		this.studentbi = studentbi;
	}
	
	
}
