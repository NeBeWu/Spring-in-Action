package sia.tacocloud.data;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import sia.tacocloud.TacoOrder;
import sia.tacocloud.User;

public interface OrderRepository
        extends CrudRepository<TacoOrder, Long> {

    List<TacoOrder> findByUserOrderByPlacedAtDesc(
            User user, Pageable pageable);
}