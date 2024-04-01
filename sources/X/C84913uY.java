package X;

import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.Button;
import com.whatsapp.voipcalling.VoipCallControlBottomSheet;
import com.whatsapp.voipcalling.VoipCallControlRingingDotsIndicator;

/* renamed from: X.3uY  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C84913uY extends C0TS {
    public View A00;
    public View A01;
    public ImageView A02;
    public ImageView A03;
    public C06030Rg A04;
    public Button A05;
    public VoipCallControlRingingDotsIndicator A06;

    public C84913uY(VoipCallControlBottomSheet voipCallControlBottomSheet, View view) {
        super(view);
        this.A00 = view;
        this.A01 = C0AT.A0D(view, R.id.name);
        this.A04 = new C06030Rg(this.A00, (int) R.id.name, voipCallControlBottomSheet.A0K, voipCallControlBottomSheet.A0Q);
        this.A02 = (ImageView) C0AT.A0D(this.A00, R.id.avatar);
        this.A03 = (ImageView) C0AT.A0D(this.A00, R.id.connect_icon);
        this.A05 = (Button) C0AT.A0D(this.A00, R.id.ring_btn);
        this.A06 = (VoipCallControlRingingDotsIndicator) C0AT.A0D(this.A00, R.id.ringing_dots);
    }
}
