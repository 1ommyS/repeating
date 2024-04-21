public class ArrayListCustom<Type> {
    private Type[] elements;
    private int size; // реальный
    private int capacity; // максимальный

    public ArrayListCustom(int capacity) {
        this.capacity = capacity;
        size = 0;
        elements = (Type[]) new Object[capacity];
    }

    public void add(Type newElement) {
        if (size == capacity)
            resize();

        elements[size++] = newElement;
    }

    public void add(int index, Type newElement) {

    }

    private void resize() {
        Type[] newArray = (Type[]) new Object[capacity * 2];

        for (int i = 0; i < capacity; i++) {
            newArray[i] = elements[i];
        }

        capacity = capacity * 2;

        elements = newArray;
    }

    @Override
    public String toString() {
        String s = "[";

        for (int i = 0; i < size; i++) {
            s += elements[i] + ", ";
        }
        s += "]";

        return s;
    }

    public Type get(int index) {
        if (index < 0 || index >= capacity)
            throw new IndexOutOfBoundsException();

        return elements[index];
    }

    public int getIndex(Type element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element))
                return i;
        }

        return -1;
    }
}
