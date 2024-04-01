package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.ContactStatusThumbnail;
import com.whatsapp.status.StatusesFragment;

/* renamed from: X.2jN  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C54802jN {
    public int A00;
    public UserJid A01;
    public final View A02;
    public final View A03;
    public final FrameLayout A04;
    public final ImageView A05;
    public final ImageView A06;
    public final TextView A07;
    public final C06030Rg A08;
    public final ContactStatusThumbnail A09;
    public final /* synthetic */ StatusesFragment A0A;

    public C54802jN(StatusesFragment statusesFragment, View view) {
        this.A0A = statusesFragment;
        ContactStatusThumbnail contactStatusThumbnail = (ContactStatusThumbnail) view.findViewById(R.id.contact_photo);
        this.A09 = contactStatusThumbnail;
        contactStatusThumbnail.setClickable(false);
        View findViewById = view.findViewById(R.id.contact_selector);
        this.A03 = findViewById;
        findViewById.setClickable(false);
        this.A08 = new C06030Rg(view, (int) R.id.contact_name, statusesFragment.A0C, statusesFragment.A0V);
        this.A07 = (TextView) view.findViewById(R.id.date_time);
        this.A04 = (FrameLayout) view.findViewById(R.id.action);
        this.A05 = (ImageView) view.findViewById(R.id.action_icon);
        this.A06 = (ImageView) view.findViewById(R.id.contact_mark);
        View findViewById2 = view.findViewById(R.id.divider);
        this.A02 = findViewById2;
        findViewById2.setBackground(new C0We(statusesFragment.A0L, C02160Ac.A03(view.getContext(), R.drawable.conversations_list_divider)));
        this.A02.setVisibility(0);
        C003301p.A06(this.A08.A01);
    }
}
