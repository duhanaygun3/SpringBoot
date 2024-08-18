package ProgramingLangs.LangandTechs.Business.abstracts;

import java.util.List;

import ProgramingLangs.LangandTechs.Business.requests.CreateNewLanguageRequest;
import ProgramingLangs.LangandTechs.Business.requests.DeleteLanguageRequest;
import ProgramingLangs.LangandTechs.Business.requests.UpdateLanguageRequest;
import ProgramingLangs.LangandTechs.Business.responses.GetAllLanguagesResponse;

public interface LanguageService {
    List<GetAllLanguagesResponse> getAll();

    void addnewLanguage(CreateNewLanguageRequest createNewLanguage);

    void deleteLanguage(DeleteLanguageRequest deleteLanguageRequest);

    void UpdateLanguageRequest(UpdateLanguageRequest updateLanguageRequest);

}
