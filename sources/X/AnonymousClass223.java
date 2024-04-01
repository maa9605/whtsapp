package X;

import android.app.Activity;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.gif_search.GifSearchContainer;

/* renamed from: X.223 */
/* loaded from: classes2.dex */
public class AnonymousClass223 {
    public InterfaceC04830Lz A00;
    public C0M1 A01;
    public final C48362Ey A02;
    public final EmojiSearchContainer A03;

    public AnonymousClass223(EmojiSearchContainer emojiSearchContainer, C48362Ey c48362Ey, Activity activity, C40081rY c40081rY, C47682Ce c47682Ce, C002301c c002301c, C02O c02o) {
        this.A03 = emojiSearchContainer;
        emojiSearchContainer.setVisibility(8);
        this.A02 = c48362Ey;
        c48362Ey.A0A = new C3AX(this, c48362Ey, emojiSearchContainer, activity, c40081rY, c47682Ce, c002301c, c02o);
    }

    public void A00(boolean z) {
        if (!(this instanceof C48342Ew)) {
            EmojiSearchContainer emojiSearchContainer = this.A03;
            if (emojiSearchContainer.getVisibility() == 0) {
                emojiSearchContainer.A01(true);
            }
            this.A02.A0B = null;
            return;
        }
        C48342Ew c48342Ew = (C48342Ew) this;
        GifSearchContainer gifSearchContainer = c48342Ew.A02;
        if (gifSearchContainer.getVisibility() == 0) {
            gifSearchContainer.setVisibility(8);
            C2MQ c2mq = gifSearchContainer.A0B;
            if (c2mq != null) {
                C43981yK.A0C(gifSearchContainer.A08, c2mq);
            }
            gifSearchContainer.A0B = null;
        } else {
            EmojiSearchContainer emojiSearchContainer2 = ((AnonymousClass223) c48342Ew).A03;
            if (emojiSearchContainer2.getVisibility() == 0) {
                emojiSearchContainer2.A01(true);
            }
        }
        ((AnonymousClass223) c48342Ew).A02.A0B = null;
        if (z) {
            C43981yK.A0C(c48342Ew.A01, c48342Ew.A03);
        }
    }

    public boolean A01() {
        if (!(this instanceof C48342Ew)) {
            return this.A03.getVisibility() == 0;
        }
        C48342Ew c48342Ew = (C48342Ew) this;
        return c48342Ew.A02.getVisibility() == 0 || ((AnonymousClass223) c48342Ew).A03.getVisibility() == 0;
    }

    public boolean A02() {
        if (A01()) {
            A00(true);
            this.A03.post(new RunnableEBaseShape2S0100000_I0_2(this, 41));
            return true;
        }
        return false;
    }
}
