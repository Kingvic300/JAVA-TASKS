public class Payment {
    private Double amount;
    private Boolean isPaid;

    public Payment(Double amount) {
        setAmount(amount);

    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        this.amount = amount;
        this.isPaid = false;

    }
    public void processPayment() {
        if (isPaid) throw new IllegalStateException("Payment already processed");
        this.isPaid = true;
    }

    public boolean isPaid() { return isPaid; }
}
