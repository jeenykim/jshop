package jeeny.book.repository;

import jeeny.book.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository  extends JpaRepository<Cart, Long> {

    //332장바구니
    Cart findByMemberId(Long memberId);

}
