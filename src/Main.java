import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Etudiant> e = new ArrayList<>();
        e.add(new Etudiant(1,"marwan",15));
        e.add(new Etudiant(2,"aziz",22));
        e.add(new Etudiant(3,"ahmed",17));
        e.add(new Etudiant(4,"nour",18));
        e.add(new Etudiant(5,"sami",12));
        StudentManagement st = new StudentManagement();
        st.displayStudents(e, etudiant-> {
            System.out.println(etudiant);
        });
        st.displayStudentsByFilter(e,etudiant -> {return etudiant.getAge()<18;},etudiant-> {
            System.out.println(etudiant);
        });
        System.out.println(st.returnStudentsNames(e,etudiant-> etudiant.getNom()));
        st.createStudent(()->new Etudiant(15,"xxxx",22));

    }
}