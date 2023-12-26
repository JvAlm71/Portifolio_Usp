package Controler;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import java.io.Serializable;
import java.io.FileNotFoundException;

public class SoundPlayer implements Serializable {
    transient SoundPlayer soundPlayer; // Marked transient, so it won't be serialized

    public void playSound(String soundFileName, boolean loop, float volume) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource(soundFileName));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);

            FloatControl volumeControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

            // Definir o volume. O valor deve estar dentro do intervalo mínimo e máximo.
            float min = volumeControl.getMinimum();
            float max = volumeControl.getMaximum();
            volume = Math.max(min, Math.min(max, volume));
            volumeControl.setValue(volume);

            if (loop) {
                clip.loop(Clip.LOOP_CONTINUOUSLY); // Para fazer o áudio tocar em loop
            }
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}