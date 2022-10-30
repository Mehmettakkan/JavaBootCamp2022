package week3Homework3.entities.concrete;

import week3Homework3.entities.abstracts.Entity;

public class Instructor implements Entity {
	private String firsName;
	private String lastName;
	private String certificate;// sertifika
	private String branch;// brans

	public Instructor(String firsName, String lastName, String certificate, String branch) {
		super();
		this.firsName = firsName;
		this.lastName = lastName;
		this.certificate = certificate;
		this.branch = branch;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
