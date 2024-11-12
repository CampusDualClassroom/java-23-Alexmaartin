package com.campusdual.classroom;

public class Teacher extends Person {

	protected String area;

	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println("Área: "+area);
	}

	public Teacher(String name, String surname) {
		super(name, surname);
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public void setName(String name) {
		super.setName(name);
	}

	@Override
	public String getSurname() {
		return super.getSurname();
	}

	@Override
	public void setSurname(String surname) {
		super.setSurname(surname);
	}
}
