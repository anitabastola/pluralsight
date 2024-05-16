package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void brake_NormalSpeedChange_SpeedDecreased() {
        // arrange
        Car raysCar = new Car("Ford", "F150 Raptor");
        int speedChange = 15;
        int exceptedSpeed = 15;

        // act
        raysCar.accelerate(speedChange);

        // assert
        int actualSpeed = raysCar.getSpeed();
        assertEquals(exceptedSpeed, actualSpeed);
    }
@Test
    public void brake_NormalSpeedChange_SpeedDecreased() {
    //arrange

    Car raysCar = new Car("Ford", "F150 Raptor");
    int speedUpBy = 15;
    int slowDownBy = 10;
    int expectedSpeed = 5;
    raysCar.accelerate(speedUpBy);

    // act
    raysCar.brake(slowDownBy);

    // assert
    int actualSpeed = raysCar.getSpeed();
    assertEquals(expectedSpeed, actualSpeed);

    }

}
