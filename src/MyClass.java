public class MyClass {
    public String divide(int w){
        if(w<1 || w>100)
            throw new IllegalArgumentException("weight out of bounds");
        else{
            if(w % 2 == 0)
                return "yes";
            else
                return "no";
        }
    }
}
