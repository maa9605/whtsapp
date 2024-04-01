package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import com.whatsapp.videoplayback.ExoPlaybackControlView;
import java.io.File;

/* renamed from: X.2Ge */
/* loaded from: classes2.dex */
public abstract class AbstractC48662Ge {
    public InterfaceC73103b6 A00;
    public InterfaceC73113b7 A01;
    public InterfaceC73123b8 A02;
    public InterfaceC73133b9 A03;
    public InterfaceC73143bA A04;

    public static AbstractC48662Ge A00(C018508q c018508q, InterfaceC002901k interfaceC002901k, C02E c02e, C002301c c002301c, Context context, File file, boolean z, boolean z2, boolean z3) {
        if (!z2 || !A01()) {
            String absolutePath = file.getAbsolutePath();
            if (!z3) {
                return new C84123tE(context, absolutePath, z);
            }
            return new C84113tD(context, absolutePath, z);
        }
        C48652Gd c48652Gd = new C48652Gd(c018508q, interfaceC002901k, c02e, C018308n.A00(context), true, (C83943sw) null, (AbstractC73093b5) null, z3);
        c48652Gd.A07 = Uri.fromFile(file);
        c48652Gd.A0I = z;
        c48652Gd.A0H();
        c48652Gd.A0F = true;
        return c48652Gd;
    }

    public static boolean A01() {
        return !C0K7.A02();
    }

    public int A02() {
        if (this instanceof C84123tE) {
            return ((C84123tE) this).A00.getCurrentPosition();
        }
        if (this instanceof C84113tD) {
            return ((C84113tD) this).A00.getCurrentPosition();
        }
        if (this instanceof C83973sz) {
            throw new UnsupportedOperationException("not implemented yet");
        }
        if (!(this instanceof C48652Gd)) {
            return (int) ((C82063pu) this).A02.A00();
        }
        C06260Si c06260Si = ((C48652Gd) this).A08;
        if (c06260Si != null) {
            return (int) c06260Si.A9U();
        }
        return 0;
    }

    public int A03() {
        if (this instanceof C84123tE) {
            return ((C84123tE) this).A00.getDuration();
        }
        if (this instanceof C84113tD) {
            return ((C84113tD) this).A00.getDuration();
        }
        if (this instanceof C83973sz) {
            return ((C83973sz) this).A03.A01.getDuration();
        }
        if (!(this instanceof C48652Gd)) {
            return (int) ((C82063pu) this).A02.A03;
        }
        C06260Si c06260Si = ((C48652Gd) this).A08;
        if (c06260Si != null) {
            return (int) c06260Si.A9q();
        }
        return 0;
    }

