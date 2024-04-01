package X;

import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.3xK  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C86373xK extends AbstractC81553p5 {
    public final View A00;
    public final View A01;
    public final TextView A02;

    public C86373xK(View view) {
        super(view);
        this.A00 = C0AT.A0D(view, R.id.wallpaper_header_chevron_view);
        this.A02 = (TextView) C0AT.A0D(view, R.id.wallpaper_header_title);
        this.A01 = C0AT.A0D(view, R.id.wallpaper_header_description);
        C003301p.A06(this.A02);
    }
}
