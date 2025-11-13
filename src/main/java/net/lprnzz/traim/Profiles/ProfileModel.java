package net.lprnzz.traim.Profiles;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.lprnzz.traim.ScenarioLists.ScenarioModel;

import java.util.List;

@Entity
@Table(name = "tb_profiles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfileModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;

    private String description;

    private int age;

    // um criador tem varias criacoes (cenarios)
    @OneToMany(mappedBy = "creator")
    private List<ScenarioModel> creations;

}