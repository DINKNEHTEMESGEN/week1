public class Rental {
    private int date;
    private Person person;
    private Book book;

    public Rental(int date, Person person, Book book) {
        this.date = date;
        this.person = person;
        this.book = book;
    }


    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Person getPerson() {
        return person;
    }

    public Book getBook() {
        return book;
    }
}
