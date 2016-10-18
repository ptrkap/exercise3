import com.hr.PersonTest;
import com.math.CalculatorTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        PersonTest.class,
        CalculatorTest.class})
public class JUnitTestSuite {
}
