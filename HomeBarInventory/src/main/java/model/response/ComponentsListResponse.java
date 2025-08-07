package model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.entity.Component;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComponentsListResponse {
    List<Component> components;
}
