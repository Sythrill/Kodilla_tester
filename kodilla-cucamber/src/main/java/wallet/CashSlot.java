package wallet;

public class CashSlot {
    private int contents;
    private boolean injectionFault;

    public int getContents() {
        return contents;
    }

    public void dispense(int amount) {
        if (!this.isInjectionFault())
        this.contents = amount;
    }

    public boolean isInjectionFault() {
        return injectionFault;
    }

    public void setFault(boolean fault) {
        this.injectionFault = fault;
    }

    public String faultMessage() {
        if (isInjectionFault()) {
            return "Technical error";
        } else {
            return "CashSlot is ok";
        }
    }
}