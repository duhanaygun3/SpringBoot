package ProgramingLangs.LangandTechs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ProgramingLangs.LangandTechs.Business.abstracts.TechService;
import ProgramingLangs.LangandTechs.Business.requests.CreateNewTechRequest;
import ProgramingLangs.LangandTechs.Business.requests.DeleteTechsRequest;
import ProgramingLangs.LangandTechs.Business.requests.UpdateTechRequest;
import ProgramingLangs.LangandTechs.Business.responses.GetAllTechResponse;

@RestController
@RequestMapping("api/techs")
public class TechsControllers {

    private TechService techService;

    public TechsControllers(TechService techService) {
        this.techService = techService;
    }

    @GetMapping("/getalltechs")
    public List<GetAllTechResponse> getAll() {

        return techService.getAllTechResponses();

    }

    @PostMapping("/addTech")
    public void addNewTech(CreateNewTechRequest createNewTechRequest){
techService.addNewTech(createNewTechRequest);


    }

    @DeleteMapping("/deleteTech/{id}")
    public void deleteTech(DeleteTechsRequest deleteTechsRequest){
        techService.deleteTech(deleteTechsRequest);
    }

    @PutMapping("/updateTech/{id}")
    public void updateTech(UpdateTechRequest updateTechRequest){
        techService.updateTech(updateTechRequest);
    }

}
