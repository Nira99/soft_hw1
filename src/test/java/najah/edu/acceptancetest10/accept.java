package najah.edu.acceptancetest10;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "casese" ,
plugin = { "html:target/cucumber/wikipedia.html"},
monochrome = true ,
snippets =  SnippetType.CAMELCASE , 
glue = {"najah.edu.acceptancetest10"},
strict = true 
	)

public class accept {

}
