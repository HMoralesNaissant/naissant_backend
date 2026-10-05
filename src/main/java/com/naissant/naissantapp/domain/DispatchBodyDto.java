package com.naissant.naissantapp.domain;

import lombok.Getter;
import lombok.Setter;
import com.naissant.naissantapp.entity.DispatchsLabels;

@Getter
@Setter
public class DispatchBodyDto {

    private DispatchsLabels dispatchsLabels;

    public DispatchBodyDto(DispatchsLabels dispatchsLabels) {
        this.dispatchsLabels = dispatchsLabels;
    }
}
