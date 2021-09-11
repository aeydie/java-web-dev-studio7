package org.launchcode.studio7;

public abstract class BaseDisc {

    //should these be constants
    String age;
    double storageCapacity = 0;

    public BaseDisc(String age, double storageCapacity) {
        this.age = "age";
        this.storageCapacity = storageCapacity;
    }


    public String getAge() {
        return age;
    }

    public String setAge() {
        this.age = age;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public abstract void playSound();

    public abstract void loadDisc();

    public abstract void spinDisc();

    public abstract void getScratched();
}

