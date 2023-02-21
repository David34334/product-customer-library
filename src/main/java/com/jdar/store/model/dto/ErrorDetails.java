package com.jdar.store.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorDetails {

    @JsonProperty("exception_type")
    private String exceptionType;

    @JsonProperty("timestamp")
    private LocalDateTime timestamp;

    @JsonProperty("http_status")
    private int httpStatus;

    @JsonProperty("description")
    private String description;

}
