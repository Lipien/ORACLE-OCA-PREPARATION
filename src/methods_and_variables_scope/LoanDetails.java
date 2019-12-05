package methods_and_variables_scope;

public class LoanDetails {

    private int term;
    private double rate;
    private double principal;

    /*public LoanDetails() {
        term = 180;
        rate = 0.0265;
        principal = 0;
    }*/

    // following version can be used instead of the one above
    public LoanDetails() {
        this(180, 0.025, 0);
    }

    public LoanDetails(int term, double rate, double principal) {
        this.term = term;
        this.rate = rate;
        this.principal = principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double monthlyPayment() {
        return (rate * principal / 12)
                / (1.0 - Math.pow(((rate / 12) + 1.0), (-term)));
    }
}
