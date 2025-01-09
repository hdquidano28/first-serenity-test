package com.automation.orangehrm.login;

import net.serenitybdd.core.annotations.findby.By;

public class LoginForm {
    public static By USERNAME_FIELD = (By) By.id("username");
    public static By PASSWORD_FIELD = (By) By.id("password");
    public static By LOGIN_BUTTON = (By) By.id("login");
}
