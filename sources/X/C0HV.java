package X;

import android.media.MediaPlayer;
import com.whatsapp.util.Log;
import com.whatsapp.util.OpusPlayer;
import java.io.File;
import java.io.IOException;

/* renamed from: X.0HV */
/* loaded from: classes.dex */
public abstract class C0HV {
    public abstract int A01();

    public abstract int A02();

    public abstract void A03();

    public abstract void A04();

    public abstract void A05();

    public abstract void A06();

    public abstract void A07();

    public abstract void A08();

    public abstract void A09(int i);

    public abstract void A0A(MediaPlayer.OnErrorListener onErrorListener);

    public abstract boolean A0B();

    public abstract boolean A0C(float f, AbstractC000600i abstractC000600i);

    public static C0HV A00(File file, int i, C01B c01b) {
        if ((c01b == null || !c01b.A0E(C01C.A24) || !C0K7.A03()) && file.getAbsolutePath().endsWith(".opus")) {
            return new C0HV(file, i) { // from class: X.3sS
                public final OpusPlayer A00;

                @Override // X.C0HV
                public void A0A(MediaPlayer.OnErrorListener onErrorListener) {
                }

                @Override // X.C0HV
                public boolean A0C(float f, AbstractC000600i abstractC000600i) {
                    return false;
                }

                {
                    this.A00 = new OpusPlayer(file.getAbsolutePath(), i);
                }

                @Override // X.C0HV
                public int A01() {
                    try {
                        return (int) this.A00.getCurrentPosition();
                    } catch (IOException e) {
                        Log.e(e);
                        return 0;
                    }
                }

                @Override // X.C0HV
                public int A02() {
                    try {
                        return (int) this.A00.getLength();
                    } catch (IOException e) {
                        Log.e(e);
                        return 0;
                    }
                }

                @Override // X.C0HV
                public void A03() {
                    try {
                        this.A00.pause();
                    } catch (IOException e) {
                        Log.e(e);
                    }
                }

                @Override // X.C0HV
                public void A04() {
                    this.A00.prepare();
                }

                @Override // X.C0HV
                public void A05() {
                    this.A00.close();
                }

                @Override // X.C0HV
                public void A06() {
                    this.A00.resume();
                }

                @Override // X.C0HV
                public void A07() {
                    this.A00.start();
                }

                @Override // X.C0HV
                public void A08() {
                    try {
                        this.A00.stop();
                    } catch (IOException e) {
                        Log.e(e);
                    }
                }

                @Override // X.C0HV
                public void A09(int i2) {
                    this.A00.seek(i2);
                }

                @Override // X.C0HV
                public boolean A0B() {
                    try {
                        return this.A00.isPlaying();
                    } catch (IOException e) {
                        Log.e(e);
                        return false;
                    }
                }
            };
        }
        C38051nT c38051nT = new C38051nT(i);
        c38051nT.A00.setDataSource(file.getAbsolutePath());
        return c38051nT;
    }
}
