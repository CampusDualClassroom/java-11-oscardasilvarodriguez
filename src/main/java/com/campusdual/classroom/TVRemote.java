package com.campusdual.classroom;

public class TVRemote {
    //atributos
    int channel;    //en qué canal está la tv
    int volume;     //en qué nivel de volumen está la tv
    boolean on;     //on/off
    String color;   //color del mando a distancia

    //constructores
    public TVRemote(String color) {
        this.channel = 0;
        this.volume =20;
        this.color = color;
    }

    //metodos
    public boolean turnOn() {
        this.on = true;
        return this.on;
    }

    public boolean turnOff() {
        this.on = false;
        return this.on;
    }

    public void channelUp() {
        this.channel++;
    }

    public void channelDown() {
        if (this.checkMinValue(this.channel)) {
            this.channel--;
        }
    }

    public void volumeUp() {
        this.volume++;
    }
    public void volumeDown() {
        if (this.checkMinValue(this.volume)) {
            this.volume--;
        }
    }
    public String getColor() {
        return this.color;
    }
    private boolean checkMinValue(int value) {
        if (value == 0) {
            System.out.println("El valor es 0, no se puede bajar más!!");
            return false;
        }else {
            return true;
        }
    }
}
