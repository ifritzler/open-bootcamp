package com.company;

import java.util.List;

public interface iCocheCRUD {
    public void save(Coche coche);
    public List<Coche> findAll();
    public void delete(Coche coche);
}
