package com.airlines_app002.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.airlines_app002.entity.Billing;
import com.airlines_app002.entity.Passenger;
import com.airlines_app002.services.BillingService;
import com.airlines_app002.services.PassengerService;
@Controller
public class PassengerController {
	@Autowired
	public PassengerService passServ;
	@Autowired
	public BillingService billServ;
	//Passenger Controller
	@RequestMapping("/newpass")
	public String newpass() {
		return "newpassreg";
	}
	@RequestMapping("/savedata")
	public String savePass(Passenger pass) {
		passServ.savePassInfo(pass);
		return "newpassreg";
	}
	@RequestMapping("/listall")
	public String listall(Passenger pass, Model model) {
		List<Passenger> passengers = passServ.listallData(pass);
		model.addAttribute("passengers", passengers);
		return "listallJSP";
	}
	@RequestMapping("/update")
	public String updatePass(@RequestParam("id") long id, Model model) {
		Passenger passenger = passServ.updateOnePass(id);
		model.addAttribute("passenger", passenger);
		return "update_pass";
	}
	@RequestMapping("/updatepass")
	public String updatepass(Passenger pass, Model model) {
		passServ.updateOneData(pass);
		List<Passenger> passengers = passServ.listallData(pass);
		model.addAttribute("passengers", passengers);
		return "listallJSP";
	}
	@RequestMapping("/deletepass")
	public String deletepass(@RequestParam("id") long id,Passenger pass, Model model) {
		passServ.deleteOnePass(id);
		List<Passenger> passengers = passServ.listallData(pass);
		model.addAttribute("passengers", passengers);
		return "listallJSP";		
	}
	
	//Billing Controller
	@RequestMapping("/newpassregBill")
	public String newpasregBill() {
		return "newpassregBill";
	}
	@RequestMapping("/saveBillData")
	public String saveBillPass(Billing bill) {
		billServ.saveBillPassInfo(bill);
		return "newpassregBill";
	}
	@RequestMapping("/listBill")
	public String listBill(Billing bill, Model model) {
		List <Billing> findBills = billServ.listBill(bill);
		model.addAttribute("findBills", findBills);
		return "listBillJSP";
	}
	@RequestMapping("/updateBill")
	public String updateBill(@RequestParam("id") long id, Model model) {
		Billing bill = billServ.updateOnePass(id);
		model.addAttribute("bill", bill);
		return "update_BillPass";
	}
	@RequestMapping("/updateBillpass")
	public String updateBillpass(Billing bill, Model model) {
		billServ.updateOneData(bill);
		List <Billing> findBills = billServ.listBill(bill);
		model.addAttribute("findBills", findBills);
		return "listBillJSP";
	}
	@RequestMapping("/deleteBill")
	public String deleteBill(@RequestParam("id") long id, Billing bill, Model model) {
		billServ.deleteOneBill(id);
		List <Billing> findBills = billServ.listBill(bill);
		model.addAttribute("findBills", findBills);
		return "listBillJSP";
	}
	@RequestMapping("/genBill")
	public String genBill(@RequestParam("id") long id, Model model) {
		Billing bill = billServ.genBill(id);
		model.addAttribute("bill", bill);
		return "gen_Bill";
	}
}