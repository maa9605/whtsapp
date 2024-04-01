package X;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.voipcalling.GroupCallLogActivity;

/* renamed from: X.3tw  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C84553tw extends C0TS {
    public ImageButton A00;
    public ImageButton A01;
    public ImageView A02;
    public TextView A03;
    public C06030Rg A04;

    public C84553tw(GroupCallLogActivity groupCallLogActivity, View view) {
        super(view);
        this.A02 = (ImageView) view.findViewById(R.id.contact_photo);
        this.A04 = new C06030Rg(view, (int) R.id.contact_name, groupCallLogActivity.A03, groupCallLogActivity.A09);
        this.A01 = (ImageButton) view.findViewById(R.id.call_btn);
        this.A00 = (ImageButton) view.findViewById(R.id.video_call_btn);
        this.A03 = (TextView) view.findViewById(R.id.participant_call_log_result);
    }
}
