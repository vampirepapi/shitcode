public class SynchronizedLazyLoading {
    // Private static instance of the class, initialized to null
    private static SynchronizedLazyLoading instance;

    // Private constructor to prevent instantiation from other classes
    private SynchronizedLazyLoading() {}

    // Public synchronized method to provide access to the instance
    public static synchronized SynchronizedLazyLoading getInstance() {
        if (instance == null) {
            instance = new SynchronizedLazyLoading();
        }
        return instance;
    }

    /*
     * Synchronized Lazy Loading Singleton Pattern:
     * In the synchronized lazy loading singleton pattern, the singleton instance is created only when it is needed for the first time.
     * This approach ensures thread safety by synchronizing the method that provides access to the instance.
     * While this guarantees that only one instance is created in a multi-threaded environment, it may introduce performance overhead due to synchronization.
     */

}
