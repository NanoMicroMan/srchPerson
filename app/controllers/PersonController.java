package controllers;

import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

import static play.libs.Scala.asScala;

/**
 * An example of form processing.
 *
 * https://playframework.com/documentation/latest/JavaForms
 */
@Singleton
public class PersonController extends Controller {
    private final Form<PersonData> form;
    private final List<PersonData> personList;

    @Inject
    public PersonController(FormFactory formFactory) {
        this.form = formFactory.form(PersonData.class);
        this.personList = new ArrayList<>();//com.google.common.collect.Lists.newArrayList( );
    }

    public Result index() {
        return ok(views.html.index.render());
    }

    public Result listPersons() {
        return ok(views.html.listPersons.render(asScala(personList), form));
    }

    public Result createPerson() {
        final Form<PersonData> boundForm = form.bindFromRequest();

        if (boundForm.hasErrors()) {
            play.Logger.ALogger logger = play.Logger.of(getClass());
            logger.error("errors = {}", boundForm.errors());
            return badRequest(views.html.listPersons.render(asScala(personList), boundForm));
        } else {
            PersonData data = boundForm.get();
            personList.add(data);
            flash("info", "Person added!");
            return redirect(routes.PersonController.listPersons());
        }
    }
}
