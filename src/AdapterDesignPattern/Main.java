package AdapterDesignPattern;

import AdapterDesignPattern.interfaces.SocketAdapter;
import AdapterDesignPattern.model.SocketAdapterImplementation;
import AdapterDesignPattern.model.SocketObjectAdapterImplementation;
import AdapterDesignPattern.model.Volt;

public class Main {
    public static void main (String[] args) {
       testingObjectAdapter();

       testingClassAdapter();
    }

    private static void testingClassAdapter() {
        SocketAdapter socketAdapter = new SocketAdapterImplementation();
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);

        System.out.println(" V3 volts is using Class Adapter " + v3.getVolts());
        System.out.println(" V12 volts is using Class Adapter " + v12.getVolts());
        System.out.println(" V120 volts is using Class Adapter " + v120.getVolts() + "\n");
    }

    private static void testingObjectAdapter() {
        SocketAdapter socketAdapter = new SocketObjectAdapterImplementation();
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);

        System.out.println(" V3 volts is using Objet Adapter " + v3.getVolts());
        System.out.println(" V12 volts is using Objet Adapter " + v12.getVolts());
        System.out.println(" V120 volts is using Objet Adapter " + v120.getVolts());
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int i) {
        switch (i) {
            case 3: return socketAdapter.get3Volts();
            case 12: return socketAdapter.get12Volts();
            case 120: return socketAdapter.get120Volts();
            default: return socketAdapter.get120Volts();
        }
    }
}
