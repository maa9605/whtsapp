package X;

import com.google.android.search.verification.client.R;

/* renamed from: X.2sO  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C59212sO {
    public final int A00;
    public final int A01;
    public final int A02;

    public C59212sO(int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }

    public static C59212sO A00(boolean z, AnonymousClass092 anonymousClass092) {
        int i;
        int i2;
        int i3;
        if (C0DB.A0E(anonymousClass092.A0m)) {
            i = R.string.message_opened_by;
            if (z) {
                i = R.string.message_opened;
            }
            i2 = R.drawable.msg_status_ephemeral_ring;
            i3 = R.color.view_once_viewed;
        } else {
            i = R.string.message_played_by;
            if (z) {
                i = R.string.message_played;
            }
            i2 = R.drawable.msg_status_mic;
            i3 = R.color.msgStatusReadTint;
        }
        return new C59212sO(i, i2, i3);
    }
}
