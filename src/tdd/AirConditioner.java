package tdd;
public class AirConditioner {

    private boolean isOn;
    private boolean isOff;
    private int temperature;
    public AirConditioner(boolean isOn,int temperature){
        this.isOn=isOn;
        this.temperature=temperature;
    }
    public void turnOn(){
        this.isOn = true;
    }
    public void turnOff() {
        this.isOff =false;
    }
    public void setOn(boolean on) {
        isOn = on;
    }
    public boolean isOff() {
        return isOff;
    }
    public void temperature (int increaseTemperature){
        this.temperature = increaseTemperature;
    }
    public int temperature() {
        return temperature;
    }
}