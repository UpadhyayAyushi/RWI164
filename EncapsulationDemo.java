package RWIPrograms;

class Book {
    private String title;
    private boolean isAvailable;

    public Book(String title) {
        this.title = title;
        this.isAvailable = true; // Initially, the book is available.
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void checkout() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully checked out the book: " + title);
        } else {
            System.out.println("Sorry, the book is currently checked out.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Thank you for returning the book: " + title);
        } else {
            System.out.println("The book is already available in the library.");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Create book objects
        Book book1 = new Book("Introduction to Java");
        Book book2 = new Book("Python Programming");
        Book book3 = new Book("Data Structures and Algorithms");

        // Check the availability of a book
        System.out.println("Availability of 'Introduction to Java': " + book1.isAvailable());
        System.out.println("Availability of 'Python Programming': " + book2.isAvailable());
        System.out.println("Availability of 'Data Structures and Algorithms': " + book3.isAvailable());

        // Checkout and return a book
        book1.checkout();
        book2.checkout();
        book2.returnBook();
    }
}
