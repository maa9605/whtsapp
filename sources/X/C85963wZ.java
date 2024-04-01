package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.PagerSlidingTabStrip;
import com.whatsapp.qrcode.contactqr.ContactQrMyCodeFragment;
import com.whatsapp.qrcode.contactqr.QrScanCodeFragment;

/* renamed from: X.3wZ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C85963wZ extends C0ZS implements C0ZU {
    public final C3U8[] A00;
    public final /* synthetic */ AbstractActivityC49982Om A01;

    @Override // X.C0ZT
    public int A0B() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85963wZ(AbstractActivityC49982Om abstractActivityC49982Om, AbstractC02800Cx abstractC02800Cx) {
        super(abstractC02800Cx);
        this.A01 = abstractActivityC49982Om;
        this.A00 = new C3U8[2];
    }

    @Override // X.C0ZT
    public CharSequence A03(int i) {
        AbstractActivityC49982Om abstractActivityC49982Om = this.A01;
        int A1P = abstractActivityC49982Om.A1P(i);
        if (A1P != 0) {
            if (A1P == 1) {
                return abstractActivityC49982Om.getString(R.string.contact_qr_scan_code);
            }
            throw new IllegalArgumentException("The item position should be less than: 2");
        }
        return abstractActivityC49982Om.getString(R.string.contact_qr_my_code);
    }

    @Override // X.C0ZS
    public C0BA A0G(int i) {
        AbstractActivityC49982Om abstractActivityC49982Om = this.A01;
        int A1P = abstractActivityC49982Om.A1P(i);
        if (A1P != 0) {
            if (A1P == 1) {
                return new QrScanCodeFragment();
            }
            throw new IllegalArgumentException("The item position should be less than: 2");
        } else if (abstractActivityC49982Om != null) {
            return new ContactQrMyCodeFragment();
        } else {
            throw null;
        }
    }

    @Override // X.C0ZU
    public View ABr(int i) {
        C3U8[] c3u8Arr = this.A00;
        if (c3u8Arr[i] == null) {
            PagerSlidingTabStrip pagerSlidingTabStrip = this.A01.A06;
            C3U8 c3u8 = new C3U8(LayoutInflater.from(pagerSlidingTabStrip.getContext()).inflate(R.layout.qr_tab, (ViewGroup) pagerSlidingTabStrip, false));
            CharSequence A03 = A03(i);
            if (A03 != null) {
                c3u8.A01.setText(A03);
                c3u8Arr[i] = c3u8;
            } else {
                throw null;
            }
        }
        return c3u8Arr[i].A00;
    }
}
