package com.klef.jfsd.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	private List<Customer> customers = new ArrayList<>();

    @RequestMapping("/demo1")
    public int demo1() {
        return 10;
    }

    @RequestMapping("/demo2")
    public double demo2() {
        return 25.5;
    }

    @GetMapping("/demo3")
    public String demo3() {
        return "<html><body><h1>Welcome to Demo3</h1></body></html>";
    }

    @GetMapping("/demo4")
    public String demo4() {
        String institution = "KLEF";
        return "I Study at " + institution;
    }

    @GetMapping("/demo5/{id}")
    public String demo5(@PathVariable int id) {
        return "Path Variable ID: " + id;
    }

    @GetMapping("/demo6/{a}/{b}")
    public String demo6(@PathVariable int a, @PathVariable int b) {
        return "Sum: " + (a + b);
    }

    @GetMapping("/demo7")
    public String demo7(@RequestParam("id") String id) {
        return "Request Parameter ID: " + id;
    }

    @GetMapping("/demo8/{name}")
    public String demo8(@PathVariable String name) {
        return "Name: " + name;
    }

    @PostMapping("/addcustomer")
    public String addCustomer(@RequestBody Customer customer) {
        customers.add(customer);
        return "Customer Added Successfully";
    }

    @GetMapping("/viewcustomer")
    public List<Customer> viewCustomers() {
        return customers;
    }

}
