package model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MixerComponent {
    private Integer mixerComponentId;
    private Integer mixerId;
    private Integer componentId;
    private BigDecimal componentAmount;
}
