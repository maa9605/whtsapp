package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.ViewSharedContactArrayActivity;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.1jX  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C35681jX extends AbstractC04890Mh {
    public final List A00;
    public final /* synthetic */ ViewSharedContactArrayActivity A01;

    public C35681jX(ViewSharedContactArrayActivity viewSharedContactArrayActivity, List list) {
        this.A01 = viewSharedContactArrayActivity;
        this.A00 = list;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A00.size();
    }

    @Override // X.AbstractC04890Mh
    public int A0D(int i) {
        Object obj = this.A00.get(i);
        if (obj instanceof C1LU) {
            return 0;
        }
        if (obj instanceof C1LS) {
            return 1;
        }
        if (obj instanceof C1LT) {
            return 2;
        }
        return obj instanceof C1LW ? 3 : -1;
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return new C35741jd(from.inflate(R.layout.contact_info_sent_by, (ViewGroup) null, true));
                    }
                    throw new IllegalStateException();
                }
                return new C35701jZ(from.inflate(R.layout.contact_card_divider, (ViewGroup) null, true));
            }
            return new C35691jY(from.inflate(R.layout.contact_info_data, (ViewGroup) null, true));
        }
        return new C35711ja(from.inflate(R.layout.review_individual_contact, (ViewGroup) null, true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x024a, code lost:
        if (r21.A01.A0O == false) goto L27;
     */
    @Override // X.AbstractC04890Mh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0F(X.C0TS r22, int r23) {
        /*
            Method dump skipped, instructions count: 960
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35681jX.A0F(X.0TS, int):void");
    }

    public /* synthetic */ void A0G(C06C c06c) {
        ViewSharedContactArrayActivity viewSharedContactArrayActivity = this.A01;
        viewSharedContactArrayActivity.A0K.A06(c06c, viewSharedContactArrayActivity, 15, true);
    }

    public /* synthetic */ void A0H(C06C c06c) {
        ViewSharedContactArrayActivity viewSharedContactArrayActivity = this.A01;
        viewSharedContactArrayActivity.A0K.A00(c06c, viewSharedContactArrayActivity, 15, true, true);
    }

    public /* synthetic */ void A0I(UserJid userJid, Object obj) {
        ViewSharedContactArrayActivity viewSharedContactArrayActivity = this.A01;
        viewSharedContactArrayActivity.A05.A01(viewSharedContactArrayActivity, userJid, ((C1LS) obj).A03);
    }
}
