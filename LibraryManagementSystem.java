public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding Books
        library.addBook(new Book(1, "The Color Purple", "Alice Walker"));
        library.addBook(new Book(2, "Things Fall Apart", "Chinua Achebe"));
        library.addBook(new Book(3, "Beloved", "Toni Morrison"));

        // Adding Members
        library.addMember(new Member(1, "Faith"));
        library.addMember(new Member(2, "Amani"));

        // Borrowing Books
        library.borrowBook(1, 1);
        library.borrowBook(2, 2);

        // Returning Books
        library.returnBook(1, 1);

        // Printing Library Details
        library.printBooks();
        library.printMembers();
        library.printTransactions();
    }
}
