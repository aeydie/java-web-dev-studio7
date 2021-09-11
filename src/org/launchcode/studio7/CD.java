package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    public String albumName;

    public CD(String age, double storageCapacity, String albumName) {
        super(age, storageCapacity);
        this.albumName = albumName;
    }

    @Override
    public void playSound() {
        System.out.println("Your favorite song plays.");
    }

    @Override
    public void loadDisc() {

    }

    @Override
    public void spinDisc() {
    }


    @Override
    public void getScratched() {
        return System.out.println("This is sily and not working cuz it's scratched!");
    }

    @Override
    public void storeData() {

    }

    @Override
    public void writeData() {

    }

    @Override
    public void readData() {

    }

}
// TODO: Implement your custom interface.

// TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
//  need to be declared separately.




