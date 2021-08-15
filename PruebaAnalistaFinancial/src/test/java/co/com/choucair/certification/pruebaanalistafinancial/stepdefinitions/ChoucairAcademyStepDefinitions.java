package co.com.choucair.certification.pruebaanalistafinancial.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.AcademyChoucairData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Answer;
import tasks.Login;
import tasks.OpenUp;
import tasks.Search;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Brandon wants to learn automation at the choucair academy$")
    public void thanBrandonWantsToLearnAutomationAtTheChoucairAcademy(List<AcademyChoucairData> academyChoucairData) {
        /*WAS ABLE TO solo se utiliza en la situación del GIVEN (precondiciones)
        Ya que se habla en pasado, para todo lo demás (WHEN) se utiliza el ATTEMPTS TO*/
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(),
                Login.onThePage(academyChoucairData.get(0).getStrUser(), academyChoucairData.get(0).getStrPassword()));
        System.out.println(academyChoucairData.get(0).getStrUser() +  academyChoucairData.get(0).getStrPassword());
    }


    @When("^he search for the course on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^he finds the course called resources$")
    public void heFindsTheCourseCalledResourcesPatronesDeAutomatizacion(List<AcademyChoucairData> academyChoucairData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }


}
