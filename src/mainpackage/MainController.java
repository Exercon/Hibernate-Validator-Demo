package mainpackage;


import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index(Model m){
        m.addAttribute("bankCustomer", new BankCustomer());
        return "index";
    }

    @RequestMapping("/formresult")
    public String formresult(@Valid @ModelAttribute BankCustomer bankCustomer, BindingResult br, Model m){
        if(br.hasErrors()){
            return "index";
        }
        m.addAttribute("bankCustomer", bankCustomer);
        return "formresult";
    }

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

}
