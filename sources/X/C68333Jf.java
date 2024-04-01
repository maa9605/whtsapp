package X;

import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.util.Log;

/* renamed from: X.3Jf  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C68333Jf extends C2KV {
    public final /* synthetic */ MediaAlbumActivity A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68333Jf(MediaAlbumActivity mediaAlbumActivity, ActivityC02320As activityC02320As, C018508q c018508q, C02980Dr c02980Dr, C2M4 c2m4, C02L c02l, InterfaceC002901k interfaceC002901k, C2MG c2mg, AnonymousClass011 anonymousClass011, C01B c01b, C41541u6 c41541u6, C018608r c018608r, C2MN c2mn, C018308n c018308n, C05W c05w, C0ED c0ed, C02E c02e, C018708s c018708s, C002301c c002301c, C0ES c0es, C2AR c2ar, C2AT c2at, C43081wp c43081wp, C42451vl c42451vl, C41771uU c41771uU, C0C8 c0c8, C02O c02o) {
        super(activityC02320As, c018508q, c02980Dr, c2m4, c02l, interfaceC002901k, c2mg, anonymousClass011, c01b, c41541u6, c018608r, c2mn, c018308n, c05w, c0ed, c02e, c018708s, c002301c, c0es, c2ar, c2at, c43081wp, c42451vl, c41771uU, c0c8, c02o);
        this.A00 = mediaAlbumActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r3.A01((X.AbstractC011205o) r6).A0B(r3.A01) != false) goto L19;
     */
    @Override // X.C2KV, X.C0O8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean AGv(X.C0U0 r10, android.view.MenuItem r11) {
        /*
            r9 = this;
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r2 = r9.A00
            X.2sQ r0 = r2.A0G
            r8 = 1
            if (r0 == 0) goto L80
            int r0 = r0.size()
            if (r0 == 0) goto L80
            int r1 = r11.getItemId()
            r0 = 2131363564(0x7f0a06ec, float:1.834694E38)
            if (r1 != r0) goto L67
            X.092 r7 = r9.A01()
            if (r2 == 0) goto L65
            X.094 r5 = r7.A0n
            X.02j r6 = r5.A00
            if (r6 == 0) goto L63
            X.05W r0 = r2.A06
            X.06C r4 = r0.A0A(r6)
            boolean r0 = r4.A0C()
            if (r0 == 0) goto L3f
            X.0C8 r3 = r2.A0A
            r0 = r6
            X.05o r0 = (X.AbstractC011205o) r0
            X.0Ce r1 = r3.A01(r0)
            X.02L r0 = r3.A01
            boolean r0 = r1.A0B(r0)
            if (r0 == 0) goto L4d
        L3f:
            boolean r0 = r4.A0Q
            if (r0 == 0) goto L54
            X.0C8 r0 = r2.A0A
            com.whatsapp.jid.GroupJid r6 = (com.whatsapp.jid.GroupJid) r6
            boolean r0 = r0.A06(r6)
            if (r0 != 0) goto L54
        L4d:
            r2.A1Z(r7)
        L50:
            r9.A03()
            return r8
        L54:
            java.lang.Class<com.whatsapp.status.playback.MessageReplyActivity> r1 = com.whatsapp.status.playback.MessageReplyActivity.class
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2, r1)
            android.content.Intent r0 = X.C0LD.A00(r0, r5)
            r2.startActivity(r0)
            goto L50
        L63:
            r0 = 0
            throw r0
        L65:
            r0 = 0
            throw r0
        L67:
            int r1 = r11.getItemId()
            r0 = 2131363565(0x7f0a06ed, float:1.8346942E38)
            if (r1 != r0) goto L7b
            X.092 r0 = r9.A01()
            r2.A1Z(r0)
            r9.A03()
            return r8
        L7b:
            boolean r0 = super.AGv(r10, r11)
            return r0
        L80:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68333Jf.AGv(X.0U0, android.view.MenuItem):boolean");
    }

    @Override // X.C0O8
    public void AJK(C0U0 c0u0) {
        Log.i("starred/selectionended");
        Log.i("conversation/selectionended");
        MediaAlbumActivity mediaAlbumActivity = this.A00;
        C59232sQ c59232sQ = ((AbstractActivityC04650Lh) mediaAlbumActivity).A0G;
        if (c59232sQ != null) {
            c59232sQ.A00();
            ((AbstractActivityC04650Lh) mediaAlbumActivity).A0G = null;
        }
        mediaAlbumActivity.A07.notifyDataSetChanged();
        ((AbstractActivityC04650Lh) mediaAlbumActivity).A00 = null;
    }
}
