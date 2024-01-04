package com.server.services;

import com.server.models.Bond;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BondService {

    public Bond getBonds(String name){
        Bond bond = new Bond();
        bond.setBondName(name);
        return bond;
    }
}
