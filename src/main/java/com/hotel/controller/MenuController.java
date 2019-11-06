package com.hotel.controller;

import com.hotel.entities.Menu;
import com.hotel.repositories.MenuRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuRepository menuRepository;

    // getAllMenu
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Menu> getAllMenu() { return menuRepository.findAll();}

    // getMenuById
     @RequestMapping(value = "/{id}", method = RequestMethod.GET)
     public Menu getMenuById(@PathVariable("id") ObjectId id) { return menuRepository.findBy_menuId(id); }


    //  modifyMenuById
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyMenuById(@PathVariable("id") ObjectId id, @Valid @RequestBody Menu menuItem) {
        menuItem.set_menuId(id);
        menuRepository.save(menuItem);
    }

    // createMenuItem
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Menu createMenuItem(@Valid @RequestBody Menu menuItem) {
        menuItem.set_menuId(ObjectId.get());
        menuRepository.save(menuItem);
        return menuItem;
    }

    // deleteMenuItem
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteMenuItem(@PathVariable ObjectId id) {
        menuRepository.delete(menuRepository.findBy_menuId(id));
    }

}
