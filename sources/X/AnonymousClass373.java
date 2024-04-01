package X;

import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.373  reason: invalid class name */
/* loaded from: classes2.dex */
public class AnonymousClass373 extends C0TS {
    public final View A00;
    public final TextView A01;
    public final ThumbnailButton A02;

    public AnonymousClass373(View view) {
        super(view);
        this.A00 = view;
        this.A02 = (ThumbnailButton) view.findViewById(R.id.contact_row_photo);
        TextView textView = (TextView) view.findViewById(R.id.contact_name);
        this.A01 = textView;
        C0AT.A0V(textView, 2);
    }
}
