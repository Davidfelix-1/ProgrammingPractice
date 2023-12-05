package NokiaPhone;

public class NokiaPhone {
    private String brand;
    private String model;
    private boolean isOn;
    private int BatteryLevel;

    public NokiaPhone(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.isOn = false;
        this.BatteryLevel = 90;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setBatteryLevel(int batteryLevel) {
        BatteryLevel = batteryLevel;
    }
}
