package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape0S0300000_I0;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I0_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.2Ji  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C49262Ji extends AbstractC04890Mh {
    public List A01;
    public final Context A03;
    public final LayoutInflater A04;
    public final C1M7 A05;
    public final C018708s A06;
    public final C0Zn A07;
    public final C002301c A08;
    public final C2AR A09;
    public int A00 = 2;
    public boolean A02 = false;

    public C49262Ji(Context context, C018708s c018708s, C002301c c002301c, C1M7 c1m7, C2AR c2ar, C0Zn c0Zn) {
        this.A03 = context;
        this.A04 = LayoutInflater.from(context);
        this.A06 = c018708s;
        this.A08 = c002301c;
        this.A05 = c1m7;
        this.A09 = c2ar;
        this.A07 = c0Zn;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        List list = this.A01;
        if (list == null) {
            return 0;
        }
        int size = list.size();
        int i = this.A00;
        return (size <= i || this.A02) ? size : i + 1;
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        return new C3DI(this.A06, this.A09, this.A04.inflate(R.layout.group_invite_row, viewGroup, false));
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        C3DI c3di = (C3DI) c0ts;
        if (!this.A02 && i == this.A00) {
            List list = this.A01;
            int size = (list == null ? 0 : list.size()) - this.A00;
            c3di.A03.A01.setText(this.A08.A0A(R.plurals.n_more, size, Integer.valueOf(size)));
            c3di.A03.A01.setTextColor(C02160Ac.A00(this.A03, R.color.list_item_sub_title));
            c3di.A02.setVisibility(8);
            c3di.A00.setImageResource(R.drawable.ic_more_participants);
            c3di.A0H.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I0_2(this, 25));
            return;
        }
        List list2 = this.A01;
        if (list2 == null) {
            return;
        }
        C62132xO c62132xO = (C62132xO) list2.get(i);
        C06C c06c = c62132xO.A00;
        c3di.A03.A03(c06c, null);
        ImageView imageView = c3di.A00;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A05.A00(R.string.transition_avatar));
        sb.append(C003101m.A07(c06c.A02()));
        C0AT.A0e(imageView, sb.toString());
        C0Zn c0Zn = this.A07;
        c0Zn.A02(c06c, c3di.A00);
        if (c06c.A0A() && c06c.A0O != null) {
            c3di.A01.setVisibility(0);
            TextEmojiLabel textEmojiLabel = c3di.A01;
            StringBuilder A0P = C000200d.A0P("~");
            A0P.append(c06c.A0O);
            textEmojiLabel.A03(A0P.toString());
        }
        if (c06c.A0L != null) {
            c3di.A02.setVisibility(0);
            c3di.A02.A03(c06c.A0L);
        } else {
            c3di.A02.setVisibility(8);
        }
        c3di.A0H.setOnClickListener(new ViewOnClickEBaseShape0S0300000_I0(this, c06c, c62132xO, 8));
        c0Zn.A02(c06c, c3di.A00);
    }
}
