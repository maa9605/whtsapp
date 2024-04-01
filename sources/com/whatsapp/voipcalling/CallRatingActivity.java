package com.whatsapp.voipcalling;

import X.C000200d;
import X.C02E;
import X.C02O;
import X.C0EW;
import X.C0HA;
import X.C2M7;
import X.C2QR;
import X.C2QS;
import X.C40081rY;
import X.InterfaceC74223cu;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallRatingActivity;

/* loaded from: classes2.dex */
public class CallRatingActivity extends C2QR {
    public static final int[] A0I = {R.string.rating_1, R.string.rating_2, R.string.rating_3, R.string.rating_4, R.string.rating_5};
    public View A00;
    public EditText A01;
    public LinearLayout A02;
    public LinearLayout A03;
    public RatingBar A04;
    public TextView A05;
    public C02E A06;
    public C40081rY A07;
    public C0HA A08;
    public WamCall A09;
    public C02O A0A;
    public InterfaceC74223cu A0B = new InterfaceC74223cu() { // from class: X.3tU
        {
            CallRatingActivity.this = this;
        }

        @Override // X.InterfaceC74223cu
        public final void A7q() {
            CallRatingActivity.this.finish();
        }
    };
    public C2M7 A0C;
    public C0EW A0D;
    public C2QS A0E;
    public Integer A0F;
    public String A0G;
    public boolean A0H;

    public final void A0o() {
        int rating = (int) this.A04.getRating();
        String A0A = C000200d.A0A(this.A01);
        boolean z = false;
        this.A00.setEnabled((rating > 0 || A0A.codePointCount(0, A0A.length()) >= 3) ? true : true);
    }

    public /* synthetic */ void lambda$onCreate$2642$CallRatingActivity(View view) {
        findViewById(((Number) view.getTag()).intValue()).performClick();
    }

    public /* synthetic */ void lambda$onCreate$2643$CallRatingActivity(View view) {
        CompoundButton compoundButton = (CompoundButton) view;
        Number number = (Number) compoundButton.getTag();
        if (number != null) {
            if (compoundButton.isChecked()) {
                this.A0F = Integer.valueOf(this.A0F.intValue() | (1 << number.intValue()));
            } else {
                this.A0F = Integer.valueOf(this.A0F.intValue() & ((1 << number.intValue()) ^ (-1)));
            }
        }
        StringBuilder A0P = C000200d.A0P("callratingactivity/problems ");
        A0P.append(Integer.toBinaryString(this.A0F.intValue()));
        Log.i(A0P.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x014c, code lost:
        if (r0.longValue() < 1) goto L69;
     */
    @Override // X.C2QR, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.CallRatingActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C2M7 c2m7 = this.A0C;
        c2m7.A00.remove(this.A0B);
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStop() {
        String str;
        super.onStop();
        WamCall wamCall = this.A09;
        if (wamCall != null) {
            StringBuilder A0P = C000200d.A0P("callratingactivity/postCallEvent with rating ");
            A0P.append(wamCall.userRating);
            Log.i(A0P.toString());
            C0EW c0ew = this.A0D;
            WamCall wamCall2 = this.A09;
            if (wamCall2 != null) {
                str = wamCall2.callRandomId;
            } else {
                str = null;
            }
            c0ew.A03().putString("call_rating_last_call", str).apply();
            this.A08.A06(this.A09, this.A0H);
            if (this.A0G != null) {
                StringBuilder A0P2 = C000200d.A0P("callratingactivity/uploadTimeSeries with rating ");
                A0P2.append(this.A09.userRating);
                A0P2.append("time series dir ");
                C000200d.A1N(A0P2, this.A0G);
                this.A0E.A02(this.A0G, this.A09);
            }
            this.A09 = null;
        }
        finish();
    }
}
