public class BillPughSingletion {
    // Private constructor to prevent instantiation from other classes
    private BillPughSingletion() { }

    // Static inner helper class responsible for holding the singleton instance
    private static class Holder {
        // The singleton instance is created when the SingletonHelper class is loaded
        private static final BillPughSingletion INSTANCE = new BillPughSingletion();
    }

    // Public method to provide access to the singleton instance
    public static BillPughSingletion getInstance() {
        return Holder.INSTANCE;
    }

    /*
     * Bill Pugh Singleton Pattern:
     * In the Bill Pugh singleton pattern, the singleton instance is created using a static inner helper class.
     * This approach leverages the class loading mechanism to ensure that the instance is created only when the inner class is loaded.
     * It provides a thread-safe and efficient way to implement the singleton pattern without requiring explicit synchronization.
     */
}
