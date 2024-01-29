package com.project.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.entity.VerificationCheckRequest;
import com.twilio.Twilio;
import com.twilio.exception.ApiException;
import com.twilio.rest.api.v2010.account.ValidationRequest;
import com.twilio.rest.verify.v2.service.Verification;
import com.twilio.rest.verify.v2.service.VerificationCheck;
import com.twilio.rest.verify.v2.service.VerificationCheckCreator;
import com.twilio.type.PhoneNumber;

@RestController
@RequestMapping("/api/verification")
public class PhoneNumberVerification {
	
	private static final String ACCOUNT_SID = "ACd5cdee69d1f74e23dff8cac7dd5c71d6";
    private static final String AUTH_TOKEN = "39203273e7a40c587a16c192641efaec";
    private static final String SERVICE_ID = "VAe40d465f9b9da5d8e6659ff89c3fc9d6";
	
	@PostMapping("/sendcode")
	public ResponseEntity<String> sendVerficationCode(@RequestBody String phoneNumber)
	{
		try {
			

            // Set your custom message here
            String customMessage = "This message is generated by thanendra kashyap spring project & OTP is: {####}";
			
			Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
			Verification verification = Verification.creator(SERVICE_ID, phoneNumber, "sms").create();
//			Verification verification = Verification.creator(SERVICE_ID, phoneNumber, "sms").setCustomMessage(customMessage).create();
			
			
			System.out.println("Verfication SID : "+verification.getSid()+verification.getStatus());
			return new ResponseEntity<>("Verification Code Sent Successfully", HttpStatus.OK);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return new ResponseEntity<>("Error Sending Verification Code", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
    @PostMapping("/initiate-call-verification")
    public ResponseEntity<String> initiateCallVerification(@RequestBody String phoneNumber) {
        try {

            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

            Verification verification = Verification.creator(SERVICE_ID, phoneNumber, "call").create();

            System.out.println("Verification SID: " + verification.getSid());
            return new ResponseEntity<>("Call verification initiated successfully.", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Error initiating call verification.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	
	@PostMapping("/verifyPhoneNumber")
    public ResponseEntity<String> verifyPhoneNumber(@RequestBody VerificationCheckRequest request) {
        try {
            PhoneNumber phoneNumberObject = new PhoneNumber(request.getPhoneNumber());

            if (phoneNumberObject == null) 
            	return new ResponseEntity<>("Phone number is null", HttpStatus.BAD_REQUEST);
                
            String phoneNumber = phoneNumberObject.getEndpoint();
            VerificationCheck verificationCheck = VerificationCheck.creator(SERVICE_ID)
                		.setCode(request.getValidationCode())
                		.setTo(phoneNumber)
                		.create();
                        

                if ("approved".equalsIgnoreCase(verificationCheck.getStatus())) {
                    return new ResponseEntity<>("Phone number verified successfully", HttpStatus.OK);
                } else {
                    return new ResponseEntity<>("Phone number verification failed", HttpStatus.BAD_REQUEST);
                }
            
        } catch (ApiException e) {
            return new ResponseEntity<>("Failed to verify phone number: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        	return new ResponseEntity<>("Failed to verify phone number: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
