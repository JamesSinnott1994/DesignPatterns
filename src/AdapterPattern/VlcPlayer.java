package AdapterPattern;

public class VlcPlayer implements AdvancedMediaPlayer {

    /*
    Create concrete classes implementing the AdvancedMediaPlayer interface.
     */

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }

}
