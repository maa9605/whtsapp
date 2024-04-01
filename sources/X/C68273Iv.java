package X;

import android.app.Application;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Iv  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C68273Iv extends C0QY {
    public final int A00;
    public final C0HK A01;
    public final C2L3 A02;
    public final C56202ms A03;
    public final C56262my A04;
    public final UserJid A05;

    public C68273Iv(C56262my c56262my, UserJid userJid, Application application, C2L3 c2l3, C56202ms c56202ms) {
        super(application);
        this.A01 = new C0HK();
        this.A04 = c56262my;
        this.A05 = userJid;
        this.A03 = c56202ms;
        this.A02 = c2l3;
        this.A00 = application.getResources().getDimensionPixelSize(R.dimen.product_catalog_list_thumb_size);
        c56202ms.A00 = this.A01;
    }
}
