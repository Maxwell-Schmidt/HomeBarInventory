package model.request.component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateComponentRequest {
    private String name;
    private BigDecimal quantity;
    private BigDecimal size;
    private BigDecimal cost;
    private BigDecimal stockLimit;
}
