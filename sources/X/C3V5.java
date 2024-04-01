package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

/* renamed from: X.3V5  reason: invalid class name */
/* loaded from: classes2.dex */
public class C3V5 {
    public long A00;
    public CountDownTimer A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Button A06;
    public final TextView A07;
    public final C002301c A08;
    public final String A09;

    public C3V5(C002301c c002301c, Activity activity, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        this.A08 = c002301c;
        this.A09 = str;
        this.A05 = i3;
        this.A02 = i4;
        this.A04 = i5;
        this.A03 = i6;
        this.A06 = (Button) activity.findViewById(i);
        this.A07 = (TextView) activity.findViewById(i2);
        this.A06.setAllCaps(false);
        A02(true);
    }

    public void A00() {
        CountDownTimer countDownTimer = this.A01;
        if (countDownTimer != null) {
            if (this.A00 > 300000) {
                return;
            }
            countDownTimer.cancel();
            this.A01 = null;
            this.A00 = 0L;
        }
        A01(300000L, false);
    }

    public final void A01(final long j, final boolean z) {
        if (j < 3000) {
            A02(true);
            return;
        }
        A02(false);
        CountDownTimer countDownTimer = this.A01;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A00 = 0L;
        }
        this.A07.setText(AnonymousClass029.A0g(this.A08, j / 1000));
        System.currentTimeMillis();
        this.A01 = new CountDownTimer(j) { // from class: X.3V4
            @Override // android.os.CountDownTimer
            public void onFinish() {
                C3V5 c3v5 = C3V5.this;
                c3v5.A02(true);
                c3v5.A01 = null;
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j2) {
                C3V5 c3v5 = C3V5.this;
                c3v5.A00 = j2;
                if (!z) {
                    c3v5.A06.setText(c3v5.A04);
                    c3v5.A07.setVisibility(8);
                } else if (j2 > 3600000) {
                    int ceil = (int) Math.ceil(j2 / 3600000.0d);
                    c3v5.A06.setText(c3v5.A08.A0A(c3v5.A03, ceil, Integer.valueOf(ceil)));
                } else {
                    c3v5.A06.setText(c3v5.A04);
                    TextView textView = c3v5.A07;
                    textView.setVisibility(0);
                    textView.setText(AnonymousClass029.A0g(c3v5.A08, j2 / 1000));
                }
            }
        }.start();
    }

    public void A02(boolean z) {
        Button button = this.A06;
        button.setEnabled(z);
        if (z) {
            CountDownTimer countDownTimer = this.A01;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.A01 = null;
            }
            button.setEnabled(true);
            button.setText(this.A04);
            Drawable A03 = C02160Ac.A03(button.getContext(), this.A05);
            if (A03 != null) {
                Drawable A0Q = C02180Ae.A0Q(A03, C02160Ac.A00(button.getContext(), R.color.verify_sms_enabled_icon_color));
                if (this.A08.A0M()) {
                    button.setCompoundDrawablesWithIntrinsicBounds(A0Q, (Drawable) null, (Drawable) null, (Drawable) null);
                } else {
                    button.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, A0Q, (Drawable) null);
                }
                this.A07.setVisibility(8);
                return;
            }
            throw null;
        }
        Drawable A032 = C02160Ac.A03(button.getContext(), this.A02);
        if (A032 != null) {
            Drawable A0Q2 = C02180Ae.A0Q(A032, C02160Ac.A00(button.getContext(), R.color.verify_sms_disabled_icon_color));
            if (this.A08.A0M()) {
                button.setCompoundDrawablesWithIntrinsicBounds(A0Q2, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                button.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, A0Q2, (Drawable) null);
            }
            this.A07.setVisibility(8);
            return;
        }
        throw null;
    }
}
