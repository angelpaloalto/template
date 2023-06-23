package com.bdm.practica.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class Estatus {

	@ApiOperation(value = "estatus de aplicacion")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "OK. El recurso se obtiene correctamente", response = String.class),
			@ApiResponse(code = 400, message = "Bad Request.", response = String.class),
			@ApiResponse(code = 500, message = "Error inesperado del sistema") })
	@GetMapping("/status")
	public ResponseEntity<Object> status(){
		return ResponseEntity.ok("OK");
	}
	
}
