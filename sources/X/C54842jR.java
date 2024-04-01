package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.ui.voip.MultiContactThumbnail;
import com.whatsapp.voipcalling.CallsFragment;

/* renamed from: X.2jR  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C54842jR extends AbstractC53222c9 {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final ImageView A03;
    public final ImageView A04;
    public final ImageView A05;
    public final TextView A06;
    public final TextView A07;
    public final C06030Rg A08;
    public final SelectionCheckView A09;
    public final C05W A0A;
    public final C0Zn A0B;
    public final MultiContactThumbnail A0C;
    public final CallsFragment A0D;
    public final C2IY A0E;

    public C54842jR(C2IY c2iy, C05W c05w, C018708s c018708s, C2AR c2ar, C0Zn c0Zn, CallsFragment callsFragment, View view) {
        this.A03 = (ImageView) C0AT.A0D(view, R.id.contact_photo);
        this.A08 = new C06030Rg(view, (int) R.id.contact_name, c018708s, c2ar);
        this.A07 = (TextView) C0AT.A0D(view, R.id.date_time);
        this.A02 = (ImageView) C0AT.A0D(view, R.id.call_type_icon);
        this.A06 = (TextView) C0AT.A0D(view, R.id.count);
        this.A05 = (ImageView) C0AT.A0D(view, R.id.voice_call);
        this.A04 = (ImageView) C0AT.A0D(view, R.id.video_call);
        this.A09 = (SelectionCheckView) C0AT.A0D(view, R.id.selection_check);
        this.A00 = C0AT.A0D(view, R.id.call_row_container);
        MultiContactThumbnail multiContactThumbnail = (MultiContactThumbnail) C0AT.A0D(view, R.id.multi_contact_photo);
        this.A0C = multiContactThumbnail;
        C0AT.A0V(multiContactThumbnail, 2);
        C003301p.A06(this.A08.A01);
        this.A01 = C0AT.A0D(view, R.id.divider);
        this.A0E = c2iy;
        this.A0A = c05w;
        this.A0B = c0Zn;
        this.A0D = callsFragment;
        this.A03.setVisibility(0);
        this.A0C.setVisibility(8);
        this.A07.setVisibility(8);
        this.A06.setVisibility(8);
        this.A02.setVisibility(8);
        this.A09.setVisibility(8);
    }
}
