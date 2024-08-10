package AdapterPattern;

public class Mp4Player implements AdvancedMediaPlayer {

    /*
    Create concrete classes implementing the AdvancedMediaPlayer interface.
     */

    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }

}
