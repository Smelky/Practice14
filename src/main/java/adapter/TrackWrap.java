package adapter;

public class TrackWrap implements Car {
    private Track track;

    public TrackWrap(Track track) {
        this.track = track;
    }

    public void wash() {
        track.clean();
    }
}
