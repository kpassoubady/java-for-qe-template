package com.kavinschool.junit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import static org.hamcrest.CoreMatchers.equalTo;

public class SoftAssertionsExampleTest {

    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Test
    public void testSoftAssertions() {
        collector.checkThat("First assertion", 2 + 2, equalTo(5));
        collector.checkThat("Second assertion", "Kangs".length(), equalTo(6));
        collector.checkThat("Third assertion", "JUnit".toLowerCase(), equalTo("Junit"));
    }
}
