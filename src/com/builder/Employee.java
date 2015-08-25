package com.builder;

import java.util.Date;


public class Employee {

	private String fname;
	private String lname;
	private Integer age;
	private Date date;
	private String email;
	private String login;
	private String password;

	private Employee(Builder builder) {
		this.fname = builder.fname;
		this.lname = builder.lname;
		this.age = builder.age;
		this.date = builder.date;
		this.email = builder.email;
		this.login = builder.login;
		this.password = builder.password;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public Integer getAge() {
		return age;
	}

	public Date getDate() {
		return date;
	}

	public String getEmail() {
		return email;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public static class Builder {

		private String fname;
		private String lname;
		private Integer age;
		private Date date;
		private String email;
		private String login;
		private String password;

		private Builder() {

		}

		public Builder fname(String fname) {
			this.fname = fname;
			return this;
		}

		public Builder lname(String lname) {
			this.lname = lname;
			return this;
		}

		public Builder age(Integer age) {
			this.age = age;
			return this;
		}

		public Builder date(Date date) {
			this.date = date;
			return this;
		}

		public Builder email(String email) {
			this.email = email;
			return this;
		}

		public Builder login(String login) {
			this.login = login;
			return this;
		}

		public Builder password(String password) {
			this.password = password;
			return this;
		}

		public Employee build() {
			return new Employee(this);
		}

	}

	public static void main(String[] args) {
		Builder b = new Builder();
		b.age = 10;
		Employee e = new Employee(b);
		System.out.println(e.getAge());
		Employee employee = new Employee.Builder().fname("olool").age(11)
				.build();
		new Employee.Builder().fname("fdsa").login("").age(10).build();
		System.out.println(employee.getClass());
		System.out.println(employee.getFname());
	}
}
