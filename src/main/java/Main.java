import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.logstash.logback.argument.StructuredArguments.keyValue;


public class Main {

    private static final Logger logger = LoggerFactory
            .getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("line is logged successfully");
        logger.info("this fails to log without notice {}", keyValue("message", new Message("hello")));
        logger.info("even all further logs");
        logger.info("are not shown");
        logger.error("as well as errors", new RuntimeException("and logged exceptions"));
    }
}
