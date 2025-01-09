package java_bootcamp.part_2.exceptions;

public class J00_CheckedExceptions {

    public static void main(String[] args) {

       exception();

       //throws ile handle edersek geçici çözüm bulmuş oluruz
        // fakat try/catch ile handle edersek garanti çözüm bulmuş oluruz

    }

    public static void exception(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
