package this_is_java.ch12.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        Student s1 = new Student(1, "홍길동");
        hashSet.add(s1);

        Student s2 = new Student(1, "홍길동");
        hashSet.add(s2);

        Student s3 = new Student(2, "홍길동");
        hashSet.add(s3);

        System.out.println("저장된 객체 수: "+ hashSet.size());
    }
}
