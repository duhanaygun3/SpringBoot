package ProgramingLangs.LangandTechs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ProgramingLangs.LangandTechs.Business.abstracts.LanguageService;
import ProgramingLangs.LangandTechs.Business.requests.CreateNewLanguageRequest;
import ProgramingLangs.LangandTechs.Business.requests.DeleteLanguageRequest;
import ProgramingLangs.LangandTechs.Business.requests.UpdateLanguageRequest;
import ProgramingLangs.LangandTechs.Business.responses.GetAllLanguagesResponse;

@RestController
@RequestMapping("api/languages")
public class LanguagesControllers {
    private LanguageService languageService;

    public LanguagesControllers(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getalllanguages")
    public List<GetAllLanguagesResponse> getAll() {

        return languageService.getAll();
    }

    @PostMapping("/addLanguage")
    public void addNewLanguage(CreateNewLanguageRequest createNewLanguageRequest) {

        languageService.addnewLanguage(createNewLanguageRequest);

    }

    @DeleteMapping("/deleteLanguage/{id}")
    public void deleteLanguageById(DeleteLanguageRequest deleteLanguageRequest){
        languageService.deleteLanguage(deleteLanguageRequest);

    }

    @PutMapping("/updateLanguage/{id}")
    public void updateLanguage(UpdateLanguageRequest updateLanguageRequest){
        languageService.UpdateLanguageRequest(updateLanguageRequest);
    }

}
