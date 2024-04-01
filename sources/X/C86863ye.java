package X;

import com.whatsapp.status.playback.StatusPlaybackActivity;
import com.whatsapp.status.playback.fragment.StatusPlaybackFragment;

/* renamed from: X.3ye  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C86863ye extends C3J1 {
    public final /* synthetic */ StatusPlaybackActivity A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86863ye(StatusPlaybackActivity statusPlaybackActivity, AbstractC02800Cx abstractC02800Cx) {
        super(abstractC02800Cx);
        this.A00 = statusPlaybackActivity;
    }

    @Override // X.C0ZT
    public int A0B() {
        StatusPlaybackActivity statusPlaybackActivity = this.A00;
        C3XN c3xn = statusPlaybackActivity.A0D;
        if (c3xn == null || !statusPlaybackActivity.A0J) {
            return 0;
        }
        return c3xn.A00.size();
    }

    @Override // X.AbstractC35271is
    public int A0F(Object obj) {
        C0BA c0ba = (C0BA) obj;
        if (c0ba instanceof StatusPlaybackFragment) {
            StatusPlaybackActivity statusPlaybackActivity = this.A00;
            int A00 = statusPlaybackActivity.A0D.A00(((StatusPlaybackFragment) c0ba).A0y());
            if (A00 >= 0 && A00 < statusPlaybackActivity.A0D.A00.size()) {
                return A00;
            }
        }
        return -2;
    }
}
