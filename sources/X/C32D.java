package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.biz.BusinessProfileFieldView;
import com.whatsapp.biz.catalog.CatalogMediaCard;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.32D  reason: invalid class name */
/* loaded from: classes2.dex */
public class C32D implements InterfaceC04730Lp {
    public View A00;
    public View A01;
    public ImageView A02;
    public TextView A03;
    public TextEmojiLabel A04;
    public TextEmojiLabel A05;
    public TextEmojiLabel A06;
    public C55992mW A07;
    public BusinessProfileFieldView A08;
    public CatalogMediaCard A09;
    public C05210Nt A0A;
    public C06C A0B;
    public final View A0C;
    public final C018308n A0D;
    public final C03230Ew A0E;
    public final C02L A0F;
    public final C2Ln A0G;
    public final C06K A0H;
    public final C06L A0I;
    public final C49462Ko A0J;
    public final C40201rk A0K;
    public final ContactInfoActivity A0L;
    public final AnonymousClass075 A0M;
    public final C018708s A0N;
    public final AnonymousClass012 A0O;
    public final C002301c A0P;
    public final C003701t A0Q;
    public final AnonymousClass011 A0R;
    public final C41471ty A0S;
    public final C2MG A0T;
    public final C2IY A0U;
    public final InterfaceC41271te A0V;
    public final InterfaceC41261td A0W;

    public C32D(AnonymousClass012 anonymousClass012, C003701t c003701t, InterfaceC41271te interfaceC41271te, C02L c02l, C2MG c2mg, AnonymousClass011 anonymousClass011, C2IY c2iy, C03230Ew c03230Ew, C018308n c018308n, C41471ty c41471ty, C018708s c018708s, C002301c c002301c, InterfaceC41261td interfaceC41261td, AnonymousClass075 anonymousClass075, C06L c06l, C2Ln c2Ln, C06K c06k, C49462Ko c49462Ko, C40201rk c40201rk, ContactInfoActivity contactInfoActivity, View view, C06C c06c) {
        this.A0O = anonymousClass012;
        this.A0Q = c003701t;
        this.A0V = interfaceC41271te;
        this.A0F = c02l;
        this.A0T = c2mg;
        this.A0R = anonymousClass011;
        this.A0U = c2iy;
        this.A0E = c03230Ew;
        this.A0D = c018308n;
        this.A0S = c41471ty;
        this.A0N = c018708s;
        this.A0P = c002301c;
        this.A0W = interfaceC41261td;
        this.A0M = anonymousClass075;
        this.A0I = c06l;
        this.A0G = c2Ln;
        this.A0H = c06k;
        this.A0J = c49462Ko;
        this.A0K = c40201rk;
        if (view != null) {
            this.A00 = view.findViewById(R.id.business_verification_status);
            this.A06 = (TextEmojiLabel) view.findViewById(R.id.business_verification_status_text);
            this.A08 = (BusinessProfileFieldView) view.findViewById(R.id.business_description);
            this.A09 = (CatalogMediaCard) view.findViewById(R.id.business_catalog_media_card);
            this.A03 = (TextView) view.findViewById(R.id.blank_business_details_text);
            if (this.A0Q.A0C(470)) {
                this.A05 = (TextEmojiLabel) view.findViewById(R.id.business_title);
                this.A04 = (TextEmojiLabel) view.findViewById(R.id.business_subtitle);
            } else {
                this.A02 = (ImageView) view.findViewById(R.id.add_business_to_contact);
            }
            this.A0L = contactInfoActivity;
            this.A0C = view;
            this.A0B = c06c;
            return;
        }
        throw null;
    }

    public UserJid A00() {
        C06C c06c = this.A0B;
        if (c06c == null) {
            return null;
        }
        return (UserJid) c06c.A03(UserJid.class);
    }

    public void A01(UserJid userJid, boolean z) {
        C05210Nt c05210Nt = this.A0A;
        if (c05210Nt == null || !c05210Nt.A09) {
            this.A09.setVisibility(8);
        } else {
            this.A09.setup(userJid, z, null, false, c05210Nt);
        }
    }

    @Override // X.InterfaceC04730Lp
    public void AKm() {
        ContactInfoActivity contactInfoActivity = this.A0L;
        if (contactInfoActivity != null) {
            contactInfoActivity.ARS();
        }
    }

    @Override // X.InterfaceC04730Lp
    public void AKn() {
        ContactInfoActivity contactInfoActivity = this.A0L;
        if (contactInfoActivity != null) {
            contactInfoActivity.ARS();
        }
    }
}
