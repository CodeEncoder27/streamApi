package interfaces_prac.sub;

interface Camera {
    void takePhoto();
    void deletePhoto();
    void viewPhotos();
}

interface Wifi {
    void connectToWifi();
    String [] getAvailableNetworks();
    void disconnectFromWifi();
}

class Cellphone {
    void makeCall(int phoneNumber) {
        System.out.println("Making a call" + phoneNumber);
    }
    void receiveCall() {
        System.out.println("connecting....");
    }
}

class SmartPhones extends Cellphone implements Camera, Wifi {
    @Override
    public void takePhoto() {
        System.out.println("Taking a photo");
    }

    @Override
    public void deletePhoto() {
        System.out.println("Deleting a photo");
    }

    @Override
    public void viewPhotos() {
        System.out.println("Viewing photos");
    }

    @Override
    public void connectToWifi() {
        System.out.println("Connecting to wifi");
    }

    @Override
    public String[] getAvailableNetworks() {
        System.out.println("Getting available networks");
        String [] networks = {"Anish2", "Chan2"};
        return networks;
    }

    @Override
    public void disconnectFromWifi() {
        System.out.println("Disconnecting from wifi");
    }
}
public class UnderstandingInterfaces {
}
