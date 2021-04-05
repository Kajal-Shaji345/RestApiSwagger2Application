package com.restapiswagger2;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

//Entity Class
@Api(value="Developer" , description="Developer Information")
public class Developer {
	
	//Fields of developers
	
    @ApiModelProperty(notes = "The application-specific developer id.")
    private int developerId;

    @ApiModelProperty(notes = "The developer name")
    private String developerName;

    @ApiModelProperty(notes = "The developer skills")
    private String developerSkill;

    
    //Constructor with fields
    public Developer(int developerId, String developerName, String developerSkill) {
        this.developerId = developerId;
        this.developerName = developerName;
        this.developerSkill = developerSkill;
    }

    
    //Getter and setter
    public int getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(int developerId) {
        this.developerId = developerId;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public String getDeveloperSkill() {
        return developerSkill;
    }

    public void setDeveloperSkill(String developerSkill) {
        this.developerSkill = developerSkill;
    }
}
