package net.lprnzz.traim.Profiles;

import jakarta.persistence.*;
import net.lprnzz.traim.ScenarioLists.ScenarioModel;

import java.util.List;

@Entity
@Table(name = "tb_profiles")
public class ProfileModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String description;

    private int age;

    // um criador tem varias criacoes (cenarios)
    @OneToMany(mappedBy = "creator")
    private List<ScenarioModel> creations;


    public ProfileModel() {
    }

    public ProfileModel(String username, String description, int age) {
        this.username = username;
        this.description = description;
        this.age = age;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}