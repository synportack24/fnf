import idlReader.Utilities.Arguments;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class main {

    private final static Logger log = LogManager.getLogger(main.class);

    public static void Main(String[] args){
        Arguments.Parse(args);

        if(Arguments.CheckArguments() == false) {

            return;
        }

        log.info("Lets go!");

    }

}
