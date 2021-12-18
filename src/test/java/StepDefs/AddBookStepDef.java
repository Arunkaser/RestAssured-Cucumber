package StepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddBookStepDef {


    @When("I add a book to my reading list")
    public void i_add_a_book_to_my_reading_list() {
        System.out.println("Adding books");
    }

    @Then("the book is added")
    public void the_book_is_added() {
        System.out.println("books Added");
    }

}
