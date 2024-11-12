package com.campusdual.classroom;

public class Doctor extends Person {

	protected String specialization;

	public Doctor(String name, String surname, String specialization) {
		super(name, surname);
		this.specialization = specialization;
	}

	public String getSpecialization() {
		return this.specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println("Especialidad: " +specialization);
	}

	public Doctor(String name, String surname) {
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

	public Doctor() {
		super();
	}
}
