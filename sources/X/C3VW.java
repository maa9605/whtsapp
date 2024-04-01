package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.List;

/* renamed from: X.3VW  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3VW extends C41R {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public FrameLayout A04;
    public WaImageView A05;
    public WaImageView A06;
    public C51792Ya A07;
    public C23W A08;
    public List A09;
    public final C018508q A0A;
    public final C0L7 A0B;
    public final C0Zn A0C;
    public final C002301c A0D;
    public final C23K A0E;

    public C3VW(Context context, C018508q c018508q, C0L7 c0l7, C002301c c002301c, C23K c23k, C0Zn c0Zn) {
        super(context);
        this.A0A = c018508q;
        this.A0B = c0l7;
        this.A0D = c002301c;
        this.A0E = c23k;
        this.A0C = c0Zn;
        A00();
    }

    public final ThumbnailButton A02(Context context, int i) {
        ThumbnailButton thumbnailButton = new ThumbnailButton(context);
        thumbnailButton.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        thumbnailButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        thumbnailButton.A03 = C02160Ac.A00(getContext(), R.color.search_attachment_background);
        thumbnailButton.A01 = this.A00;
        thumbnailButton.A02 = this.A02;
        thumbnailButton.A06 = false;
        C0AT.A0V(thumbnailButton, 2);
        return thumbnailButton;
    }

    public void A03(final AnonymousClass092 anonymousClass092, final List list) {
        this.A07.setSubText(null, null);
        C23W c23w = this.A08;
        if (c23w != null) {
            this.A0E.A03(c23w);
        }
        C23W c23w2 = (C23W) this.A0E.A00(anonymousClass092);
        this.A08 = c23w2;
        ((C0CI) c23w2).A01.A03(new C0CG() { // from class: X.3o0
            @Override // X.C0CG
            public final void A54(Object obj) {
                C3VW c3vw = C3VW.this;
                AnonymousClass092 anonymousClass0922 = anonymousClass092;
                List list2 = list;
                C72753aX c72753aX = (C72753aX) obj;
                if (anonymousClass0922 instanceof C0D8) {
                    C04110Ip c04110Ip = c72753aX.A03;
                    if (c04110Ip != null) {
                        c3vw.A0C.A07(c04110Ip, c3vw.A06);
                        c3vw.A07.setTitleAndDescription(AnonymousClass024.A0K(c04110Ip.A08(), 128), null, list2);
                        List list3 = c04110Ip.A05;
                        if (list3 != null && !list3.isEmpty()) {
                            c3vw.A07.setSubText(((C09010cT) c04110Ip.A05.get(0)).A02, list2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                List list4 = c72753aX.A02;
                for (int i = 0; i < c3vw.A09.size(); i++) {
                    if (i < list4.size()) {
                        c3vw.A0C.A07((C04110Ip) list4.get(i), (ImageView) c3vw.A09.get(i));
                    }
                }
                int i2 = c72753aX.A00;
                C04110Ip c04110Ip2 = c72753aX.A03;
                String A08 = c04110Ip2 == null ? null : c04110Ip2.A08();
                if (A08 != null) {
                    int i3 = i2 - 1;
                    c3vw.A07.setTitleAndDescription(c3vw.A0D.A0A(R.plurals.contacts_array_title, i3, AnonymousClass024.A0K(A08, 128), Integer.valueOf(i3)), null, list2);
                    return;
                }
                c3vw.A07.setTitleAndDescription(c3vw.A0D.A0A(R.plurals.n_contacts_message_title, i2, Integer.valueOf(i2)), null, null);
            }
        }, this.A0A.A06);
    }
}
