package X;

import android.os.SystemClock;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.3pz  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C82113pz extends C3XV {
    public View A00;
    public final View A01;
    public final TextEmojiLabel A02;
    public final C0WZ A03;
    public final C003701t A04;
    public final C0JJ A05;
    public final C3XU A06;

    public C82113pz(C003701t c003701t, C018508q c018508q, C03230Ew c03230Ew, C02E c02e, C002301c c002301c, C42441vk c42441vk, C0WZ c0wz, AbstractC53802hX abstractC53802hX, AnonymousClass092 anonymousClass092) {
        super(c018508q, c02e, c002301c, c42441vk, c03230Ew, abstractC53802hX);
        this.A05 = (C0JJ) anonymousClass092;
        this.A04 = c003701t;
        this.A03 = c0wz;
        C2Z8 A00 = C2Z8.A00(A01(), this.A05, true);
        this.A01 = A00;
        this.A02 = (TextEmojiLabel) A00.findViewById(R.id.message_text);
        this.A06 = A00.A03;
    }

    @Override // X.C3XV
    public long A00() {
        return this.A06.A03;
    }

    @Override // X.C3XV
    public void A04() {
        C3XU c3xu = this.A06;
        c3xu.A00 = 0L;
        c3xu.A01 = SystemClock.elapsedRealtime();
        c3xu.A01();
        super.A05.A01();
    }

    @Override // X.C3XV
    public void A05() {
        this.A06.A02();
    }
}
