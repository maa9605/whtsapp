package X;

import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.Random;

/* renamed from: X.0Fe */
/* loaded from: classes.dex */
public class C03310Fe {
    public static volatile C03310Fe A09;
    public final C0G6 A00;
    public final C000500h A01;
    public final C0G7 A02;
    public final C0G8 A03 = new C0G8(new Random(), 3, 200);
    public final InterfaceC002901k A04;
    public final JniBridge A05;
    public static final byte[] A06 = "backup encryption".getBytes();
    public static final byte[] A08 = "metadata encryption".getBytes();
    public static final byte[] A07 = "metadata authentication".getBytes();

    public C03310Fe(InterfaceC002901k interfaceC002901k, JniBridge jniBridge, C0G6 c0g6, C000500h c000500h, C0G7 c0g7) {
        this.A04 = interfaceC002901k;
        this.A05 = jniBridge;
        this.A00 = c0g6;
        this.A01 = c000500h;
        this.A02 = c0g7;
    }

    public static C03310Fe A00() {
        if (A09 == null) {
            synchronized (C03310Fe.class) {
                if (A09 == null) {
                    InterfaceC002901k A00 = C002801j.A00();
                    JniBridge jniBridge = JniBridge.getInstance();
                    if (C0G6.A01 == null) {
                        synchronized (C0G6.class) {
                            if (C0G6.A01 == null) {
                                C0G6.A01 = new C0G6(C001200o.A01);
                            }
                        }
                    }
                    C0G6 c0g6 = C0G6.A01;
                    C000500h A002 = C000500h.A00();
                    if (C0G7.A01 == null) {
                        synchronized (C0G7.class) {
                            if (C0G7.A01 == null) {
                                C0G7.A01 = new C0G7(C05Y.A01());
                            }
                        }
                    }
                    A09 = new C03310Fe(A00, jniBridge, c0g6, A002, C0G7.A01);
                }
            }
        }
        return A09;
    }

    public void A01(InterfaceC37941nI interfaceC37941nI) {
        final C0G7 c0g7 = this.A02;
        final C1NV c1nv = new C1NV(this, interfaceC37941nI);
        C05Y c05y = c0g7.A00;
        String A02 = c05y.A02();
        C000200d.A14("EncryptedBackupProtocolHelper/sendDeleteAccountIq id=", A02);
        c05y.A07(255, A02, new C02590Ca("iq", new C04P[]{new C04P("id", A02), new C04P("xmlns", "vesta"), new C04P("type", "set"), new C04P("to", "s.whatsapp.net")}, new C02590Ca("delete", null)), new InterfaceC010405f() { // from class: X.1nH
            @Override // X.InterfaceC010405f
            public void AJI(String str) {
                C000200d.A13("EncryptedBackupProtocolHelper/onDeliveryFailure id=", str);
                c1nv.AJu("delivery failure", 3);
            }

            @Override // X.InterfaceC010405f
            public void AJx(String str, C02590Ca c02590Ca) {
                C0G7.A00(str, c02590Ca, c1nv);
            }

            @Override // X.InterfaceC010405f
            public void APJ(String str, C02590Ca c02590Ca) {
                C0G7 c0g72 = c0g7;
                InterfaceC37941nI interfaceC37941nI2 = c1nv;
                if (c0g72 != null) {
                    StringBuilder sb = new StringBuilder("EncryptedBackupProtocolHelper/onSuccess id=");
                    sb.append(str);
                    Log.i(sb.toString());
                    if (c02590Ca.A0D("success") == null) {
                        StringBuilder sb2 = new StringBuilder("EncryptedBackupProtocolHelper/success was empty id=");
                        sb2.append(str);
                        Log.e(sb2.toString());
                        interfaceC37941nI2.AJu("success was empty", 1);
                        return;
                    }
                    interfaceC37941nI2.APE();
                    return;
                }
                throw null;
            }
        }, 32000L);
    }
}
