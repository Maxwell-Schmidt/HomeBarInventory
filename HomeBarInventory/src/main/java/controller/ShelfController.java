package controller;

import model.entity.Component;
import model.entity.Shelf;
import model.request.shelf.ChangeComponentShelfRequest;
import model.request.shelf.UpsertShelfRequest;
import model.response.ApiResponse;
import model.response.ShelvesListResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/shelf")
@Controller
public class ShelfController {

    // Responds to requests to the API for a given shelf based on id
    @GetMapping("/{shelfId}")
    public ApiResponse<Shelf> getShelfById(@PathVariable Integer shelfId) {
        return ApiResponse.success(new Shelf(),"Shelf found");
    }

    // Responds to requests to the API for to retrieve all shelfs
    @GetMapping()
    public ApiResponse<ShelvesListResponse> getAllShelves() {
        return ApiResponse.success(new ShelvesListResponse(),"Shelves retrieved");
    }

    // Responds to requests to the API to create a shelf
    @PostMapping
    public ApiResponse<Shelf> createShelf(@RequestBody UpsertShelfRequest shelf) {
        return ApiResponse.success(new Shelf(),"Shelf created successfully");
    }

    // Responds to requests to the API to update shelf body
    @PutMapping
    public ApiResponse<Shelf> updateShelf(@RequestBody UpsertShelfRequest updateShelfRequest) {
        return ApiResponse.success(new Shelf(),"Shelf updated successfully");
    }

    // Responds to requests to the API to change the shelf of a component
    @PutMapping("/change/{componentId}")
    public ApiResponse<Component> changeComponentShelf(@RequestBody ChangeComponentShelfRequest changeComponentShelfRequest, @PathVariable Integer componentId) {
        return ApiResponse.success(new Component(),"Shelf of "+componentId+" changed successfully");
    }

    // Responds to requests to the API for to delete a given shelf
    @DeleteMapping("/{shelfId}")
    public ApiResponse<Shelf> deleteShelf(@PathVariable Integer shelfId) {
        return ApiResponse.success();
    }
}
