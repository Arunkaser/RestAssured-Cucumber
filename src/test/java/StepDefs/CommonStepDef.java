package StepDefs;

import io.cucumber.java.en.Given;

public class CommonStepDef {


    @Given("I am an authorized user")
    public void i_am_an_authorized_user() {
       System.out.println("I am Authorized User");
    }

    @Given("A list of books are available")
    public void a_list_of_books_are_available() {
        System.out.println("book List");
    }
}
