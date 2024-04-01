package X;

import android.view.ViewGroup;
import com.whatsapp.Conversation;

/* renamed from: X.37Y  reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C37Y extends C2J9 {
    public final float A00;
    public final ViewGroup A01;

    public C37Y(Conversation conversation, ViewGroup viewGroup, int i) {
        super(conversation, i);
        this.A01 = viewGroup;
        C0U1 A0c = conversation.A0c();
        if (A0c == null) {
            throw null;
        }
        this.A00 = A0c.A00();
    }

    public final void A05(C37Q c37q) {
        ViewGroup viewGroup = this.A01;
        if (viewGroup.getVisibility() == 8) {
            return;
        }
        C0U1 A0c = super.A01.A0c();
        if (A0c != null) {
            float A00 = A0c.A00();
            float f = this.A00;
            if (A00 != f) {
                A0c.A06(f);
                C0AT.A0P(viewGroup, 0.0f);
            }
            viewGroup.setVisibility(8);
            if (this instanceof C3JO) {
                ((C3JO) this).A00 = true;
            }
            c37q.A00.A01 = null;
            return;
        }
        throw null;
    }
}
