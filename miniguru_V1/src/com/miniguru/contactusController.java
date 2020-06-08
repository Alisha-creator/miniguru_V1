package com.miniguru;

import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.miniguru.entity.contactus;
import com.miniguru.service.contactusService;

@Controller
@RequestMapping("/")
public class contactusController {
	
	private Logger logger = Logger.getLogger(contactusController.class);
	
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor ste = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, ste);
	}

    @Autowired
    private contactusService contactusService;

    @RequestMapping("/")
    public String addcontactus(contactus contactus ,Model theModel) {
        logger.info("Debug: showing contactus");
        theModel.addAttribute("contactus", new contactus());
        return "homepage";
    }

    @RequestMapping("/")
    public String savecontactus(@Valid @ModelAttribute("contactus") contactus contactus, BindingResult br) {
    	logger.info("Debug:saving Contacts");
    	if(br.hasErrors()) {
    	    logger.info("Debug:Error Occured");
        }
    	else {
    		logger.info("Debug:Error Occured");
    	    contactusService.savecontactus(contactus);
            return "homepage";
    	}
		return "homepage";
    }
 
}
