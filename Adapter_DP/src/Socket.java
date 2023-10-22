public class Socket {
    public static void main(String[] args) {
        EuropeanSocket europeanSocket = new fromEuropeanToAmerican();

        europeanSocket.plugInto();
        europeanSocket.charge();
        europeanSocket.batteryFull();
        europeanSocket.unplugCharger();
    }
}
