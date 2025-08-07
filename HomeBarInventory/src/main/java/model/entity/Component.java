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
public class Component {
    private Integer componentId;
    private Integer shelfId;
    private String name;
    private BigDecimal quantity;
    private BigDecimal size;
    private BigDecimal cost;
    private BigDecimal stockLimit;
}
