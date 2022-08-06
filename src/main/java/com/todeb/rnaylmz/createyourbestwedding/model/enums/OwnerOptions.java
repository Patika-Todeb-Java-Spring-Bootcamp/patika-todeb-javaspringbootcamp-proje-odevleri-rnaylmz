package com.todeb.rnaylmz.createyourbestwedding.model.enums;

import lombok.Getter;

@Getter
public enum OwnerOptions {
    MakeupArtist("Make-up Artist "),
    Photographer("Photographer"),
    Organizer("Organizer "),
    PastryMaker("Pastry Maker "),
    WeddingDressSeller("Wedding Dresses Seller "),
    Florist("Florist");

    private String text;
    OwnerOptions(String text) {
        this.text = text;
    }
}
