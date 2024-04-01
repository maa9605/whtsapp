package X;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.facebook.redex.ViewOnClickEBaseShape2S0200000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.contact.picker.PhoneContactsSelector;

/* renamed from: X.371  reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass371 extends AbstractC04890Mh {
    public final /* synthetic */ PhoneContactsSelector A00;

    public AnonymousClass371(PhoneContactsSelector phoneContactsSelector) {
        this.A00 = phoneContactsSelector;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A00.A0V.size();
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        return new AnonymousClass373(this.A00.getLayoutInflater().inflate(R.layout.selected_contact, viewGroup, false));
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        AnonymousClass373 anonymousClass373 = (AnonymousClass373) c0ts;
        PhoneContactsSelector phoneContactsSelector = this.A00;
        C2LC c2lc = (C2LC) phoneContactsSelector.A0V.get(i);
        String str = c2lc.A05;
        if (!TextUtils.isEmpty(str)) {
            anonymousClass373.A01.setText(str);
        } else {
            anonymousClass373.A01.setText(c2lc.A06);
        }
        ThumbnailButton thumbnailButton = anonymousClass373.A02;
        phoneContactsSelector.A0A.A05(thumbnailButton, R.drawable.avatar_contact);
        phoneContactsSelector.A0C.A01(c2lc, thumbnailButton);
        anonymousClass373.A00.setOnClickListener(new ViewOnClickEBaseShape2S0200000_I1(this, c2lc, 2));
    }
}
