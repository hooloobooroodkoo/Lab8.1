package ATM;

public abstract class DefaultTray implements Tray{
    private final int bill;
    private Tray nextTray;
    public DefaultTray(int bill) {
        this.bill = bill;
    }
    public void process(int amount) {

        if (null != nextTray) {
            nextTray.process(amount % bill);
        }
        else if (amount % bill > 0){
            throw new IllegalArgumentException();
        }
        System.out.println("extracted " + amount / bill + " with amount of " + bill);
    }

    @Override
    public void setNext(Tray nextTray) {
        this.nextTray = nextTray;
    }


}
