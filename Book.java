class Book {
    String title;
    String author;
    int publicationYear;

    // Default constructor
    Book() {
        this.title = "Untitled";
        this.author = "Unknown Author";
        this.publicationYear = -1;
    }

    // Constructor with title and author
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.publicationYear = -1;
    }

    // Constructor with title, author, and publication year
    Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + 
            (publicationYear != -1 ? ", Year: " + publicationYear : ""));
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = new Book("The Hobbit", "J.R.R. Tolkien", 1937);

        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();
    }
}
