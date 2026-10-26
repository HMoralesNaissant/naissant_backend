package com.naissant.naissantapp.service;

import com.naissant.naissantapp.config.CurrentUser;
import com.naissant.naissantapp.entity.Auditable;
import java.util.Date;

/** Stamps the authenticated user and the current date on audited entities before they are saved. */
public final class Audit {

    private Audit() {
    }

    /** Fills the create and update audit fields. */
    public static <T extends Auditable> T created(T entity) {
        Date now = new Date();
        entity.setDateCreate(now);
        entity.setDateUpdate(now);
        CurrentUser.get().ifPresent(u -> {
            entity.setUserCreate(u.username());
            entity.setUserUpdate(u.username());
        });
        return entity;
    }

    /** Fills the update audit fields, leaving the create ones untouched. */
    public static <T extends Auditable> T updated(T entity) {
        entity.setDateUpdate(new Date());
        CurrentUser.get().ifPresent(u -> entity.setUserUpdate(u.username()));
        return entity;
    }
}
