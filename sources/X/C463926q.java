package X;

import android.os.Message;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.26q  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C463926q implements C0EK {
    public static volatile C463926q A06;
    public final C41541u6 A00;
    public final C05E A01;
    public final C0ES A02;
    public final C0EG A03;
    public final C22P A04;
    public final InterfaceC002901k A05;

    @Override // X.C0EK
    public int[] AAP() {
        return new int[]{8};
    }

    public C463926q(InterfaceC002901k interfaceC002901k, C0EG c0eg, C41541u6 c41541u6, C0ES c0es, C22P c22p, C05E c05e) {
        this.A05 = interfaceC002901k;
        this.A03 = c0eg;
        this.A00 = c41541u6;
        this.A02 = c0es;
        this.A04 = c22p;
        this.A01 = c05e;
    }

    @Override // X.C0EK
    public boolean AEN(int i, Message message) {
        C22R c22r;
        if (8 != i) {
            return false;
        }
        AnonymousClass280 anonymousClass280 = (AnonymousClass280) message.obj;
        String str = anonymousClass280.A01;
        if ("groups".equals(str)) {
            if (this.A01.A00) {
                Log.i("DirtyBitHandler/onGroupsDirty call refetchGroups");
                C0ES c0es = this.A02;
                c0es.A03.set(true);
                if (!c0es.A0m) {
                    c0es.A0N(true, true, 3);
                }
                return true;
            }
            Log.i("DirtyBitHandler/onGroupsDirty/no-db-access/skip");
            return true;
        } else if ("account_sync".equals(str)) {
            if (this.A01.A00) {
                C22P c22p = this.A04;
                Set set = anonymousClass280.A02;
                C22Q c22q = new C22Q();
                if (set.isEmpty()) {
                    c22q.A05 = true;
                    c22q.A03 = true;
                    c22q.A04 = true;
                    c22q.A02 = true;
                    c22q.A01 = true;
                    c22r = new C22R(c22q);
                } else {
                    c22q.A02 = set.contains("device");
                    c22q.A05 = set.contains("status");
                    c22q.A03 = set.contains("picture");
                    c22q.A04 = set.contains("privacy");
                    c22q.A01 = set.contains("blocklist");
                    c22r = new C22R(c22q);
                }
                c22p.A01(c22r, true, false);
                return true;
            }
            Log.i("DirtyBitHandler/onAccountDirty/no-db-access/skip");
            return true;
        } else if ("syncd_app_state".equals(str)) {
            Log.i("OnDirtyMessageHandler/onSyncDDirty");
            this.A05.AS1(new RunnableEBaseShape3S0200000_I0_3(this, anonymousClass280, 39));
            return true;
        } else {
            C000200d.A1O(C000200d.A0P("OnDirtyMessageHandler/onDirty received unknown dirty bit category: "), str);
            this.A03.A0P(anonymousClass280.A01, null);
            return true;
        }
    }
}
