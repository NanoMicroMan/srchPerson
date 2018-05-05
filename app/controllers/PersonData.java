package controllers;

import play.data.validation.Constraints;

import javax.swing.*;

/**
 * A form processing DTO that maps to the Person form.
 *
 * Using a class specifically for form binding reduces the chances
 * of a parameter tampering attack and makes code clearer, because
 * you can define constraints against the class.
 */
public class PersonData {
	public String gender;
	@Constraints.Required
	public String first_name;
	@Constraints.Required
	public String last_name;

	public String birth_dates;
	public String birth_places;

	public String marriage_dates;
	public String marriage_places;

	public String death_dates;
	public String death_places;

	public String other_dates;
	public String other_places;

	public String father_first_name;
	public String father_last_name;

	public String mother_first_name;
	public String mother_last_name;

	public String spouse_first_name;
	public String spouse_last_name;

	public PersonData() { }

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getBirth_dates() {
		return birth_dates;
	}

	public void setBirth_dates(String birth_dates) {
		this.birth_dates = birth_dates;
	}

	public String getBirth_places() {
		return birth_places;
	}

	public void setBirth_places(String birth_places) {
		this.birth_places = birth_places;
	}

	public String getMarriage_dates() {
		return marriage_dates;
	}

	public void setMarriage_dates(String marriage_dates) {
		this.marriage_dates = marriage_dates;
	}

	public String getMarriage_places() {
		return marriage_places;
	}

	public void setMarriage_places(String marriage_places) {
		this.marriage_places = marriage_places;
	}

	public String getDeath_dates() {
		return death_dates;
	}

	public void setDeath_dates(String death_dates) {
		this.death_dates = death_dates;
	}

	public String getDeath_places() {
		return death_places;
	}

	public void setDeath_places(String death_places) {
		this.death_places = death_places;
	}

	public String getOther_dates() {
		return other_dates;
	}

	public void setOther_dates(String other_dates) {
		this.other_dates = other_dates;
	}

	public String getOther_places() {
		return other_places;
	}

	public void setOther_places(String other_places) {
		this.other_places = other_places;
	}

	public String getFather_first_name() {
		return father_first_name;
	}

	public void setFather_first_name(String father_first_name) {
		this.father_first_name = father_first_name;
	}

	public String getFather_last_name() {
		return father_last_name;
	}

	public void setFather_last_name(String father_last_name) {
		this.father_last_name = father_last_name;
	}

	public String getMother_first_name() {
		return mother_first_name;
	}

	public void setMother_first_name(String mother_first_name) {
		this.mother_first_name = mother_first_name;
	}

	public String getMother_last_name() {
		return mother_last_name;
	}

	public void setMother_last_name(String mother_last_name) {
		this.mother_last_name = mother_last_name;
	}

	public String getSpouse_first_name() {
		return spouse_first_name;
	}

	public void setSpouse_first_name(String spouse_first_name) {
		this.spouse_first_name = spouse_first_name;
	}

	public String getSpouse_last_name() {
		return spouse_last_name;
	}

	public void setSpouse_last_name(String spouse_last_name) {
		this.spouse_last_name = spouse_last_name;
	}
}
