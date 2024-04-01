package X;

import android.os.SystemClock;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.preference.WaFontListPreference;

/* renamed from: X.3q0  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C82123q0 extends C3XV {
    public final FrameLayout A00;
    public final TextEmojiLabel A01;
    public final C09I A02;
    public final C003701t A03;
    public final AnonymousClass092 A04;
    public final C3XU A05;

    public C82123q0(C003701t c003701t, C09I c09i, C018508q c018508q, C03230Ew c03230Ew, C02E c02e, C002301c c002301c, C42441vk c42441vk, AbstractC53802hX abstractC53802hX, AnonymousClass092 anonymousClass092) {
        super(c018508q, c02e, c002301c, c42441vk, c03230Ew, abstractC53802hX);
        this.A05 = new C3XU();
        this.A03 = c003701t;
        this.A02 = c09i;
        this.A04 = anonymousClass092;
        TextEmojiLabel textEmojiLabel = new TextEmojiLabel(A01());
        this.A01 = textEmojiLabel;
        textEmojiLabel.setTextColor(C02160Ac.A00(A01(), R.color.white));
        this.A01.setGravity(17);
        this.A01.setTextSize(AbstractC48182Ef.A05(A01().getResources(), c002301c, WaFontListPreference.A00));
        int A05 = (int) AbstractC48182Ef.A05(A01().getResources(), c002301c, WaFontListPreference.A00);
        this.A01.setPadding(A05, A05, A05, A05);
        FrameLayout frameLayout = new FrameLayout(A01());
        this.A00 = frameLayout;
        frameLayout.addView(this.A01, new FrameLayout.LayoutParams(-2, -2, 17));
    }

    @Override // X.C3XV
    public long A00() {
        return this.A05.A03;
    }

    @Override // X.C3XV
    public void A04() {
        C3XU c3xu = this.A05;
        c3xu.A00 = 0L;
        c3xu.A01 = SystemClock.elapsedRealtime();
        c3xu.A01();
        super.A05.A01();
    }

    @Override // X.C3XV
    public void A05() {
        this.A05.A02();
    }
}
