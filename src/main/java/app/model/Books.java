package app.model;

public class Books {
    public Books() {

    }
    public Books(int bookId, String title, Integer authorId, Authors authorsByAuthorId) {
        this.bookId = bookId;
        this.title = title;
        this.authorId = authorId;
        this.authorsByAuthorId = authorsByAuthorId;
    }

    private int bookId;
    private String title;
    private Integer authorId;
    private Authors authorsByAuthorId;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Books books = (Books) o;

        if (bookId != books.bookId) return false;
        if (title != null ? !title.equals(books.title) : books.title != null) return false;
        if (authorId != null ? !authorId.equals(books.authorId) : books.authorId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bookId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (authorId != null ? authorId.hashCode() : 0);
        return result;
    }

    public Authors getAuthorsByAuthorId() {
        return authorsByAuthorId;
    }

    public void setAuthorsByAuthorId(Authors authorsByAuthorId) {
        this.authorsByAuthorId = authorsByAuthorId;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", authorId=" + authorId +
                ", authorsByAuthorId=" + authorsByAuthorId +
                '}';
    }
}
