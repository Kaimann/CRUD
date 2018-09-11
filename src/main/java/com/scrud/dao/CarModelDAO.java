package com.scrud.dao;

import com.scrud.model.CarModel;

import java.util.List;

public interface CarModelDAO {

    void saveOrUpdate(CarModel item);

    void delete(int itemId);

    CarModel get(int itemId);

    List<CarModel> list();

}
