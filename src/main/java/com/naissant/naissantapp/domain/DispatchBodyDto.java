package com.naissant.naissantapp.domain;

import com.naissant.naissantapp.Entity.DispatchsLabels;

public class DispatchBodyDto {

    private DispatchsLabels dispatchsLabels;

    public DispatchBodyDto(DispatchsLabels dispatchsLabels) {
        this.dispatchsLabels = dispatchsLabels;
    }

    public DispatchsLabels getDispatchsLabels() {
        return dispatchsLabels;
    }

    public void setDispatchsLabels(DispatchsLabels dispatchsLabels) {
        this.dispatchsLabels = dispatchsLabels;
    }
}
