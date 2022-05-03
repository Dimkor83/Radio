package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class RadioTest {


    @Test
    public void testSetStation1() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(9);
        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetStation11() {
        Radio radio = new Radio(50);
        radio.setCurrentNumberStation(49);
        int expected = 49;
        int actual = radio.getCurrentNumberStation();

        assertEquals(expected, actual);
    }

    @Test
    void testSetStation2() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(0);
        int expected = 0;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    void testSetStation22() {
        Radio radio = new Radio(50);
        radio.setCurrentNumberStation(0);
        int expected = 0;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    void testSetStation3() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(10);
        int expected = 0;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }


    @Test
    void testSetStation33() {
        Radio radio = new Radio(50);
        radio.setCurrentNumberStation(50);
        int expected = 0;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    void testSetStation4() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(1);
        int expected = 1;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    void testSetStation44() {
        Radio radio = new Radio(50);
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
    void nextNumberStation11() {
        Radio radio = new Radio(50);
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
    void nextNumberStation22() {
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
    void nextNumberStation33() {
        Radio radio = new Radio(50);
        radio.setCurrentNumberStation(48);
        int expected = 49;
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
    void nextNumberStation44() {
        Radio radio = new Radio(50);
        radio.setCurrentNumberStation(49);
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
    void prevNumberStation11() {
        Radio radio = new Radio(50);
        radio.setCurrentNumberStation(49);
        int expected = 48;
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
    void prevNumberStation22() {
        Radio radio = new Radio(50);
        radio.setCurrentNumberStation(48);
        int expected = 47;
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
    void prevNumberStation44() {
        Radio radio = new Radio(50);
        radio.setCurrentNumberStation(0);
        int expected = 49;
        int actual = radio.prevNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.increaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int expected = 100;
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
        radio.setCurrentVolume(49);
        int expected = 50;
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
        radio.setCurrentVolume(100);
        int expected = 99;
        int actual = radio.decreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int expected = 98;
        int actual = radio.decreaseVolume();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }


}