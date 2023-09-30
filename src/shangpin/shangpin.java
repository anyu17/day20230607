package shangpin;

public class shangpin {
    private String ID;
    private String name;
    private double jiage;
    private int kucun;


    public shangpin() {
    }

    public shangpin(String ID, String name, double jiage, int kucun) {
        this.ID = ID;
        this.name = name;
        this.jiage = jiage;
        this.kucun = kucun;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getJiage() {
        return jiage;
    }

    public void setJiage(double jiage) {
        this.jiage = jiage;
    }

    public int getKucun() {
        return kucun;
    }

    public void setKucun(int kucun) {
        this.kucun = kucun;
    }

}
