package sia.tacocloud.data;

import java.util.Optional;

import sia.tacocloud.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder order);

    Optional<TacoOrder> findById(Long id);

}