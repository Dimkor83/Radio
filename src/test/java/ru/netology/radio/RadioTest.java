package ru.netology.radio;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @org.junit.jupiter.api.Test
    void TestSetStation1() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(9);
        int expected = 9;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void TestSetStation2() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(0);
        int expected = 0;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void TestSetStation3() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(10);
        int expected = 0;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void TestSetStation4() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(1);
        int expected = 1;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void nextNumberStation1() {
        Radio radio = new Radio();
        radio.nextNumberStation(0);
        int expected = 1;
        int actual = radio.nextNumberStation(0);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void nextNumberStation2() {
        Radio radio = new Radio();
        radio.nextNumberStation(1);
        int expected = 2;
        int actual = radio.nextNumberStation(1);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void nextNumberStation3() {
        Radio radio = new Radio();
        radio.nextNumberStation(8);
        int expected = 9;
        int actual = radio.nextNumberStation(8);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void nextNumberStation4() {
        Radio radio = new Radio();
        radio.nextNumberStation(9);
        int expected = 0;
        int actual = radio.nextNumberStation(9);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void nextNumberStation5() {
        Radio radio = new Radio();
        radio.nextNumberStation(10);
        int expected = 10;
        int actual = radio.nextNumberStation(10);
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void prevNumberStation1() {
        Radio radio = new Radio();
        radio.prevNumberStation(9);
        int expected = 8;
        int actual = radio.prevNumberStation(9);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void prevNumberStation2() {
        Radio radio = new Radio();
        radio.prevNumberStation(8);
        int expected = 7;
        int actual = radio.prevNumberStation(8);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void prevNumberStation3() {
        Radio radio = new Radio();
        radio.prevNumberStation(1);
        int expected = 0;
        int actual = radio.prevNumberStation(1);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void prevNumberStation4() {
        Radio radio = new Radio();
        radio.prevNumberStation(0);
        int expected = 9;
        int actual = radio.prevNumberStation(0);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void prevNumberStation5() {
        Radio radio = new Radio();
        radio.prevNumberStation(-1);
        int expected = -1;
        int actual = radio.prevNumberStation(-1);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.increaseVolume(10);
        int expected = 10;
        int actual = radio.increaseVolume(10);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void increaseVolume2() {
        Radio radio = new Radio();
        radio.increaseVolume(9);
        int expected = 10;
        int actual = radio.increaseVolume(9);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void increaseVolume3() {
        Radio radio = new Radio();
        radio.increaseVolume(0);
        int expected = 1;
        int actual = radio.increaseVolume(0);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void increaseVolume4() {
        Radio radio = new Radio();
        radio.increaseVolume(1);
        int expected = 2;
        int actual = radio.increaseVolume(1);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void decreaseVolume1() {
        Radio radio = new Radio();
        radio.decreaseVolume(1);
        int expected = 0;
        int actual = radio.decreaseVolume(1);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void decreaseVolume2() {
        Radio radio = new Radio();
        radio.decreaseVolume(0);
        int expected = 0;
        int actual = radio.decreaseVolume(0);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void decreaseVolume3() {
        Radio radio = new Radio();
        radio.decreaseVolume(10);
        int expected = 9;
        int actual = radio.decreaseVolume(10);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void decreaseVolume4() {
        Radio radio = new Radio();
        radio.decreaseVolume(9);
        int expected = 8;
        int actual = radio.decreaseVolume(9);
        assertEquals(expected, actual);
    }
}