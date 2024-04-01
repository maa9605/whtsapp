package X;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: X.1ZD  reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ZD implements InterfaceC21490zQ {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public AudioTrack A0M;
    public C21120yp A0N;
    public C21120yp A0O;
    public C21350zC A0P;
    public InterfaceC21470zO A0Q;
    public C21540zV A0R;
    public ByteBuffer A0S;
    public ByteBuffer A0T;
    public ByteBuffer A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public byte[] A0b;
    public InterfaceC21420zJ[] A0c;
    public ByteBuffer[] A0d;
    public final ConditionVariable A0e;
    public final C21360zD A0f;
    public final C21530zU A0g;
    public final C1ZA A0h;
    public final InterfaceC21560zX A0i;
    public final C1ZJ A0j;
    public final ArrayDeque A0k;
    public final InterfaceC21420zJ[] A0l;
    public final InterfaceC21420zJ[] A0m;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0zV] */
    public C1ZD(C21360zD c21360zD, InterfaceC21420zJ[] interfaceC21420zJArr) {
        C1ZB c1zb = new C1ZB(interfaceC21420zJArr);
        this.A0f = c21360zD;
        this.A0i = c1zb;
        this.A0e = new ConditionVariable(true);
        this.A0g = new C21530zU(new InterfaceC21520zT() { // from class: X.1ZC
            @Override // X.InterfaceC21520zT
            public void AL7(long j) {
                StringBuilder sb = new StringBuilder("Ignoring impossibly large audio latency: ");
                sb.append(j);
                Log.w("AudioTrack", sb.toString());
            }

            @Override // X.InterfaceC21520zT
            public void AN5(long j, long j2, long j3, long j4) {
                StringBuilder A0S = C000200d.A0S("Spurious audio timestamp (frame position mismatch): ", j, ", ");
                A0S.append(j2);
                A0S.append(", ");
                A0S.append(j3);
                A0S.append(", ");
                A0S.append(j4);
                A0S.append(", ");
                C1ZD c1zd = C1ZD.this;
                A0S.append(c1zd.A0X ? c1zd.A0J / c1zd.A0B : c1zd.A0I);
                A0S.append(", ");
                A0S.append(c1zd.A00());
                Log.w("AudioTrack", A0S.toString());
            }

            @Override // X.InterfaceC21520zT
            public void APX(long j, long j2, long j3, long j4) {
                StringBuilder A0S = C000200d.A0S("Spurious audio timestamp (system clock mismatch): ", j, ", ");
                A0S.append(j2);
                A0S.append(", ");
                A0S.append(j3);
                A0S.append(", ");
                A0S.append(j4);
                A0S.append(", ");
                C1ZD c1zd = C1ZD.this;
                A0S.append(c1zd.A0X ? c1zd.A0J / c1zd.A0B : c1zd.A0I);
                A0S.append(", ");
                A0S.append(c1zd.A00());
                Log.w("AudioTrack", A0S.toString());
            }

            @Override // X.InterfaceC21520zT
            public void AQ2(final int i, final long j) {
                C1ZD c1zd = C1ZD.this;
                InterfaceC21470zO interfaceC21470zO = c1zd.A0Q;
                if (interfaceC21470zO != null) {
                    final long elapsedRealtime = SystemClock.elapsedRealtime() - c1zd.A0E;
                    C1ZF c1zf = (C1ZF) interfaceC21470zO;
                    final C21430zK c21430zK = c1zf.A00.A0F;
                    if (c21430zK.A01 != null) {
                        c21430zK.A00.post(new Runnable() { // from class: X.0zA
                            @Override // java.lang.Runnable
                            public final void run() {
                                C21430zK c21430zK2 = C21430zK.this;
                                c21430zK2.A01.AHW(i, j, elapsedRealtime);
                            }
                        });
                    }
                    if (c1zf.A00 == null) {
                        throw null;
                    }
                }
            }
        });
        C1ZA c1za = new C1ZA();
        this.A0h = c1za;
        C1ZJ c1zj = new C1ZJ();
        this.A0j = c1zj;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new InterfaceC21420zJ() { // from class: X.1ZG
            public ByteBuffer A03;
            public ByteBuffer A04;
            public boolean A05;
            public int A02 = -1;
            public int A00 = -1;
            public int A01 = 0;

            @Override // X.InterfaceC21420zJ
            public int ABj() {
                return 2;
            }

            {
                ByteBuffer byteBuffer = InterfaceC21420zJ.A00;
                this.A03 = byteBuffer;
                this.A04 = byteBuffer;
            }

            @Override // X.InterfaceC21420zJ
            public boolean A6P(int i, int i2, int i3) {
                if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
                    throw new C21410zI(i, i2, i3);
                }
                if (this.A02 == i && this.A00 == i2 && this.A01 == i3) {
                    return false;
                }
                this.A02 = i;
                this.A00 = i2;
                this.A01 = i3;
                return true;
            }

            @Override // X.InterfaceC21420zJ
            public ByteBuffer ABh() {
                ByteBuffer byteBuffer = this.A04;
                this.A04 = InterfaceC21420zJ.A00;
                return byteBuffer;
            }

            @Override // X.InterfaceC21420zJ
            public int ABi() {
                return this.A00;
            }

            @Override // X.InterfaceC21420zJ
            public int ABk() {
                return this.A02;
            }

            @Override // X.InterfaceC21420zJ
            public boolean AF4() {
                int i = this.A01;
                return (i == 0 || i == 2) ? false : true;
            }

            @Override // X.InterfaceC21420zJ
            public boolean AFE() {
                return this.A05 && this.A04 == InterfaceC21420zJ.A00;
            }

            @Override // X.InterfaceC21420zJ
            public void AR0() {
                this.A05 = true;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x007b A[LOOP:2: B:23:0x007b->B:24:0x007d, LOOP_START, PHI: r3 
              PHI: (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:11:0x0031, B:24:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
            @Override // X.InterfaceC21420zJ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void AR1(java.nio.ByteBuffer r8) {
                /*
                    r7 = this;
                    int r3 = r8.position()
                    int r2 = r8.limit()
                    int r1 = r2 - r3
                    int r0 = r7.A01
                    r6 = 1073741824(0x40000000, float:2.0)
                    r5 = -2147483648(0xffffffff80000000, float:-0.0)
                    r4 = 3
                    if (r0 == r5) goto L43
                    if (r0 == r4) goto L44
                    if (r0 != r6) goto La7
                    int r1 = r1 >> 1
                L19:
                    java.nio.ByteBuffer r0 = r7.A03
                    int r0 = r0.capacity()
                    if (r0 >= r1) goto L3d
                    java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
                    java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
                    java.nio.ByteBuffer r0 = r1.order(r0)
                    r7.A03 = r0
                L2f:
                    int r0 = r7.A01
                    if (r0 == r5) goto L7b
                    if (r0 == r4) goto L62
                    if (r0 == r6) goto L47
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r0.<init>()
                    throw r0
                L3d:
                    java.nio.ByteBuffer r0 = r7.A03
                    r0.clear()
                    goto L2f
                L43:
                    int r1 = r1 / r4
                L44:
                    int r1 = r1 << 1
                    goto L19
                L47:
                    if (r3 >= r2) goto L96
                    java.nio.ByteBuffer r1 = r7.A03
                    int r0 = r3 + 2
                    byte r0 = r8.get(r0)
                    r1.put(r0)
                    java.nio.ByteBuffer r1 = r7.A03
                    int r0 = r3 + 3
                    byte r0 = r8.get(r0)
                    r1.put(r0)
                    int r3 = r3 + 4
                    goto L47
                L62:
                    if (r3 >= r2) goto L96
                    java.nio.ByteBuffer r1 = r7.A03
                    r0 = 0
                    r1.put(r0)
                    java.nio.ByteBuffer r1 = r7.A03
                    byte r0 = r8.get(r3)
                    r0 = r0 & 255(0xff, float:3.57E-43)
                    int r0 = r0 + (-128)
                    byte r0 = (byte) r0
                    r1.put(r0)
                    int r3 = r3 + 1
                    goto L62
                L7b:
                    if (r3 >= r2) goto L96
                    java.nio.ByteBuffer r1 = r7.A03
                    int r0 = r3 + 1
                    byte r0 = r8.get(r0)
                    r1.put(r0)
                    java.nio.ByteBuffer r1 = r7.A03
                    int r0 = r3 + 2
                    byte r0 = r8.get(r0)
                    r1.put(r0)
                    int r3 = r3 + 3
                    goto L7b
                L96:
                    int r0 = r8.limit()
                    r8.position(r0)
                    java.nio.ByteBuffer r0 = r7.A03
                    r0.flip()
                    java.nio.ByteBuffer r0 = r7.A03
                    r7.A04 = r0
                    return
                La7:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r0.<init>()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1ZG.AR1(java.nio.ByteBuffer):void");
            }

            @Override // X.InterfaceC21420zJ
            public void flush() {
                this.A04 = InterfaceC21420zJ.A00;
                this.A05 = false;
            }

            @Override // X.InterfaceC21420zJ
            public void reset() {
                flush();
                this.A02 = -1;
                this.A00 = -1;
                this.A01 = 0;
                this.A03 = InterfaceC21420zJ.A00;
            }
        }, c1za, c1zj);
        Collections.addAll(arrayList, c1zb.A02);
        this.A0m = (InterfaceC21420zJ[]) arrayList.toArray(new InterfaceC21420zJ[arrayList.size()]);
        this.A0l = new InterfaceC21420zJ[]{new InterfaceC21420zJ() { // from class: X.1ZE
            public static final int A06 = Float.floatToIntBits(Float.NaN);
            public ByteBuffer A03;
            public ByteBuffer A04;
            public boolean A05;
            public int A01 = -1;
            public int A00 = -1;
            public int A02 = 0;

            @Override // X.InterfaceC21420zJ
            public int ABj() {
                return 4;
            }

            {
                ByteBuffer byteBuffer = InterfaceC21420zJ.A00;
                this.A03 = byteBuffer;
                this.A04 = byteBuffer;
            }

            @Override // X.InterfaceC21420zJ
            public boolean A6P(int i, int i2, int i3) {
                if (i3 != Integer.MIN_VALUE && i3 != 1073741824) {
                    throw new C21410zI(i, i2, i3);
                }
                if (this.A01 == i && this.A00 == i2 && this.A02 == i3) {
                    return false;
                }
                this.A01 = i;
                this.A00 = i2;
                this.A02 = i3;
                return true;
            }

            @Override // X.InterfaceC21420zJ
            public ByteBuffer ABh() {
                ByteBuffer byteBuffer = this.A04;
                this.A04 = InterfaceC21420zJ.A00;
                return byteBuffer;
            }

            @Override // X.InterfaceC21420zJ
            public int ABi() {
                return this.A00;
            }

            @Override // X.InterfaceC21420zJ
            public int ABk() {
                return this.A01;
            }

            @Override // X.InterfaceC21420zJ
            public boolean AF4() {
                int i = this.A02;
                return i == Integer.MIN_VALUE || i == 1073741824;
            }

            @Override // X.InterfaceC21420zJ
            public boolean AFE() {
                return this.A05 && this.A04 == InterfaceC21420zJ.A00;
            }

            @Override // X.InterfaceC21420zJ
            public void AR0() {
                this.A05 = true;
            }

            @Override // X.InterfaceC21420zJ
            public void AR1(ByteBuffer byteBuffer) {
                boolean z = this.A02 == 1073741824;
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                int i = limit - position;
                if (!z) {
                    i = (i / 3) << 2;
                }
                if (this.A03.capacity() < i) {
                    this.A03 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                } else {
                    this.A03.clear();
                }
                if (z) {
                    while (position < limit) {
                        ByteBuffer byteBuffer2 = this.A03;
                        int floatToIntBits = Float.floatToIntBits((float) (((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24)) * 4.656612875245797E-10d));
                        if (floatToIntBits == A06) {
                            floatToIntBits = Float.floatToIntBits(0.0f);
                        }
                        byteBuffer2.putInt(floatToIntBits);
                        position += 4;
                    }
                } else {
                    while (position < limit) {
                        ByteBuffer byteBuffer3 = this.A03;
                        int floatToIntBits2 = Float.floatToIntBits((float) ((((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24)) * 4.656612875245797E-10d));
                        if (floatToIntBits2 == A06) {
                            floatToIntBits2 = Float.floatToIntBits(0.0f);
                        }
                        byteBuffer3.putInt(floatToIntBits2);
                        position += 3;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                this.A03.flip();
                this.A04 = this.A03;
            }

            @Override // X.InterfaceC21420zJ
            public void flush() {
                this.A04 = InterfaceC21420zJ.A00;
                this.A05 = false;
            }

            @Override // X.InterfaceC21420zJ
            public void reset() {
                flush();
                this.A01 = -1;
                this.A00 = -1;
                this.A02 = 0;
                this.A03 = InterfaceC21420zJ.A00;
            }
        }};
        this.A00 = 1.0f;
        this.A0D = 0;
        this.A0P = C21350zC.A02;
        this.A01 = 0;
        this.A0R = new Object() { // from class: X.0zV
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && C21540zV.class == obj.getClass() && Float.compare(0.0f, 0.0f) == 0;
            }

            public int hashCode() {
                return Float.floatToIntBits(0.0f) + 16337;
            }
        };
        this.A0O = C21120yp.A04;
        this.A04 = -1;
        this.A0c = new InterfaceC21420zJ[0];
        this.A0d = new ByteBuffer[0];
        this.A0k = new ArrayDeque();
    }

    public final long A00() {
        return this.A0X ? this.A0L / this.A09 : this.A0K;
    }

    public void A01() {
        if (this.A0M != null) {
            this.A0J = 0L;
            this.A0I = 0L;
            this.A0L = 0L;
            this.A0K = 0L;
            this.A05 = 0;
            C21120yp c21120yp = this.A0N;
            if (c21120yp != null) {
                this.A0O = c21120yp;
                this.A0N = null;
            } else {
                ArrayDeque arrayDeque = this.A0k;
                if (!arrayDeque.isEmpty()) {
                    this.A0O = ((C21570zY) arrayDeque.getLast()).A02;
                }
            }
            this.A0k.clear();
            this.A0F = 0L;
            this.A0G = 0L;
            this.A0j.A07 = 0L;
            this.A0T = null;
            this.A0U = null;
            int i = 0;
            while (true) {
                InterfaceC21420zJ[] interfaceC21420zJArr = this.A0c;
                if (i >= interfaceC21420zJArr.length) {
                    break;
                }
                InterfaceC21420zJ interfaceC21420zJ = interfaceC21420zJArr[i];
                interfaceC21420zJ.flush();
                this.A0d[i] = interfaceC21420zJ.ABh();
                i++;
            }
            this.A0W = false;
            this.A04 = -1;
            this.A0S = null;
            this.A03 = 0;
            this.A0D = 0;
            C21530zU c21530zU = this.A0g;
            AudioTrack audioTrack = c21530zU.A0H;
            if (audioTrack != null) {
                if (audioTrack.getPlayState() == 3) {
                    this.A0M.pause();
                }
                final AudioTrack audioTrack2 = this.A0M;
                this.A0M = null;
                c21530zU.A0E = 0L;
                c21530zU.A04 = 0;
                c21530zU.A01 = 0;
                c21530zU.A09 = 0L;
                c21530zU.A0H = null;
                c21530zU.A0I = null;
                this.A0e.close();
                new Thread() { // from class: X.0zW
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        try {
                            AudioTrack audioTrack3 = audioTrack2;
                            audioTrack3.flush();
                            audioTrack3.release();
                        } finally {
                            C1ZD.this.A0e.open();
                        }
                    }
                }.start();
                return;
            }
            throw null;
        }
    }

    public final void A02() {
        if (this.A0M != null) {
            if (C08M.A00 >= 21) {
                this.A0M.setVolume(this.A00);
                return;
            }
            AudioTrack audioTrack = this.A0M;
            float f = this.A00;
            audioTrack.setStereoVolume(f, f);
        }
    }

    public final void A03() {
        InterfaceC21420zJ[] interfaceC21420zJArr;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC21420zJ interfaceC21420zJ : this.A0m) {
            if (interfaceC21420zJ.AF4()) {
                arrayList.add(interfaceC21420zJ);
            } else {
                interfaceC21420zJ.flush();
            }
        }
        int size = arrayList.size();
        this.A0c = (InterfaceC21420zJ[]) arrayList.toArray(new InterfaceC21420zJ[size]);
        this.A0d = new ByteBuffer[size];
        int i = 0;
        while (true) {
            InterfaceC21420zJ[] interfaceC21420zJArr2 = this.A0c;
            if (i < interfaceC21420zJArr2.length) {
                InterfaceC21420zJ interfaceC21420zJ2 = interfaceC21420zJArr2[i];
                interfaceC21420zJ2.flush();
                this.A0d[i] = interfaceC21420zJ2.ABh();
                i++;
            } else {
                return;
            }
        }
    }

    public final void A04(long j) {
        ByteBuffer byteBuffer;
        int length = this.A0c.length;
        int i = length;
        do {
            if (i > 0) {
                byteBuffer = this.A0d[i - 1];
            } else {
                byteBuffer = this.A0T;
                if (byteBuffer == null) {
                    byteBuffer = InterfaceC21420zJ.A00;
                }
            }
            if (i == length) {
                A05(byteBuffer, j);
            } else {
                InterfaceC21420zJ interfaceC21420zJ = this.A0c[i];
                interfaceC21420zJ.AR1(byteBuffer);
                ByteBuffer ABh = interfaceC21420zJ.ABh();
                this.A0d[i] = ABh;
                if (ABh.hasRemaining()) {
                    i++;
                    continue;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i--;
            continue;
        } while (i >= 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cc, code lost:
        if (r0 < r1) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A05(java.nio.ByteBuffer r10, long r11) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1ZD.A05(java.nio.ByteBuffer, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x002a -> B:8:0x000e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A06() {
        /*
            r9 = this;
            int r0 = r9.A04
            r8 = -1
            r7 = 1
            r6 = 0
            if (r0 != r8) goto L34
            boolean r0 = r9.A0Z
            if (r0 == 0) goto L30
            r0 = 0
        Lc:
            r9.A04 = r0
        Le:
            r5 = 1
        Lf:
            X.0zJ[] r4 = r9.A0c
            int r3 = r4.length
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 >= r3) goto L36
            r0 = r4[r0]
            if (r5 == 0) goto L20
            r0.AR0()
        L20:
            r9.A04(r1)
            boolean r0 = r0.AFE()
            if (r0 != 0) goto L2a
            return r6
        L2a:
            int r0 = r9.A04
            int r0 = r0 + r7
            r9.A04 = r0
            goto Le
        L30:
            X.0zJ[] r0 = r9.A0c
            int r0 = r0.length
            goto Lc
        L34:
            r5 = 0
            goto Lf
        L36:
            java.nio.ByteBuffer r0 = r9.A0U
            if (r0 == 0) goto L42
            r9.A05(r0, r1)
            java.nio.ByteBuffer r0 = r9.A0U
            if (r0 == 0) goto L42
            return r6
        L42:
            r9.A04 = r8
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1ZD.A06():boolean");
    }

    public boolean A07(int i, int i2) {
        if (C08M.A07(i2)) {
            return i2 != 4 || C08M.A00 >= 21;
        }
        C21360zD c21360zD = this.A0f;
        if (c21360zD == null || Arrays.binarySearch(c21360zD.A01, i2) < 0) {
            return false;
        }
        return i == -1 || i <= c21360zD.A00;
    }
}
