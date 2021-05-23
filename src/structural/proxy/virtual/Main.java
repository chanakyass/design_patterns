package structural.proxy.virtual;

/*
Definition: Structural design pattern that created a proxy for an target object to get access to functionality of the object
instead of creating the object directly. The proxy has direct access to the target object and can call the functionality on the
clients behalf

Problems solved:
1) Virtual Proxy: The target object initialization could be time taking but the functionality it offers may not be used that often.
In this case we create the proxy on demand providing lazy initialization.
2)Remote Proxy: The original object is not of the clients namespace and it resides remotely. There are a lot of operations it offers and
you could pipeline them before making the actual call which does all your work in one shot.
3)Protection Proxy: When we want to add a layer of security to the original underlying object to provide controlled access based on access rights of the client.

Key points: Creating a proxy object that composes of target object where proxy mimics target object.

 */

public class Main {
    public static void main(String[] args) {
        GPSPathFinderProxy proxy = new GPSPathFinderProxy();
        System.out.println(proxy.findPath("Mumbai", "hyderabad"));
    }
}
