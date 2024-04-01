package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.ui.voip.MultiContactThumbnail;
import com.whatsapp.voipcalling.CallsFragment;

/* renamed from: X.2jQ  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C54832jQ extends AbstractC53222c9 {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public C06030Rg A03;
    public MultiContactThumbnail A04;
    public final C01B A05;
    public final C05W A06;
    public final C018708s A07;
    public final InterfaceC52362ab A08 = new InterfaceC52362ab() { // from class: X.3u3
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
    public final C0Zn A09;
    public final C0C8 A0A;
    public final CallsFragment A0B;
    public final C2IY A0C;

    public C54832jQ(C01B c01b, CallsFragment callsFragment, C2IY c2iy, C05W c05w, C018708s c018708s, C2AR c2ar, C0C8 c0c8, View view, C0Zn c0Zn) {
        this.A05 = c01b;
        this.A0B = callsFragment;
        this.A0C = c2iy;
        this.A06 = c05w;
        this.A07 = c018708s;
        this.A0A = c0c8;
        this.A00 = C0AT.A0D(view, R.id.root_view);
        this.A03 = new C06030Rg(view, (int) R.id.participant_names, c018708s, c2ar);
        this.A01 = (ImageView) C0AT.A0D(view, R.id.call_type_icon);
        C0AT.A0D(view, R.id.call_row_container);
        this.A04 = (MultiContactThumbnail) C0AT.A0D(view, R.id.multi_contact_photo);
        this.A02 = (TextView) C0AT.A0D(view, R.id.ongoing_label);
        C003301p.A06(this.A03.A01);
        this.A09 = c0Zn;
    }
}
