package X;

import android.graphics.BitmapFactory;
import android.util.Base64;
import java.util.Arrays;

/* renamed from: X.0Hp  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03900Hp {
    public Float A00;
    public boolean A01;
    public boolean A02;
    public byte[] A03;
    public final AnonymousClass092 A04;

    public static boolean A01(byte b) {
        return b == 1 || b == 3 || b == 13 || b == 9 || b == 5 || b == 16 || b == 23 || b == 37 || b == 24 || b == 44 || b == 20 || b == 25 || b == 26 || b == 28 || b == 29 || b == 30 || b == 42 || b == 43 || b == 45 || b == 52;
    }

    public C03900Hp(AnonymousClass092 anonymousClass092) {
        if (A01(anonymousClass092.A0m)) {
            this.A04 = anonymousClass092;
            return;
        }
        throw new IllegalStateException("this message should not have a thumbnail");
    }

    public static float A00(byte[] bArr) {
        int i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        int i2 = options.outWidth;
        if (i2 <= 0 || (i = options.outHeight) <= 0) {
            return -1.0f;
        }
        return i / i2;
    }

    public synchronized void A02(byte[] bArr) {
        if (!this.A01) {
            this.A03 = bArr;
            this.A01 = true;
        }
    }

    public synchronized void A03(byte[] bArr) {
        A04(bArr, false);
    }

    public synchronized void A04(byte[] bArr, boolean z) {
        C09H c09h;
        AnonymousClass092 anonymousClass092 = this.A04;
        if ((anonymousClass092 instanceof AnonymousClass097) && (c09h = ((AnonymousClass097) anonymousClass092).A02) != null) {
            if (bArr != null) {
                c09h.A00 = A00(bArr);
            } else {
                c09h.A00 = -1.0f;
            }
        }
        if (z) {
            anonymousClass092.A0w(bArr);
            this.A02 = false;
        } else {
            anonymousClass092.A0w(null);
            this.A02 = true;
        }
        this.A00 = null;
        this.A01 = true;
        this.A03 = bArr;
    }

    public synchronized boolean A05() {
        if (!this.A01 || this.A03 == null) {
            AnonymousClass092 anonymousClass092 = this.A04;
            if (anonymousClass092.A03() != 0 || anonymousClass092.A0G() == null || anonymousClass092.A0G().length() <= 0) {
                if (anonymousClass092.A15() == null || anonymousClass092.A15().length <= 0) {
                    if (anonymousClass092 instanceof C0KD) {
                        return ((C0KD) anonymousClass092).A02 == 2;
                    } else if (anonymousClass092 instanceof AnonymousClass097) {
                        C09H c09h = ((AnonymousClass097) anonymousClass092).A02;
                        if (c09h == null || c09h.A00 <= 0.0f) {
                            r3 = false;
                        }
                        return r3;
                    } else {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public synchronized boolean A06() {
        return this.A01;
    }

    public byte[] A07() {
        byte[] A15;
        String A0G;
        AnonymousClass092 anonymousClass092 = this.A04;
        if (anonymousClass092.A03() == 0 && (A0G = anonymousClass092.A0G()) != null && A0G.length() > 0) {
            try {
                return Base64.decode(anonymousClass092.A0G(), 0);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        } else if (anonymousClass092.A03() != 1 || (A15 = anonymousClass092.A15()) == null || A15.length <= 0) {
            return null;
        } else {
            return A15;
        }
    }

    public synchronized byte[] A08() {
        if (this.A01) {
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("thumbnail not loaded, key=");
            sb.append(this.A04.A0n);
            throw new IllegalStateException(sb.toString());
        }
        return this.A03;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C03900Hp.class != obj.getClass()) {
            return false;
        }
        C03900Hp c03900Hp = (C03900Hp) obj;
        if (this.A04.A0n.equals(c03900Hp.A04.A0n)) {
            byte[] bArr = this.A03;
            if (bArr == null) {
                if (c03900Hp.A03 != null) {
                    return false;
                }
            } else if (!Arrays.equals(bArr, c03900Hp.A03)) {
                return false;
            }
            Float f = this.A00;
            Float f2 = c03900Hp.A00;
            if (f == null) {
                if (f2 != null) {
                    return false;
                }
            } else if (!f.equals(f2)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
