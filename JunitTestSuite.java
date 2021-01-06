package assignment1;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    UniversityTest.class,
    OfficierTest.class,
    LecturerTest.class,
    TransactionTest.class,
    ProviderTest.class,
    SeasonalStaffTest.class,
    StudentTest.class,
    MyAccountTest.class,

})
public class JunitTestSuite {

    
}
