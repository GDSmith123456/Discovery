package flow;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FetchAccountTypeFlowImpTest {
    private FetchAccountTypeFlowImp testClass;

    @BeforeEach
    void setUp() {
        testClass = new FetchAccountTypeFlowImp(null);
    }

    @AfterEach
    void tearDown() {
        testClass = null;
    }

    @Test
    void methodToTest() {

        assertTrue(testClass.methodToTest());
    }
}