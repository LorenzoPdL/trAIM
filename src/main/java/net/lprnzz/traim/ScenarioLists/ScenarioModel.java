package net.lprnzz.traim.ScenarioLists;
import jakarta.persistence.*;
import net.lprnzz.traim.Profiles.ProfileModel;

import java.util.List;

// Transforma uma classe em uma entidade da DB
@Entity
@Table(name = "tb_scenarios")
public class ScenarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String scenarioName;

    private String subcategory;

    private String description;

    private int difficulty;//1-5

    //@manytoOne - um cenario tem apenas um criador
    @ManyToOne
    @JoinColumn(name = "creator_id")//Foreign Key ou Chave Estrangeria
    private ProfileModel creator;


    public ScenarioModel() {
    }

    public ScenarioModel(int difficulty, String scenarioName, String description, String subcategory) {
        this.difficulty = this.difficulty;
        this.scenarioName = scenarioName;
        this.description = description;
        this.subcategory = subcategory;
    }


    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public String getScenarioName() {
        return scenarioName;
    }

    public void setScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
