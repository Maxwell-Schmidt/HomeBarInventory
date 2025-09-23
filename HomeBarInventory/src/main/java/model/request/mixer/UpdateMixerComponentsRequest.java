package model.request.mixer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.request.component.ComponentId;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateMixerComponentsRequest {
    private List<ComponentId> components;
}
