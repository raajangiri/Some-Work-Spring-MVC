package com.raajan.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {
	@NotBlank(message = "*user name cant be blank")
	//@Min(value=3,message="*atleast 3 characher")
	@Size(min=3,max=10 ,message="alteat 3 and max 10")
	private String userName;
	private String crushName;
	@AssertTrue(message="you have to agree our term and conditon")
	private boolean termandCondition;
	

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	public String getUserName() {
		return userName;
	}

	public String getCrushName() {
		return crushName;
	}



	public boolean isTermandCondition() {
		return termandCondition;
	}

	public void setTermandCondition(boolean termandCondition) {
		this.termandCondition = termandCondition;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}

}
