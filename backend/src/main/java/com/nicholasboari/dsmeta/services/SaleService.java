package com.nicholasboari.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nicholasboari.dsmeta.entities.Sale;
import com.nicholasboari.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {

  @Autowired
  private SaleRepository repository;

  public List<Sale> findSales() {
    return repository.findAll();
  }
}
