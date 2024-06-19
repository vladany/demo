package com.example.demo.survey;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.Mapping;

@Data
@RequiredArgsConstructor
public class Response {
    private Integer Id;
    private String response;
}
