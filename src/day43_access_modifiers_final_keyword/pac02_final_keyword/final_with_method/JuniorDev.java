package day43_access_modifiers_final_keyword.pac02_final_keyword.final_with_method;

public class JuniorDev extends SeniorDev{


    @Override
    public void seniorCode() {
        System.out.println("Junior Code");
    }


    //inherite edebildik fakat Parent class da final ile korunduğundan Override edilemedi
    /*
    @Override
    public void doNotChange() {
        System.out.println("Değiştirdim");
    }
    */
}
