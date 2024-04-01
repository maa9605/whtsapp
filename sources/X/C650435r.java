package X;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.facebook.redex.ViewOnClickEBaseShape7S0100000_I1;
import com.google.android.search.verification.client.R;

/* renamed from: X.35r  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C650435r extends C0TS {
    public View A00;
    public TextView A01;
    public Group A02;
    public final C650835v A03;

    public C650435r(View view, C650835v c650835v) {
        super(view);
        C0AT.A0D(view, R.id.link_device_button).setOnClickListener(new ViewOnClickEBaseShape7S0100000_I1(c650835v, 3));
        this.A03 = c650835v;
        this.A02 = (Group) C0AT.A0D(view, R.id.web_beta_group);
        this.A00 = C0AT.A0D(view, R.id.header_separator);
        this.A01 = (TextView) C0AT.A0D(view, R.id.web_beta_card_text);
    }
}
