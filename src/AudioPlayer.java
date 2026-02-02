public class AudioPlayer implements MediaPlayer {
    @Override
    public void play() {
        System.out.println("AudioPlayer is playing.");
    }

    @Override
    public void pause() {
        System.out.println("AudioPlayer is paused.");
    }

    @Override
    public void stop() {
        System.out.println("AudioPlayer has stopped.");
    }
    
}
