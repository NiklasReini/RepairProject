package com.example.RepairProject.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.RepairProject.domain.Repair;
import com.example.RepairProject.domain.RepairRepository;

//this is my controller class, here i choose which endpoints lead to which html files.

@Controller
public class RepairController {
	@Autowired
	private RepairRepository repository;
	
	
	
	@RequestMapping("/repairList")
	public String repairList(Model model) {
		model.addAttribute("repairs", repository.findAll());
		return "repairList";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteRepair(@PathVariable("id") Long repairId, Model model) {
		repository.deleteById(repairId);
	    return "redirect:../repairList";
	} 
	
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id")Long repairId, Model model) {
	model.addAttribute("repairs", repository.findAll());
	 model.addAttribute("repair", repository.findById(repairId));
	 return "edit";
	}
	
	@PostMapping("/save")
	public String save(Repair repair) {
		repository.save(repair);
		return "redirect:repairList";
	}
	
	@GetMapping("/add")
	public String addRepair(Model model) {
		model.addAttribute("repairs", repository.findAll());
		model.addAttribute("repair", new Repair());	

		return "add";
		
	}
	@GetMapping("/sortByDate")
	public String sort(Model model) {
		model.addAttribute("repairs", repository.findAllByOrderByDateDesc());
		return "repairList";
	}
	@GetMapping("/sortByPrice")
	public String sortPrice(Model model) {
		model.addAttribute("repairs", repository.findAllByOrderByPriceDesc());
		return "repairList";
	}
	@GetMapping("/login")
	 public String login() {
		 return "login";
	 }
	@GetMapping({"/home","/"})
	 public String home() {
		 return "redirect:repairList";
	 }

}
