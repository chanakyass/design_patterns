package structural.proxy.virtual;

public class GPSPathFinderProxy implements GPSPathFinder{
    private GPSPathFinder gpsPathFinder;

    @Override
    public Path findPath(String currentLocation, String destinationLocation) {
        if(gpsPathFinder == null){
            gpsPathFinder = new GPSPathFinderImpl();
        }
        return gpsPathFinder.findPath(currentLocation, destinationLocation);
    }
}
