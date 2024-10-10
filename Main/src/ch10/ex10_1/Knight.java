package ch10.ex10_1;

public class Knight extends Novice {
    int Stamina;

    void Slash() {
        System.out.printf("%s(HP: %d,Stamina: %d)의 S L A S H", name, Hp, Stamina);
    }
}
