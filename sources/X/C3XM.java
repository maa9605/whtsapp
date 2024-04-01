package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.status.ContactStatusThumbnail;
import com.whatsapp.status.playback.MyStatusesActivity;

/* renamed from: X.3XM  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3XM {
    public final View A00;
    public final View A01;
    public final View A02;
    public final ImageView A03;
    public final ProgressBar A04;
    public final TextView A05;
    public final TextView A06;
    public final SelectionCheckView A07;
    public final ContactStatusThumbnail A08;
    public final /* synthetic */ MyStatusesActivity A09;

    public C3XM(MyStatusesActivity myStatusesActivity, View view) {
        this.A09 = myStatusesActivity;
        this.A00 = view;
        ContactStatusThumbnail contactStatusThumbnail = (ContactStatusThumbnail) view.findViewById(R.id.contact_photo);
        this.A08 = contactStatusThumbnail;
        contactStatusThumbnail.setClickable(false);
        View findViewById = view.findViewById(R.id.contact_selector);
        this.A01 = findViewById;
        findViewById.setClickable(false);
        this.A05 = (TextView) view.findViewById(R.id.date_time);
        ImageView imageView = (ImageView) view.findViewById(R.id.overflow_icon);
        this.A03 = imageView;
        imageView.setOnClickListener(myStatusesActivity.A0m);
        this.A06 = (TextView) view.findViewById(R.id.views_count);
        View findViewById2 = view.findViewById(R.id.retry_button);
        this.A02 = findViewById2;
        findViewById2.setOnClickListener(myStatusesActivity.A0n);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress);
        this.A04 = progressBar;
        C02180Ae.A18(progressBar, C02160Ac.A00(view.getContext(), R.color.primary_light));
        this.A07 = (SelectionCheckView) view.findViewById(R.id.selection_check);
        C003301p.A06(this.A06);
    }
}
