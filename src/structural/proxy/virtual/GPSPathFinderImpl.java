package structural.proxy.virtual;

public class GPSPathFinderImpl implements GPSPathFinder{

    public GPSPathFinderImpl() {
        //Connecting to a lot of remote servers. Takes time.
    }

    @Override
    public Path findPath(String currentLocation, String destinationLocation) {
        return Path.generatePath(currentLocation, destinationLocation);
    }
}
