package X;

import android.app.Application;
import com.whatsapp.Me;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.concurrent.Callable;

/* renamed from: X.02L */
/* loaded from: classes.dex */
public class C02L {
    public static volatile C02L A07;
    public Me A00;
    public C0K1 A01;
    public DeviceJid A02;
    public UserJid A03;
    public final C004802e A04 = new C004802e();
    public final C001200o A05;
    public final C000500h A06;

    public C02L(C001200o c001200o, C000500h c000500h) {
        this.A05 = c001200o;
        this.A06 = c000500h;
    }

    public static C02L A00() {
        if (A07 == null) {
            synchronized (C02L.class) {
                if (A07 == null) {
                    A07 = new C02L(C001200o.A01, C000500h.A00());
                }
            }
        }
        return A07;
    }

    public Me A01() {
        C05970Ra c05970Ra;
        Me me;
        Log.i("memanager/getoldme");
        A05();
        Application application = this.A05.A00;
        Me me2 = null;
        if (!new File(application.getFilesDir(), "me_old").exists()) {
            return null;
        }
        try {
            FileInputStream openFileInput = application.openFileInput("me_old");
            try {
                c05970Ra = new C05970Ra(openFileInput);
                me = (Me) c05970Ra.readObject();
            } catch (Throwable th) {
                th = th;
            }
            try {
                c05970Ra.close();
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                        return me;
                    } catch (IOException e) {
                        e = e;
                        me2 = me;
                        Log.e("memanager/read_old_me/io_error", e);
                        return me2;
                    } catch (ClassNotFoundException e2) {
                        e = e2;
                        me2 = me;
                        Log.w("memanager/read_old_me/serialization_error", e);
                        return me2;
                    }
                }
                return me;
            } catch (Throwable th2) {
                th = th2;
                me2 = me;
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (ClassNotFoundException e4) {
            e = e4;
        }
    }

    public String A02() {
        return this.A06.A00.getString("push_name", "");
    }

    public void A03() {
        Log.i("memanager/clearMe");
        A05();
        A06(null);
    }

    public void A04() {
        Log.i("memanager/deleteoldme");
        A05();
        new File(this.A05.A00.getFilesDir(), "me_old").delete();
    }

