package _26187_.q8;

public class Book extends Section {
    private String title;
    private String author;
    private String isbn;

    public Book(long id, String createdDate, String updatedDate, String libraryName, String location, String phoneNumber, String sectionName, String sectionCode, String title, String author, String isbn) throws LibraryDataException {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode);
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
    }

    public String getTitle() { return title; }
    public void setTitle(String title) throws LibraryDataException { if (title == null || title.trim().isEmpty()) throw new LibraryDataException("title must not be empty"); this.title = title.trim(); }

    public String getAuthor() { return author; }
    public void setAuthor(String author) throws LibraryDataException { if (author == null || author.trim().isEmpty()) throw new LibraryDataException("author must not be empty"); this.author = author.trim(); }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) throws LibraryDataException { if (isbn == null || isbn.trim().length() < 10) throw new LibraryDataException("ISBN must be at least 10 chars"); this.isbn = isbn.trim(); }
}
