package com.todeb.rnaylmz.createyourbestwedding.model.enums;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {

    Customer,
    MakeupArtist,
    Photographer,
    Organizer,
    PastrySeller,
    WeddingDressSeller,
    Florist;

    @Override
    public String getAuthority() {
        return name();
    }
}
