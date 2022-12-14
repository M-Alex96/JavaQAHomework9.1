package ru.netology;

public class Radio {

    public int maxStation = 9;
    public int minStation = 0;

    public int maxVolume = 100;
    public int minVolume = 0;

    public int currentStation = minStation;
    public int currentVolume = minVolume;

    public Radio(int maxStation) {
        this.maxStation = maxStation - 1;
    }

    public Radio() {
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = maxVolume;
        }
        if (newCurrentVolume < minVolume) {
            newCurrentVolume = minVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            newCurrentStation = maxStation;
        }
        if (newCurrentStation > maxStation) {
            newCurrentStation = minStation;
        }
        currentStation = newCurrentStation;
    }

    public void NextStationNumber() {
        if (currentStation <= maxStation) {
            currentStation = currentStation + 1;
        }
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
    }

    public void PrevStationNumber() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }
}


