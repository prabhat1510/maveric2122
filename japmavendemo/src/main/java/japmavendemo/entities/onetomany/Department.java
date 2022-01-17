package japmavendemo.entities.onetomany;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="department_info")
public class Department {
	
	@Id
	@Column(name="deptNo")
	private Integer id;
	private String name;
	@OneToMany(mappedBy="department")
	private Set<Employees> employee;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Employees> getEmployee() {
		return employee;
	}
	public void setEmployee(Set<Employees> employee) {
		this.employee = employee;
	}
	
	
}
