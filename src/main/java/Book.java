import javax.persistence.*;
import java.security.Identity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Book {                     //Q14.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;

    String bookName;

//    public Author getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(Author author) {
//        this.author = author;
//    }



//    @ManyToOne
//    Author author;

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    @ManyToMany
    List<Author> author=new ArrayList<Author>();

    public void setbookname(String bookName) {
       this.bookName = bookName;
    }


}

