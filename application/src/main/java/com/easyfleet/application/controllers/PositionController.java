package com.easyfleet.application.controllers;

import com.easyfleet.api.dto.PositionDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/v1/positions")
public class PositionController {

    @GetMapping("/{id}")
    public ResponseEntity<PositionDTO> getOne(@PathVariable Long id) {
        PositionDTO positionDTO = new PositionDTO(1L, new BigDecimal("43.5453634"), new BigDecimal("11.3453634"), "Via XX Settembre");
        return new ResponseEntity<>(positionDTO, HttpStatus.OK);
    }
}
