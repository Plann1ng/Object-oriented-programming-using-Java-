/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package assignmentone;

import org.junit.jupiter.api.Test;

import assignmentone.App;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
