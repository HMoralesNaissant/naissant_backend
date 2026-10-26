package com.naissant.naissantapp.entity;

import java.util.Date;

/** Entity with the standard creation/update audit columns. */
public interface Auditable {
    void setUserCreate(String user);
    void setDateCreate(Date date);
    void setUserUpdate(String user);
    void setDateUpdate(Date date);
}
