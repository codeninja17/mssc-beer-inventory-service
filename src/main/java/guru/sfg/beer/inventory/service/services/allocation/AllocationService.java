package guru.sfg.beer.inventory.service.services.allocation;

import guru.sfg.brewery.model.BeerOrderDto;

public interface AllocationService {

    Boolean allocateOrder(BeerOrderDto beerOrderDto);

}
