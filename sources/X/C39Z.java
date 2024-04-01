package X;

import android.graphics.Bitmap;
import com.whatsapp.jid.UserJid;

/* renamed from: X.39Z  reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C39Z implements InterfaceC49482Kq {
    public final /* synthetic */ C2JU A00;
    public final /* synthetic */ UserJid A01;

    public /* synthetic */ C39Z(C2JU c2ju, UserJid userJid) {
        this.A00 = c2ju;
        this.A01 = userJid;
    }

    @Override // X.InterfaceC49482Kq
    public final void ALY(C40231ro c40231ro, Bitmap bitmap, boolean z) {
        C2JU c2ju = this.A00;
        UserJid userJid = this.A01;
        C05920Qu c05920Qu = c2ju.A00;
        if (c05920Qu != null) {
            c05920Qu.A0F = C05920Qu.A06(bitmap);
            c2ju.A02(userJid);
        }
    }
}
