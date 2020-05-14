package javaproj.springmvccrud.controller;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javaproj.springmvccrud.model.Trainer;
import javaproj.springmvccrud.service.TrainerService;

@Controller
@RequestMapping("/")
public class MyController {

	@Autowired
	TrainerService service;
	
	@Autowired
	MessageSource messageSource;

	/*
	 * List all existing trainers
	 */
	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String listTrainers(ModelMap model) {

		List<Trainer> trainers = service.findAllTrainers();
		model.addAttribute("trainers", trainers);
		return "alltrainers";
	}

	/*
	 * Add a new trainer.
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String newTrainer(ModelMap model) {
		Trainer trainer = new Trainer();
		model.addAttribute("trainer", trainer);
		model.addAttribute("edit", false);
		return "registration";
	}

	/*
	 * Handling POST request for validating the user input and saving trainer in database.
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String saveTrainer(@Valid Trainer trainer, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "registration";
		}
		

		
		service.saveTrainer(trainer);

		model.addAttribute("success", "Trainer " + trainer.getLname() + " registered successfully");
		return "success";
	}


	/*
	 * Provide the existing trainer for updating.
	 */
	@RequestMapping(value = { "/edit-{id}-trainer" }, method = RequestMethod.GET)
	public String editTrainer(@PathVariable int id, ModelMap model) {
		Trainer trainer = service.findTrainerById(id);
		model.addAttribute("trainer", trainer);
		model.addAttribute("edit", true);
		return "registration";
	}
	
	/*
	 * Handling POST request for validating the user input and updating trainer in database.
	 */
	@RequestMapping(value = { "/edit-{id}-trainer" }, method = RequestMethod.POST)
	public String updateTrainer(@Valid Trainer trainer, BindingResult result,
			ModelMap model, @PathVariable int id) {

		if (result.hasErrors()) {
			return "registration";
		}

		

		service.updateTrainer(trainer);

		model.addAttribute("success", "Trainer " + trainer.getLname()	+ " updated successfully");
		return "success";
	}

	
	/*
	 * Delete a trainer by it's CODE value.
	 */
	@RequestMapping(value = { "/delete-{id}-trainer" }, method = RequestMethod.GET)
	public String deleteTrainer(@PathVariable int id) {
		service.deleteTrainerById(id);
		return "redirect:/list";
	}

}
