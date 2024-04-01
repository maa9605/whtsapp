package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaButton;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.WaMapView;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;

/* renamed from: X.3wp */
/* loaded from: classes2.dex */
public class C86083wp extends AbstractC81013oD {
    public FrameLayout A00;
    public WaButton A01;
    public ThumbnailButton A02;
    public C0Zn A03;
    public final C02L A04;
    public final C0L7 A05;
    public final AnonymousClass012 A06;
    public final C0DK A07;
    public final C41461tx A08;
    public final C41471ty A09;
    public final WaMapView A0A;

    public C86083wp(Context context, AnonymousClass012 anonymousClass012, C02L c02l, C41471ty c41471ty, C0L7 c0l7, C0Zn c0Zn, C41461tx c41461tx, C0DK c0dk) {
        super(context);
        this.A06 = anonymousClass012;
        this.A04 = c02l;
        this.A09 = c41471ty;
        this.A05 = c0l7;
        this.A03 = c0Zn;
        this.A08 = c41461tx;
        this.A07 = c0dk;
        FrameLayout.inflate(context, R.layout.search_row_location_map_preview, this);
        this.A0A = (WaMapView) C0AT.A0D(this, R.id.search_map_preview_map);
        this.A01 = (WaButton) C0AT.A0D(this, R.id.search_map_preview_thumb_button);
        this.A00 = (FrameLayout) C0AT.A0D(this, R.id.search_map_preview_avatar_container);
        this.A02 = (ThumbnailButton) C0AT.A0D(this, R.id.search_map_preview_contact_thumbnail);
    }

    private void setMessage(C0KC c0kc) {
        long A06;
        this.A00.setVisibility(0);
        C41461tx c41461tx = this.A08;
        boolean z = c0kc.A0n.A02;
        if (z) {
            A06 = c41461tx.A07(c0kc);
        } else {
            A06 = c41461tx.A06(c0kc);
        }
        boolean A0R = C23X.A0R(c0kc, A06, this.A06);
        WaMapView waMapView = this.A0A;
        C41471ty c41471ty = this.A09;
        waMapView.A02(c41471ty, c0kc, A0R);
        Context context = getContext();
        C02L c02l = this.A04;
        this.A01.setOnClickListener(C23X.A06(c0kc, A0R, context, c02l, c41471ty));
        this.A01.setContentDescription(getContext().getString(R.string.conversation_row_live_location_button));
        ThumbnailButton thumbnailButton = this.A02;
        C0L7 c0l7 = this.A05;
        C0Zn c0Zn = this.A03;
        C0DK c0dk = this.A07;
        if (z) {
            c02l.A05();
            C0K1 c0k1 = c02l.A01;
            if (c0k1 != null) {
                c0Zn.A02(c0k1, thumbnailButton);
                return;
            }
            throw null;
        }
        UserJid A0B = c0kc.A0B();
        if (A0B != null) {
            c0Zn.A02(c0dk.A02(A0B), thumbnailButton);
        } else {
            c0l7.A05(thumbnailButton, R.drawable.avatar_contact);
        }
    }

    public void setMessage(C0KD c0kd) {
        this.A0A.setVisibility(0);
        if (c0kd instanceof C0LP) {
            setMessage((C0LP) c0kd);
        } else {
            setMessage((C0KC) c0kd);
        }
    }

    private void setMessage(C0LP c0lp) {
        this.A00.setVisibility(8);
        WaMapView waMapView = this.A0A;
        C41471ty c41471ty = this.A09;
        if (waMapView != null) {
            LatLng latLng = new LatLng(((C0KD) c0lp).A00, ((C0KD) c0lp).A01);
            waMapView.A01(c41471ty, latLng, null);
            waMapView.A00(latLng);
            if (((C0KD) c0lp).A01 == 0.0d && ((C0KD) c0lp).A00 == 0.0d) {
                return;
            }
            this.A01.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, c0lp, 13));
            this.A01.setContentDescription(getContext().getString(R.string.location_button));
            return;
        }
        throw null;
    }
}
