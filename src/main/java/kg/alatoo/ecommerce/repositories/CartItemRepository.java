package kg.alatoo.ecommerce.repositories;

import kg.alatoo.ecommerce.entities.Cart;
import kg.alatoo.ecommerce.entities.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    Optional<CartItem> findByTitle(String title);

    Optional<CartItem> findBySku(String sku);

    Optional<CartItem> findBySkuAndCart(String sku, Cart cart);
}
