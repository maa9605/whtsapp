package X;

import com.whatsapp.gallery.MediaGalleryActivity;

/* renamed from: X.3K9  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3K9 extends C2KV {
    public final /* synthetic */ MediaGalleryActivity A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3K9(MediaGalleryActivity mediaGalleryActivity, ActivityC02320As activityC02320As, C018508q c018508q, C02980Dr c02980Dr, C2M4 c2m4, C02L c02l, InterfaceC002901k interfaceC002901k, C2MG c2mg, AnonymousClass011 anonymousClass011, C01B c01b, C41541u6 c41541u6, C018608r c018608r, C2MN c2mn, C018308n c018308n, C05W c05w, C0ED c0ed, C02E c02e, C018708s c018708s, C002301c c002301c, C0ES c0es, C2AR c2ar, C2AT c2at, C43081wp c43081wp, C42451vl c42451vl, C41771uU c41771uU, C0C8 c0c8, C02O c02o) {
        super(activityC02320As, c018508q, c02980Dr, c2m4, c02l, interfaceC002901k, c2mg, anonymousClass011, c01b, c41541u6, c018608r, c2mn, c018308n, c05w, c0ed, c02e, c018708s, c002301c, c0es, c2ar, c2at, c43081wp, c42451vl, c41771uU, c0c8, c02o);
        this.A00 = mediaGalleryActivity;
    }

    @Override // X.C0O8
    public void AJK(C0U0 c0u0) {
        MediaGalleryActivity mediaGalleryActivity = this.A00;
        C59232sQ c59232sQ = mediaGalleryActivity.A0G;
        if (c59232sQ != null) {
            c59232sQ.A00();
            mediaGalleryActivity.A0G = null;
        }
        mediaGalleryActivity.A07 = null;
        for (C0BA c0ba : mediaGalleryActivity.A0t()) {
            if (c0ba instanceof InterfaceC53322di) {
                ((InterfaceC53322di) c0ba).AOT();
            }
        }
    }
}
