package com.one.digitalinnovation.experts.shoppingcart.shoppingcart.repository;


import com.one.digitalinnovation.experts.shoppingcart.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {

}
