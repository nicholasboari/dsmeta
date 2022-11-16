package com.nicholasboari.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nicholasboari.dsmeta.entities.Sale;
import com.nicholasboari.dsmeta.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

  @Autowired
  private SaleService service;

  @GetMapping
  public ResponseEntity<List<Sale>> salesFind() {
    return ResponseEntity.ok().body(service.findSales());
  }
}
