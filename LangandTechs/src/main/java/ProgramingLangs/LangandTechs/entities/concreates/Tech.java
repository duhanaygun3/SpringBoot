package ProgramingLangs.LangandTechs.entities.concreates;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "techs")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tech {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

   
    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "language_id", referencedColumnName = "id")
    @JsonBackReference
    private Language language;

    public Tech(String name, Language language) {
        this.name = name;
        this.language = language;
    }


}
