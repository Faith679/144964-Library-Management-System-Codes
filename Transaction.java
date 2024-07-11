import java.util.*;

class Transaction {
    private Member member;
    private Book book;
    private Date date;
    private boolean isBorrowing;

    public Transaction(Member member, Book book, boolean isBorrowing) {
        this.member = member;
        this.book = book;
        this.isBorrowing = isBorrowing;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "Transaction: " + (isBorrowing ? "Borrowed" : "Returned") + " - " + book + " by " + member + " on " + date;
    }
}
