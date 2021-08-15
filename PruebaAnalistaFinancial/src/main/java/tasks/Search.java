package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.SearchCoursePage;

public class Search implements Task {

    private String course;

    public Search(String course) {
        this.course = course;
    }

    public static Search the(String course){
        return Tasks.instrumented(Search.class, course);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SearchCoursePage.COURSES_AND_CERTS),
                Enter.theValue("Patrones de automatizacion").into(SearchCoursePage.INPUT_COURSE_SEARCH),
                Click.on(SearchCoursePage.BUTTON_COURSE_SEARCH),
                Click.on(SearchCoursePage.FOUND_COURSE));
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
