package com.campusdual.classroom;

public class PoliceOfficer extends Person {

	protected String squad;

	public PoliceOfficer(String name, String surname, String squad) {
		super(name, surname);
		this.squad = squad;
	}

	public String getSquad() {
		return this.squad;
	}

	public void setSquad(String squad) {
		this.squad = squad;
	}

	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println("Equipo: " +squad);
	}

	@Override
	public String getSurname() {
		return super.getSurname();
	}

	@Override
	public void setName(String name) {
		super.setName(name);
	}

	@Override
	public void setSurname(String surname) {
		super.setSurname(surname);
	}
}
