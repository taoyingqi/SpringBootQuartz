package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class SimpropTriggers {
    private String schedName;
    private String triggerName;
    private String triggerGroup;
    private String strProp1;
    private String strProp2;
    private String strProp3;
    private Integer intProp1;
    private Integer intProp2;
    private Long longProp1;
    private Long longProp2;
    private BigDecimal decProp1;
    private BigDecimal decProp2;
    private Boolean boolProp1;
    private Boolean boolProp2;

}
