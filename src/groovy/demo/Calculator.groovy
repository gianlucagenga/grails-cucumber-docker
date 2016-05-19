package demo

/**
 * Created by gianlucagenga on 19/05/16.
 */
class Calculator {

    GroovyShell shell = GroovyShell.newInstance()
    String arg

    def run () {
        shell.evaluate(arg).toString()
    }
}
