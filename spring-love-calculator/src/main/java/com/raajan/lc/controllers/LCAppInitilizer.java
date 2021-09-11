package com.raajan.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.raajan.lc.api.UserInfoDTO;

@Controller
public class LCAppInitilizer {
	
	
	
	
	
	/*
	@RequestMapping("/")
	public String homepage(Model model)
	{
		UserInfoDTO userInfoDto=new UserInfoDTO();
		
		model.addAttribute("userInfo",userInfoDto);
		return"home-page";
	}
	@RequestMapping("/home-process")
	// this "@RequestParam String userName,@RequestParam String crushName" be used  but it will be too difficult if we have large files.
	public String resultProcess(UserInfoDTO userInfoDto, Model model)
	
	{
		model.addAttribute("userInfo",userInfoDto);
		model.addAttribute("userInfo",userInfoDto);
		
		return"result-page";
	}*/
	
	// we can do all things done by spring framework
	
	@RequestMapping("/")
	public String homepage(@ModelAttribute("userInfo")UserInfoDTO userInfoDTO)
	
	{
		
		
		return"home-page";
	}
	@RequestMapping("/home-process")
	// this "@RequestParam String userName,@RequestParam String crushName" be used  but it will be too difficult if we have large files.
	public String resultProcess(@Valid @ModelAttribute("userInfo")UserInfoDTO userInfoDto,BindingResult result)
	
	
	{
		if(result.hasErrors())
		{
			List<ObjectError> allErrors = result.getAllErrors();
			for(ObjectError temp:allErrors)
			{
				System.out.println(temp);
			}
			return"home-page";
		}
		
		return"result-page";
	}

}
