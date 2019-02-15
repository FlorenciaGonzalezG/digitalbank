package io.demo.bank.test.steps;

import static org.junit.Assert.assertTrue;

import io.demo.bank.test.pageobject.ChangePasswordPage;
import io.demo.bank.test.pageobject.HomePage;
import net.thucydides.core.annotations.Step;


public class ChangePasswordSteps {
	
	HomePage homePage;
	ChangePasswordPage changePasswordPage;
	
	
	@Step ("Click Change Password menu option")
	public void clickChangePasswordMenuOption () {
		homePage.clickChangePasswordMenuOption();
	}
	
	@Step ("Enter Current Password '{0}'")
	public void enterCurrentPassword (String password) {
		changePasswordPage.enterCurrentPassword(password);
	}
	
	@Step ("Enter New Password '{0}'")
	public void enterNewPassword (String password) {
		changePasswordPage.enterNewPassword(password);
	}
	
	@Step ("Enter Confirm Password '{0}'")
	public void enterConfirmPassword (String password) {
		changePasswordPage.enterConfirmPassword(password);
	}
	
	@Step ("Click Update Password")
	public void clickUpdatePassword () {
		changePasswordPage.clickUpdatePassword();
	}
	
	@Step ("Assert Current Password requirement Error Message")
	public void currentPasswordErrorRequired () {
		assertTrue (changePasswordPage.currentPasswordRequired());
	}
	
	@Step ("Assert New Password requirement Error Message")
	public void newPasswordErrorRequired () {
		assertTrue (changePasswordPage.newPasswordRequired());
	}
	
	@Step ("Assert Confirm Password requirement Error Message")
	public void confirmPasswordErrorRequired () {
		assertTrue (changePasswordPage.confirmPasswordRequired());
	}
	
	@Step ("Assert Current Password Error Message")
	public void currentPasswordError () {
		assertTrue (changePasswordPage.errorMessagePresent());
	}
	


}