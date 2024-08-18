package ProgramingLangs.LangandTechs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import ProgramingLangs.LangandTechs.entities.concreates.Tech;

public interface TechRepository extends JpaRepository<Tech,Integer> {
    
}
