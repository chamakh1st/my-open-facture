package com.mounir.myfacture.web;

import java.util.Date;

import com.mounir.myfacture.business.IUserBusiness;
import com.mounir.myfacture.business.impl.UserBusinessImpl;
import com.mounir.myfacture.entities.User;
import com.mounir.myfacture.web.base.BaseBean;


/**
 * 
 * @author Mounir
 *
 */
public class UserBean extends BaseBean{
	
//	Business services
	private IUserBusiness userBusiness ;

    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private String passwordConfirm;
    private String mail;
    private String birthDate;
    private String phone;
	
	public IUserBusiness getUserBusiness() {
		return userBusiness;
	}


	public void setUserBusiness(IUserBusiness userBusiness) {
		this.userBusiness = userBusiness;
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


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPasswordConfirm() {
		return passwordConfirm;
	}


	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}


	public String login(){
		boolean test = true ;
		if(test){
			return SUCCESS ;
		}else{
			return FAILURE ;
		}
	}
	
	public String create(){
		User user = new User(0, firstName, lastName, login, password, mail, null, phone) ;
		userBusiness.create(user) ;
		
		return SUCCESS ;
	}
}
