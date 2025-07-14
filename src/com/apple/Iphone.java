package com.apple;

import com.apple.applications.Browser;
import com.apple.applications.MusicPlayer;
import com.apple.applications.PhoneHandset;

import java.math.BigDecimal;

public class Iphone implements PhoneHandset, MusicPlayer, Browser {

    private Integer capacityStorage;
    private BigDecimal price;

    public Iphone() {
    }

    public Iphone(Integer capacityStorage, BigDecimal price) {

        this.capacityStorage = capacityStorage;
        this.price = price;
    }

    public Integer getCapacityStorage() {
        return capacityStorage;
    }

    public void setCapacityStorage(Integer capacityStorage) {
        this.capacityStorage = capacityStorage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String displayPage(String url) {
        return "";
    }

    @Override
    public void addNewTab() {

    }

    @Override
    public void updatePage() {

    }

    @Override
    public void playMusic() {

    }

    @Override
    public void pauseMusic() {

    }

    @Override
    public void selectMusic() {

    }

    @Override
    public void call(String phoneNumber) {

    }

    @Override
    public void acceptCall() {

    }

    @Override
    public void startVoicemail() {

    }
}
