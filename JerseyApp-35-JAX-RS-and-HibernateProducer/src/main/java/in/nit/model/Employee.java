package in.nit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="empTab")
@NoArgsConstructor
public class Employee  implements Comparable<Employee >{
	@Id
	@GeneratedValue
	@Column(name="eid")
	private Integer empId;
	@Column(name="ename")
	private String empName;
	@Column(name="esal")
	private Double empSal;
	@Override
	public int compareTo(Employee e) {
		return  this.getEmpId()-e.getEmpId();
	}
	
}
