package com.dialynas.brewery.web.services;

import com.dialynas.brewery.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {

    BeerDTO getBeerById(UUID beerId);
}
