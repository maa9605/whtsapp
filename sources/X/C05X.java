package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.05X */
/* loaded from: classes.dex */
public class C05X {
    public static volatile C05X A0A;
    public String A00;
    public boolean A01;
    public final AbstractC000600i A03;
    public final C02L A04;
    public final C010005b A06;
    public final C001200o A07;
    public final C000500h A08;
    public final C05Y A09;
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final C010705i A05 = new C010705i();

    public C05X(C001200o c001200o, AbstractC000600i abstractC000600i, C02L c02l, C05Y c05y, C010005b c010005b, C000500h c000500h) {
        this.A07 = c001200o;
        this.A03 = abstractC000600i;
        this.A04 = c02l;
        this.A09 = c05y;
        this.A06 = c010005b;
        this.A08 = c000500h;
    }

    public static C05X A00() {
        if (A0A == null) {
            synchronized (C05X.class) {
                if (A0A == null) {
                    A0A = new C05X(C001200o.A01, AbstractC000600i.A00(), C02L.A00(), C05Y.A01(), C010005b.A07, C000500h.A00());
                }
            }
        }
        return A0A;
    }

    public String A01() {
        String str = this.A00;
        if (str == null) {
            A02(null);
            String string = this.A08.A00.getString("my_current_status", null);
            return string != null ? string : this.A07.A00.getString(R.string.info_default_empty);
        }
        return str;
    }

    public void A02(C0NA c0na) {
        if (this.A01) {
            return;
        }
        C0OV c0ov = new C0OV(this.A07, this.A03, this.A09, new C35371j2(this, c0na));
        C02L c02l = this.A04;
        c02l.A05();
        UserJid userJid = c02l.A03;
        if (userJid != null) {
            c0ov.A00(userJid, 0L);
            this.A01 = true;
            return;
        }
        throw null;
    }

    public void A03(String str, String str2) {
        this.A00 = str;
        this.A01 = false;
        this.A08.A0Z(str, str2);
        Handler handler = this.A02;
        final C010705i c010705i = this.A05;
        handler.post(new Runnable() { // from class: X.1Jm
            @Override // java.lang.Runnable
            public final void run() {
                c010705i.A02();
            }
        });
    }

    public boolean A04(String str, InterfaceC07770Zu interfaceC07770Zu, C0I3 c0i3, C0I4 c0i4, C04500Kk c04500Kk) {
        if (this.A06.A06) {
            this.A09.A09(Message.obtain(null, 0, 29, 0, new C0ZH(str, interfaceC07770Zu, c0i3, c0i4, c04500Kk)));
            return true;
        }
        return false;
    }
}
