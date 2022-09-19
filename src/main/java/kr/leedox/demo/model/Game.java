package kr.leedox.demo.model;

public class Game {
    private Integer id;
    private String name;
    private String creator;

    public Game(Integer id, String name, String creator) {
        this.id = id;
        this.name = name;
        this.creator = creator;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

}
