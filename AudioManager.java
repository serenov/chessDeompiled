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
    public Player a;
    public boolean b = false;
    public Thread c;
    private VolumeControl e;
    public int d = 0;
    private int f;

    public AudioManager() {
        this.b();
    }

    private void b() {
        this.c = new Thread(this);
        this.c.start();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void run() {
        while (true) {
            AudioManager h2 = this;
            synchronized (h2) {
                try {
                    while (!this.b) {
                        this.wait();
                    }
                }
                catch (Exception exception) {}
            }
            try {
                h2 = this;
                synchronized (h2) {
                    this.b = false;
                    if (this.a != null) {
                        this.a(d.A);
                        this.a.setLoopCount(this.f);
                        this.a.prefetch();
                        this.a.start();
                    }
                    continue;
                }
            }
            catch (Exception exception) {
                continue;
            }
            break;
        }
    }

    public final void playerUpdate(Player player, String string, Object object) {
    }

    private void b(int n) {
        if (n == -1) {
            return;
        }
        try {
            if (this.a != null) {
                this.a.close();
                this.a = null;
            }
            InputStream inputStream = null;
            inputStream = this.getClass().getResourceAsStream("/snd/" + n);
            this.a = Manager.createPlayer((InputStream)inputStream, (String)"audio/midi");
            this.a.realize();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final synchronized void a(int n, boolean bl) {
        this.f = bl ? -1 : 1;
        try {
            this.a();
            this.b(n);
            this.b = true;
            this.notify();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void a(int n) {
        try {
            this.e = (VolumeControl)this.a.getControl("VolumeControl");
            if (this.e != null) {
                this.e.setLevel(n);
                this.d = 30 * n;
                if (this.d > 99) {
                    this.d = 0;
                }
                this.d = this.e.setLevel(this.d);
                return;
            }
        }
        catch (Exception exception) {}
    }

    public final void a() {
        try {
            if (this.a != null) {
                this.a.stop();
                return;
            }
        }
        catch (Exception exception) {}
    }
}

