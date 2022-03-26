package com.tdea.parcial;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UtilsTests {

    @Test
    public void ShouldReturnNight() {

        int hour = 2;
        String result = Utils.getTimeOfDay(hour);

        assertEquals("Night", result);


    }

    @Test
    public void ShouldNotReturnMorning() {

        int hour = 13;
        String result = Utils.getTimeOfDay(hour);

        assertNotEquals("Morning", result);


    }

    @Test
    public void ShouldReturnAfternoon() {

        int hour = 15;
        String result = Utils.getTimeOfDay(hour);

        assertEquals("Afternoon", result);


    }

    @Test
    public void ShouldNotReturnEvening() {

        int hour = 10;
        String result = Utils.getTimeOfDay(hour);

        assertNotEquals("Evening", result);


    }

    @Test
    public void ShouldReturnFalse() {

        int hour = 25;
        boolean result = Utils.isValidHour(hour);
        assertFalse(result);


    }


}
