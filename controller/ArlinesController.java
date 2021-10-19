package com.codewithflex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.codewithflex.model.Customers;
import com.codewithflex.service.CustomerService;
import com.codewithflex.service.FlightsService;

@Controller
public class ArlinesController {
	@Autowired
	private FlightsService flightservice;

	@Autowired
	private CustomerService customerservice;

	/*
	 * Home page to welcome our customers
	 */
	@GetMapping("/")
	public String homePage() {
		return "index";
	}

	/*
	 * Lets show flights That are Available to our clients
	 */
	@GetMapping("/showFlights")
	public String showFlights(Model model) {
		model.addAttribute("listFlights", flightservice.getAllFlights());
		return "flights";
	}

	/*
	 * Lets Book some Customers Some Nice flights and save their data in the
	 * Database. This will come in handy when Creating flight tickets for them
	 */

	@GetMapping("/showBookingsForm")
	public String showBookingsForm(Model model) {
		Customers customer = new Customers();
		model.addAttribute("customer", customer);
		return "flight_booking";
	}

	/*
	 * This will Store The Customers Data in the Database It will then lead to the
	 * page where we can print the customers Ticket that will carry all the details
	 * necessary
	 */
	@PostMapping("/save")
	public String saveCustomer(@ModelAttribute("customer") Customers customer) {
		// save customer to database
		customerservice.saveCustomers(customer);
		return "redirect:/";
	}

	@GetMapping("/showTicket")
	public String showTicket(Model model) {
		model.addAttribute("customer", customerservice.getCustomersDetailsById(2));
		return "viewTicket";
	}

	// Mapping to get the About page
	@GetMapping("/showAboutPage")
	public String showAboutPage() {
		return "About";
	}

	// Mapping to get the About page
	@GetMapping("/showAdminPage")
	public String showAdminPage() {
		return "Admin";
	}

	// Mapping to get the About page
	@GetMapping("/showContactPage")
	public String showContactPage() {
		return "Contact";
	}
	//Mapping to get the Home Page 
	@GetMapping("/showHomePage")
	public String showHomePage() {
		return "index";
	}

	// Mapping to get the About page
	@GetMapping("/showStaffPage")
	public String showStaffPage() {
		return "Staff";
	}
}
