package com.nepdroid.form;
	import javax.validation.constraints.Size;

	import org.hibernate.validator.constraints.NotEmpty;

	import com.fasterxml.jackson.annotation.JsonInclude;
	@JsonInclude(JsonInclude.Include.NON_NULL)

	public class Employee {
		private int empId;
		@NotEmpty
	@Size(min = 2, max = 30 )
		private String name;
		private Long salary;
		private int age;

	   
	    

		public void setEmpId(int empId) {
			this.empId=empId;
		}
		public int getEmpId() {
			return empId;
		}
		public void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public void setSalary(Long salary) {
			this.salary=salary;
		}
		public long getSalary() {
			return salary;
		}
		public void setAge(int age) {
			this.age=age;
		}
		public int getAge() {
			return age;
		}
	}


