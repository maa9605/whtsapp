package X;

import com.whatsapp.util.Log;

/* renamed from: X.1kX  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C36281kX extends C0MU {
    public final C03310Fe A05;
    public final C000500h A06;
    public final C0HK A04 = new C0HK();
    public final C0HK A00 = new C0HK();
    public final C0HK A01 = new C0HK();
    public final C0HK A03 = new C0HK();
    public final C0HK A02 = new C0HK();

    public C36281kX(C03310Fe c03310Fe, C000500h c000500h) {
        this.A05 = c03310Fe;
        this.A06 = c000500h;
    }

    public static void A00(C36281kX c36281kX, int i) {
        if (c36281kX == null) {
            throw null;
        }
        if (i == 0) {
            Log.i("EncBackupViewModel/enabled encrypted backup");
            c36281kX.A01.A0A(3);
            c36281kX.A00.A0A(600);
            return;
        }
        Log.e("EncBackupViewModel/failed to enable encrypted backup");
        c36281kX.A01.A0A(4);
    }

    public static void A01(C36281kX c36281kX, int i) {
        if (c36281kX == null) {
            throw null;
        }
        if (i == 0) {
            Log.i("EncBackupViewModel/successfully changed password");
            c36281kX.A01.A0A(3);
            c36281kX.A00.A0A(402);
            return;
        }
        Log.e("EncBackupViewModel/failed to change password");
        c36281kX.A01.A0A(4);
    }

    public static void A02(C36281kX c36281kX, int i) {
        if (c36281kX == null) {
            throw null;
        }
        if (i == 0) {
            Log.i("EncBackupViewModel/successfully verified password");
            c36281kX.A01.A0A(3);
            C0HK c0hk = c36281kX.A04;
            Object A01 = c0hk.A01();
            if (A01 != null) {
                if (((Number) A01).intValue() == 3) {
                    c36281kX.A00.A0A(301);
                    return;
                }
                Object A012 = c0hk.A01();
                if (A012 != null) {
                    if (((Number) A012).intValue() != 4) {
                        return;
                    }
                    c36281kX.A00.A0A(300);
                    return;
                }
                throw null;
            }
            throw null;
        } else if (i == 8) {
            Log.i("EncBackupViewModel/invalid password");
            c36281kX.A01.A0A(5);
        } else {
            Log.e("EncBackupViewModel/failed to verify password");
            c36281kX.A01.A0A(4);
        }
    }

    public static void A03(C36281kX c36281kX, int i) {
        if (c36281kX == null) {
            throw null;
        }
        if (i == 0) {
            Log.i("EncBackupViewModel/enabled encrypted backup");
            c36281kX.A01.A0A(3);
            c36281kX.A00.A0A(401);
            return;
        }
        Log.e("EncBackupViewModel/failed to enable encrypted backup");
        c36281kX.A01.A0A(4);
    }

    public static void A04(C36281kX c36281kX, boolean z, int i, int i2) {
        if (c36281kX == null) {
            throw null;
        }
        if (z) {
            Log.i("EncBackupViewModel/successfully retrieved backup key");
            c36281kX.A01.A0A(3);
            c36281kX.A03.A0A(-1);
        } else if (i == 8) {
            Log.i("EncBackupViewModel/invalid password");
            c36281kX.A01.A0A(5);
            if (i2 != 0) {
                return;
            }
            Log.i("EncBackupViewModel/all password attempts used");
        } else {
            Log.e("EncBackupViewModel/failed to retrieve backup key");
            c36281kX.A01.A0A(4);
        }
    }

    public void A05(int i) {
        this.A03.A0B(Integer.valueOf(i));
    }

    public void A06(int i) {
        this.A00.A0B(Integer.valueOf(i));
    }
}
