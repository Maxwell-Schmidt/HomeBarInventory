package controller;

import model.entity.Component;
import model.request.component.CreateComponentRequest;
import model.request.component.UpdateComponentPropertyRequest;
import model.request.component.UpdateComponentQuantityRequest;
import model.response.ApiResponse;
import model.response.ComponentsListResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/component")
@Controller
public class ComponentController {

    // Responds to requests to the API for a given component based on id
    @GetMapping("/{componentId}")
    public ApiResponse<Component> getComponentById(@PathVariable Integer componentId) {
        return ApiResponse.success(new Component(),"Component found");
    }

    // Responds to requests to the API for a given component based on name
    @GetMapping("/name/{name}")
    public ApiResponse<Component> getComponentByName(@PathVariable String name) {
        return ApiResponse.success(new Component(),"Component found");
    }

    // Responds to requests to the API for a list of components based on their shelf
    @GetMapping("/shelf/{shelfId}")
    public ApiResponse<ComponentsListResponse> getComponentsByShelf(@PathVariable Integer shelfId) {
        return ApiResponse.success(new ComponentsListResponse(),"Components retrieved");
    }

    // Responds to requests to the API for to retrieve all components
    @GetMapping()
    public ApiResponse<ComponentsListResponse> getAllComponents() {
        return ApiResponse.success(new ComponentsListResponse(),"Components retrieved");
    }

    // Responds to requests to the API to create a component
    @PostMapping
    public ApiResponse<Component> createComponent(@RequestBody CreateComponentRequest component) {
        return ApiResponse.success(new Component(),"Component created successfully");
    }

    // Responds to requests to the API to update component properties
    @PutMapping
    public ApiResponse<Component> updateComponentProperty(@RequestBody UpdateComponentPropertyRequest componentPropertyRequest) {
        return ApiResponse.success(new Component(),"Component updated successfully");
    }

    // Responds to requests to the API to update component quantity
    @PutMapping
    public ApiResponse<Component> updateComponentQuantity(@RequestBody UpdateComponentQuantityRequest componentQuantityRequest) {
        return ApiResponse.success(new Component(),"Component updated successfully");
    }

    // Responds to requests to the API for to delete a given component
    @DeleteMapping("/{componentId}")
    public ApiResponse<ComponentsListResponse> deleteComponent(@PathVariable Integer componentId) {
        return ApiResponse.success();
    }
}
