public class VideoPlayer implements MediaPlayer {
    @Override
    public void play() {
        System.out.println("VideoPlayer is playing.");
    }

    @Override
    public void pause() {
        System.out.println("VideoPlayer is paused.");
    }

    @Override
    public void stop() {
        System.out.println("VideoPlayer has stopped.");
    }
    
}
