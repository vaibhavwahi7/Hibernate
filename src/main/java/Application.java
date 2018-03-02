    import org.hibernate.Session;
    import org.hibernate.SessionFactory;
    import org.hibernate.cfg.Configuration;

    import java.text.ParseException;
    import java.util.*;


    public class Application {
    public static void main(String[] args) throws ParseException {


    Configuration configuration = new Configuration();
        SessionFactory sessionFactory =configuration.configure().buildSessionFactory();
       Session session=sessionFactory.openSession();
        session.beginTransaction();

//        Author author=new Author();
//        author.setfirstName("Vaibhav");
//        author.setlastName("Wahi");
//        author.setage(24);
//        author.setdob(new Date(12-10-1994));
//
//
//
//
//
//        session.save(author);

//        Author author1=new Author();
//
//        author1.setfirstName("Vd");
//        author1.setlastName("Indeevar");
//        author1.setage(24);
//        List<String> sub=new ArrayList<>();
//        sub.add("Hindi");
//        author1.setsubject(String.valueOf(sub));
//        Date dob=new SimpleDateFormat("yyyy-mm-dd").parse("1995-04-02");
//        author1.setdob(dob);                         //Q3. Date
//        Book book=new Book();
//        Book book1=new Book();
//        book.setbookname("xyz");
//        book1.setbookname("abc");
//ArrayList<Book> bookArrayList=new ArrayList<>();
//        bookArrayList.add(book);
//        bookArrayList.add(book1);
//        author1.setAddBook(bookArrayList);
//        session.save(book1);
//        session.save(book);
//      session.save(author1);


// 16-Q2       Author author=new Author();
//        author.setfirstName("Harsh");
//        author.setlastName("Mehta");
//        author.setage(24);
//        Book book=new Book();
//        book.setbookname("SeaBed");
//        book.setAuthor(author);
//        Book book2=new Book();
//        book2.setAuthor(author);
//        book2.setbookname("Bike");
//        author.getAddBook().add(book);
//        author.getAddBook().add(book2);
//        session.save(author);
//        session.save(book);
//        session.save(book2);


        //17Q

        List<Author> auth=new ArrayList<Author>();
        Author a1=new Author();
        Author a2=new Author();
        a1.setfirstName("Vaibhav");
        a1.setage(23);
        a2.setfirstName("Harsh");
        a2.setage(25);

        auth.add(a1);
        auth.add(a2);
        List<Book> book=new ArrayList<Book>();
        Book b1= new Book();
        Book b2=new Book();
        b1.setbookname("Java");
        b2.setbookname("Hibernate");

        book.add(b1);
        book.add(b2);
        a1.getAddBook().add(b1);
        a2.getAddBook().add(b1);
        b1.getAuthor().add(a2);
        a1.getAddBook().add(b2);
        a2.getAddBook().add(b2);
        b2.getAuthor().add(a1);

session.save(a1);
session.save(a2);
session.save(b1);
session.save(b2);

          //Author data=session.get(Author.class,1); //Q2. Read
//        Author upd=session.get(Author.class,2);
//        upd.setfirstName("Rahul");
//        session.update(upd);                        //Q2. Update
//        Author del=session.get(Author.class,1);
//
//        session.delete(del);                        //Q2. Delete

//        Author author2=new Author();
//        author2.setfirstName("Ajay");
//        author2.setlastName("Jodha");
//        author2.setage(23);
//        dob=new SimpleDateFormat("yyyy-mm-dd").parse("1995-04-02");
//        author2.setdob(dob);
//        List<String> sub2=new ArrayList<>();
//        sub2.add("English");
//        author2.setsubject(String.valueOf(sub2));
//
//
//        Book book1=new Book();
//        book1.setbookname("Car");
//        Book book2=new Book();
//        book2.setbookname("Bike");
//        author2.getAddBook().add(book1);
//        author2.getAddBook().add(book2);


//Q11.

//        Address address=new Address();
//        address.setStreetNumber("621-RajPur");
//        address.setLocation("Delhi");
//        address.setState("Delhi");
//        author2.setAddress(address);
//        session.persist(author2);
//

// Q13.

//        Author author3=new Author();
//        author3.setfirstName("Akash");
//        author3.setlastName("Singh");
//        author3.setage(23);
//        dob=new SimpleDateFormat("yyyy-mm-dd").parse("1991-04-02");
//        author3.setdob(dob);
//        List<String> sub3=new ArrayList<>();
//        sub3.add("French");
//        author3.setsubject(String.valueOf(sub3));
//
//        session.persist(author3);
//
//        Author author4=new Author();
//        author4.setfirstName("Vaibhav");
//        author4.setlastName("Seth");
//        author4.setage(24);
//        dob=new SimpleDateFormat("yyyy-mm-dd").parse("1995-04-02");
//        author4.setdob(dob);
//        List<String> sub4=new ArrayList<>();
//        sub4.add("Sanskrit");
//        author4.setsubject(String.valueOf(sub4));
//        session.persist(author4);
//
//        Author author5=new Author();
//        author5.setfirstName("Aman");
//        author5.setlastName("Aggarwal");
//        author5.setage(23);
//        dob=new SimpleDateFormat("yyyy-mm-dd").parse("1995-04-02");
//        author5.setdob(dob);
//        List<String> sub5=new ArrayList<>();
//        sub5.add("Hindi");
//        author5.setsubject(String.valueOf(sub5));
//        session.persist(author5);
//


//Q12.


//     List<String> sub1=new ArrayList<>();
//     sub1.add("Hindi");
//     author.setSubject(String.valueOf(sub1));

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
//        System.out.println("Data is:- "+data);
//        System.out.println("Updated Data is:- "+upd);

    }
}
