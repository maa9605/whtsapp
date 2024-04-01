package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.status.StatusesFragment;
import com.whatsapp.util.Log;

/* renamed from: X.2jP */
/* loaded from: classes2.dex */
public class C54822jP implements InterfaceC53102bt {
    public final long A00;
    public final /* synthetic */ StatusesFragment A01;

    public C54822jP(StatusesFragment statusesFragment, long j) {
        this.A01 = statusesFragment;
        this.A00 = j;
    }

    @Override // X.InterfaceC53102bt
    public View ADs(int i, View view, ViewGroup viewGroup, Context context) {
        int i2;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_section_status, viewGroup, false);
            view.setEnabled(false);
            C0AT.A0V(view, 2);
        }
        TextView textView = (TextView) view.findViewById(R.id.title);
        C003301p.A06(textView);
        long j = this.A00;
        if (j == 0) {
            i2 = R.string.recent_updates;
        } else if (j == 1) {
            i2 = R.string.viewed_updates;
        } else {
            if (j != 2) {
                StringBuilder A0P = C000200d.A0P("statusesFragment/invalid id: ");
                A0P.append(j);
                Log.e(A0P.toString());
            }
            i2 = R.string.muted_updates;
        }
        textView.setText(i2);
        ImageView imageView = (ImageView) view.findViewById(R.id.muted_statuses_icon);
        StatusesFragment statusesFragment = this.A01;
        if (statusesFragment.A0v && j == 2 && !statusesFragment.A0t) {
            imageView.setVisibility(0);
            boolean z = statusesFragment.A0s;
            int i3 = R.string.accessibility_hide_muted_statuses_prompt;
            if (z) {
                i3 = R.string.accessibility_show_muted_statuses_prompt;
            }
            AnonymousClass088.A1V(textView, i3);
            statusesFragment.A17(imageView);
            textView.setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0_0(this, imageView, 47));
            C0AT.A0V(imageView, 2);
            return view;
        }
        imageView.setVisibility(4);
        C0AT.A0c(textView, null);
        textView.setOnClickListener(null);
        textView.setClickable(false);
        C0AT.A0V(imageView, 0);
        return view;
    }
}
