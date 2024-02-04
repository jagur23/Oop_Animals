package drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PharmacyIterable implements Iterable<Component>, Comparable<PharmacyIterable>{
    
    private List<Component> components;
    private int index;
	private int size = 0;


    public PharmacyIterable(){
        this.components = new ArrayList<>();
        this.index = 0;
    }

    public PharmacyIterable addComponents(Component item){
		size++;
        components.add(item);
        return this;
    }

	public int getSize(){
		return size;
	}

	public Component getComponent(int index){
		return components.get(index);
	}

	public List<Component> getComponents() {
		return components;
	}

	@Override
	public Iterator<Component> iterator() {
		return new Iterator<Component>() { // создание анонимного класса, так как пытаемся создать наследника от абстрактного класса

			@Override
			public boolean hasNext() {
				return index < components.size();
			}

			@Override
			public Component next() {
				return components.get(index++);
			} 
        };

		//return new MyIterator(this);
	}

    public int getIndex() {
        return index;
    }

	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public int compareTo(PharmacyIterable components) {
		//if(this.components.size() > components.getSize()) return 1;
		//else if(this.components.size() < components.getSize()) return -1;
		//else return 0;

		return Integer.compare(this.components.size(), components.getSize());
	}

	@Override
	public String toString() {
		return components.toString();
	}
}
