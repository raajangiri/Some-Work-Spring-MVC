package com.raajan.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.raajan.lc.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {
		// TODO Auto-generated method stub
		System.out.println("inside print method of phonenumber formatter");
		return phone.getCountryCode() + "-" + phone.getUserName();

	}

	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {

		// split the string received from the user
		String[] phoneNumberArray = completePhoneNumber.split("-");

		// extract the country code and set it to the phone class contrycodeproerty
		Phone phone = new Phone();

		int index = completePhoneNumber.indexOf("-");

		if (index == -1) {
			phone.setCountryCode("977");
			phone.setUserName(phoneNumberArray[0]);

		} 
		
		if (index == 0) {
			phone.setCountryCode("977");
			phone.setUserName(phoneNumberArray[1]);

		}
		
		else {

			phone.setCountryCode(phoneNumberArray[0]);
			phone.setUserName(phoneNumberArray[1]);
		}
		return phone;
	}

}
