# API Calls between Frontend and Backend of Bar Inventory

### 1.1. Component Management
- **Get Component by ID**
    - Method: `GET /component/{componentId}`
    - Response:
      ```json
      {
        "code": 1,
        "msg": "Component found",
        "data": {
            "componentId": "int",
            "shelfId": "int",
            "name": "string",
            "quantity": "float",
            "size": "float",
            "cost": "float",
            "stockLimit": "float"
        }
      }
      ```
        - HTTP Status: 200 OK if component found, 404 Not Found if the component does not exist.

- **Get Component by Name**
    - Method: `GET /component/name/{name}`
    - Response:
      ```json
      {
        "code": 1,
        "msg": "Component found",
        "data": {
            "componentId": "int",
            "shelfId": "int",
            "name": "string",
            "quantity": "float",
            "size": "float",
            "cost": "float",
            "stockLimit": "float"
        }
      }
      ```
        - HTTP Status: 200 OK if component found, 404 Not Found if the component does not exist.

- **Get Components by Shelf**
    - Method: `GET /component/shelf/{shelfId}`
    - Response:
      ```json
      {
        "code": 1,
        "msg": "Components retrieved",
        "data": {
            "components": [
              {
                "componentId": "int",
                "shelfId": "int",
                "name": "string",
                "quantity": "float",
                "size": "float",
                "cost": "float",
                "stockLimit": "float"
              }
            ]
        }
      }
      ```
        - HTTP Status: 200 OK if components found, 404 Not Found if no components exist


- **Get All Components**
    - Method: `GET /component`
    - Response:
      ```json
      {
        "code": 1,
        "msg": "Components retrieved",
        "data": {
            "components": [
              {
                "componentId": "int",
                "shelfId": "int",
                "name": "string",
                "quantity": "float",
                "size": "float",
                "cost": "float",
                "stockLimit": "float"
              }
            ]
        }
      }
      ```
        - HTTP Status: 200 OK if components found, 404 Not Found if no components exist

- **Create a New Component**
    - Method: `POST /component`
    - Request Body:
      ```json
      {
        "name": "string",
        "quantity": "float",
        "size": "float",
        "cost": "float",
        "stockLimit": "float"
      }
      ```
    - Response:
      ```json
      {
        "code": 1,
        "msg": "Component created successfully",
        "data": {
          "componentID": "int",
          "shelfId": "int",
          "name": "string",
          "quantity": "float",
          "size": "float",
          "cost": "float",
          "stockLimit": "float"
        }
      }
      ```
        - HTTP Status: 201 Created on success, 400 Bad Request on creation failure.

- **Update Component Properties**
    - Method: `PUT /component/{componentId}`
    - Request Body:
      ```json
      {
        "name": "string",
        "size": "float",
        "cost": "float",
        "stock_limit": "float"
      }
      ```
    - Response:
      ```json
      {
        "code": 1,
        "msg": "Component updated successfully",
        "data": {
          "componentId": "int",
          "name": "string",
          "quantity": "float",
          "size": "float",
          "cost": "float",
          "stockLimit": "float"
        }
      }
      ```
        - HTTP Status: 200 OK on success, 404 Not Found if component does not exist.

- **Update Component Quantity**
    - Method: `PUT /component/quantity/{componentId}`
    - Request Body:
      ```json
      {
        "quantity": "float"
      }
      ```
    - Response:
      ```json
      {
        "code": 1,
        "msg": "Component updated successfully",
        "data": {
          "componentId": "int",
          "name": "string",
          "quantity": "float",
          "size": "float",
          "cost": "float",
          "stockLimit": "float"
        }
      }
      ```
        - HTTP Status: 200 OK on success, 404 Not Found if component does not exist.

- **Delete Component**
    - Method: `DELETE /component/{componentId}`
    - Response: HTTP Status 204 No Content on successful deletion, 400 Bad Request if Component still exists


### 1.2. Mixer Management
- **Get Mixer by ID**
    - Method: `GET /mixer/{mixerId}`
    - Response:
      ```json
      {
        "code": 1,
        "msg": "Mixer found",
        "data": {
            "mixerId": "int",
            "name": "string",
            "cost": "float"
        }
      }
      ```
        - HTTP Status: 200 OK if mixer found, 404 Not Found if the mixer does not exist.

- **Get All Mixers**
    - Method: `GET /mixer`
    - Response:
      ```json
      {
        "code": 1,
        "msg": "Mixers retrieved",
        "data": {
            "items": [
              {
                "mixerId": "int",
                "name": "string",
                "cost": "float"
              }
            ]
        }
      }
      ```
        - HTTP Status: 200 OK if mixers found, 404 Not Found if no mixers exist.

- **Create a New Mixer**
    - Method: `POST /mixer`
    - Request Body:
      ```json
      {
        "name": "string",
        "cost": "float",
        "components": [
          {
            "componentId": "int"
          }
        ]
      }
      ```
    - Response:
      ```json
      {
        "code": 1,
        "msg": "Mixer created successfully",
        "data": {
          "mixerId": "int",
          "name": "string",
          "cost": "float",
          "components": [
            {
              "componentId": "int"
            }   
          ]
        }
      }
      ```
        - HTTP Status: 201 Created on success, 400 Bad Request on creation failure.

