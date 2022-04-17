package com.example.crypto.controller;

import com.example.crypto.models.Coin;
import com.example.crypto.service.CoinService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CoinController {
    CoinService coinService;

    public CoinController(CoinService coinService) {
        this.coinService = coinService;
    }
    @PostMapping("/coins")
    public void createCoin(@RequestBody Coin coin){
        coinService.createCoin(coin);
    }


    @GetMapping("/coins")
    public List<Coin> getAllCoins() {
       return coinService.getAllCoins();
    }
}
