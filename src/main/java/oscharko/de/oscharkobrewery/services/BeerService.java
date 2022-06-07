package oscharko.de.oscharkobrewery.services;

import oscharko.de.oscharkobrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
