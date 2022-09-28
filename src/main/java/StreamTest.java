import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StreamTest {

    private static final Logger logger = LoggerFactory.getLogger(StreamTest.class);

    public static void main(String[] args) {
        //
        List<String> classList = Arrays.asList("java", "spring framework", "spring jpa", "java8");
        long count = 0;

        for (String className : classList) {
            if (className.contains("java")) {
                count++;
            }
        }
        logger.debug("java 가 들어간 강좌 갯수 : {}", count);

        long streamCount = classList.stream().filter(className -> className.contains("java"))
            .count();

        logger.debug("Stream 으로 java count :{}", streamCount);

        Stream<String> streamString = Arrays.stream(new String[]{"oh", "kim", "lee"});
        logger.debug("stream String:{}", streamString.toList());
    }

}
