package datamanager;

import models.Car;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ObjectOutputStream;
//import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;


class DataManagerTest {
    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void serialize() {
        Car car = new Car(100,"Lada", "ABC");

    }

    @Test
    void serialize1() {

    }

    @Test
    void deserialize1() {

    }

    @Test
    void deserialize2() {

    }

}