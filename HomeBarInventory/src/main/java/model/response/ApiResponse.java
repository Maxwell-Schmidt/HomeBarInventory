package model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse<T> implements Serializable {
    private Integer code;
    private String msg;
    private T data;

    // Method to return a success response without data
    public static <T> ApiResponse<T> success() {
        ApiResponse<T> result = new ApiResponse<>();
        result.code = 1;
        return result;
    }

    // Method to return a success response with data
    public static <T> ApiResponse<T> success(T object) {
        ApiResponse<T> result = new ApiResponse<>();
        result.data = object;
        result.code = 1;
        return result;
    }

    // Method to return a success result with data and a message
    public static <T> ApiResponse<T> success(T object, String msg) {
        ApiResponse<T> result = new ApiResponse<>();
        result.data = object;
        result.code = 1;
        result.msg = msg;
        return result;
    }

    // Method to return an error result with a message
    public static <T> ApiResponse<T> error(String msg) {
        ApiResponse<T> result = new ApiResponse<>();
        result.msg = msg;
        result.code = 0;
        return result;
    }

}
