import java.util.*;
import java.lang.*;

interface vi0{
    abstract void vid();
}

class vi1 implements vi0{
    // @Override
    @Override public void vid(){
        System.out.println("Hello i am overrided");
    }

    public static void main(String[] args){
        vi0 v = new vi1();
        v.vid();
    }
}