package Observer;

/**
 * description
 *
 * @author txcaojiamen 2020/07/28 13:34
 */
public interface Debit {
    void borrow(Credit credit);
    void notifyCredits();
}
