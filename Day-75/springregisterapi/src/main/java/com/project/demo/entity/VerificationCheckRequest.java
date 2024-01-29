package com.project.demo.entity;

public class VerificationCheckRequest {
//	private String serviceSid;
    private String phoneNumber;
    private String validationCode;
	public VerificationCheckRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	public String getServiceSid() {
//		return serviceSid;
//	}
//	public void setServiceSid(String serviceSid) {
//		this.serviceSid = serviceSid;
//	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getValidationCode() {
		return validationCode;
	}
	public void setValidationCode(String validationCode) {
		this.validationCode = validationCode;
	}
    
}
