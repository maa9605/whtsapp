package com.whatsapp.camera.litecamera;

import X.AbstractC885543o;
import X.AnonymousClass358;
import X.AnonymousClass420;
import X.AnonymousClass422;
import X.AnonymousClass423;
import X.AnonymousClass426;
import X.AnonymousClass470;
import X.AnonymousClass472;
import X.AnonymousClass473;
import X.AnonymousClass474;
import X.AnonymousClass475;
import X.AnonymousClass476;
import X.C000200d;
import X.C02M;
import X.C07K;
import X.C1D9;
import X.C2F8;
import X.C42C;
import X.C44L;
import X.C44Q;
import X.C44V;
import X.C44W;
import X.C44Y;
import X.C44Z;
import X.C45B;
import X.C45D;
import X.C45G;
import X.C45H;
import X.C45I;
import X.C46V;
import X.C471729x;
import X.EnumC881942e;
import X.InterfaceC471629w;
import X.InterfaceC49112In;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.OrientationEventListener;
import android.view.TextureView;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class LiteCameraView extends AnonymousClass470 implements InterfaceC471629w {
    public InterfaceC49112In A00;
    public C2F8 A01;
    public String A02;
    public List A03;
    public List A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final SharedPreferences A08;
    public final C44Q A09;
    public final C44W A0A;
    public final C46V A0B;
    public final AnonymousClass472 A0C;
    public final AnonymousClass473 A0D;
    public final AnonymousClass474 A0E;
    public volatile boolean A0F;

    @Override // X.InterfaceC471629w
    public int getCameraType() {
        return 1;
    }

    public LiteCameraView(Context context, int i) {
        super(context);
        this.A02 = "off";
        this.A03 = Collections.emptyList();
        this.A04 = Collections.emptyList();
        this.A0C = new AnonymousClass472(this);
        this.A0D = new AnonymousClass473(this);
        this.A0E = new AnonymousClass474(this);
        SharedPreferences sharedPreferences = context.getSharedPreferences(C02M.A02, 0);
        this.A08 = sharedPreferences;
        int i2 = sharedPreferences.getInt("camera_facing", 0);
        Boolean bool = C44L.A02;
        if (bool == null) {
            if (Build.VERSION.SDK_INT < 24) {
                bool = Boolean.FALSE;
                C44L.A02 = bool;
            } else {
                try {
                    CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
                    for (String str : cameraManager.getCameraIdList()) {
                        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                        if (num != null) {
                            int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
                            if (C44L.A01 == -1 && num.intValue() == 0) {
                                C44L.A01 = intValue;
                            } else if (C44L.A00 == -1 && num.intValue() == 1) {
                                C44L.A00 = intValue;
                            }
                        }
                    }
                    int i3 = C44L.A01;
                    boolean A00 = C44L.A00(i3);
                    if (A00 && C44L.A00(C44L.A00)) {
                        bool = Boolean.TRUE;
                        C44L.A02 = bool;
                    } else {
                        int i4 = C44L.A00;
                        if (C44L.A00(i4) && i3 != 2 && i3 >= 0 && Build.VERSION.SDK_INT >= 26) {
                            bool = Boolean.TRUE;
                            C44L.A02 = bool;
                        } else if (A00 && i4 != 2 && i4 >= 0 && Build.VERSION.SDK_INT >= 26) {
                            bool = Boolean.TRUE;
                            C44L.A02 = bool;
                        } else {
                            bool = Boolean.FALSE;
                            C44L.A02 = bool;
                        }
                    }
                } catch (AssertionError | Exception unused) {
                    bool = Boolean.FALSE;
                    C44L.A02 = bool;
                }
            }
        }
        C44W c44w = new C44W(context, new C44Y(), bool.booleanValue());
        c44w.A0A = false;
        this.A0A = c44w;
        TextureView textureView = c44w.A0G;
        if (c44w.A0C) {
            if (c44w.A0M.AEO(C07K.A0m(i2))) {
                c44w.A00 = i2;
            }
            int i5 = 2097152;
            int i6 = 307200;
            int i7 = 2073600;
            if (i >= 2015) {
                i5 = 8388608;
                i6 = 2073600;
            } else if (i >= 2013) {
                i5 = 5242880;
                i6 = 921600;
            } else {
                i7 = 921600;
            }
            C44Q c44q = new C44Q(i7, i5, i6);
            this.A09 = c44q;
            this.A0A.A05 = c44q;
            addView(textureView);
            this.A0B = new C46V(new AnonymousClass358(this));
            return;
        }
        throw new IllegalStateException("Initial camera facing must be set before initializing the camera.");
    }

    public static final int A00(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode != 109935) {
                if (hashCode == 3005871 && str.equals("auto")) {
                    return 2;
                }
            } else if (str.equals("off")) {
                return 0;
            }
        } else if (str.equals("on")) {
            return 1;
        }
        throw new IllegalArgumentException(C000200d.A0H("Not able to map app flash mode: ", str));
    }

    public final void A01() {
        List flashModes = getFlashModes();
        SharedPreferences sharedPreferences = this.A08;
        if (sharedPreferences.getInt(getFlashModesCountPrefKey(), 0) != flashModes.size()) {
            sharedPreferences.edit().putInt(getFlashModesCountPrefKey(), flashModes.size()).apply();
        }
    }

    public /* synthetic */ void A02(C1D9 c1d9) {
        InterfaceC49112In interfaceC49112In = this.A00;
        if (interfaceC49112In != null) {
            interfaceC49112In.ANU(c1d9);
        }
    }

    @Override // X.InterfaceC471629w
    public void A6C() {
        this.A0B.A03.A00();
    }

    @Override // X.InterfaceC471629w
    public void A7u(float f, float f2) {
        C44W c44w = this.A0A;
        c44w.A09 = new AnonymousClass475(this);
        int i = (int) f;
        int i2 = (int) f2;
        AbstractC885543o A01 = c44w.A01();
        if (A01 != null) {
            float[] fArr = {i, i2};
            AnonymousClass423 anonymousClass423 = c44w.A0M;
            anonymousClass423.AGD(fArr);
            if (((Boolean) A01.A00(AbstractC885543o.A0F)).booleanValue()) {
                anonymousClass423.AUw((int) fArr[0], (int) fArr[1], new C45I());
            }
            if (((Boolean) A01.A00(AbstractC885543o.A0E)).booleanValue()) {
                anonymousClass423.A7t((int) fArr[0], (int) fArr[1]);
            }
        }
    }

    @Override // X.InterfaceC471629w
    public boolean AFI() {
        return this.A0A.A00 == 1;
    }

    @Override // X.InterfaceC471629w
    public boolean AFK() {
        return this.A0F;
    }

    @Override // X.InterfaceC471629w
    public boolean AFg() {
        return this.A0A.A0M.AFh();
    }

    @Override // X.InterfaceC471629w
    public boolean AFr() {
        return this.A02 == "torch";
    }

    @Override // X.InterfaceC471629w
    public boolean AGa() {
        return AFI() && !this.A02.equals("off");
    }

    @Override // X.InterfaceC471629w
    public void AGk() {
        C44W c44w = this.A0A;
        AnonymousClass423 anonymousClass423 = c44w.A0M;
        if (anonymousClass423.AFp()) {
            this.A0B.A00();
            if (c44w.A0C || !anonymousClass423.AFp()) {
                return;
            }
            anonymousClass423.AVL(c44w.A0R);
        }
    }

    @Override // X.InterfaceC471629w
    public String AGl() {
        List flashModes = getFlashModes();
        if (flashModes.isEmpty()) {
            return "off";
        }
        int indexOf = flashModes.indexOf(getFlashMode());
        if (indexOf < 0) {
            indexOf = flashModes.indexOf("off");
        }
        String str = (String) flashModes.get((indexOf + 1) % flashModes.size());
        this.A02 = str;
        this.A0A.A02(A00(str));
        return this.A02;
    }

    @Override // X.InterfaceC471629w
    public void ARq() {
        if (!this.A0F) {
            ARs();
            return;
        }
        InterfaceC49112In interfaceC49112In = this.A00;
        if (interfaceC49112In != null) {
            interfaceC49112In.ANK();
        }
    }

    @Override // X.InterfaceC471629w
    public void ARs() {
        EnumC881942e enumC881942e;
        C44W c44w = this.A0A;
        c44w.A0B = this.A06;
        AnonymousClass472 anonymousClass472 = this.A0C;
        if (anonymousClass472 != null) {
            c44w.A0N.A01(anonymousClass472);
        }
        c44w.A08 = this.A0D;
        if (c44w.A0C) {
            c44w.A0C = false;
            OrientationEventListener orientationEventListener = c44w.A0F;
            if (orientationEventListener.canDetectOrientation()) {
                orientationEventListener.enable();
            }
            HandlerThread handlerThread = c44w.A0E;
            Looper looper = handlerThread.getLooper();
            if (looper != null) {
                AnonymousClass426.A00().A01.A00 = new Handler(looper);
                EnumC881942e enumC881942e2 = EnumC881942e.HIGH;
                C44Q c44q = c44w.A05;
                if (c44q == null) {
                    c44q = new C44Q();
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 26) {
                    enumC881942e = enumC881942e2;
                } else if (i >= 19) {
                    enumC881942e = EnumC881942e.MEDIUM;
                } else {
                    enumC881942e = EnumC881942e.LOW;
                }
                C45H c45h = new C45H(enumC881942e2, enumC881942e, c44q, new C44Z(), c44w.A0B);
                c44w.A02 = c44w.A00();
                AnonymousClass423 anonymousClass423 = c44w.A0M;
                anonymousClass423.A5H(c44w.A0I);
                anonymousClass423.AT3(c44w.A0O);
                anonymousClass423.A6R(c44w.A0T, C07K.A0m(c44w.A00), c45h, new AnonymousClass420(), c44w.A0K, c44w.A02, null, null, c44w.A0Q);
                return;
            }
            StringBuilder A0P = C000200d.A0P("Callback handler looper is null. CallbackHandlerThread is alive: ");
            A0P.append(handlerThread.isAlive());
            throw new RuntimeException(A0P.toString());
        }
    }

    @Override // X.InterfaceC471629w
    public int AUG(int i) {
        C44W c44w = this.A0A;
        if (c44w.A05()) {
            c44w.A0M.AUH(i, null);
        }
        AbstractC885543o A01 = c44w.A01();
        if (A01 != null && c44w.A05()) {
            return ((Number) ((List) A01.A00(AbstractC885543o.A0h)).get(!c44w.A05() ? 0 : c44w.A0M.AE9())).intValue();
        }
        return 100;
    }

    @Override // X.InterfaceC471629w
    public void AV4(File file, int i) {
        C44W c44w = this.A0A;
        AnonymousClass474 anonymousClass474 = this.A0E;
        if (c44w.A0C) {
            c44w.A0J.A00(10, new Object[]{anonymousClass474, new IllegalStateException("Cannot start video recording while camera is paused.")});
            return;
        }
        synchronized (c44w.A0S) {
            if (c44w.A0V) {
                c44w.A0J.A00(10, new Object[]{anonymousClass474, new IllegalStateException("Cannot start video recording. Another recording already in progress")});
                return;
            }
            c44w.A0V = true;
            c44w.A0U = anonymousClass474;
            c44w.A0M.AV7(file, new C45G(c44w));
        }
    }

    @Override // X.InterfaceC471629w
    public void AVD() {
        C44W c44w = this.A0A;
        if (c44w != null) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            synchronized (c44w.A0S) {
                if (c44w.A0V) {
                    c44w.A0M.AVF(false, new C45D(c44w, countDownLatch));
                    try {
                        countDownLatch.await(5L, TimeUnit.SECONDS);
                        return;
                    } catch (InterruptedException unused) {
                        throw new RuntimeException("Timeout stopping video recording.");
                    }
                }
                return;
            }
        }
        throw null;
    }

    @Override // X.InterfaceC471629w
    public boolean AVK() {
        return this.A07;
    }

    @Override // X.InterfaceC471629w
    public void AVO(C471729x c471729x, boolean z) {
        C44W c44w = this.A0A;
        AnonymousClass476 anonymousClass476 = new AnonymousClass476(this, c471729x);
        if (c44w != null) {
            c44w.A0M.AVN(false, z, new C44V(c44w, anonymousClass476));
            return;
        }
        throw null;
    }

    @Override // X.InterfaceC471629w
    public void AVf() {
        if (this.A07) {
            if (this.A02 == "torch") {
                this.A0A.A02(0);
                this.A02 = "off";
                return;
            }
            this.A0A.A02(3);
            this.A02 = "torch";
        }
    }

    @Override // X.InterfaceC471629w
    public int getCameraApi() {
        return this.A0A.A0L == AnonymousClass422.CAMERA2 ? 1 : 0;
    }

    @Override // X.InterfaceC471629w
    public String getFlashMode() {
        return this.A02;
    }

    @Override // X.InterfaceC471629w
    public List getFlashModes() {
        return AFI() ? this.A04 : this.A03;
    }

    private String getFlashModesCountPrefKey() {
        StringBuilder A0P = C000200d.A0P("flash_modes_count");
        A0P.append(this.A0A.A00);
        return A0P.toString();
    }

    @Override // X.InterfaceC471629w
    public int getMaxZoom() {
        C44W c44w = this.A0A;
        AbstractC885543o A01 = c44w.A01();
        if (A01 == null || !c44w.A05()) {
            return 0;
        }
        return ((Number) A01.A00(AbstractC885543o.A0N)).intValue();
    }

    @Override // X.InterfaceC471629w
    public int getNumberOfCameras() {
        return this.A0A.A0M.AFp() ? 2 : 1;
    }

    @Override // X.InterfaceC471629w
    public long getPictureResolution() {
        C42C c42c = this.A09.A00;
        if (c42c != null) {
            return c42c.A01 * c42c.A00;
        }
        return 0L;
    }

    @Override // X.InterfaceC471629w
    public int getStoredFlashModeCount() {
        return this.A08.getInt(getFlashModesCountPrefKey(), 0);
    }

    @Override // X.InterfaceC471629w
    public long getVideoResolution() {
        C42C c42c = this.A09.A01;
        if (c42c != null) {
            return c42c.A01 * c42c.A00;
        }
        return 0L;
    }

    @Override // X.InterfaceC471629w
    public void pause() {
        C44W c44w = this.A0A;
        if (!c44w.A0C) {
            OrientationEventListener orientationEventListener = c44w.A0F;
            if (orientationEventListener.canDetectOrientation()) {
                orientationEventListener.disable();
            }
            c44w.A0C = true;
            AnonymousClass423 anonymousClass423 = c44w.A0M;
            anonymousClass423.ARQ(c44w.A0I);
            anonymousClass423.AT3(null);
            anonymousClass423.A7I(new C45B(c44w));
        }
        AnonymousClass472 anonymousClass472 = this.A0C;
        if (c44w != null) {
            if (anonymousClass472 != null) {
                c44w.A0N.A02(anonymousClass472);
            }
            c44w.A08 = null;
            c44w.A04(null);
            this.A0B.A00();
            this.A0F = false;
            return;
        }
        throw null;
    }

    @Override // X.InterfaceC471629w
    public void setCameraCallback(InterfaceC49112In interfaceC49112In) {
        this.A00 = interfaceC49112In;
    }

    @Override // X.InterfaceC471629w
    public void setQrDecodeHints(Map map) {
        this.A0B.A03.A02 = map;
    }

    @Override // X.InterfaceC471629w
    public void setQrScanningEnabled(boolean z) {
        if (z == this.A06) {
            return;
        }
        this.A06 = z;
        if (z) {
            C44W c44w = this.A0A;
            C46V c46v = this.A0B;
            c44w.A04(c46v.A01);
            if (!c46v.A08) {
                c46v.A03.A02();
                c46v.A08 = true;
                return;
            }
            return;
        }
        this.A0B.A00();
        this.A0A.A04(null);
    }
}
