package com.rest.service;

import com.rest.models.Menu;
import com.rest.repository.MenuRepository;
import java.util.List;

public class MenuServices {

    MenuRepository repository = new MenuRepository();

    public List<Menu> getAll() {
        return repository.show();
    }

    public Menu getById(int id) {
        return repository.findById(id);
    }

    public void addItem(String name, double price, Menu.Category type) {
        Menu menu = new Menu(0, name, price, type);
        repository.add(menu);
    }

    public void updatePrice(int id, double price) {
        Menu menu = getById(id);

        if (menu != null) {
            menu.setPrice(price);
        }
    }

    public void updateName(int id, String name) {
        Menu menu = getById(id);

        if (menu != null) {
            menu.setName(name);
        }
    }

    public void deleteItem(int id) {
        repository.delete(id);
    }
}
