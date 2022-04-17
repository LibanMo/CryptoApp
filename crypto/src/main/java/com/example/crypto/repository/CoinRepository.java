package com.example.crypto.repository;
import com.example.crypto.models.Coin;
import org.springframework.data.repository.CrudRepository;

public interface CoinRepository extends CrudRepository<Coin, Integer> {
}