    public void A05() {
        C004802e c004802e = this.A04;
        if (c004802e.A06()) {
            c004802e.A04(new Callable() { // from class: X.0RZ
                {
                    C02L.this = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C02L c02l = C02L.this;
                    try {
                        C003601s.A01("MeManager/loadMe");
                        C004802e c004802e2 = c02l.A04;
                        c004802e2.A03();
                        Log.i("memanager/load-me");
                        Application application = c02l.A05.A00;
                        if (new File(application.getFilesDir(), "me").exists()) {
                            try {
                                FileInputStream openFileInput = application.openFileInput("me");
                                try {
                                    C05970Ra c05970Ra = new C05970Ra(openFileInput);
                                    c02l.A06((Me) c05970Ra.readObject());
                                    c004802e2.A01();
                                    c05970Ra.close();
                                    if (openFileInput != null) {
                                        openFileInput.close();
                                    }
                                } finally {
                                }
                            } catch (IOException e) {
                                Log.e("memanager/read_me/io_error", e);
                            } catch (ClassNotFoundException e2) {
                                Log.w("memanager/read_me/serialization_error", e2);
                            }
                        }
                        if (c004802e2.A06()) {
                            c004802e2.A02();
                        }
                        C003601s.A00();
                        return null;
                    } catch (Throwable th) {
                        C004802e c004802e3 = c02l.A04;
                        if (c004802e3.A06()) {
                            c004802e3.A02();
                        }
                        C003601s.A00();
                        throw th;
                    }
                }
            });
            c004802e.A00();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0015 A[Catch: 05p -> 0x001f, TryCatch #0 {05p -> 0x001f, blocks: (B:28:0x0009, B:30:0x000d, B:31:0x0011, B:33:0x0015, B:34:0x001c), top: B:43:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x001c A[Catch: 05p -> 0x001f, TRY_LEAVE, TryCatch #0 {05p -> 0x001f, blocks: (B:28:0x0009, B:30:0x000d, B:31:0x0011, B:33:0x0015, B:34:0x001c), top: B:43:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0056  */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.06C, X.0K1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A06(com.whatsapp.Me r5) {
        /*
            r4 = this;
            r4.A00 = r5
            r3 = 0
            r2 = 0
            if (r5 == 0) goto L7
            goto L9
        L7:
            r0 = r2
            goto L11
        L9:
            java.lang.String r0 = r5.jabber_id     // Catch: X.C011305p -> L1f
            if (r0 == 0) goto L7
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.getFromIdentifier(r0)     // Catch: X.C011305p -> L1f
        L11:
            r4.A03 = r0     // Catch: X.C011305p -> L1f
            if (r0 == 0) goto L1c
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.getFromUserJidAndDeviceId(r0, r3)     // Catch: X.C011305p -> L1f
            r4.A02 = r0     // Catch: X.C011305p -> L1f
            goto L29
        L1c:
            r4.A02 = r2     // Catch: X.C011305p -> L1f
            goto L29
        L1f:
            r1 = move-exception
            java.lang.String r0 = "memanager/setMe/invalid_jid_error"
            com.whatsapp.util.Log.e(r0, r1)
            r4.A03 = r2
            r4.A02 = r2
        L29:
            com.whatsapp.jid.UserJid r0 = r4.A03
            if (r0 != 0) goto L56
            r4.A01 = r2
        L2f:
            java.lang.String r0 = "memanager/setMe me: "
            java.lang.StringBuilder r1 = X.C000200d.A0P(r0)
            com.whatsapp.Me r0 = r4.A00
            r1.append(r0)
            java.lang.String r0 = ", myUserJid: "
            r1.append(r0)
            com.whatsapp.jid.UserJid r0 = r4.A03
            r1.append(r0)
            java.lang.String r0 = ", myDeviceJid: "
            r1.append(r0)
            com.whatsapp.jid.DeviceJid r0 = r4.A02
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i(r0)
            return
        L56:
            X.0K1 r1 = new X.0K1
            r1.<init>(r0)
            r4.A01 = r1
            X.00h r0 = r4.A06
            android.content.SharedPreferences r2 = r0.A00
            java.lang.String r0 = "profile_photo_thumb_id"
            int r0 = r2.getInt(r0, r3)
            r1.A02 = r0
            X.0K1 r1 = r4.A01
            java.lang.String r0 = "profile_photo_full_id"
            int r0 = r2.getInt(r0, r3)
            r1.A01 = r0
            X.0K1 r1 = r4.A01
            java.lang.String r0 = r4.A02()
            r1.A0O = r0
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02L.A06(com.whatsapp.Me):void");
    }

    public void A07(String str) {
        this.A06.A0D().putString("push_name", str).apply();
        A05();
        C0K1 c0k1 = this.A01;
        if (c0k1 != null) {
            c0k1.A0O = str;
        }
    }

    /* JADX WARN: Finally extract failed */
    public final boolean A08(Me me, String str) {
        C000200d.A14("memanager/save ", str);
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(this.A05.A00.openFileOutput(str, 0));
            try {
                objectOutputStream.writeObject(me);
                objectOutputStream.close();
                return true;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        objectOutputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th2;
                }
            }
        } catch (FileNotFoundException e) {
            StringBuilder sb = new StringBuilder("memanager/save/notfounderror ");
            sb.append(str);
            Log.e(sb.toString(), e);
            return false;
        } catch (IOException e2) {
            StringBuilder sb2 = new StringBuilder("memanager/save/ioerror ");
            sb2.append(str);
            Log.e(sb2.toString(), e2);
            return false;
        }
    }

    public boolean A09(DeviceJid deviceJid) {
        if (deviceJid != null) {
            UserJid userJid = deviceJid.userJid;
            A05();
            if (userJid.equals(this.A03) && (!deviceJid.isPrimary())) {
                return true;
            }
        }
        return false;
    }

    public boolean A0A(Jid jid) {
        if (jid != null) {
            A05();
            if (jid.equals(this.A03)) {
                return true;
            }
        }
        return false;
    }
}
