/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.media.Manager
 *  javax.microedition.media.Player
 *  javax.microedition.media.PlayerListener
 *  javax.microedition.media.control.VolumeControl
 */
import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;

public final class AudioManager
extends Thread
implements PlayerListener {

    public Player soundPlayer;
    public boolean isResourceAvailable = false; // Mutex lock for thread synchronization

    public Thread audioThread;
    private VolumeControl volumeController;

    public int soundLevelScaled = 0;
    private int loopCount; 

    public AudioManager() {
        this.startAudioThread();
    }

    private void startAudioThread() {
        this.audioThread = new Thread(this);
        this.audioThread.start();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void run() {
        while (true) {
            AudioManager h2 = this;
            synchronized (h2) {
                try {
                    while (!this.isResourceAvailable) {
                        this.wait();
                    }
                }
                catch (Exception exception) {}
            }
            try {
                h2 = this;
                synchronized (h2) {
                    this.isResourceAvailable = false;
                    if (this.soundPlayer != null) {
                        this.setVolumeLevel(Constants.soundVolumeLevel);
                        this.soundPlayer.setLoopCount(this.loopCount);
                        this.soundPlayer.prefetch();
                        this.soundPlayer.start();
                    }
                    continue;
                }
            }
            catch (Exception exception) {
                continue;
            }
        }
    }

    public final void playerUpdate(Player player, String string, Object object) {
    }

    private void loadSoundById(int soundSerialId) {
        if (soundSerialId == -1) {
            return;
        }
        try {
            if (this.soundPlayer != null) {
                this.soundPlayer.close();
                this.soundPlayer = null;
            }

            InputStream inputStream = this.getClass().getResourceAsStream("/snd/" + soundSerialId);
            this.soundPlayer = Manager.createPlayer(inputStream, "audio/midi");
            this.soundPlayer.realize();

            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final synchronized void playSoundByResouceId(int soundSerialId, boolean loopSound) {
        this.loopCount = loopSound ? -1 : 1;
        try {
            this.stopSound();
            this.loadSoundById(soundSerialId);
            this.isResourceAvailable = true;
            this.notify();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void setVolumeLevel(int level) {
        try {
            this.volumeController = (VolumeControl)this.soundPlayer.getControl("VolumeControl");

            if (this.volumeController != null) {

                this.volumeController.setLevel(level); // what is the point of this? it is anyways getting set below

                this.soundLevelScaled = 30 * level;

                if (this.soundLevelScaled > 99) {

                    this.soundLevelScaled = 0;
                }

                this.soundLevelScaled = this.volumeController.setLevel(this.soundLevelScaled);

                return;
            }
        }
        catch (Exception exception) {}
    }

    public final void stopSound() {
        try {
            if (this.soundPlayer != null) {
                this.soundPlayer.stop();
                return;
            }
        }
        catch (Exception exception) {}
    }
}

