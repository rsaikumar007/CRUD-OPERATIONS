package Project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Sid;
	@Column(name="Student_Name")
	private String Sname;
	@Column(name="Branch")
	private String Branch;
	@Column(name="Fee")
	private int Fee;
	public Student() {
		super();
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public int getFee() {
		return Fee;
	}
	public void setFee(int fee) {
		Fee = fee;
	}
	@Override
	public String toString() {
		return "Student [Sname=" + Sname + ", Branch=" + Branch + ", Fee=" + Fee + "]";
	}
	
}