package com.nepdroid.form;

	import javax.validation.Valid;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.validation.BindingResult;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.servlet.ModelAndView;



	@Controller
	@RequestMapping("/employee")
	public class FormHandler {
		@RequestMapping(value="/addemployee", method = RequestMethod.GET)
		public ModelAndView addEmployee() {
			
			ModelAndView model= new ModelAndView("employeeForm");
			model.addObject("headermsg", "Nepdroid Techonologies");
			return model;
		}	
		@ModelAttribute
		public void addCommonObjects(Model model1) {
			model1.addAttribute("quotemsg", "Let the code flow in your blood....");
		}
		@RequestMapping(value = "/addemployee", method = RequestMethod.POST)
		  public ModelAndView showEmployee( @ModelAttribute("emp")  @Valid Employee emp, BindingResult result) {
			
			if(result.hasErrors()) {
				ModelAndView model= new ModelAndView("employeeForm");
				return model;
			}
			ModelAndView model = new ModelAndView ("employeeDetails");
			model.addObject("headermsg", "Nepdroid Techonologies");
			return model;
		   }

	}


