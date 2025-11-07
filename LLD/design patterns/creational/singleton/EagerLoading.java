public class EagerLoading {
    // Private static final instance of the class, created at the time of class loading
    private static final EagerLoading instance = new EagerLoading();

    // Private constructor to prevent instantiation from other classes
    private EagerLoading() {}

    // Public method to provide access to the instance
    public static EagerLoading getInstance() {
        return instance;
    }

    /*
     * Eager Loading Singleton Pattern:
     * In the eager loading singleton pattern, the singleton instance is created at the time of class loading.
     * This approach ensures that the instance is available immediately when needed, but it may lead to resource wastage if the instance is never used.
     * This pattern is thread-safe without requiring additional synchronization mechanisms.
     */

}
