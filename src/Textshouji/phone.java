package Textshouji;

public class phone {
    private String pinpai;
    private double jiage;
    private String yanse;


    public phone(){

    }
    public phone(String pinpai,double jiage, String yanse){
        this.pinpai = pinpai;
        this.jiage = jiage;
        this.yanse = yanse;
    }

    public String getPinpai (){
        return pinpai;
    }
    public void setPinpai(String pinpai){
        this.pinpai = pinpai ;
    }

    public double getjiage(){
        return jiage ;
    }
    public void setJiage (int jiage){
            this.jiage = jiage;
    }

    public String getYanse(){
        return yanse;
    }
    public void Getyanse(){
        this.yanse = yanse;
    }
}
