package ProgramingLangs.LangandTechs.Business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ProgramingLangs.LangandTechs.Business.abstracts.LanguageService;
import ProgramingLangs.LangandTechs.Business.requests.CreateNewLanguageRequest;
import ProgramingLangs.LangandTechs.Business.requests.DeleteLanguageRequest;
import ProgramingLangs.LangandTechs.Business.requests.UpdateLanguageRequest;
import ProgramingLangs.LangandTechs.Business.responses.GetAllLanguagesResponse;
import ProgramingLangs.LangandTechs.dataAccess.abstracts.LanguageRepository;
import ProgramingLangs.LangandTechs.entities.concreates.Language;

@Service
public class LanguageManager implements LanguageService {

    private LanguageRepository languagesRepository;

    public LanguageManager(LanguageRepository languagesRepository) {
        this.languagesRepository = languagesRepository;
    }

    public void addnewLanguage(CreateNewLanguageRequest createNewLanguage) {
        Language language = new Language();
        language.setName(createNewLanguage.getName());
        languagesRepository.save(language);

    }

    @Override
    public List<GetAllLanguagesResponse> getAll() {

        List<Language> languages = languagesRepository.findAll();
        List<GetAllLanguagesResponse> getAllLanguages = new ArrayList<GetAllLanguagesResponse>();

        for (Language language : languages) {
            GetAllLanguagesResponse tempLanguages = new GetAllLanguagesResponse();

            tempLanguages.setId(language.getId());
            tempLanguages.setName(language.getName());

            getAllLanguages.add(tempLanguages);
        }

        return getAllLanguages;
    }

    @Override
    public void deleteLanguage(DeleteLanguageRequest deleteLanguageRequest) {
        languagesRepository.deleteById(deleteLanguageRequest.getId());

    }

    @Override
    public void UpdateLanguageRequest(UpdateLanguageRequest updateLanguageRequest) {
        Language languagetemp=new Language();
       
        languagetemp.setId(updateLanguageRequest.getId());
        languagetemp.setName(updateLanguageRequest.getName());
        languagesRepository.save(languagetemp);

    }
    

}
