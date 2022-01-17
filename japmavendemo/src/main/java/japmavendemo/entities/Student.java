package japmavendemo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private Integer studentId;
	private String studentName;
	//Defines a single valued association to another entity that has one-to-one multiplicity.
	//cascade and fetch is an optional attributes of this 
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Address address;
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
