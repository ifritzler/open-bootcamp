package com.company;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements iCocheCRUD{
    List<Coche> coches = new ArrayList<>();

    @Override
    public void save(Coche coche) {
        this.coches.add(coche);
    }

    @Override
    public List<Coche> findAll() {
        return this.coches;
    }

    @Override
    public void delete(Coche coche) {
        this.coches.remove(coche);
    }
}
