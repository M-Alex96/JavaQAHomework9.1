package ru.netology;

public class Radio {

    public int currentVolume;

    public int currentStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            newCurrentVolume = 10;
        }
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            newCurrentStation = 9;
        }
        if (newCurrentStation > 9) {
            newCurrentStation = 0;
        }
        currentStation = newCurrentStation;
    }

    public void NextStationNumber() {
        if (currentStation <= 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation > 9) {
            currentStation = 0;
        }
    }

    public void PrevStationNumber() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }
}


