package com.example.crypto.DAO;

import com.example.crypto.models.Coin;
import com.example.crypto.repository.CoinRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CoinDAO {
    CoinRepository coinRepository;

    public CoinDAO(CoinRepository coinRepository) {
        this.coinRepository = coinRepository;
    }

    public List<Coin> getAll() {
     return (List<Coin>) coinRepository.findAll();
    }

    public void saveCoin(Coin coin) {
        coinRepository.save(coin);
    }
}
