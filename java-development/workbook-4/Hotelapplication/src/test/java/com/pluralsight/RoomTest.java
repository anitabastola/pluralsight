package com.pluralsight;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {

    @Test
    public void checkIn_shouldBe_occupiedAndDirty (){
        Room anitaRoom = new Room(1, 70);
        anitaRoom.checkIn();
        assertTrue(anitaRoom.isOccupied());
        assertTrue(anitaRoom.isDirty());
    }

    @Test
    public void checkOut_shouldBe_occupiedAndDirty() {
        Room anitaRoom = new Room(1, 70);
        anitaRoom.checkout();
        assertFalse(anitaRoom.isOccupied());
    }

    @Test
    public void cleanRoom_shouldBe_clean () {
        Room anitaRoom = new Room(5, 50);
        anitaRoom.cleanRoom();
        assertTrue(anitaRoom.isOccupied());
        assertTrue(anitaRoom.isDirty());

    }

    }
