package com.hotel.controller;

import com.hotel.entities.Staff;
import com.hotel.repositories.StaffRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffRepository staffRepository;

    // getAllStaff
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Staff> getAllStaff() { return staffRepository.findAll();}

    // getStaffById
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Staff getStaffById(@PathVariable("id") ObjectId id) { return staffRepository.findBy_staffId(id); }


    //  modifyStaffById
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void modifyStaffById(@PathVariable("id") ObjectId id, @Valid @RequestBody Staff staff) {
        staff.set_staffId(id);
        staffRepository.save(staff);
    }

    // createStaff
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Staff createStaff(@Valid @RequestBody Staff staff) {
        staff.set_staffId(ObjectId.get());
        staffRepository.save(staff);
        return staff;
    }

    // deleteStaff
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteStaff(@PathVariable ObjectId id) {
        staffRepository.delete(staffRepository.findBy_staffId(id));
    }
}
