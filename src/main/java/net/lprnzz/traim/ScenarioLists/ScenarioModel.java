package net.lprnzz.traim.ScenarioLists;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.lprnzz.traim.Profiles.ProfileModel;

import java.util.List;

// Transforma uma classe em uma entidade da DB
@Entity
@Table(name = "tb_scenario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScenarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String scenarioName;

    private String subcategory;

    private String description;

    private int difficulty;//1-5

    //@manytoOne - um cenario tem apenas um criador
    @ManyToOne
    @JoinColumn(name = "creator_id")//Foreign Key ou Chave Estrangeria
    private ProfileModel creator;

}
