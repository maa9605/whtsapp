package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I0_3;

/* renamed from: X.2CF */
/* loaded from: classes2.dex */
public class C2CF extends AbstractC461525e {
    public int A00;
    public View A01;
    public TextView A02;
    public CircularProgressBar A03;
    public C42531vt A04;
    public final C43791xz A05;
    public final C2AS A06;
    public final InterfaceC53342en A07;

    public C2CF(C003701t c003701t, Context context, LayoutInflater layoutInflater, C2AS c2as, C43791xz c43791xz, InterfaceC53342en interfaceC53342en, int i, C42531vt c42531vt) {
        super(c003701t, context, layoutInflater, i);
        this.A06 = c2as;
        this.A05 = c43791xz;
        this.A04 = c42531vt;
        this.A07 = interfaceC53342en;
    }

    @Override // X.AbstractC461525e
    public void A03(View view) {
        View findViewById = view.findViewById(R.id.pack_loading);
        if (findViewById != null) {
            this.A03 = (CircularProgressBar) findViewById;
            View findViewById2 = view.findViewById(R.id.pack_loading_text);
            if (findViewById2 != null) {
                this.A02 = (TextView) findViewById2;
                View findViewById3 = view.findViewById(R.id.cancel_button);
                if (findViewById3 != null) {
                    this.A01 = findViewById3;
                    findViewById3.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I0_3(this, 1));
                    A05();
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public void A05() {
        View view;
        if (!(this instanceof C86923yl)) {
            CircularProgressBar circularProgressBar = this.A03;
            if (circularProgressBar != null && this.A02 != null && (view = this.A01) != null) {
                if (this.A04.A05) {
                    circularProgressBar.setVisibility(0);
                    this.A02.setVisibility(0);
                    this.A01.setVisibility(0);
                    if (TextUtils.isEmpty(this.A04.A0F)) {
                        this.A02.setText(R.string.sticker_pack_downloading);
                    } else {
                        this.A02.setText(this.A09.getString(R.string.sticker_pack_downloading_with_name, this.A04.A0F));
                    }
                    if (this.A00 >= 0) {
                        this.A03.setIndeterminate(false);
                        this.A03.setProgress(this.A00);
                        return;
                    }
                    this.A03.setIndeterminate(true);
                    return;
                }
                view.setVisibility(8);
                this.A03.setVisibility(8);
                this.A02.setVisibility(8);
                return;
            }
            return;
        }
        C86923yl c86923yl = (C86923yl) this;
        CircularProgressBar circularProgressBar2 = ((C2CF) c86923yl).A03;
        if (circularProgressBar2 != null && ((C2CF) c86923yl).A02 != null) {
            if (c86923yl.A02) {
                circularProgressBar2.setVisibility(0);
                ((C2CF) c86923yl).A02.setVisibility(0);
                if (TextUtils.isEmpty(((C2CF) c86923yl).A04.A0F)) {
                    ((C2CF) c86923yl).A02.setText(R.string.sticker_pack_loading);
                } else {
                    ((C2CF) c86923yl).A02.setText(c86923yl.A09.getString(R.string.sticker_pack_loading_with_name, ((C2CF) c86923yl).A04.A0F));
                }
            } else {
                circularProgressBar2.setVisibility(8);
                ((C2CF) c86923yl).A02.setVisibility(8);
            }
        }
        if (c86923yl.A00 != null) {
            if (((C2CF) c86923yl).A04.A04.size() == 0 && !c86923yl.A02) {
                c86923yl.A00.setVisibility(0);
                c86923yl.A01.setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1(c86923yl, 20));
                return;
            }
            c86923yl.A00.setVisibility(8);
        }
    }
}
