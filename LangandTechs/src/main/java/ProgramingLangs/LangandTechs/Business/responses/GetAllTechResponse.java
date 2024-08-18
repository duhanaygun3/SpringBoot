package ProgramingLangs.LangandTechs.Business.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllTechResponse {
    private String name;
    private int id;
    
}
