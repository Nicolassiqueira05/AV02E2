import javax.sound.sampled.*;
import java.io.*;
import java.net.URL;

public class SoundPlayer {
    public void playSound(String input){
        try {
            URL url = this.getClass().getResource(input);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}
