package com.mounir.myfacture.web;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.mounir.myfacture.business.IUserBusiness;
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
    private boolean authenticated ;
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


	public boolean isAuthenticated() {
		return authenticated;
	}


	public void setAuthenticated(boolean authenticated) {
		this.authenticated = authenticated;
	}


	public String login(){
		User user = userBusiness.login(login, password) ;
		if(user!=null){
			fillObject(user) ;
			authenticated = true ;
			return SUCCESS ;
		}else{
			authenticated = false ;
			return FAILURE ;
		}
	}
		public String logout(){
			((HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true)).invalidate() ;
			return "logout" ;
		
	}
	
	
	public String create(){
		User user = new User(0, firstName, lastName, login, password, mail, null, phone) ;
		userBusiness.create(user) ;
		return SUCCESS ;
	}
	
	private void fillObject(User user){
		setFirstName(user.getFirstName()) ;
		setLastName(user.getLastName()) ;
		setLogin(user.getLogin()) ;
		setMail(user.getMail()) ;
//		setBirthDate(user.getBirthDate()) ; TODO casting
		setPhone(user.getPhone()) ;
		
	}
}
