public class Main {
    public static void main(String[] args) {

        smartDevice ordenador = new smartDevice();
        SmartPhone telefono1 = new SmartPhone();
        SmartWatch reloj1 = new SmartWatch();

        ordenador.setScreenSize(17);
        ordenador.setCpu("Intel");
        ordenador.setRam(32);

        telefono1.setScreenSize(6);
        telefono1.setCpu("SnapDragon");
        telefono1.setRam(12);

        reloj1.setScreenSize(2);
        reloj1.setCpu("AMD");
        reloj1.setRam(4);

        ordenador.screenSize = 17;
        ordenador.cpu = "Intel";
        ordenador.ram = 32;

        telefono1.screenSize = 6;
        telefono1.cpu = "SnapDragon";
        telefono1.ram = 12;

        reloj1.screenSize = 2;
        reloj1.cpu = "AMD";
        reloj1.ram = 4;

        System.out.println(ordenador.screenSize);
        System.out.println(ordenador.cpu);
        System.out.println(ordenador.ram);
        System.out.println(telefono1.screenSize);
        System.out.println(telefono1.cpu);
        System.out.println(telefono1.ram);
        System.out.println(reloj1.screenSize);
        System.out.println(reloj1.cpu);
        System.out.println(reloj1.ram);

    }
}