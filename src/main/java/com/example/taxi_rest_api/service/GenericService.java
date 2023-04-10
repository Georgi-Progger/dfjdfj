package com.example.taxi_rest_api.service;

import java.util.List;

public interface GenericService<T, ID> {
    T getById(ID id);

    List<T> getAll();

    T save(T t);

    void deleteById(ID id);
}
