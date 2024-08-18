package ProgramingLangs.LangandTechs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ProgramingLangs.LangandTechs.entities.concreates.Language;

public interface LanguageRepository extends JpaRepository<Language,Integer> {
    
}
