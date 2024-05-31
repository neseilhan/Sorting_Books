import java.util.Date;

 class Books implements Comparable<Books>{
    public String title;
    public int pages;
    public String author;
    public Date publicationDate;

     public Books(String title, int pages, String author, Date publicationDate) {
         this.title = title;
         this.pages = pages;
         this.author = author;
         this.publicationDate = publicationDate;
     }

     public Date getPublicationDate() {
         return publicationDate;
     }

     public void setPublicationDate(Date publicationDate) {
         this.publicationDate = publicationDate;
     }

     public String getAuthor() {
         return author;
     }

     public void setAuthor(String author) {
         this.author = author;
     }

     public int getPages() {
         return pages;
     }

     public void setPages(int pages) {
         this.pages = pages;
     }

     public String getTitle() {
         return title;
     }

     public void setTitle(String title) {
         this.title = title;
     }

     @Override
     public String toString() {
         return "Books{" +
                 "title='" + title + '\'' +
                 ", pages=" + pages +
                 ", author='" + author + '\'' +
                 ", publicationDate=" + publicationDate +
                 '}';
     }

     @Override
     public int compareTo(Books o) { //sort by title
         return this.title.compareTo(o.title);
     }
 }
