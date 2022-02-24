package com.sai.requestbinding;

public class PlanRequest {
	private String planName;
	private Integer age;
	private String unEmployee;

	private Integer income;
	
	public Integer getIncome() {
		return income;
	}
	public void setIncome(Integer income) {
		this.income = income;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getUnEmployee() {
		return unEmployee;
	}
	public void setUnEmployee(String unEmployee) {
		this.unEmployee = unEmployee;
	}
	

}
