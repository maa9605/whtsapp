package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;

/* renamed from: X.2XW */
/* loaded from: classes2.dex */
public class C2XW extends C2XX {
    public C018308n A00;
    public final View A01;
    public final View A02;
    public final WaImageView A03;
    public final WaImageView A04;
    public final WaTextView A05;
    public final WaTextView A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2XW(Context context, int i) {
        super(context);
        ColorStateList colorStateList = null;
        View inflate = LayoutInflater.from(context).inflate(R.layout.conversations_archive_row_view, (ViewGroup) this, false);
        this.A01 = inflate;
        this.A03 = (WaImageView) C0AT.A0D(inflate, R.id.archived_row_image);
        this.A06 = (WaTextView) C0AT.A0D(this.A01, R.id.archived_row);
        WaTextView waTextView = (WaTextView) C0AT.A0D(this.A01, R.id.archive_row_counter);
        this.A05 = waTextView;
        if (context != null) {
            waTextView.setBackgroundDrawable(new C50502Sa(C02160Ac.A00(context, R.color.transparent)));
            this.A02 = C0AT.A0D(this.A01, R.id.content_indicator_container);
            this.A04 = (WaImageView) C0AT.A0D(this.A01, R.id.archive_row_important_chat_indicator);
            C003301p.A06(this.A06);
            C02180Ae.A11(this.A01);
            this.A01.setOnClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 22));
            AnonymousClass088.A1U(this.A01);
            C07O.A0h(this.A03, C02160Ac.A02(context, R.color.selector_archive_icon));
            C07O.A0h(this.A04, C02160Ac.A02(context, R.color.selector_unread_indicator));
            this.A06.setTextColor(C02160Ac.A02(context, R.color.selector_list_item));
            if (i == 1) {
                C0AT.A0D(this.A01, R.id.top_archived_row_divider).setVisibility(0);
                C0AT.A0D(this.A01, R.id.bottom_archived_row_divider).setVisibility(8);
                colorStateList = C02160Ac.A02(context, R.color.selector_archived_count_indicator);
            } else if (i != 2) {
                C000200d.A0p("archive/Unspoorted mode in ArchivePreviewView: ", i);
            } else {
                C0AT.A0D(this.A01, R.id.top_archived_row_divider).setVisibility(8);
                C0AT.A0D(this.A01, R.id.bottom_archived_row_divider).setVisibility(0);
                colorStateList = C02160Ac.A02(context, R.color.selector_unread_indicator);
            }
            this.A05.setTextColor(colorStateList);
            addView(this.A01);
            return;
        }
        throw null;
    }

    public void setContentIndicatorText(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("archive/set-content-indicator-to-empty");
            this.A02.setVisibility(8);
            return;
        }
        this.A02.setVisibility(0);
        if ("@".equals(str)) {
            this.A04.setVisibility(0);
            this.A05.setVisibility(8);
            return;
        }
        this.A04.setVisibility(8);
        WaTextView waTextView = this.A05;
        waTextView.setText(str);
        waTextView.setVisibility(0);
    }

    public void setEnableState(boolean z) {
        this.A01.setClickable(z);
        this.A06.setEnabled(z);
        this.A03.setEnabled(z);
        this.A05.setEnabled(z);
        this.A04.setEnabled(z);
    }

    public void setVisibility(boolean z) {
        this.A01.setVisibility(z ? 0 : 8);
    }
}
