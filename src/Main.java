public class Main {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();
        MediaPlayer videoPlayer = new VideoPlayer();
        MediaPlayer streamingPlayer = new StreamingPlayer();

        audioPlayer.play();
        audioPlayer.pause();
        audioPlayer.stop();

        videoPlayer.play();
        videoPlayer.pause();
        videoPlayer.stop();

        streamingPlayer.play();
        streamingPlayer.pause();
        streamingPlayer.stop();
    }
}
