import demo.Calculator

import static cucumber.api.groovy.EN.*
import cucumber.runtime.PendingException

/**
 * Created by gianlucagenga on 19/05/16.
 */
Given(~'^the input "([^"]*)"$') { String arg1 ->
    // Express the Regexp above with the code you wish you had
    calculator = Calculator.newInstance(arg: arg1)
}
Given(~'^the input string "([^"]*)"$') { String arg1 ->
    // Express the Regexp above with the code you wish you had
    calculator = Calculator.newInstance(arg: arg1)
}
When(~'^the calculator is run$') { ->
    // Express the Regexp above with the code you wish you had
    output = calculator.run()
}
Then(~'^the output should be "([^"]*)"$') { String arg1 ->
    // Express the Regexp above with the code you wish you had
    assert output == arg1
}