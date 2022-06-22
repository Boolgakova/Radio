package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data

public class Radio {
    private int quantity = 10;
    private int currentRadioStation;
    private int maxStation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
        this.maxStation = this.quantity - 1;
        this.minVolume = 0;
        this.maxVolume = 100;
    }

    public Radio(int quantity) {
        this.quantity = quantity;
        this.maxStation = quantity - 1;
    }

    public int getCurrentRadioStation() {
        return this.currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > maxStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void increaseRadioStation() {
        if (this.currentRadioStation < this.maxStation) {
            ++this.currentRadioStation;
        } else {
            this.currentRadioStation = 0;
        }
    }

    public void reduceRadioStation() {
        if (this.currentRadioStation > 0) {
            --this.currentRadioStation;
        } else {
            this.currentRadioStation = this.maxStation;
        }
    }

    public void increaseVolume() {
        if (this.currentVolume < this.maxVolume) {
            ++this.currentVolume;
        }

        if (this.currentVolume != this.maxVolume) {
            ;
        }
    }

    public void reduceVolume() {
        if (this.currentVolume > this.minVolume) {
            --this.currentVolume;
        }

        if (this.currentVolume != this.minVolume) {
            ;
        }
    }
}