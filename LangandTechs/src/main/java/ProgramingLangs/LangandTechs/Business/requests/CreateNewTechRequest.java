package ProgramingLangs.LangandTechs.Business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateNewTechRequest {
    private String name;
    private int language_id;
}
