package X;

import android.widget.TextView;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3hi  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C77133hi {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ AnonymousClass093 A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ C2OS A03;
    public final /* synthetic */ C2OU A04;
    public final /* synthetic */ boolean A05 = true;

    public C77133hi(C2OU c2ou, AnonymousClass093 anonymousClass093, UserJid userJid, C2OS c2os, TextView textView) {
        this.A04 = c2ou;
        this.A01 = anonymousClass093;
        this.A02 = userJid;
        this.A03 = c2os;
        this.A00 = textView;
    }

    public void A00() {
        C018508q c018508q = this.A04.A00;
        c018508q.A02.post(new C3NQ(this, this.A00, this.A01, this.A05));
    }
}
