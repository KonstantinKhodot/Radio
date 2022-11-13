import org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    public void moreThanTheMaximumStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void lessThanTheMinimumRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);

        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void setStationMoreThanMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void setStationLessThanMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-5);

        int actual = radio.getCurrentStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void moreThanTheVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void lessThanTheVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);

    }

    @Test
    public void increaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void CurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void lessThanTheMinimumVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
}