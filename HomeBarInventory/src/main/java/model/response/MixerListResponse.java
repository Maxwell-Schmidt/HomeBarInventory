package model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.entity.Mixer;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MixerListResponse {
    List<Mixer> items;
}
