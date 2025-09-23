package model.response;

import model.request.component.ComponentId;

import java.math.BigDecimal;
import java.util.List;

public class MixerDataResponse {
    private Integer mixerId;
    private String name;
    private BigDecimal cost;
    private List<ComponentId> components;
}
