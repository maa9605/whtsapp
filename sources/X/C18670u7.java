package X;

import android.os.Handler;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* renamed from: X.0u7 */
/* loaded from: classes.dex */
public class C18670u7 {
    public static HandlerC18660u6 A0M;
    public float A00;
    public float A01;
    public int A03;
    public long A07;
    public long A0A;
    public static final Object A0P = new Object();
    public static final ArrayList A0Q = new ArrayList();
    public static final ArrayList A0T = new ArrayList();
    public static final ArrayList A0R = new ArrayList();
    public static final ArrayList A0S = new ArrayList();
    public static final ArrayList A0U = new ArrayList();
    public static final Interpolator A0N = new AccelerateDecelerateInterpolator();
    public static final C18640u4 A0O = new C18640u4(64);
    public long A09 = -1;
    public boolean A0G = false;
    public int A02 = 0;
    public boolean A0J = false;
    public int A04 = 0;
    public boolean A0H = false;
    public boolean A0I = false;
    public boolean A0F = false;
    public long A08 = 300;
    public int A05 = 0;
    public int A06 = 1;
    public ArrayList A0D = null;
    public Interpolator A0B = A0N;
    public ArrayList A0C = null;
    public float[] A0K = new float[2];
    public float[] A0L = new float[2];
    public boolean A0E = true;

    public static C18670u7 A00(float f, float f2) {
        C18670u7 c18670u7 = (C18670u7) A0O.A00();
        if (c18670u7 == null) {
            c18670u7 = new C18670u7();
        }
        c18670u7.A03 = 2;
        float[] fArr = c18670u7.A0K;
        fArr[0] = 0.0f;
        float[] fArr2 = c18670u7.A0L;
        fArr2[0] = f;
        fArr[1] = 1.0f;
        fArr2[1] = f2;
        c18670u7.A0F = false;
        return c18670u7;
    }

    public void A01() {
        ArrayList arrayList;
        if (this.A04 != 0 || A0T.contains(this) || A0R.contains(this)) {
            if (this.A0H && (arrayList = this.A0C) != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((C0T6) this.A0C.get(i)).AH7(this);
                }
            }
            A04();
        }
    }

    public void A02() {
        ArrayList arrayList = this.A0C;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.A0D;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.A0A = 0L;
        this.A09 = -1L;
        this.A0G = false;
        this.A02 = 0;
        this.A0J = false;
        this.A07 = 0L;
        this.A04 = 0;
        this.A0H = false;
        this.A0I = false;
        this.A0F = false;
        this.A08 = 300L;
        this.A05 = 0;
        this.A06 = 1;
        this.A0B = A0N;
        this.A00 = 0.0f;
        this.A0E = true;
        A0O.A02(this);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0u6] */
    public void A03() {
        HandlerC18660u6 handlerC18660u6;
        if (Looper.myLooper() != null) {
            this.A0G = false;
            this.A02 = 0;
            this.A04 = 0;
            this.A0I = true;
            this.A0J = false;
            A0T.add(this);
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (this.A04 != 1) {
                this.A09 = 0L;
                this.A04 = this.A0F ? 2 : 0;
            }
            this.A0A = currentAnimationTimeMillis - 0;
            this.A0F = true;
            A08(currentAnimationTimeMillis);
            this.A0H = true;
            ArrayList arrayList = this.A0C;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList.get(i);
                }
            }
            synchronized (A0P) {
                HandlerC18660u6 handlerC18660u62 = A0M;
                handlerC18660u6 = handlerC18660u62;
                if (handlerC18660u62 == null) {
                    ?? r0 = new Handler() { // from class: X.0u6
                        /* JADX WARN: Code restructure failed: missing block: B:90:0x004f, code lost:
                            if (X.C18670u7.A0R.size() > 0) goto L71;
                         */
                        @Override // android.os.Handler
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public void handleMessage(android.os.Message r16) {
                            /*
                                Method dump skipped, instructions count: 256
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.HandlerC18660u6.handleMessage(android.os.Message):void");
                        }
                    };
                    A0M = r0;
                    handlerC18660u6 = r0;
                }
            }
            handlerC18660u6.sendEmptyMessage(0);
            return;
        }
        throw new AndroidRuntimeException("Animators may only be run on Looper threads");
    }

    public final void A04() {
        A0Q.remove(this);
        A0T.remove(this);
        A0R.remove(this);
        this.A04 = 0;
        this.A0I = false;
        if (this.A0H) {
            this.A0H = false;
            ArrayList arrayList = this.A0C;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((C0T6) this.A0C.get(i)).AH9(this);
                }
            }
        }
    }

    public void A05(long j) {
        if (j >= 0) {
            this.A08 = j;
            return;
        }
        StringBuilder sb = new StringBuilder("Animators cannot have negative duration: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public void A06(C0T6 c0t6) {
        ArrayList arrayList = this.A0C;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A0C = arrayList;
        }
        arrayList.add(c0t6);
    }

    public void A07(C0T7 c0t7) {
        ArrayList arrayList = this.A0D;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A0D = arrayList;
        }
        arrayList.add(c0t7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0032, code lost:
        if (r3 >= 1.0f) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A08(long r12) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18670u7.A08(long):boolean");
    }
}
