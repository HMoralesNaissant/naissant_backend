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
        entity.setDate_create(now);
        entity.setDate_update(now);
        CurrentUser.get().ifPresent(u -> {
            entity.setUser_create(u.username());
            entity.setUser_update(u.username());
        });
        return entity;
    }

    /** Fills the update audit fields, leaving the create ones untouched. */
    public static <T extends Auditable> T updated(T entity) {
        entity.setDate_update(new Date());
        CurrentUser.get().ifPresent(u -> entity.setUser_update(u.username()));
        return entity;
    }
}
