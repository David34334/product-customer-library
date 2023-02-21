package com.jdar.store.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DataResponse<T> {

    @JsonProperty("data")
    private T data;

    @JsonProperty("error_details")
    private ErrorDetails errorDetails;

}
