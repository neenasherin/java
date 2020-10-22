import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestComparable {
  
  static class Student implements Comparable<Student> {
    private int id;
    private String name;
  
    public Student(int id, String name) {
      this.id = id;
      this.name = name;
    }

    public int getId() {
      return id;
    }
    public String getName() {
      return name;
    }

    public void setId(int id) {
      this.id = id;
    }

    public void setName(String name) {
      this.name = name;
    }
    
    public int compareTo(Student s) {
      return id > s.id ? 1 : (id < s.id ? -1 : 0);

    }

    @Override
    public String toString() {
      return id + " -  " + name;
    }
  }




  static class StudentAscComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return s1.id > s2.id ? -1 : (s1.id < s2.id ? 1 : 0);
	}
    
  }

  public static void main(String a[]) {

    Student s1 = new Student(1, "a");
    Student s2 = new Student(2, "b");


    SortedSet<Student> s = new TreeSet<>();
    s.add(s1);
    s.add(s2);
    
    s.forEach(System.out::println);
    
    SortedSet<Student> ss2 = new TreeSet<>(new StudentAscComparator());
    ss2.addAll(s);

    ss2.forEach(System.out::println);

    List<Student> l = new ArrayList<>(s);
    Collections.sort(l, new StudentAscComparator());
    l.forEach(System.out::println);
  }  
}
