package com.HotelBookingApplication.request;

import java.util.Objects;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

public class LoginRequest {
	
    @Override
	public int hashCode() {
		return Objects.hash(email, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginRequest other = (LoginRequest) obj;
		return Objects.equals(email, other.email) && Objects.equals(password, other.password);
	}
	@Override
	public String toString() {
		return "LoginRequest [email=" + email + ", password=" + password + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public LoginRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginRequest(@NotBlank String email, @NotBlank String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@NotBlank
    private String email;
    @NotBlank
    private String password;
}
