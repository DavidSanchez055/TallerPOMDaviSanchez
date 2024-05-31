package com.unac.pages;

import com.unac.actions.Action;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ProductsPage extends PageObject {
    By aOpenNewAccount = By.xpath("//a[text()='Open New Account']");
    By savings = By.xpath("//*[@id='type']/option[2]");
    By btnOpenNewAccount = By.xpath("//input[@type='button' and @class='button' and @value='Open New Account']");
    //*[@id="openAccountForm"]/form/div/input

    By account = By.xpath("//*[@id=\"newAccountId\"]");
    String cuentaNueva;
    List<WebElement> listaCuentas;
    String cuentaComparar;

    By aAccountsOverview = By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a");

    By pathListaComparar = By.xpath("//*[@id=\"accountTable\"]/tbody/tr");



    public void esperar() {
        try {
            Thread.sleep(3000); // wait for 1000 milliseconds (1 second)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickearSavings(){
        Action.clickElement(getDriver(), aOpenNewAccount);
        Action.clickElement(getDriver(), savings);
        esperar();
        Action.clickElement(getDriver(), btnOpenNewAccount);
        esperar();
        cuentaNueva = Action.getElementText(getDriver(),account);

    }

    public void validateAccount(){
        Action.clickElement(getDriver(),aAccountsOverview);
        listaCuentas = Action.getListElementText(getDriver(), pathListaComparar);
        boolean cuentaExistente = false;

        for (WebElement row : listaCuentas) {
            WebElement firstColumn = row.findElement(By.xpath("./td[1]/a"));
            String accountValue = firstColumn.getText();
            cuentaComparar = accountValue;
            if (accountValue.equals(cuentaNueva)) {
                cuentaExistente = true;
                break;
            }
        }

        if (cuentaExistente) {
            System.out.println("La cuenta " + cuentaNueva + " está presente en la tabla.");
            assertEquals("La cuenta buscada es: "+ cuentaNueva + "es igual a "+ cuentaComparar, cuentaNueva, cuentaComparar);
        } else {
            System.out.println("La cuenta " + cuentaNueva + " no está presente en la tabla.");

        }

    }
}