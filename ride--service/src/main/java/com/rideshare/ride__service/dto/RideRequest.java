package com.rideshare.ride__service.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideRequest {

    @NotBlank(message = "Rider Id is required")
    private String riderId;

    @NotBlank(message = "pickup Latitude is required")
    private double pickupLatitude;

    @NotBlank(message = "pickup Longitude is required")
    private double pickupLongitdue;

    @NotBlank(message = "pickup address is required")
    private String pickupAddress;

    @NotBlank(message = "drop Latitude is required")
    private double dropLatitude;

    @NotBlank(message = "drop Longitude is required")
    private double dropLongitude;

    @NotBlank(message = "drop address is required")
    private String dropAddress;

}
