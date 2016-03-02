/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.helloweenvsfei.struts.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/**
 * MyEclipse Struts Creation date: 04-30-2008
 * 
 * XDoclet definition:
 * 
 * @struts.form name="personForm"
 */
public class PersonForm extends ActionForm {

	private static final long serialVersionUID = -4399412058693078781L;

	/** id property */
	private Integer id;

	/** birthday property */
	private String birthday;

	/** name property */
	private String name;

	/** hobby property */
	private String[] hobby;

	/** action property */
	private String action;

	/** secret property */
	private boolean secret;

	/** account property */
	private String account;

	/*
	 * Generated Methods
	 */

	/**
	 * Method validate
	 * 
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Method reset
	 * 
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/**
	 * Returns the id.
	 * 
	 * @return Integer
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Set the id.
	 * 
	 * @param id
	 *            The id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Returns the birthday.
	 * 
	 * @return String
	 */
	public String getBirthday() {
		return birthday;
	}

	/**
	 * Set the birthday.
	 * 
	 * @param birthday
	 *            The birthday to set
	 */
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	/**
	 * Returns the name.
	 * 
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * Set the name.
	 * 
	 * @param name
	 *            The name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the hobby.
	 * 
	 * @return String[]
	 */
	public String[] getHobby() {
		return hobby;
	}

	/**
	 * Set the hobby.
	 * 
	 * @param hobby
	 *            The hobby to set
	 */
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	/**
	 * Returns the action.
	 * 
	 * @return String
	 */
	public String getAction() {
		return action;
	}

	/**
	 * Set the action.
	 * 
	 * @param action
	 *            The action to set
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * Returns the secret.
	 * 
	 * @return boolean
	 */
	public boolean getSecret() {
		return secret;
	}

	/**
	 * Set the secret.
	 * 
	 * @param secret
	 *            The secret to set
	 */
	public void setSecret(boolean secret) {
		this.secret = secret;
	}

	/**
	 * Returns the account.
	 * 
	 * @return String
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * Set the account.
	 * 
	 * @param account
	 *            The account to set
	 */
	public void setAccount(String account) {
		this.account = account;
	}

}