    public Bitmap A04() {
        if (this instanceof C84123tE) {
            return ((C84123tE) this).A00.getBitmap();
        }
        if (this instanceof C84113tD) {
            return null;
        }
        if (!(this instanceof C83973sz)) {
            if (!(this instanceof C48652Gd)) {
                return null;
            }
            C48652Gd c48652Gd = (C48652Gd) this;
            if (c48652Gd.A0M || c48652Gd.A08 == null || !c48652Gd.A0L) {
                return null;
            }
            return c48652Gd.A0X.getCurrentFrame();
        }
        C83973sz c83973sz = (C83973sz) this;
        Drawable current = c83973sz.A01.getCurrent();
        if (current instanceof BitmapDrawable) {
            return ((BitmapDrawable) current).getBitmap();
        }
        Bitmap bitmap = c83973sz.A00;
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(Math.max(current.getIntrinsicWidth(), 1), Math.max(current.getIntrinsicHeight(), 1), Bitmap.Config.ARGB_8888);
            c83973sz.A00 = bitmap;
        }
        Canvas canvas = new Canvas(bitmap);
        current.draw(canvas);
        current.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        return c83973sz.A00;
    }

    public View A05() {
        if (this instanceof C84123tE) {
            return ((C84123tE) this).A00;
        }
        if (this instanceof C84113tD) {
            return ((C84113tD) this).A00;
        }
        if (this instanceof C83973sz) {
            return ((C83973sz) this).A02;
        }
        if (!(this instanceof C48652Gd)) {
            return ((C82063pu) this).A01;
        }
        return ((C48652Gd) this).A0X;
    }

    public void A06() {
        if (this instanceof C84123tE) {
            ((C84123tE) this).A00.pause();
        } else if (this instanceof C84113tD) {
            ((C84113tD) this).A00.pause();
        } else if (this instanceof C83973sz) {
            ((C83973sz) this).A01.stop();
        } else if (!(this instanceof C48652Gd)) {
            C82063pu c82063pu = (C82063pu) this;
            c82063pu.A02.A02();
            c82063pu.A00.removeMessages(0);
        } else {
            C06260Si c06260Si = ((C48652Gd) this).A08;
            if (c06260Si != null) {
                c06260Si.ATc(false);
            }
        }
    }

    public void A07() {
        C48652Gd c48652Gd;
        AbstractC73093b5 abstractC73093b5;
        int i;
        if ((this instanceof C48652Gd) && (abstractC73093b5 = (c48652Gd = (C48652Gd) this).A0D) != null) {
            abstractC73093b5.A00 = c48652Gd.A04;
            int i2 = c48652Gd.A02;
            if (!(abstractC73093b5 instanceof C84103tC)) {
                C67393Fi c67393Fi = (C67393Fi) abstractC73093b5;
                C3ST c3st = c67393Fi.A0D;
                c3st.A00();
                c67393Fi.A0C.A00();
                C3ST c3st2 = c67393Fi.A0B;
                c3st2.A00();
                C3ST c3st3 = c67393Fi.A0A;
                c3st3.A00();
                c67393Fi.A03 = i2;
                C37241m6 c37241m6 = new C37241m6();
                C06350Ss c06350Ss = c67393Fi.A04;
                if (c06350Ss != null) {
                    c37241m6.A09 = c06350Ss.A02();
                    c37241m6.A02 = Double.valueOf(c06350Ss.A01());
                    c37241m6.A0A = Long.valueOf(c67393Fi.A04.A01 + 1);
                }
                c37241m6.A01 = Double.valueOf(c67393Fi.A02);
                c37241m6.A07 = Long.valueOf(c3st2.A00);
                c37241m6.A0D = Long.valueOf(c3st3.A00);
                c37241m6.A0C = Long.valueOf(c67393Fi.A01);
                long j = c3st.A00;
                c37241m6.A08 = Long.valueOf(j);
                int i3 = c67393Fi.A00;
                if (i3 == 0) {
                    i = 1;
                } else if (i3 == 1) {
                    i = 2;
                } else if (i3 == 2) {
                    i = 3;
                } else if (i3 == 3) {
                    i = 4;
                } else if (i3 != 5) {
                    i = 1;
                } else {
                    i = 6;
                }
                c37241m6.A06 = i;
                c37241m6.A0B = Long.valueOf(c67393Fi.A03);
                c37241m6.A00 = Boolean.valueOf(j > 0);
                c37241m6.A05 = Integer.valueOf(c67393Fi.A07);
                C09B c09b = c67393Fi.A0E;
                c37241m6.A0E = Long.valueOf(((AnonymousClass097) c09b).A00);
                c37241m6.A03 = Double.valueOf(((AnonymousClass097) c09b).A01);
                c37241m6.A04 = Integer.valueOf(C0E3.A04(c09b, c67393Fi.A08));
                c67393Fi.A09.A0B(c37241m6, null, false);
                return;
            }
            C84103tC c84103tC = (C84103tC) abstractC73093b5;
            if (!c84103tC.A01) {
                return;
            }
            C37621mi c37621mi = new C37621mi();
            c37621mi.A03 = c84103tC.A00;
            c37621mi.A02 = Integer.valueOf(((AbstractC73093b5) c84103tC).A01);
            C3ST c3st4 = c84103tC.A08;
            c37621mi.A07 = Long.valueOf(c3st4.A00 / 1000);
            c37621mi.A06 = Long.valueOf(c84103tC.A07.A00);
            if (c84103tC.A05.A00 != null) {
                c37621mi.A04 = Long.valueOf((System.currentTimeMillis() - c84103tC.A04) / 1000);
                c37621mi.A05 = Long.valueOf(c84103tC.A03);
                c37621mi.A00 = Double.valueOf(c84103tC.A02);
                c37621mi.A01 = Integer.valueOf(((AbstractC73093b5) c84103tC).A00);
                c84103tC.A06.A0B(c37621mi, null, false);
                c84103tC.A01 = false;
                c3st4.A01();
                return;
            }
            throw null;
        }
    }

    public void A08() {
        if (this instanceof C84123tE) {
            ((C84123tE) this).A00.start();
        } else if (this instanceof C84113tD) {
            ((C84113tD) this).A00.start();
        } else if (this instanceof C83973sz) {
            ((C83973sz) this).A01.start();
        } else if (!(this instanceof C48652Gd)) {
            C82063pu c82063pu = (C82063pu) this;
            c82063pu.A02.A01();
            Handler handler = c82063pu.A00;
            handler.removeMessages(0);
            handler.sendEmptyMessageDelayed(0, c82063pu.A03() - c82063pu.A02());
        } else {
            C48652Gd c48652Gd = (C48652Gd) this;
            c48652Gd.hashCode();
            if (c48652Gd.A08 != null) {
                c48652Gd.A0K();
                c48652Gd.A08.ATc(true);
                return;
            }
            c48652Gd.A0O = true;
            c48652Gd.A0H();
        }
    }

    public void A09() {
        AudioManager A0A;
        if (this instanceof C84123tE) {
            C86653y0 c86653y0 = ((C84123tE) this).A00;
            MediaPlayer mediaPlayer = c86653y0.A09;
            if (mediaPlayer != null) {
                mediaPlayer.reset();
                c86653y0.A09.release();
                c86653y0.A09 = null;
                c86653y0.A0H = false;
                c86653y0.A00 = 0;
                c86653y0.A03 = 0;
            }
        } else if (this instanceof C84113tD) {
            ((C84113tD) this).A00.A00();
        } else if (this instanceof C83973sz) {
            C83973sz c83973sz = (C83973sz) this;
            c83973sz.A03.close();
            c83973sz.A01.stop();
        } else if (!(this instanceof C48652Gd)) {
            C82063pu c82063pu = (C82063pu) this;
            c82063pu.A02.A02();
            c82063pu.A00.removeMessages(0);
        } else {
            C48652Gd c48652Gd = (C48652Gd) this;
            c48652Gd.hashCode();
            c48652Gd.A0N = false;
            c48652Gd.A0G = false;
            C06260Si c06260Si = c48652Gd.A08;
            if (c06260Si != null) {
                c48652Gd.A0O = c06260Si.ACR();
                c48652Gd.A08.ATc(false);
                c48652Gd.A0P = false;
                AbstractC21230z0 A9X = c48652Gd.A08.A9X();
                if (A9X != null && !A9X.A0D()) {
                    int A9Y = c48652Gd.A08.A9Y();
                    c48652Gd.A01 = A9Y;
                    C21220yz A0A2 = A9X.A0A(A9Y, new C21220yz());
                    c48652Gd.A0P = true;
                    c48652Gd.A05 = A0A2.A03 ? c48652Gd.A08.A9U() : -9223372036854775807L;
                }
                c48652Gd.A08.A00();
                C06260Si c06260Si2 = c48652Gd.A08;
                c06260Si2.A03();
                c06260Si2.A03();
                c06260Si2.A01();
                c06260Si2.A06(null, false);
                c06260Si2.A05(0, 0);
                c48652Gd.A08.ARO(c48652Gd.A0S);
                c48652Gd.A0V.AS1(new RunnableEBaseShape7S0100000_I0_7(c48652Gd.A08, 31));
                c48652Gd.A08 = null;
                InterfaceC73143bA interfaceC73143bA = ((AbstractC48662Ge) c48652Gd).A04;
                if (interfaceC73143bA != null) {
                    interfaceC73143bA.AN3(false, 1);
                }
                C86593xt c86593xt = c48652Gd.A0X;
                c86593xt.A01 = null;
                C72953ar c72953ar = c86593xt.A03;
                if (c72953ar != null) {
                    c72953ar.A00();
                }
                c48652Gd.A09 = null;
                ExoPlaybackControlView exoPlaybackControlView = c48652Gd.A0C;
                if (exoPlaybackControlView != null) {
                    exoPlaybackControlView.setPlayer(null);
                    ExoPlaybackControlView exoPlaybackControlView2 = c48652Gd.A0C;
                    exoPlaybackControlView2.removeCallbacks(exoPlaybackControlView2.A0K);
                    exoPlaybackControlView2.removeCallbacks(exoPlaybackControlView2.A0L);
                }
                if (!c48652Gd.A0F && (A0A = c48652Gd.A0U.A0A()) != null) {
                    AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = c48652Gd.A06;
                    if (onAudioFocusChangeListener == null) {
                        onAudioFocusChangeListener = C72783aa.A00;
                        c48652Gd.A06 = onAudioFocusChangeListener;
                    }
                    A0A.abandonAudioFocus(onAudioFocusChangeListener);
                }
            }
        }
    }

    public void A0A(int i) {
        if (this instanceof C84123tE) {
            ((C84123tE) this).A00.seekTo(i);
        } else if (this instanceof C84113tD) {
            ((C84113tD) this).A00.seekTo(i);
        } else if (this instanceof C83973sz) {
            throw new UnsupportedOperationException("not implemented yet");
        } else {
            if (!(this instanceof C48652Gd)) {
                C82063pu c82063pu = (C82063pu) this;
                C3XU c3xu = c82063pu.A02;
                c3xu.A00 = i;
                c3xu.A01 = SystemClock.elapsedRealtime();
                Handler handler = c82063pu.A00;
                handler.removeMessages(0);
                handler.sendEmptyMessageDelayed(0, c82063pu.A03() - c82063pu.A02());
                return;
            }
            C48652Gd c48652Gd = (C48652Gd) this;
            C06260Si c06260Si = c48652Gd.A08;
            if (c06260Si != null) {
                c06260Si.ASJ(i);
            } else {
                c48652Gd.A03 = i;
            }
        }
    }

    public void A0B(boolean z) {
        if (this instanceof C84123tE) {
            ((C84123tE) this).A00.setMute(z);
        } else if (this instanceof C84113tD) {
            ((C84113tD) this).A00.setMute(z);
        } else if ((this instanceof C83973sz) || !(this instanceof C48652Gd)) {
        } else {
            C48652Gd c48652Gd = (C48652Gd) this;
            c48652Gd.A0J = z;
            C06260Si c06260Si = c48652Gd.A08;
            if (c06260Si != null) {
                c06260Si.A04(z ? 0.0f : 1.0f);
            }
        }
    }

    public boolean A0C() {
        if (this instanceof C84123tE) {
            return ((C84123tE) this).A00.isPlaying();
        }
        if (this instanceof C84113tD) {
            return ((C84113tD) this).A00.isPlaying();
        }
        if (this instanceof C83973sz) {
            return ((C83973sz) this).A01.A0F;
        }
        if (!(this instanceof C48652Gd)) {
            return ((C82063pu) this).A02.A02;
        }
        C48652Gd c48652Gd = (C48652Gd) this;
        C06260Si c06260Si = c48652Gd.A08;
        if (c06260Si == null || c48652Gd.A0M) {
            return false;
        }
        int ACT = c06260Si.ACT();
        return (ACT == 3 || ACT == 2) && c48652Gd.A08.ACR();
    }

    public boolean A0D() {
        if (this instanceof C84123tE) {
            return ((C84123tE) this).A00.A0H;
        }
        if (this instanceof C84113tD) {
            return A02() > 50;
        } else if (this instanceof C83973sz) {
            throw new UnsupportedOperationException("not implemented yet");
        } else {
            if (!(this instanceof C48652Gd)) {
                return true;
            }
            return ((C48652Gd) this).A0N;
        }
    }

    public boolean A0E() {
        if ((this instanceof C84123tE) || (this instanceof C84113tD) || (this instanceof C83973sz) || !(this instanceof C48652Gd)) {
            return false;
        }
        return ((C48652Gd) this).A0H;
    }
}
