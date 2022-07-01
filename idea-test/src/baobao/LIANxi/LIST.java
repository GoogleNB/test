package baobao.LIANxi;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LIST {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();

        objects.add(0,"哈哈");
        objects.add(1,1);
        objects.add(2,"集合");
        objects.add(3,true);
        objects.forEach(new Consumer<Object>() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }


        });

    }
}
