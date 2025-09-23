package model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.entity.Shelf;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShelvesListResponse {
    List<Shelf> shelves;
}
