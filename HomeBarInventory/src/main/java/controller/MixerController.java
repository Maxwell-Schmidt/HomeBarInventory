package controller;

import model.entity.Mixer;
import model.request.mixer.CreateMixerRequest;
import model.request.mixer.UpdateMixerBodyRequest;
import model.request.mixer.UpdateMixerComponentsRequest;
import model.response.ApiResponse;
import model.response.MixerDataResponse;
import model.response.MixerListResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/mixer")
@Controller
public class MixerController {

    // Responds to requests to the API for a given mixer based on id
    @GetMapping("/{mixerId}")
    public ApiResponse<Mixer> getMixerById(@PathVariable Integer mixerId) {
        return ApiResponse.success(new Mixer(),"Mixer found");
    }

    // Responds to requests to the API for a given mixer based on name
    @GetMapping("/name/{name}")
    public ApiResponse<Mixer> getMixerByName(@PathVariable String name) {
        return ApiResponse.success(new Mixer(),"Mixer found");
    }

    // Responds to requests to the API for to retrieve all mixers
    @GetMapping()
    public ApiResponse<MixerListResponse> getAllMixers() {
        return ApiResponse.success(new MixerListResponse(),"Mixers retrieved");
    }

    // Responds to requests to the API to create a mixer
    @PostMapping
    public ApiResponse<MixerDataResponse> createMixer(@RequestBody CreateMixerRequest mixer) {
        return ApiResponse.success(new MixerDataResponse(),"Mixer created successfully");
    }

    // Responds to requests to the API to update mixer body
    @PutMapping
    public ApiResponse<MixerDataResponse> updateMixerBody(@RequestBody UpdateMixerBodyRequest mixerBodyRequest) {
        return ApiResponse.success(new MixerDataResponse(),"Mixer updated successfully");
    }

    // Responds to requests to the API to update mixer quantity
    @PutMapping
    public ApiResponse<MixerDataResponse> updateMixerComponents(@RequestBody UpdateMixerComponentsRequest mixerComponentsRequest) {
        return ApiResponse.success(new MixerDataResponse(),"Mixer updated successfully");
    }

    // Responds to requests to the API for to delete a given mixer
    @DeleteMapping("/{mixerId}")
    public ApiResponse<Mixer> deleteMixer(@PathVariable Integer mixerId) {
        return ApiResponse.success();
    }
}
