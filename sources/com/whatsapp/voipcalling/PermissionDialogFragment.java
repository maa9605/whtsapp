package com.whatsapp.voipcalling;

import X.C000200d;
import X.C000500h;
import X.C000700j;
import X.C018708s;
import X.C02F;
import X.C03150Ej;
import X.C05W;
import X.C0MN;
import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class PermissionDialogFragment extends Hilt_PermissionDialogFragment {
    public int A00;
    public Dialog A01;
    public Button A02;
    public TextView A03;
    public C03150Ej A04;
    public C05W A05;
    public C018708s A06;
    public C02F A07;
    public C000500h A08;
    public C0MN A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public String[] A0D;

    @Override // X.C0BA
    public void A0N(int i, String[] strArr, int[] iArr) {
        boolean z = false;
        if (i != 100) {
            C000700j.A08(false, "Unknown request code");
            return;
        }
        StringBuilder A0P = C000200d.A0P("PermissionDialogFragment/onRequestPermissionsResult permissions: ");
        A0P.append(Arrays.toString(strArr));
        A0P.append(", grantResults: ");
        A0P.append(Arrays.toString(iArr));
        Log.i(A0P.toString());
        int length = iArr.length;
        boolean z2 = length > 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = z2;
                break;
            } else if (iArr[i2] != 0) {
                break;
            } else {
                i2++;
            }
        }
        C0MN c0mn = this.A09;
        if (c0mn != null) {
            if (z) {
                c0mn.AMx(this.A00, strArr);
            } else {
                c0mn.AMw(this.A00);
            }
        }
    }

    @Override // X.C0BA
    public void A0e() {
        this.A0U = true;
        this.A09 = null;
    }

    @Override // X.C0BA
    public void A0g() {
        this.A0U = true;
        Window window = this.A01.getWindow();
        if (window != null) {
            window.setLayout(A01().getDisplayMetrics().widthPixels, A01().getDisplayMetrics().heightPixels);
            return;
        }
        throw null;
    }

    @Override // X.C0BA
    public void A0q() {
        this.A0U = true;
        Dialog dialog = this.A01;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // X.C0BA
    public void A0s() {
        this.A0U = true;
        if (this.A0A) {
            boolean A09 = this.A07.A09();
            boolean A07 = this.A07.A07();
            if ((!this.A0B || A07) && (!this.A0C || A09)) {
                this.A01.dismiss();
                if (this.A09 != null) {
                    new Handler().post(new RunnableEBaseShape7S0100000_I0_7(this, 41));
                }
            }
            this.A0A = false;
        }
    }

    @Override // com.whatsapp.voipcalling.Hilt_PermissionDialogFragment, X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        this.A09 = (C0MN) context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0118, code lost:
        if (r7 != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x002c, code lost:
        if (r10.A0B != false) goto L85;
     */
    @Override // X.C0BA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0v(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.PermissionDialogFragment.A0v(android.os.Bundle):void");
    }
}
