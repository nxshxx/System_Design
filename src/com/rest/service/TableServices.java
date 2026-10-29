package com.rest.service;

import com.rest.models.Table;
import com.rest.repository.TableRepository;
import java.util.List;

public class TableServices {

    TableRepository repository = new TableRepository();

    public List<Table> getAll() {
        return repository.getAll();
    }
}
