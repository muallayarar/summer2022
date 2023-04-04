package practice8;

public class Q03_VolumeRunner {
    public static void main(String[] args) {
        Q03_Volume volume=new Q03_Volume(); //object and constructor oluşturduk çünkü
        // methodlarımız static değil

        System.out.println(volume.calculateVolume(5));//125.0
        System.out.println(volume.calculateVolume(7,5));//245.0
        System.out.println(volume.calculateVolume(7,8,9));//504.0

    }

//hep ayni seyi (volume-hacim bulma)yapacağımız için overloading yöntemini kullandık.

}
