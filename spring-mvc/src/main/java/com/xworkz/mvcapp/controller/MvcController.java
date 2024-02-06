package com.xworkz.mvcapp.controller;

import com.xworkz.mvcapp.dto.MvcDto;
import com.xworkz.mvcapp.service.MvcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/")
@Component
@Controller
public class MvcController {

    //Methods of controller class which will process the Request and get Response back
    //controller will returns page/view
    // Model- set the value into the scope
    //if we write any java code in jsp we have to use <% %> -Scriplate

    @Autowired
    private MvcService service;
    @PostMapping("mvc")
    public String saveMvcTechnology(@ModelAttribute @Valid MvcDto dto, BindingResult errors, Model model) {


//        String name=dto.getMvcTechnologyName();
//        String version=dto.getTechnologyVersion();
//        String year=dto.getReleasedYear();
//        String ownerName=dto.getOwnerName();
        if (errors.hasErrors()){
            System.out.println("is dto has errors :" +errors.hasErrors());
            List<ObjectError> errorList =errors.getAllErrors();

            for (ObjectError objectError:errorList){
                System.out.println(objectError.getDefaultMessage());
            }
            model.addAttribute("list",errorList);
           return "index";
        }
        if(service.validateAndSaveMvcTechnology(dto)) {

//       model.addAttribute("mvcTechnologyName",name);
//       model.addAttribute("technologyVersion",version);
//       model.addAttribute("releasedYear",year);
//       model.addAttribute("ownerName",ownerName);
       return "{\"response\":\"ok\"}";
        }
    return "error";
    }

    @GetMapping("listOfTechnology")
    public  String getAlltechnologies(Model model) {

        List<MvcDto> list = service.getAllTechnogies();
        if (!list.isEmpty()) {
            model.addAttribute("techs", list);
            System.out.println(list);

            return "technology-list";
//            return "{\"status\":\"ok\"}";
        }
        return "error";
    }

    @GetMapping("getTechnology/{techId}")
    public String getTechnology(@PathVariable("techId") String techId ,Model model){

         MvcDto dto=service.validateAndGetTechnologyById(Integer.parseInt(techId));
         model.addAttribute("updateInfo",dto);

        System.out.println(dto);

        return "update-technology";
    }

    @PostMapping("updateTechnology")
    public  String updateTechnology(@ModelAttribute  MvcDto dto , String id,Model model){

        if (service.validateAndUpdateTechnologyById(dto, Integer.parseInt(id))){
           model.addAttribute("updateMessage","updatedSuccessfully");

            return getAlltechnologies(model);
        }
    return "error";
    }
    @GetMapping("delete")
    public String deleteTechnology(@RequestParam("techId") String id ,Model model){

        
        service.validateAndDeleteTechnologyById(Integer.parseInt(id));
        model.addAttribute("deleteMessage","deletedSuccessfully");
        return getAlltechnologies(model);
    }

    @GetMapping("search")
    public String SearchTechnology(@RequestParam("mvcTechnologyName") String mvcTechnologyName,@RequestParam("technologyVersion") String technologyVersion,Model model){

        if (!mvcTechnologyName.isEmpty() || !technologyVersion.isEmpty()){
            List<MvcDto> list=service.getMvcByTechnologyNameAndVersion(mvcTechnologyName,technologyVersion);
            System.out.println(list);
            model.addAttribute("techs",list);
            return "technology-list";
        }
        return "error";
    }

}
