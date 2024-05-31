package com.unac.pages;

import com.unac.actions.Action;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://parabank.parasoft.com/")

public class LoginPage extends PageObject {
    By nombre = By.id("customer.firstName");
    By apellido = By.id("customer.lastName");
    By direccion = By.id("customer.address.street");
    By ciudad = By.id("customer.address.city");
    By estado = By.id("customer.address.state");
    By postal = By.id("customer.address.zipCode");
    By telefono = By.id("customer.phoneNumber");
    By sSN = By.id("customer.ssn");
    By username = By.id("customer.username");
    By password = By.id("customer.password");
    By confirmPassword = By.id("repeatedPassword");
    By btnRegister = By.xpath("//*[@id=\"loginPanel\"]/p[2]/a");
    By btnRegistrar = By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");
    public void navegateTo(String url){
        Action.navegateUrl(getDriver(),url);
        Action.clickElement(getDriver(),btnRegister);
    }
    public void register1(String strNombre,String strApellido){
        Action.sendData(getDriver(),nombre, strNombre);
        Action.sendData(getDriver(),apellido,strApellido);
    }
    public void register2(String strDireccion, String strCiudad,String strEstado){
        Action.sendData(getDriver(),estado,strEstado);
        Action.sendData(getDriver(),direccion, strDireccion);
        Action.sendData(getDriver(),ciudad,strCiudad);

    }
    public void register3(String strPostal,String strTelefono, String strSSN){
        Action.sendData(getDriver(),postal, strPostal);
        Action.sendData(getDriver(),telefono,strTelefono);
        Action.sendData(getDriver(),sSN,strSSN);
    }

    public void register(String strUsername, String strPassword){
        Action.sendData(getDriver(),username, strUsername);
        Action.sendData(getDriver(),password,strPassword);
        Action.sendData(getDriver(),confirmPassword,strPassword);
        Action.clickElement(getDriver(),btnRegistrar);

    }



}
