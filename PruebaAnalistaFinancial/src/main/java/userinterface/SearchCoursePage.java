package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target COURSES_AND_CERTS = Target.the("Courses and certifications option on main page").located(By.xpath("//*[@id=\"certificaciones\"]/div[1]/a"));
    public static final Target INPUT_COURSE_SEARCH = Target.the("Input for course searching").located(By.xpath("//*[@id=\"coursesearchbox\"]"));
    public static final Target BUTTON_COURSE_SEARCH = Target.the("Button for course searching").located(By.xpath("/html/body/div[1]/div[2]/div/div/div/section/div[2]/form/fieldset/button"));
    public static final Target FOUND_COURSE = Target.the("Found Course Tittle").located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div[1]/h4/a"));
    public static final Target COURSE_TITLE = Target.the("Tittle of checked course").located(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/section/div/div[1]/div/div[1]/h3/a"));


}
