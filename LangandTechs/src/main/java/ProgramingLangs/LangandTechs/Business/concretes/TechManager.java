package ProgramingLangs.LangandTechs.Business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ProgramingLangs.LangandTechs.Business.abstracts.TechService;
import ProgramingLangs.LangandTechs.Business.requests.CreateNewTechRequest;
import ProgramingLangs.LangandTechs.Business.requests.DeleteTechsRequest;
import ProgramingLangs.LangandTechs.Business.requests.UpdateTechRequest;
import ProgramingLangs.LangandTechs.Business.responses.GetAllTechResponse;
import ProgramingLangs.LangandTechs.dataAccess.abstracts.LanguageRepository;
import ProgramingLangs.LangandTechs.dataAccess.abstracts.TechRepository;
import ProgramingLangs.LangandTechs.entities.concreates.Language;
import ProgramingLangs.LangandTechs.entities.concreates.Tech;

@Service
public class TechManager implements TechService {
    private LanguageRepository languageRepository;
    private TechRepository techRepository;

    public TechManager(LanguageRepository languageRepository, TechRepository techRepository) {
        this.languageRepository = languageRepository;
        this.techRepository = techRepository;
    }

    @Override
    public List<GetAllTechResponse> getAllTechResponses() {
        List<Tech> techs = techRepository.findAll();
        List<GetAllTechResponse> getAllTechResponses = new ArrayList<>();

        for (Tech tech : techs) {
            GetAllTechResponse temptech = new GetAllTechResponse();
            temptech.setId(tech.getId());
            temptech.setName(tech.getName());

            getAllTechResponses.add(temptech);
        }

        return getAllTechResponses;
    }

    @Override
    public void addNewTech(CreateNewTechRequest createNewTechRequest) {

        Language language = languageRepository.findById(createNewTechRequest.getLanguage_id()).orElseThrow();
        Tech tech = new Tech();
        tech.setName(createNewTechRequest.getName());
        tech.setLanguage(language);
        techRepository.save(tech);
    }

    @Override
    public void deleteTech(DeleteTechsRequest deleteTechsRequest) {
        techRepository.deleteById(deleteTechsRequest.getId());
    }

    @Override
    public void updateTech(UpdateTechRequest updateTechRequest) {
        Tech tech = new Tech();
        tech.setId(updateTechRequest.getId());
        tech.setName(updateTechRequest.getName());

    }

}
