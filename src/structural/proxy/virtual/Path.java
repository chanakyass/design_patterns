package structural.proxy.virtual;

import java.util.List;


public class Path {
    private String currentPosition;
    private String destinationPosition;
    private List<String> pathPoints;

    public Path(String currentPosition, String destinationPosition, List<String> pathPoints) {
        this.currentPosition = currentPosition;
        this.destinationPosition = destinationPosition;
        this.pathPoints = pathPoints;
    }

    public static Path generatePath(String source, String destination) {
        return new Path(source,destination,List.of("Start from "+source, "drive towards "+destination));
    }

    public String getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(String currentPosition) {
        this.currentPosition = currentPosition;
    }

    public String getDestinationPosition() {
        return destinationPosition;
    }

    public void setDestinationPosition(String destinationPosition) {
        this.destinationPosition = destinationPosition;
    }

    public List<String> getPathPoints() {
        return pathPoints;
    }

    public void setPathPoints(List<String> pathPoints) {
        this.pathPoints = pathPoints;
    }

    @Override
    public String toString() {
        return "Path{" +
                "currentPosition='" + currentPosition + '\'' +
                ", destinationPosition='" + destinationPosition + '\'' +
                ", pathPoints=" + pathPoints +
                '}';
    }
}
