package com.naissant.naissantapp.entity;

import java.util.Date;

/** Entity with the standard creation/update audit columns. */
public interface Auditable {
    void setUser_create(String user);
    void setDate_create(Date date);
    void setUser_update(String user);
    void setDate_update(Date date);
}
