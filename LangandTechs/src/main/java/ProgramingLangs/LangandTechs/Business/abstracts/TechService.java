package ProgramingLangs.LangandTechs.Business.abstracts;

import java.util.List;

import ProgramingLangs.LangandTechs.Business.requests.CreateNewTechRequest;
import ProgramingLangs.LangandTechs.Business.requests.DeleteTechsRequest;
import ProgramingLangs.LangandTechs.Business.requests.UpdateTechRequest;
import ProgramingLangs.LangandTechs.Business.responses.GetAllTechResponse;

public interface TechService {
    List<GetAllTechResponse> getAllTechResponses();

    void addNewTech(CreateNewTechRequest createNewTechRequest);

    void deleteTech(DeleteTechsRequest deleteTechsRequest);

    void updateTech(UpdateTechRequest updateTechRequest);
}
