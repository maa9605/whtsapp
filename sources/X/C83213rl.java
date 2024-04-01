package X;

import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.3rl  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C83213rl extends C0TS {
    public final TextView A00;
    public final C01B A01;
    public final C06030Rg A02;
    public final ThumbnailButton A03;
    public final C05W A04;
    public final C018708s A05;
    public final C002301c A06;
    public final AnonymousClass011 A07;

    public C83213rl(AnonymousClass011 anonymousClass011, C01B c01b, C05W c05w, C018708s c018708s, C002301c c002301c, C2AR c2ar, View view) {
        super(view);
        this.A07 = anonymousClass011;
        this.A01 = c01b;
        this.A04 = c05w;
        this.A05 = c018708s;
        this.A06 = c002301c;
        this.A03 = (ThumbnailButton) C0AT.A0D(view, R.id.storage_usage_chat_contact_photo);
        this.A00 = (TextView) C0AT.A0D(view, R.id.storage_usage_chat_used_space);
        this.A02 = new C06030Rg(view, (int) R.id.storage_usage_chat_contact_name, this.A05, c2ar);
        AnonymousClass088.A1U(view);
    }
}
