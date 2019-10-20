package eu.ibisba;

import org.junit.Test;

public class tascuTest {
    @Test
    public void testTascuParser() throws Exception {
        String[] args = {"-input","../../tascu.tsv"};
        App.main(args);
    }
}

