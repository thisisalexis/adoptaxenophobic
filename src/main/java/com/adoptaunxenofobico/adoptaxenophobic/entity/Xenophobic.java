package com.adoptaunxenofobico.adoptaxenophobic.entity;

public class Xenophobic {
	
	private int id;
	private String firstName;
	private String lastName;
	private String description;
	private int votes;
	private String facebookUser;
	private String instagramUser;
	private String twitterUser;
	private boolean isActive;
	private String country;
	private String phoneNumber;
	private String level;
	private boolean isAdoped;

	public Xenophobic() {
		super();
	}

	public Xenophobic(int id, String firstName, String lastName, String description, int votes, String facebookUser,
			String instagramUser, String twitterUser, boolean isActive, String country, String phoneNumber,
			String level, boolean isAdoped) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.description = description;
		this.votes = votes;
		this.facebookUser = facebookUser;
		this.instagramUser = instagramUser;
		this.twitterUser = twitterUser;
		this.isActive = isActive;
		this.country = country;
		this.phoneNumber = phoneNumber;
		this.level = level;
		this.isAdoped = isAdoped;
	}

	@Override
	public String toString() {
		return "Xenophobic [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", description="
				+ description + ", votes=" + votes + ", facebookUser=" + facebookUser + ", instagramUser="
				+ instagramUser + ", twitterUser=" + twitterUser + ", isActive=" + isActive + ", country=" + country
				+ ", phoneNumber=" + phoneNumber + ", level=" + level + ", isAdoped=" + isAdoped + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	public String getFacebookUser() {
		return facebookUser;
	}

	public void setFacebookUser(String facebookUser) {
		this.facebookUser = facebookUser;
	}

	public String getInstagramUser() {
		return instagramUser;
	}

	public void setInstagramUser(String instagramUser) {
		this.instagramUser = instagramUser;
	}

	public String getTwitterUser() {
		return twitterUser;
	}

	public void setTwitterUser(String twitterUser) {
		this.twitterUser = twitterUser;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public boolean isAdoped() {
		return isAdoped;
	}

	public void setAdoped(boolean isAdoped) {
		this.isAdoped = isAdoped;
	}
	
}
