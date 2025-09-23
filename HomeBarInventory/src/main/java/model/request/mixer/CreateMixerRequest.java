package model.request.mixer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.request.component.ComponentId;

import java.math.BigDecimal;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateMixerRequest {
    private String name;
    private BigDecimal cost;
    private List<ComponentId> components;
}
