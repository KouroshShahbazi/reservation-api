package com.hotel.entities;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Staff {

    @Id
    public ObjectId _staffId;

    public String staffFistName;
    public String staffLastName;
    public String staffTitle;

    // constructors
    public Staff() {
    }

    public Staff(ObjectId _staffId, String staffFistName, String staffLastName, String staffTitle) {
        super();
        this._staffId = _staffId;
        this.staffFistName = staffFistName;
        this.staffLastName = staffLastName;
        this.staffTitle = staffTitle;
    }

    // ObjectId to string
    public String get_staffId() {
        return _staffId.toHexString();
    }

    public void set_staffId(ObjectId _staffId) { this._staffId = _staffId; }

    public String getStaffFistName() { return staffFistName; }

    public void setStaffFistName(String staffFistName) { this.staffFistName = staffFistName; }

    public String getStaffLastName() { return staffLastName; }

    public void setStaffLastName(String staffLastName) { this.staffLastName = staffLastName; }

    public String getStaffTitle() { return staffTitle; }

    public void setStaffTitle(String staffTitle) { this.staffTitle = staffTitle; }
}
