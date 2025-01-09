package day49_exception_part_2;

public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException(String message) {
        super(message);
    }

    public StudentNotFoundException() {
        super("Öğrenci Bulunamadı;"); //parametresiz cons kullanılırsa orjinal mesaj olarak ayarlandı.
    }
}
