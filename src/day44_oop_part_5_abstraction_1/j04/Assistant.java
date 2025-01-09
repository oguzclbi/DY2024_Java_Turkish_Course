package day44_oop_part_5_abstraction_1.j04;
                    //concrate class
public abstract class Assistant extends Manager {
    
    //Şu an içinde bulunduğumuz class Manager classının concrate classıdır

    /*yukarıda classımızı abstract ettik dolayısıyla müdürün 
    koymuş olduğu kuraldan muaf olduk. yani istersek müdürün 
    abstract metodlarını implemente etmek zorunda değiliz çünkü 
    Assistant classı da artık Abstact bir class ve dolayısıyla
    extend ettiği abstact classın kurallarını implamete etmekten muaf hale geldi.
    Ayrıca Assistant classı da abstract olduğu için artık
    bu class da yeni kurallar koyabilir.
     */
    
    
    /*
    @Override
    public void enterTimeAtEight() {
        System.out.println("Eight");
    }
    */
    
    public abstract void doNotSmoke();
    
    
    
    
    
}
