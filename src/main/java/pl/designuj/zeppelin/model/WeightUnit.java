package pl.designuj.zeppelin.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum WeightUnit {
    LB("lb"),
    KG("kg");

    private final String code;
}
