package com.HotelExample.RoomWebApp.Controllers;

import java.util.ArrayList;
import java.util.List;

import com.HotelExample.RoomWebApp.models.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private static final List<Employee> employees = new ArrayList<>();
    static {
        for(int i = 0; i < 10; i++){
            employees.add(new Employee(i, "john ", "smith", "front desk"));
        }
    }

    @GetMapping
    public String getAllEmployees(Model model){
        model.addAttribute("employees", employees);
        return "employees";
    }
}