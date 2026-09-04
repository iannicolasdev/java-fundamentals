public class EnumExample {

    enum Status {
        PAID(200),
        PENDING(300),
        CANCELED(400);

        private final int id;

        Status(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }
    }

    public static void main(String[] args) {

        Status status = Status.CANCELED;

        String message = switch (status) {
            case PAID -> "Order paid.\nStatus: " + status.getId();
            case PENDING -> "waiting for payment.\nStatus: " + status.getId();
            case CANCELED -> "Order canceled.\nStatus: " + status.getId();
        };

        System.out.println(message);
    }
}