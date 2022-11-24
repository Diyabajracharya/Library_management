
import model.books;
import model.students;
import model.borrowing;
public class main {

public static void main(String[] args) {

        students student1 = new students("joe",12,5);
        students student2 = new students("Sam",11,6);
        students student3 = new students("ken",10,7);
        books book1 = new books("J.k Rowling","Harry Potter",12345,1990);
        books book2 = new books("Ram","Ikigai",12346,1991);
        borrowing first = new borrowing(1,10,2,500);
        borrowing second = new borrowing(2,15,0,400);
        borrowing third = new borrowing(3,16,5,900);

        book1.books_format();
        book2.books_format();
        student1.students_format();
        student2.students_format();
        student3.students_format();
        first.fine_rate();
        second.fine_rate();
        third.fine_rate();
        }
}