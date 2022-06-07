package oscharko.de.oscharkobrewery.services;

import org.springframework.stereotype.Service;
import oscharko.de.oscharkobrewery.web.model.BeerDto;

import java.util.UUID;
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerName("Pale Ale")
                .build();
    }
}
