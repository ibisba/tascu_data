package eu.ibisba;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;
import com.beust.jcommander.Parameters;

import java.io.File;

@Parameters(commandDescription = "Available options: ")
public class CommandOptions  {
    @Parameter(names = {"-help","-h","--help"}, description = "Help overview")
    boolean help;

    @Parameter(names = "-input", description = "Tascu input file")
    File tascu;

    // TODO this is the default CommandOptions code ...
    public CommandOptions(String args[]) throws Exception {
        try {
            if (args.length == 0)
                throw new ParameterException("No parameter is given");

            new JCommander(this, args);

            if (this.help) {
                throw new ParameterException("");
            }

        } catch (ParameterException pe) {
            int exitCode = 64;
            if (this.help) {
                exitCode = 0;
            }
            System.out.println(pe.getMessage());
            new JCommander(this).usage();
            System.out.println("  * required parameter");
            System.exit(exitCode);
        }
    }
}
