import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StudentManagement implements  Management{

    @Override
    public void displayStudents(List<Etudiant> students, Consumer<Etudiant> con) {
    for(Etudiant e: students){
        con.accept(e);
    }
    }

    @Override
    public void displayStudentsByFilter(List<Etudiant> students, Predicate<Etudiant> pre, Consumer<Etudiant> con) {
        for(Etudiant e: students){
            if (pre.test(e))
            con.accept(e);
        }
    }

    @Override
    public String returnStudentsNames(List<Etudiant> students, Function<Etudiant, String> fun) {
        String names = "";
        for(Etudiant e: students){
            names+=fun.apply(e);
        }
        return names;
    }

    @Override
    public Etudiant createStudent(Supplier<Etudiant> sup) {
        return sup.get();
    }

    @Override
    public List<Etudiant> sortStudentsById(List<Etudiant> students, Comparator<Etudiant> com) {
        List<Etudiant> a = new ArrayList<>((Collection) com);
        a.addAll(students);
        return a;
    }

    @Override
    public Stream<Etudiant> convertToStream(List<Etudiant> students) {
        return null;
    }
}
