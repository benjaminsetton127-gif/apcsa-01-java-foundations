public class CalculaeInterrest{
public static void main(String[] args) {
System.out.println(CompoundInterest(1000, 5, 0.05));
}
public static double CompoundInterest(double principal, int loanTerms, double interestRate) {
    double remainingBalance = principal;
    for (int i = 0; i < loanTerms; i++) {
        remainingBalance = remainingBalance + (remainingBalance * interestRate);
    }
    return remainingBalance - principal;
}
}
