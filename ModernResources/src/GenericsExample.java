public class GenericsExample {

    public static class Box<T> {

        private final T object;

        public Box(T object) {
            this.object = object;
        }

        public T getObject() {
            return object;
        }
    }

    public static void main(String[] args) {

        Box<Integer> object1 = new Box<>(100);
        Box<String> object2 = new Box<>("Object");
        Box<Boolean> object3 = new Box<>(true);

        System.out.println(object1.getObject());
        System.out.println(object2.getObject());
        System.out.println(object3.getObject());

    }
}
