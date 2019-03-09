package UnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="",
		glue={""},
		tags= {""},
		plugin= {"Pretty","json:trget/cucumber.json","html:target/cucumber-html"}
		)


public class Test_Runner {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
