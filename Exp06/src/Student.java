import java.util.Date;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 12/31/2015.
 */
public abstract class Student {

	String name;
	char gender;
	Date birthDay;
	String school;
	String stuId;
	String category;
	double[] score;
	boolean status;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double[] getScore() {
		return score;
	}

	public void setScore(double ... score) {
		this.score = score;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public abstract boolean getPass();
	public abstract double computeAverage();
	public abstract String getDegree();
}

