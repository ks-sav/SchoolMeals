package ru.sfedu.SchoolMeals.model.api.WrapperXML;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import ru.sfedu.SchoolMeals.model.bean.Staff;

import java.util.List;

@Root
public class StaffList {
    @ElementList
    public List<Staff> staff;

    public StaffList(List<Staff> staff) {
        this.staff = staff;
    }

    public StaffList() {
    }
}
