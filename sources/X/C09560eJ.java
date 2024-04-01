package X;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.audiofx.Visualizer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.0eJ */
/* loaded from: classes.dex */
public class C09560eJ {
    public static int A0p;
    public static byte[] A0r;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A08;
    public Activity A09;
    public Sensor A0A;
    public SensorEventListener A0B;
    public SensorManager A0C;
    public AudioManager.OnAudioFocusChangeListener A0D;
    public MediaPlayer A0E;
    public Visualizer A0F;
    public InterfaceC59072sA A0G;
    public InterfaceC53562h9 A0H;
    public InterfaceC59092sC A0I;
    public C09G A0J;
    public C0HV A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public final BroadcastReceiver A0U;
    public final PowerManager.WakeLock A0W;
    public final AbstractC000600i A0X;
    public final C018508q A0Y;
    public final C03130Eh A0Z;
    public final C01B A0a;
    public final C42411vh A0b;
    public final C03120Eg A0c;
    public final C02E A0d;
    public final C02F A0e;
    public final C00A A0f;
    public final C0HA A0g;
    public final C42421vi A0h;
    public final C0H9 A0i;
    public final C42391vf A0j;
    public final C42401vg A0l;
    public final boolean A0m;
    public final boolean A0n;
    public volatile boolean A0o;
    public static C04W A0q = new C04W(250);
    public static String[] A0s = {"GT-I9505", "GT-I9506", "GT-I9505G", "SGH-I337", "SGH-M919", "SCH-I545", "SPH-L720", "SCH-R970", "GT-I9508", "SGH-N045", "SC-04E"};
    public int A07 = 0;
    public boolean A0N = false;
    public final Handler A0V = new Handler(Looper.getMainLooper()) { // from class: X.2s6
        {
            C09560eJ.this = this;
        }

        /* JADX WARN: Removed duplicated region for block: B:80:0x00af  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void handleMessage(android.os.Message r19) {
            /*
                r18 = this;
                r4 = r18
                X.0eJ r9 = X.C09560eJ.this
                X.0HV r0 = r9.A0K
                if (r0 != 0) goto L9
                return
            L9:
                boolean r0 = r0.A0B()
                if (r0 != 0) goto L17
                boolean r0 = r9.A0R
                if (r0 != 0) goto L16
                r9.A05()
            L16:
                return
            L17:
                int r1 = r9.A03()
                r9.A03 = r1
                X.2h9 r0 = r9.A0H
                if (r0 == 0) goto L30
                X.09G r0 = r0.AA4()
                boolean r0 = r9.A0M(r0)
                if (r0 == 0) goto L30
                X.2h9 r0 = r9.A0H
                r0.ANN(r1)
            L30:
                boolean r0 = r9.A0n
                r3 = 0
                r12 = 1
                if (r0 == 0) goto L57
                X.1vi r11 = r9.A0h
                android.app.Activity r0 = r9.A09
                android.content.Context r10 = r0.getApplicationContext()
                X.0Eg r0 = r11.A0C
                X.0eJ r0 = r0.A00
                if (r0 != r9) goto L57
                long r7 = java.lang.System.currentTimeMillis()
                long r0 = r11.A00
                long r5 = r7 - r0
                r1 = 1000(0x3e8, double:4.94E-321)
                int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r0 < 0) goto L57
                r11.A03(r10, r9)
                r11.A00 = r7
            L57:
                X.2sC r6 = r9.A0I
                if (r6 == 0) goto Lc0
                android.media.audiofx.Visualizer r0 = r9.A0F
                if (r0 != 0) goto Lc0
                int r11 = r9.A04
                int r11 = r11 + r12
                r9.A04 = r11
                byte[] r5 = X.C09560eJ.A0r
                if (r5 != 0) goto Lab
                r0 = 128(0x80, float:1.794E-43)
                r10 = 128(0x80, float:1.794E-43)
                byte[] r5 = new byte[r0]
                X.C09560eJ.A0r = r5
                r9 = 0
            L71:
                double r7 = (double) r9
                r0 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
                double r7 = r7 * r0
                r12 = 4629700416936869888(0x4040000000000000, double:32.0)
                double r12 = r12 * r7
                double r0 = (double) r10
                double r12 = r12 / r0
                double r16 = java.lang.Math.sin(r12)
                r12 = 4616189618054758400(0x4010000000000000, double:4.0)
                double r12 = r12 * r7
                double r12 = r12 / r0
                double r12 = java.lang.Math.sin(r12)
                double r14 = java.lang.Math.abs(r12)
                double r14 = r14 * r16
                r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                double r7 = r7 * r12
                double r7 = r7 / r0
                double r0 = java.lang.Math.sin(r7)
                double r1 = java.lang.Math.abs(r0)
                double r1 = r1 * r14
                r12 = 4638707616191610880(0x4060000000000000, double:128.0)
                r7 = 4634204016564240384(0x4050000000000000, double:64.0)
                double r1 = r1 * r7
                double r1 = r1 + r12
                int r0 = (int) r1
                byte r0 = (byte) r0
                r5[r9] = r0
                int r9 = r9 + 1
                if (r9 >= r10) goto Lab
                goto L71
            Lab:
                int r0 = r11 % 4
                if (r0 != 0) goto Lbd
                r1 = 0
            Lb0:
                int r0 = r5.length
                if (r1 >= r0) goto Lbd
                r0 = r5[r1]
                int r0 = 256 - r0
                byte r0 = (byte) r0
                r5[r1] = r0
                int r1 = r1 + 1
                goto Lb0
            Lbd:
                r6.AQT(r5)
            Lc0:
                r0 = 50
                r4.sendEmptyMessageDelayed(r3, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: X.HandlerC59032s6.handleMessage(android.os.Message):void");
        }
    };
    public final C73363bW A0k = new AnonymousClass397(this);

    public C09560eJ(Activity activity, C018508q c018508q, AbstractC000600i abstractC000600i, C42391vf c42391vf, C02E c02e, C0H9 c0h9, C00A c00a, C0HA c0ha, C03130Eh c03130Eh, C42401vg c42401vg, C02F c02f, C42411vh c42411vh, C42421vi c42421vi, C03120Eg c03120Eg, C01B c01b, boolean z, boolean z2) {
        this.A09 = activity;
        this.A0Y = c018508q;
        this.A0X = abstractC000600i;
        this.A0j = c42391vf;
        this.A0d = c02e;
        this.A0i = c0h9;
        this.A0f = c00a;
        this.A0g = c0ha;
        this.A0Z = c03130Eh;
        this.A0l = c42401vg;
        this.A0e = c02f;
        this.A0b = c42411vh;
        this.A0h = c42421vi;
        this.A0n = z;
        this.A0c = c03120Eg;
        this.A0a = c01b;
        this.A0m = z2;
        if (A00() != -1) {
            PowerManager A0D = c02e.A0D();
            if (A0D == null) {
                Log.w("messageaudioplayer pm=null");
            } else {
                this.A0W = C02180Ae.A0R(A0D, A00(), "WhatsApp MessageAudioPlayer ProximityWakeLock");
            }
        }
        this.A0M = c03130Eh.A00;
        this.A0U = new BroadcastReceiver() { // from class: X.2s7
            {
                C09560eJ.this = this;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                C09560eJ c09560eJ = C09560eJ.this;
                boolean z3 = intent.getIntExtra("state", 0) > 0;
                c09560eJ.A0M = z3;
                C000200d.A1V(C000200d.A0P("messageaudioplayer/broadcastreceiver HeadsetPluggedInState: "), z3);
                if (c09560eJ.A0M) {
                    c09560eJ.A0C();
                } else {
                    c09560eJ.A0A();
                }
            }
        };
    }

    public static final int A00() {
        if (Build.VERSION.SDK_INT >= 21) {
            return 32;
        }
        try {
            return PowerManager.class.getDeclaredField("PROXIMITY_SCREEN_OFF_WAKE_LOCK").getInt(null);
        } catch (IllegalAccessException e) {
            Log.w("unable to access PROXIMITY_SCREEN_OFF_WAKE_LOCK field in PowerManager", e);
            return -1;
        } catch (NoSuchFieldException e2) {
            Log.w("no PROXIMITY_SCREEN_OFF_WAKE_LOCK field in PowerManager", e2);
            return -1;
        }
    }

    public static C09G A01(File file, String str) {
        C09G c09g = new C09G(new AnonymousClass094(null, true, str), 0L);
        ((AnonymousClass092) c09g).A04 = 2;
        C09H c09h = new C09H();
        c09h.A0F = file;
        ((AnonymousClass097) c09g).A02 = c09h;
        return c09g;
    }

    public static void A02(C09G c09g, int i) {
        A0q.put(c09g.A0n, Integer.valueOf(i));
    }

    public int A03() {
        C0HV c0hv = this.A0K;
        if (c0hv == null) {
            return 0;
        }
        return Math.max(this.A03, c0hv.A01());
    }

    public void A04() {
        C0HV c0hv = this.A0K;
        if (c0hv != null && c0hv.A0B()) {
            this.A0K.A03();
            this.A0R = true;
            A07();
            A0D();
            A0C();
        }
        A06();
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0012, code lost:
        if ((A03() + 50) > r15.A02) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A05() {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09560eJ.A05():void");
    }

    public final void A06() {
        AudioManager A0A = this.A0d.A0A();
        if (A0A == null) {
            return;
        }
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.A0D;
        if (onAudioFocusChangeListener == null) {
            onAudioFocusChangeListener = new C59082sB(this.A0c);
            this.A0D = onAudioFocusChangeListener;
        }
        A0A.abandonAudioFocus(onAudioFocusChangeListener);
    }

    public final void A07() {
        if (this.A0n) {
            if (this.A0L) {
                this.A0h.A03(this.A09.getApplicationContext(), this);
            } else {
                this.A0h.A01();
            }
        }
        InterfaceC53562h9 interfaceC53562h9 = this.A0H;
        if (interfaceC53562h9 != null && A0M(interfaceC53562h9.AA4())) {
            this.A0H.AMl(A03());
        }
        A02(this.A0J, A03());
        this.A0o = false;
    }

    public final void A08() {
        if (this.A0n) {
            this.A0h.A03(this.A09.getApplicationContext(), this);
        }
        InterfaceC53562h9 interfaceC53562h9 = this.A0H;
        if (interfaceC53562h9 != null && A0M(interfaceC53562h9.AA4())) {
            this.A0H.AOH();
        }
        A0q.remove(this.A0J.A0n);
        this.A0b.A02();
        this.A0o = true;
    }

    public final void A09() {
        if (Build.VERSION.SDK_INT < 21 || this.A0N) {
            return;
        }
        this.A09.getApplicationContext().registerReceiver(this.A0U, new IntentFilter("android.intent.action.HEADSET_PLUG"));
        this.A0N = true;
    }

    public final void A0A() {
        PowerManager.WakeLock wakeLock = this.A0W;
        if (wakeLock == null || wakeLock.isHeld() || this.A0M || !this.A0K.A0B() || this.A0L) {
            return;
        }
        wakeLock.acquire();
        Log.i("messageaudioplayer/startProximityListener acquired proximityWakeLock");
    }

    public final void A0B() {
        SensorEventListener sensorEventListener;
        Sensor sensor;
        SensorManager sensorManager = this.A0C;
        if (sensorManager != null && (sensorEventListener = this.A0B) != null && (sensor = this.A0A) != null) {
            sensorManager.unregisterListener(sensorEventListener, sensor);
            this.A0C = null;
        }
        A0C();
    }

    public final void A0C() {
        PowerManager.WakeLock wakeLock = this.A0W;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            wakeLock.release(1);
        } else {
            wakeLock.release();
        }
        Log.i("messageaudioplayer/stopproximitylistener released proximityWakeLock");
    }

    public final void A0D() {
        if (this.A0N) {
            this.A09.getApplicationContext().unregisterReceiver(this.A0U);
            this.A0N = false;
        }
    }

    public void A0E(int i) {
        try {
            C0HV c0hv = this.A0K;
            if (c0hv != null) {
                c0hv.A09(i);
            }
            this.A05++;
            this.A03 = i;
        } catch (IOException e) {
            Log.e(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:231:0x01b0, code lost:
        if (r1 == false) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0F(int r13) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09560eJ.A0F(int):void");
    }

    public final void A0G(final C09560eJ c09560eJ) {
        A0A();
        if (this.A0C == null) {
            SensorManager A08 = this.A0d.A08();
            this.A0C = A08;
            if (A08 == null) {
                return;
            }
            Sensor defaultSensor = A08.getDefaultSensor(8);
            this.A0A = defaultSensor;
            if (defaultSensor == null) {
                return;
            }
            SensorEventListener sensorEventListener = new SensorEventListener() { // from class: X.2s9
                @Override // android.hardware.SensorEventListener
                public void onAccuracyChanged(Sensor sensor, int i) {
                }

                {
                    C09560eJ.this = this;
                }

                @Override // android.hardware.SensorEventListener
                public void onSensorChanged(SensorEvent sensorEvent) {
                    C09560eJ c09560eJ2 = c09560eJ;
                    if (c09560eJ2 == null) {
                        C09560eJ c09560eJ3 = C09560eJ.this;
                        c09560eJ3.A0I(false);
                        c09560eJ3.A0B();
                        return;
                    }
                    C09560eJ c09560eJ4 = C09560eJ.this;
                    if (c09560eJ2 != c09560eJ4) {
                        c09560eJ4.A0B();
                        return;
                    }
                    float f = sensorEvent.values[0];
                    if (f < 5.0f && f != c09560eJ4.A0A.getMaximumRange()) {
                        c09560eJ4.A0I(true);
                    } else {
                        c09560eJ4.A0I(false);
                    }
                }
            };
            this.A0B = sensorEventListener;
            this.A0C.registerListener(sensorEventListener, defaultSensor, 2);
        }
    }

    public void A0H(C09G c09g) {
        Number number = (Number) A0q.get(c09g.A0n);
        if (number != null) {
            A0E(number.intValue());
        }
    }

    public void A0I(boolean z) {
        C0HV c0hv;
        if (this.A0Z.A00) {
            z = false;
        }
        if (this.A0O == z) {
            return;
        }
        if (!z || ((c0hv = this.A0K) != null && c0hv.A0B())) {
            C000200d.A1C("messageaudioplayer/onearproximity ", z);
            this.A0O = z;
            if (this.A0W == null) {
                Window window = this.A09.getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                if (z) {
                    this.A00 = attributes.screenBrightness;
                    attributes.screenBrightness = 0.1f;
                } else {
                    attributes.screenBrightness = this.A00;
                }
                window.setAttributes(attributes);
            }
            InterfaceC53562h9 interfaceC53562h9 = this.A0H;
            if (interfaceC53562h9 != null) {
                interfaceC53562h9.AJg(z);
            }
            C0HV c0hv2 = this.A0K;
            if (c0hv2 == null || !c0hv2.A0B()) {
                return;
            }
            int A01 = this.A0K.A01();
            this.A0K.A05();
            this.A0K = null;
            C09H c09h = ((AnonymousClass097) this.A0J).A02;
            if (c09h != null) {
                int i = z ? 0 : 3;
                try {
                    this.A01 = i;
                    this.A0K = C0HV.A00(c09h.A0F, i, this.A0a);
                    this.A09.setVolumeControlStream(this.A01);
                    AudioManager A0A = this.A0d.A0A();
                    if (z && A0A != null) {
                        A0A.setSpeakerphoneOn(false);
                    }
                    this.A0K.A04();
                    int max = Math.max(0, A01 - 1000);
                    this.A03 = max;
                    this.A0K.A09(max);
                    if (!z && System.currentTimeMillis() - this.A08 >= 1500) {
                        this.A0R = true;
                        A07();
                        A0D();
                        A0C();
                        A06();
                        return;
                    }
                    if (!A0L(A0p)) {
                        A0p = 0;
                    }
                    this.A0K.A07();
                    return;
                } catch (IOException | IllegalStateException unused) {
                    this.A0Y.A07(R.string.gallery_audio_cannot_load, 0);
                    return;
                }
            }
            throw null;
        }
    }

    public void A0J(boolean z) {
        C09560eJ A01 = this.A0c.A01();
        if (A01 != this && A01 != null) {
            A01.A05();
        }
        C0HV c0hv = this.A0K;
        if (c0hv != null && c0hv.A0B()) {
            A04();
            return;
        }
        int i = 0;
        if (z) {
            i = A0p;
        }
        A0F(i);
    }

    public boolean A0K() {
        C0HV c0hv = this.A0K;
        return c0hv != null && c0hv.A0B();
    }

    public boolean A0L(int i) {
        float f;
        if (i != 0) {
            f = 1.5f;
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException(C000200d.A0D("setFastPlaybackPlayerState: Did not handle FastPlaybackPlayerState: ", i));
                }
                f = 2.0f;
            }
        } else {
            f = 1.0f;
        }
        C000200d.A0q("messageaudioplayer/setFastPlaybackPlayerState fastPlaybackPlayerState: ", i);
        C0HV c0hv = this.A0K;
        if (c0hv != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                return c0hv.A0C(f, this.A0X);
            }
            return false;
        }
        return true;
    }

    public boolean A0M(AnonymousClass092 anonymousClass092) {
        return anonymousClass092.A0n.equals(this.A0J.A0n);
    }
}
