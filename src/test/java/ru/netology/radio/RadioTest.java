package ru.netology.radio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test

    public void shouldSetRadioStationMin() {
        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test

    public void shouldSetRadioStationAboveMin() {
        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetRadioStationBelowMin() {
        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test

    public void shouldSetRadioStationMax() {
        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test

    public void shouldSetRadioStationBelowMax() {
        radio.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetRadioStationAboveMax() {
        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test

    public void shouldIncreaseRadioStation() {
        radio.setCurrentRadioStation(8);
        radio.increaseRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test

    public void shouldIncreaseRadioStationFromMaxToMin() {
        radio.setCurrentRadioStation(9);
        radio.increaseRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test

    public void shouldReduceRadioStation() {
        radio.setCurrentRadioStation(8);
        radio.reduceRadioStation();

        int expected = 7;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test

    public void shouldReduceRadioStationFromMinToMax() {
        radio.setCurrentRadioStation(0);
        radio.reduceRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test

    public void shouldIncreaseVolume() {
        radio.setCurrentVolume(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test

    public void shouldIncreaseToMaxVolume() {
        radio.setCurrentVolume(99);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test

    public void shouldNotIncreaseMaxVolume() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test

    public void shouldReduceVolume() {
        radio.setCurrentVolume(10);
        radio.reduceVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test

    public void shouldReduceVolumeToMin() {
        radio.setCurrentVolume(1);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test

    public void shouldNotReduceMinVolume() {
        radio.setCurrentVolume(0);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetCurrentVolumeBelowMin() {
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetCurrentVolumeAboveMax() {
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test

    public void shouldIncreaseToMaxQuantity() {
        Radio radio = new Radio(34);
        radio.setCurrentRadioStation(32);
        radio.increaseRadioStation();

        int expected = 33;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test

    public void shouldChangeFromMinToMaxQuantity() {
        Radio radio = new Radio(25);
        radio.setCurrentRadioStation(0);
        radio.reduceRadioStation();

        int expected = 24;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test

    public void shouldChangeFromMaxToMinQuantity() {
        Radio radio = new Radio(15);
        radio.setCurrentRadioStation(14);
        radio.increaseRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetAboveMaxQuantity() {
        Radio radio = new Radio(30);
        radio.setCurrentRadioStation(31);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        assertEquals(expected, actual);
    }
}
