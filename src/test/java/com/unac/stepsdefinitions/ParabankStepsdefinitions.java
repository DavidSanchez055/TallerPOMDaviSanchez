package com.unac.stepsdefinitions;

import com.unac.pages.ProductsPage;
import com.unac.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class ParabankStepsdefinitions {

    LoginPage loginPage;
    ProductsPage productsPage;

    @Given("Deseo abrir la pagina de Parabank {string}")
    public void deseo_abrir_la_pagina_de_Parabank(String url) {
        loginPage.navegateTo(url);
    }
    @When("ingreso el nombre  {string} y el apellido {string}")
    public void ingresoElNombreYElApellido(String nombre, String apellido) {
         loginPage.register1(nombre,apellido);
    }
    @When("ingreso la direccion {string} y la ciudad {string} y el estado {string}")
    public void ingresoLaDireccionYLaCiudadYElEstado(String direccion, String ciudad, String estado){
        loginPage.register2(direccion,ciudad,estado);
    }
    @When ("ingreso el codigo postal {string} y el telefono {string} y el SSN {string}")
    public void ingresoElCodigoPostalYElTelefonoYElSSN(String codigoPostal, String telefono, String socialsSecurityNum){
        loginPage.register3(codigoPostal,telefono,socialsSecurityNum);
    }

    @When ("ingreso el Username {string} y la  contrasena {string} y confirmo contrasena y envio")
    public void ingresoElUsernameYLaContrasenaYConfirmoContrasenaYEnvio(String username, String password){
        loginPage.register(username,password);
    }
    @When("me dirijo a OpenNewAccount y despues selecciono Savings y creo la cuenta")
    public  void meDirijoAOpenNewAccountYDespuesSeleccionoSavingsYCreoLaCuenta(){
        productsPage.clickearSavings();
    }
    @Then("verifico que exista la cuenta creada")
    public void verificoQueExistaLaCuentaCreada(){
        productsPage.validateAccount();
    }
}
