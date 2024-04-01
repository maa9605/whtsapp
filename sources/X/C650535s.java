package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.35s  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C650535s extends C0TS {
    public final ImageView A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final C650835v A04;
    public final C002301c A05;

    public C650535s(View view, C002301c c002301c, C650835v c650835v) {
        super(view);
        this.A05 = c002301c;
        this.A04 = c650835v;
        this.A00 = (ImageView) C0AT.A0D(view, R.id.device_icon);
        this.A01 = (ImageView) C0AT.A0D(view, R.id.sync_badge);
        this.A02 = (TextView) C0AT.A0D(view, R.id.name);
        this.A03 = (TextView) C0AT.A0D(view, R.id.status);
    }
}
