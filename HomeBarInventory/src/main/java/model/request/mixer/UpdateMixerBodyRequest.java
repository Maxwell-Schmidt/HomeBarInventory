package model.request.mixer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateMixerBodyRequest {
    private String name;
    private BigDecimal cost;
}
