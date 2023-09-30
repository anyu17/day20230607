package nv;

public class nv {
    private String name;
    private char gender;
    private int age;
    private String aihao;

    public nv() {
    }

    public nv(String name, char gender, int age, String aihao) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.aihao = aihao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAihao() {
        return aihao;
    }

    public void setAihao(String aihao) {
        this.aihao = aihao;
    }
}
