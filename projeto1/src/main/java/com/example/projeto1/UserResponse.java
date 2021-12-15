package com.example.projeto1;

public class UserResponse {

	private Long id;
	private String name;
	private int birthday;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public static UserResponse build(Long idParam, String nameParam, int birthdayParam) {
		UserResponse user = new UserResponse();
		user.setId(idParam);
		user.setName(nameParam);
		user.setBirthday(birthdayParam);
		return user;
	}

}
