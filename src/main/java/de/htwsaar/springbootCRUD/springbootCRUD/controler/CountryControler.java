package de.htwsaar.springbootCRUD.springbootCRUD.controler;

import de.htwsaar.springbootCRUD.springbootCRUD.dao.CountryRepository;
import de.htwsaar.springbootCRUD.springbootCRUD.entities.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CountryControler {

    @Autowired
    private CountryRepository countryRepository;



    @GetMapping("/")
    public String showPage(Model model, @RequestParam(defaultValue = "0")int page){
        model.addAttribute("data", countryRepository.findAll(new PageRequest(page, 4)));
        return "index";
    }

    @PostMapping("/save")
    public String save(Country country){
        countryRepository.save(country);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(Integer id){
        countryRepository.deleteById(id);
        return "redirect:/";
    }


    @GetMapping("/findOne")
    @ResponseBody
    public String findOne(Integer id){
       return countryRepository.findOne(id);

    }
}