- **Update Mixer Body**
    - Method: `PUT /mixer/{mixerId}`
    - Request Body:
      ```json
      {
        "name": "string",
        "cost": "float"
      }
      ```
    - Response:
      ```json
      {
        "code": 1,
        "msg": "Mixer updated successfully",
        "data": {
            "mixerId": "int",
            "name": "string",
            "cost": "string",
            "components": [
              {
                "componentId": "int"
              }
            ]
        }
      }
      ```
        - HTTP Status: 200 OK on success, 404 Not Found if mixer does not exist.

- **Update Mixer Components**
    - Method: `PUT /mixer/components/{mixerId}`
    - Request Body:
      ```json
      {
        "components": [
          {
            "componentID": "int"
          }   
        ]
      }
      ```
    - Response:
      ```json
      {
        "code": 1,
        "msg": "Mixer updated successfully",
        "data": {
            "mixerId": "int",
            "name": "string",
            "cost": "string",
            "components": [
              {
                "componentId": "int"
              }
            ]
        }
      }
      ```
        - HTTP Status: 200 OK on success, 404 Not Found if mixer does not exist.


- **Delete Mixer**
    - Method: `DELETE /mixer/{mixerId}`
    - Response: HTTP Status 204 No Content on successful deletion.

### 1.3 Shelf Management
- **Get Shelf By ID**
    - Method: `GET /shelf/{shelfId}`
    - Response:
      ```json
      {
        "code": 1,
        "msg": "Shelf found",
        "data": {
            "shelfId": "int",
            "name": "string"
        }
      }
      ```
        - HTTP Status: 200 OK if shelf found, 404 Not Found if the shelf does not exist.


- **Get All Shelves**
    - Method: `GET /shelf`
    - Response:
      ```json
      {
        "code": 1,
        "msg": "Shelves retrieved",
        "data": {
            "shelves": [
              {
                "shelfId": "int",
                "name": "string"
              }
            ]
        }
      }
      ```
        - HTTP Status: 200 OK if labels found, 404 Not Found if no labels exist.

- **Create a New Shelf**
    - Method: `POST /shelf`
    - Request Body:
      ```json
      {
        "name": "string"
      }
      ```
    - Response:
      ```json
      {
        "code": 1,
        "msg": "Shelf created successfully",
        "data": {
            "shelfId": "int",
            "name": "string"
        }
      }
      ```
        - HTTP Status: 201 Created on success, 400 Bad Request on creation failure.

- **Update Shelf**
    - Method: `PUT /shelf/{shelfID}`
    - Request Body:
      ```json
      {
       "name": "string"
      }
      ```
    - Response:
      ```json
      {
        "code": 1,
        "msg": "Shelf updated successfully",
        "data": {
            "shelfId": "int",
            "name": "string"
        }
      }
      ```
        - HTTP Status: 200 OK on success, 404 Not Found if shelf does not exist.

- **Change Shelf of Component**
    - Method: `PUT /shelf/change/{componentId}`
    - Request Body:
      ```json
      {
        "shelfId": "int"
      }
      ```
    - Response:
      ```json
      {
        "code": 1,
        "msg": "Shelf of {componentId} changed successfully",
        "data": {
           "componentId": "int",
           "shelfId": "int",
           "name": "string",
           "quantity": "float",
           "size": "float",
           "cost": "float",
           "stockLimit": "float"
         }
      }
      ```
        - HTTP Status: 200 OK on success, 404 Not Found if component does not exist.

- **Delete Shelf**
    - Method: `DELETE /shelf/{shelfId}`
    - Request Header:
      ```
      Authorization: Bearer <JWT token>
      ```
    - Response: HTTP Status 204 No Content on successful deletion.


## 2. Data Exchange Format
- All data between frontend and backend should be exchanged in **JSON** format.

---

## 3. Error Handling
- **Frontend**: Handle errors returned by the API (e.g., `400 Bad Request`, `401 Unauthorized`, `404 Not Found`, `500 Internal Server Error`). Display appropriate error messages to users based on the `msg` field in the response.
- **Backend**: Return errors in the following structure:
    ```json
    {
      "code": 0,
      "msg": "string",
      "data": null
    }
    ```

- HTTP Status Codes:
    - **200 OK**: Successful requests
    - **201 Created**: Successful resource creation
    - **400 Bad Request**: Validation or input errors
    - **404 Not Found**: Requested resource not found
    - **500 Internal Server Error**: Unexpected server errors

---

## 4. Documentation and Testing
- **Backend Documentation**: API documentation will be provided using **Postman** collection.
- **Error Logging**: Frontend will log errors in the browser console, and the backend will use a logging framework (e.g., Logback) for server-side logs.

---
