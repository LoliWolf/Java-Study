package t4;

import java.util.Optional;

public class demo {
    public static void main(String[] args) {
        operator ao=new operator();
        cat c=new cat();
        ao.use(c);
        dog d=new dog();
        ao.use(d);
    }
}
