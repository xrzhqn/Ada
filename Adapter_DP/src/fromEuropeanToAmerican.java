public class fromEuropeanToAmerican extends AmericanSocket implements EuropeanSocket{
    @Override
    public void plugInto() {
        plugIn();
    }

    @Override
    public void charge() {
        chargeDevice();
    }

    @Override
    public void batteryFull() {
        deviceCharged();
    }

    @Override
    public void unplugCharger() {
        unplug();
    }
}
