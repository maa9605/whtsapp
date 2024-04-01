package X;

import com.whatsapp.data.ProfilePhotoChange;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.3Tk  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC70733Tk extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ AbstractC005302j A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ C04420Kc A04;
    public final /* synthetic */ AnonymousClass279 A05;

    public /* synthetic */ RunnableC70733Tk(AnonymousClass279 anonymousClass279, C04420Kc c04420Kc, AbstractC005302j abstractC005302j, UserJid userJid, int i, long j) {
        this.A05 = anonymousClass279;
        this.A04 = c04420Kc;
        this.A02 = abstractC005302j;
        this.A03 = userJid;
        this.A00 = i;
        this.A01 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ProfilePhotoChange profilePhotoChange;
        AnonymousClass279 anonymousClass279 = this.A05;
        C04420Kc c04420Kc = this.A04;
        AbstractC005302j abstractC005302j = this.A02;
        UserJid userJid = this.A03;
        int i = this.A00;
        long j = this.A01;
        StringBuilder sb = new StringBuilder("ProfilePictureNotificationHandler/profilephotochange ");
        sb.append(abstractC005302j);
        sb.append(" author:");
        sb.append(userJid);
        sb.append(" photoId:");
        C000200d.A1F(sb, i);
        C06C A0A = anonymousClass279.A02.A0A(abstractC005302j);
        C02L c02l = anonymousClass279.A01;
        c02l.A05();
        if (c02l.A03 != null) {
            boolean z = true;
            if (!c02l.A0A(userJid)) {
                anonymousClass279.A08.A08(abstractC005302j, i, true);
            }
            if (A0A.A0C() && userJid != null && !c02l.A0A(userJid)) {
                File A04 = anonymousClass279.A03.A04(A0A);
                if (A04.exists()) {
                    profilePhotoChange = new ProfilePhotoChange();
                    profilePhotoChange.newPhotoId = i;
                    try {
                        profilePhotoChange.oldPhoto = AnonymousClass024.A0n(A04);
                    } catch (IOException e) {
                        Log.w("app/xmpp/recv/handle_profile_photo_changed/", e);
                    }
                } else {
                    profilePhotoChange = null;
                }
                C04300Jq A03 = anonymousClass279.A09.A03(abstractC005302j, c04420Kc.A07, 1000 * j, userJid, i, profilePhotoChange);
                AnonymousClass092 A032 = anonymousClass279.A05.A03(abstractC005302j);
                if (!(A032 instanceof C04300Jq)) {
                    anonymousClass279.A04.A0Q(A03);
                } else {
                    C04300Jq c04300Jq = (C04300Jq) A032;
                    boolean z2 = c04300Jq.A00 == 11;
                    z = (A03.A0G != null && c04300Jq.A18() && userJid.equals(c04300Jq.A0A())) ? false : false;
                    if (!z2 || !z) {
                        anonymousClass279.A04.A0Q(A03);
                    }
                }
            }
            anonymousClass279.A06.A0L(c04420Kc);
            return;
        }
        throw new AssertionError("local JID unknown");
    }
}
