package sample.model;

public class Area {

    private Long code;
    private String name;
    private Integer level;

    public Area() {
    }

    public Area( String name,Long code, Integer level) {
        this.code = code;
        this.name = name;
        this.level = level;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
