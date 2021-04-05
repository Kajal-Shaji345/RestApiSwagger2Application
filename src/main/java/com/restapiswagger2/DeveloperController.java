package com.restapiswagger2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

@RestController
@RequestMapping("/developers")
@Api(value="/developers" , tags="Developer Controller")
public class DeveloperController {
    @Autowired
    DeveloperService developerService;

    
    //List of Developers
    @RequestMapping(method=RequestMethod.GET)
    @ApiOperation(value = "Get developer" ,notes="Get developer", tags="Developer Controller")
    public List<Developer> getAllDeveloper(){
        return developerService.getAllDeveloper();
    }

    //Adding new Developer
    @RequestMapping(method= RequestMethod.POST)
    @ApiOperation(value = "Create default developer" ,notes="create default developer", tags="Developer Controller")
    public String addDeveloper(@RequestBody Developer developer){
        developerService.addDeveloper(developer);
        return "Developer added successfully";
    }

    //Update Developer by Id
    @RequestMapping(method= RequestMethod.PUT,value="/{getId}")
    @ApiOperation(value = "Get developer by Id" ,notes="Get developer by Id", tags="Developer Controller")
    public String updateDeveloper(@RequestBody Developer developer,@PathVariable Integer getId){
        developerService.updateDeveloper(developer, getId);
        return "Data updated successfully";
    }

    
    //Delete Developer by Id
    @RequestMapping(method= RequestMethod.DELETE,value="/{getId}")
    @ApiOperation(value = "Delete developer by Id" ,notes="Delete developer by Id", tags="Developer Controller")
    public String deleteDeveloper(@PathVariable Integer getId){
        developerService.deleteDeveloper(getId);
        return "Data deleted successfully";
    }
}
