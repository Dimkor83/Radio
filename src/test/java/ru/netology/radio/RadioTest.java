package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class RadioTest {

    @Test
    public void TestStation1() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(9);
        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        assertEquals(expected, actual);
    }
    @Test
    void TestSetStation2() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(0);
        int expected = 0;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    void TestSetStation3() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(10);
        int expected = 0;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    void TestSetStation4() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(1);
        int expected = 1;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    void nextNumberStation1() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(0);
        int expected = 1;
        int actual = radio.nextNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    void nextNumberStation2() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(1);
        int expected = 2;
        int actual = radio.nextNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    void nextNumberStation3() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(8);
        int expected = 9;
        int actual = radio.nextNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    void nextNumberStation4() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(9);
        int expected = 0;
        int actual = radio.nextNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    void prevNumberStation1() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(9);
        int expected = 8;
        int actual = radio.prevNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    void prevNumberStation2() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(8);
        int expected = 7;
        int actual = radio.prevNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    void prevNumberStation3() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(1);
        int expected = 0;
        int actual = radio.prevNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    void prevNumberStation4() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(0);
        int expected = 9;
        int actual = radio.prevNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.increaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        int expected = 10;
        int actual = radio.increaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 1;
        int actual = radio.increaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 2;
        int actual = radio.increaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 0;
        int actual = radio.decreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.decreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 9;
        int actual = radio.decreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        int expected = 8;
        int actual = radio.decreaseVolume();
        assertEquals(expected, actual);
    }


}