package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageButton;

/* renamed from: X.3tm  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C84463tm extends C0TS {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public WaImageButton A03;

    public C84463tm(View view) {
        super(view);
        this.A01 = (ImageView) view.findViewById(R.id.audio_call_participant_photo);
        this.A00 = view.findViewById(R.id.audio_call_status_layout);
        this.A02 = (TextView) view.findViewById(R.id.audio_call_status);
        this.A03 = (WaImageButton) view.findViewById(R.id.audio_call_status_button);
    }
}
