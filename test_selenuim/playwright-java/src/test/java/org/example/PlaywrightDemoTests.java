package org.example;

import com.microsoft.playwright.*;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class PlaywrightDemo {

    @Test
    public void testOnChromeHeadless() {
        // Créer une instance de Playwright
        try (Playwright playwright = Playwright.create()) {
            // Lancer le navigateur Chromium en mode headless (sans interface graphique)
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));

            // Créer une nouvelle page
            Page page = browser.newPage();

            // Naviguer vers le site
            page.navigate("https://ecommerce-playground.lambdatest.io/");

            // Vérifier le titre de la page
            String pageTitle = page.title();
            assertEquals(pageTitle, "Your Store");

            // Fermer le navigateur
            browser.close();
        }
    }
}
