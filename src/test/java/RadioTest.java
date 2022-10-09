import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.next();

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.prev();

        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        int actual = radio.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void stationsCount() {
        int stationsCount;
        Radio radio = new Radio(stationsCount = 10);
        radio.setCurrentRadioStation(9);

        radio.next();

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }
}




