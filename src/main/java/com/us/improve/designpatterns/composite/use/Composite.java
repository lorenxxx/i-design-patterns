package com.us.improve.designpatterns.composite.use;

import java.util.ArrayList;

/**
 * Created by Loren on 2018/11/6.
 */
public class Composite extends Component {

    public Iterator iterator = null;

    public ArrayList<Component> list = new ArrayList();

    public Composite(Iterator iterator){
        this.iterator = iterator;
    }

    @Override
    public void print(){
        while (iterator != null && iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (Component component : list) {
            component.print();
        }
    }

}
