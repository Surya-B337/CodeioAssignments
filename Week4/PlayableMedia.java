package Week4;

interface Playable{
    public  void play();
    public void pause();
}
class AudioPlayer implements Playable{

    public void play(){
        System.out.println("Play the Audio");
    }
    public void pause(){
        System.out.println("Audio Paused");
    }
}

class VideoPlayer implements Playable{

    public void play(){
        System.out.println("Play the Video");
    }
    public void pause(){
        System.out.println("Video Paused");
    }
}

class PlayableDemo{
    public static void main(String[] args) {
        Playable audioPlayer = new AudioPlayer();
        audioPlayer.play();
        audioPlayer.pause();
        System.out.println("-----------");
        Playable videoPlayer = new VideoPlayer();
        videoPlayer.play();
        videoPlayer.pause();
    }
}