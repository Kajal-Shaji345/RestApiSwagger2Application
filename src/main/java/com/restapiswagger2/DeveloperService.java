package com.restapiswagger2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DeveloperService

{
	
	//List of developers.
    List<Developer> arrayList=new ArrayList<Developer>(Arrays.asList(
            new Developer( 1, "Kajal","Java"),
            new Developer( 2, "Kiran","ReactJS")
    ));
    public List<Developer> getAllDeveloper()
    {
        return arrayList;
    }

    
    //Add new developer
    public Developer addDeveloper(Developer developer){
        arrayList.add(developer);
        return developer;
    }


    //Update developer by Id
    public void updateDeveloper(Developer developer, Integer getId) {
        for(Developer dev: arrayList) {
            if(dev.getDeveloperId()==getId)
            {
                dev.setDeveloperId(developer.getDeveloperId());
                dev.setDeveloperName(developer.getDeveloperName());
                dev.setDeveloperSkill(developer.getDeveloperSkill());
            }

        }

    }

    
    //Delete developer by Id
    public  void deleteDeveloper(Integer getId){

        for(int i=0;i<arrayList.size();i++)
        {
            Developer dev=arrayList.get(i);
            if(dev.getDeveloperId()==getId);
            {
                arrayList.removeIf(developer -> developer.getDeveloperId()==getId);

            }
        }
    }

}
