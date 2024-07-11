import java.util.*;

class Library {
    private Map<Integer, Book> books;
    private Map<Integer, Member> members;
    private Queue<Transaction> transactions;

    public Library() {
        books = new HashMap<>();
        members = new HashMap<>();
        transactions = new LinkedList<>();
    }

    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    public void addMember(Member member) {
        members.put(member.getId(), member);
    }

    public void borrowBook(int memberId, int bookId) {
        Book book = books.get(bookId);
        Member member = members.get(memberId);

        if (book != null && member != null) {
            member.borrowBook(book);
            transactions.add(new Transaction(member, book, true));
        } else {
            System.out.println("Book or Member not found.");
        }
    }

    public void returnBook(int memberId, int bookId) {
        Book book = books.get(bookId);
        Member member = members.get(memberId);

        if (book != null && member != null) {
            member.returnBook(book);
            transactions.add(new Transaction(member, book, false));
        } else {
            System.out.println("Book or Member not found.");
        }
    }

    public void printBooks() {
        System.out.println("Books in Library:");
        for (Book book : books.values()) {
            System.out.println(book);
        }
    }

    public void printMembers() {
        System.out.println("Library Members:");
        for (Member member : members.values()) {
            System.out.println(member);
        }
    }

    public void printTransactions() {
        System.out.println("Transactions:");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
