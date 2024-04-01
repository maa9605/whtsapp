package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.ui.voip.MultiContactThumbnail;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I0_3;
import com.whatsapp.voipcalling.CallsFragment;

/* renamed from: X.2cB */
/* loaded from: classes2.dex */
public class C53242cB extends AbstractC53222c9 {
    public final View A01;
    public final View A02;
    public final ImageView A03;
    public final ImageView A04;
    public final ImageView A05;
    public final ImageView A06;
    public final TextView A07;
    public final TextView A08;
    public final C01B A09;
    public final C06030Rg A0A;
    public final SelectionCheckView A0B;
    public final C05W A0C;
    public final C018708s A0D;
    public final C0Zn A0F;
    public final C0Zn A0G;
    public final C02E A0H;
    public final C002301c A0I;
    public final C0C8 A0J;
    public final MultiContactThumbnail A0K;
    public final CallsFragment A0M;
    public final C2IY A0N;
    public final AbstractView$OnClickListenerC49532Ky A0L = new ViewOnClickCListenerShape11S0100000_I0_3(this, 8);
    public final InterfaceC52362ab A0E = new InterfaceC52362ab() { // from class: X.3th
        @Override // X.InterfaceC52362ab
        public void AUd(ImageView imageView, Bitmap bitmap, boolean z) {
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
            } else {
                imageView.setImageResource(R.drawable.avatar_contact);
            }
        }

        @Override // X.InterfaceC52362ab
        public void AUp(ImageView imageView) {
            imageView.setImageResource(R.drawable.avatar_contact);
        }
    };
    public final View.OnTouchListener A00 = new View$OnTouchListenerC49522Kw(0.15f, 0.15f, 0.15f, 0.15f);

    public C53242cB(C01B c01b, C2IY c2iy, C05W c05w, C02E c02e, C018708s c018708s, C002301c c002301c, C2AR c2ar, C0C8 c0c8, C0Zn c0Zn, C0Zn c0Zn2, CallsFragment callsFragment, View view) {
        this.A09 = c01b;
        this.A0N = c2iy;
        this.A0C = c05w;
        this.A0H = c02e;
        this.A0D = c018708s;
        this.A0I = c002301c;
        this.A0J = c0c8;
        this.A0G = c0Zn;
        this.A0F = c0Zn2;
        this.A0M = callsFragment;
        this.A04 = (ImageView) C0AT.A0D(view, R.id.contact_photo);
        this.A0A = new C06030Rg(view, (int) R.id.contact_name, c018708s, c2ar);
        this.A08 = (TextView) C0AT.A0D(view, R.id.date_time);
        this.A03 = (ImageView) C0AT.A0D(view, R.id.call_type_icon);
        this.A07 = (TextView) C0AT.A0D(view, R.id.count);
        this.A06 = (ImageView) C0AT.A0D(view, R.id.voice_call);
        this.A05 = (ImageView) C0AT.A0D(view, R.id.video_call);
        this.A0B = (SelectionCheckView) C0AT.A0D(view, R.id.selection_check);
        this.A01 = C0AT.A0D(view, R.id.call_row_container);
        MultiContactThumbnail multiContactThumbnail = (MultiContactThumbnail) C0AT.A0D(view, R.id.multi_contact_photo);
        this.A0K = multiContactThumbnail;
        C0AT.A0V(multiContactThumbnail, 2);
        C003301p.A06(this.A0A.A01);
        this.A02 = C0AT.A0D(view, R.id.divider);
    }
}
