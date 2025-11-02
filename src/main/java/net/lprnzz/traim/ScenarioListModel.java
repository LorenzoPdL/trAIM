package net.lprnzz.traim;
import jakarta.persistence.*;

// Transforma uma classe em uma entidade da DB
@Entity
@Table(name = "tb_cadastro")
public class ScenarioListModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String scenarioName;
    private String subcategory;
    private String description;

    public ScenarioListModel() {
    }

    public ScenarioListModel(String scenarioName, String subcategory, String description) {
        this.scenarioName = scenarioName;
        this.subcategory = subcategory;
        this.description = description;
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
