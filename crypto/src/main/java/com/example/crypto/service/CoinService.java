package com.example.crypto.service;

import com.example.crypto.DAO.CoinDAO;
import com.example.crypto.models.Coin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoinService {
    CoinDAO coinDAO;

    public CoinService(CoinDAO coinDAO) {
        this.coinDAO = coinDAO;
    }

    public List<Coin> getAllCoins() {
        return coinDAO.getAll();
    }

    public void createCoin(Coin coin) {
        coinDAO.saveCoin(coin);
    }
}
