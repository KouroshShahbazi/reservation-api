package com.hotel.entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Menu {

    @Id
    public ObjectId _menuId;

    public String menuName;
    public String menuDescription;

    // constructors
    public Menu() {
    }

    public Menu(ObjectId _menuId, String menuName, String menuDescription) {
        this._menuId = _menuId;
        this.menuName = menuName;
        this.menuDescription = menuDescription;
    }

    // ObjectId to string
    public String get_menuId() {
        return _menuId.toHexString();
    }

    public void set_menuId(ObjectId _menuId) {
        this._menuId = _menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription;
    }
}
