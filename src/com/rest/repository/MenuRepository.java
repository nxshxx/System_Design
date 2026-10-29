package com.rest.repository;

import com.rest.models.Menu;
import java.util.ArrayList;
import java.util.List;

public class MenuRepository {

    private List<Menu> menus = new ArrayList<>();
    private int nextId = 1;

    public MenuRepository() {
        menus.add(new Menu(nextId++, "Spring Rolls", 120, Menu.Category.starter));
        menus.add(new Menu(nextId++, "Paneer Tikka", 220, Menu.Category.starter));
        menus.add(new Menu(nextId++, "Butter Chicken", 320, Menu.Category.mainCourse));
        menus.add(new Menu(nextId++, "Veg Biryani", 250, Menu.Category.mainCourse));
        menus.add(new Menu(nextId++, "Gulab Jamun", 90, Menu.Category.dessert));
        menus.add(new Menu(nextId++, "Ice Cream", 110, Menu.Category.dessert));
        menus.add(new Menu(nextId++, "Masala Chai", 40, Menu.Category.drink));
        menus.add(new Menu(nextId++, "Fresh Lime Soda", 70, Menu.Category.drink));
    }

    public List<Menu> show() {
        return menus;
    }

    public Menu findById(int id) {
        for (Menu menu : menus) {
            if (menu.getId() == id) {
                return menu;
            }
        }
        return null;
    }

    public Menu add(Menu menu) {
        menu.setId(nextId++);
        menus.add(menu);
        return menu;
    }

    public boolean delete(int id) {
        for (Menu menu : menus) {
            if (menu.getId() == id) {
                menus.remove(menu);
                return true;
            }
        }
        return false;
    }
}