package ru.netology.radio;

public class Radio {
    private int currentNumberStation;
    private int currentVolume;

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

public void setCurrentNumberStation(int newCurrentNumberStation) {
                if (newCurrentNumberStation > 9) {
            return;
        }
    currentNumberStation = newCurrentNumberStation;
}

    public int nextNumberStation(int newCurrentNumberStation) {
        if (currentNumberStation < 9) {
            return currentNumberStation = currentNumberStation + 1;
        }
        return currentNumberStation = 0;
    }

    public int prevNumberStation(int currentNumberStation) {
        if (currentNumberStation > 0) {
            return currentNumberStation = currentNumberStation - 1;
        }
        if (currentNumberStation == 0) {
            return currentNumberStation = 9;
        }
        return currentNumberStation;
    }

    //Блок взаимодействия со звуком:
    public int increaseVolume(int currentVolume) {
        if (currentVolume < 10) {
            return currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int decreaseVolume(int currentVolume) {
        if (currentVolume > 0) {
            return currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }
}
