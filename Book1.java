public class Book1 {
    private String title;
    private String author;
    private int numOfPages;


    public Book1() {
        System.out.println("the Book1 no param constr called");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public Book1(String title, String author, int numOfPages) {
        this.title = title;
        this.author = author;
        this.numOfPages = numOfPages;
    }

    public void show()
    {
        System.out.println(this.title+ "  "+this.author);
    }



}
