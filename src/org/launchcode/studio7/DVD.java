package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    public String movieTitle;

    public DVD(String age, double storageCapacity, String movieTitle) {
        super(age, storageCapacity);
        this.movieTitle = movieTitle;
    }


    @Override
    public void playSound() {
        System.out.println("Your favorite movie plays.");
    }

    @Override
    public void loadDisc() {

    }

    @Override
    public void spinDisc() {

    }

    @Override
    public void getScratched() {

    }
    @Override
    public String getAge() {
        return this.age;
    }

//
//    @Override
//    public void storeData() {
//
//    }
//
//    @Override
//    public void writeData() {
//
//    }
//
//    @Override
//    public void readData() {
//
//    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
