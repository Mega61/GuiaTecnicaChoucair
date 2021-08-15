package tasks;

import cucumber.api.java.en_scouse.An;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.SearchCoursePage;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question){
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result = false;
        String nameCourse = Text.of(SearchCoursePage.COURSE_TITLE).viewedBy(actor).asString();
        System.out.println("Ingresado por tabla: " + question + "\nEncontrado en página: " + nameCourse);
        if(question.equals(nameCourse)){
            result = true;
        }
        return result;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
