public class StreamingPlayer implements MediaPlayer {
    @Override
    public void play() {
        System.out.println("StreamingPlayer is playing.");
    }

    @Override
    public void pause() {
        System.out.println("StreamingPlayer is paused.");
    }

    @Override
    public void stop() {
        System.out.println("StreamingPlayer has stopped.");
    }
    
}
