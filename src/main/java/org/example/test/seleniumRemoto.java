package org.example.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class seleniumRemoto {

    public static void main(String[] args) throws Exception {
        // Configurar las capacidades deseadas
        ChromeOptions chromeOptions = new ChromeOptions();
        // Establecer la URL del hub de Selenium Grid
        URL hubUrl = new URL("http://localhost:4444/wd/hub");

        // Inicializar el controlador remoto
        WebDriver driver = new RemoteWebDriver(hubUrl, chromeOptions);

        // Ejecutar tu prueba en el controlador remoto
        driver.get("https://www.saucedemo.com/v1/");
        // Agregar pasos de prueba adicionales aquí

    }

}
