package drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterator<Component>{ //Pharmacy является теперь итератором
    
    private List<Component> components;
    private int index;


    public Pharmacy(){
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public Pharmacy addComponents(Component item){
        components.add(item);
        return this;
    }

	@Override
	public boolean hasNext() {
		return index < components.size();
	}

	@Override
	public Component next() {
		return components.get(index++);
	}


}
