package ex8.ex8_1.ex8_5;

public class Student {
    //공유(static)영역 할당: Class변수
    static int count = 0;
    //힙(Heap{Non-static}) 영역 할당:인스턴스 변수
    int id;
    String name;

    Student(int _id, String _name) {
        Student.count++;
        this.id=_id;
        this.name=_name;
    }
}
