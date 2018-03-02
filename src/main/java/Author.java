import javax.persistence.*;
import javax.security.auth.Subject;
import java.util.*;

@Entity

public class Author {                                //Q1.

@Id
//@GeneratedValue(strategy = GenerationType.TABLE)    //Q9.
  @GeneratedValue(strategy = GenerationType.IDENTITY)   //Q9.
Integer id;


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Embedded
Address address;                                 //Q11.


    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    @ElementCollection
    List<String> subject=new ArrayList<>();


    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", addBook=" + addBook +
                '}';
    }




    @Column       //Q6.


    String firstName;                          //Q1.

    @Column
    @Transient    //Q7.
    String lastName;                           //Q1.

    @Column
    Integer age;

    @Column
    @Temporal(TemporalType.DATE)               //Q8.
    Date dob;
 //  @OneToOne(cascade = CascadeType.ALL)                   //15Q.
 //   @JoinColumn(name="BookId")
//    Book book;
//
//    public void setbook(Book book) {
//        this.book = book;
//    }





    /* public List<Book> getCollections()
            {

                return bookCollections;
            }


                public List<Book> getBookCollections() {
                    return bookCollections;
                }

                public void setBookCollections(List<Book> bookCollections) {
                    this.bookCollections = bookCollections;
                }
            */

//    public void setAddBook(Collection<Book> addBook) {
//        this.addBook = addBook;
//    }

  //  public Collection<Book> getAddBook() {
//        return addBook;
//    }

 //   @OneToMany                                          //Q16.
 //   Collection<Book> addBook= new HashSet<Book>();

    public List<Book> getAddBook() {
        return addBook;
    }

    public void setAddBook(List<Book> addBook) {
        this.addBook = addBook;
    }

    @ManyToMany                                    //17Q
    List<Book> addBook= new ArrayList<Book>();


//   @OneToMany(mappedBy="author")         //16Q-3
//       Collection<Book> addBook= new HashSet<Book>();



//    public List<Book> getAddBook() {
//        return addBook;
//    }
//
//    public void setAddBook(List<Book> addBook) {
//        this.addBook = addBook;
//    }
//
//    @OneToMany
//    List<Book> addBook= new ArrayList<>();                  //16




    public void setfirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setlastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setage(int age)
    {
        this.age = age;
    }

    public void setdob(Date dob)
    {
        this.dob = dob;

    }





}
