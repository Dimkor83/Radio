package ru.netology.radio;

public class Radio {
    private int currentNumberStation;

    public int currentVolume;

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentNumberStation(int CurrentNumberStation) {
        if (CurrentNumberStation > 9) {
            return;
        }
        this.currentNumberStation = CurrentNumberStation;
    }

    public int nextNumberStation(int currentNumberStation) {
        if (currentNumberStation < 9) {
            return this.currentNumberStation = currentNumberStation + 1;
        }
        return this.currentNumberStation = 0;
    }

    public int prevNumberStation(int currentNumberStation) {
        if (currentNumberStation > 0) {
            return this.currentNumberStation = currentNumberStation - 1;
        }
        if (currentNumberStation == 0) {
            return this.currentNumberStation = 9;
        }
        return currentNumberStation;
    }

    //Блок взаимодействия со звуком:
    public int increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > 0) {
            return this.currentVolume = currentVolume - 1;
        }
        return this.currentVolume;
    }

    public void setCurrentVolume() {
        if (currentVolume < 0) {
            return;
        }

        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;

    }
}
