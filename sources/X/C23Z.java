package X;

import com.whatsapp.util.Log;

/* renamed from: X.23Z  reason: invalid class name */
/* loaded from: classes2.dex */
public class C23Z {
    public static volatile C23Z A06;
    public final C018508q A00;
    public final C02L A01;
    public final C01J A02;
    public final C01R A03;
    public final C0C9 A04;
    public final C456823b A05;

    public C23Z(C018508q c018508q, C02L c02l, C01R c01r, C0C9 c0c9, C01J c01j, C456823b c456823b) {
        this.A00 = c018508q;
        this.A01 = c02l;
        this.A03 = c01r;
        this.A04 = c0c9;
        this.A02 = c01j;
        this.A05 = c456823b;
    }

    public static C23Z A00() {
        if (A06 == null) {
            synchronized (C0F4.class) {
                if (A06 == null) {
                    A06 = new C23Z(C018508q.A00(), C02L.A00(), C01R.A02, C0C9.A00(), C01J.A00(), C456823b.A01);
                }
            }
        }
        return A06;
    }

    public final void A01(AbstractC005302j abstractC005302j) {
        C018508q c018508q = this.A00;
        c018508q.A02.post(new RunnableEBaseShape2S0200000_I0_2(this, abstractC005302j, 18));
    }

    public void A02(AnonymousClass092 anonymousClass092, int i) {
        if (i == 1) {
            Log.i("groupactionhandler/handleGroupAction/handle-init-group-chat");
            this.A04.A0Q(anonymousClass092);
        } else if (i == 2) {
            Log.i("groupactionhandler/handleGroupAction/handle_add_groupchat_msg");
            this.A04.A0Q(anonymousClass092);
            A01(anonymousClass092.A0n.A00);
        } else if (i == 4) {
            Log.i("groupactionhandler/handleGroupAction/handle_groupchat_subject_change");
            this.A04.A0Q(anonymousClass092);
            A01(anonymousClass092.A0n.A00);
        } else if (i != 7) {
            if (i == 3009) {
                Log.i("groupactionhandler/handleGroupAction/handle groupchat announcements only change");
                this.A04.A0Q(anonymousClass092);
                A01(anonymousClass092.A0n.A00);
                return;
            }
            throw new RuntimeException(C000200d.A0D("Unhandled action ", i));
        } else {
            Log.i("groupactionhandler/handle_user_remove");
            C01R c01r = this.A03;
            c01r.A00.submit(new RunnableEBaseShape2S0200000_I0_2(this, anonymousClass092, 19));
            this.A04.A0Q(anonymousClass092);
            A01(anonymousClass092.A0n.A00);
        }
    }
}
