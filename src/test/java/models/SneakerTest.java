package models;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SneakerTest {

    @Test
    public void setNameTest() {


        // given (1)
        String expected = "OZWEEGO";

        // when (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setName(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getName());
    }
}
