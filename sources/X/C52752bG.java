package X;

import android.animation.ObjectAnimator;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.2bG  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52752bG {
    public static final int[] A0D = {R.id.contact_icon1, R.id.contact_icon2, R.id.contact_icon3, R.id.contact_icon4, R.id.contact_icon5};
    public ObjectAnimator A00;
    public C52802bN A01;
    public AbstractView$OnClickListenerC49532Ky A02;
    public boolean A03;
    public boolean A04;
    public final C018508q A05;
    public final C05W A06;
    public final C018708s A07;
    public final C011505r A08;
    public final C0Zn A09;
    public final ConversationsFragment A0A;
    public final C002301c A0B;
    public final ExecutorC004702d A0C;

    public C52752bG(ConversationsFragment conversationsFragment, C018508q c018508q, InterfaceC002901k interfaceC002901k, C05W c05w, C018708s c018708s, C002301c c002301c, C011505r c011505r, C0Zn c0Zn) {
        this.A0A = conversationsFragment;
        this.A05 = c018508q;
        this.A06 = c05w;
        this.A07 = c018708s;
        this.A0B = c002301c;
        this.A08 = c011505r;
        this.A09 = c0Zn;
        this.A0C = new ExecutorC004702d(interfaceC002901k, false);
    }
}
