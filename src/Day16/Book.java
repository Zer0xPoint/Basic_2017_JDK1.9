package Day16;

public class Book {
    private String title;
    private int pages;
    private double price;

    public Book() {
    }

    public Book(String title, int pages, double price) {
        this.title = title;
        this.pages = pages;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void show() {
        System.out.println(this.title + " " + this.pages + " " + this.price);
    }
}

class BookTestDrive {
    public static void main(String[] args) {
        Book book1 = new Book("HarryPotter", 265, 59.9);
        book1.show();
    }
}
