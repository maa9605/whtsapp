package X;

import android.app.Application;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Is  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C68243Is extends C0QY {
    public final int A00;
    public final C0HK A01;
    public final C2L3 A02;
    public final AnonymousClass272 A03;
    public final C56202ms A04;
    public final C56262my A05;
    public final C003701t A06;
    public final UserJid A07;

    public C68243Is(C003701t c003701t, C56262my c56262my, UserJid userJid, Application application, C2L3 c2l3, C56202ms c56202ms, AnonymousClass272 anonymousClass272) {
        super(application);
        this.A01 = new C0HK();
        this.A06 = c003701t;
        this.A05 = c56262my;
        this.A07 = userJid;
        this.A04 = c56202ms;
        this.A02 = c2l3;
        this.A03 = anonymousClass272;
        this.A00 = application.getResources().getDimensionPixelSize(R.dimen.product_catalog_list_thumb_size);
        c56202ms.A00 = this.A01;
    }
}
