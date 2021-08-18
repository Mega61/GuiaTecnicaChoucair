package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage{

    public static final Target LOGIN_BUTTON = Target.the("Button that shows the popup login form").located(By.xpath("/html/body/div[1]/div[2]/div/section/div[2]/header/div[1]/nav/ul[2]/li"));
    public static final Target USERNAME_INPUT = Target.the("Username input for login form").located(By.xpath("//*[@id=\"username\"]"));
    public static final Target PASSWORD_INPUT = Target.the("Password inpit for login form").located(By.xpath("//*[@id=\"password\"]"));
    public static final Target FINAL_LOGIN_BUTTON = Target.the("Login button inside the login form").located(By.xpath("/html/body/div[1]/div[2]/div/section/div[2]/div[1]/div/div/div[2]/div[2]/form/div[3]/button"));
    public static final Target FINAL_LOGIN_BUTTON_FAIL = Target.the("Login button inside the login form after rejected first login form").located(By.xpath("/html/body/div[1]/div[2]/div/section/div[2]/div[2]/div/div/div[2]/div[3]/form/div[3]/button"));

}
