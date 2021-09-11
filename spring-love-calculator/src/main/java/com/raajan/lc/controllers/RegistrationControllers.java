package com.raajan.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.raajan.lc.api.CommunicationDTO;
import com.raajan.lc.api.Phone;
import com.raajan.lc.api.UserRegistrationDTO;

@Controller
public class RegistrationControllers {

	@RequestMapping("/registration")
	public String showRegistration(@ModelAttribute("userReg") UserRegistrationDTO dto)

	{
		dto.setName("raajan");
		System.out.println("inside show registration");
		// load the save registration data from the database

		Phone phone = new Phone();
		phone.setCountryCode("23");
		phone.setUserName("988405845");
		CommunicationDTO communicationDTO = new CommunicationDTO();
		communicationDTO.setPhone(phone);
		dto.setCommunicationDTO(communicationDTO);

		return "user-registration-page";
	}

	@RequestMapping("/registration-success")
	public String processUserReg(@Valid @ModelAttribute("userReg") UserRegistrationDTO dto, BindingResult result) {

		System.out.println("inside show the process registration");
		if (result.hasErrors()) {
			System.out.println("my apps has erros");
			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError error : allErrors) {
				System.out.println(error);
			}
			return "user-registration-page";
		}

		return "registration-success";
	}
}
