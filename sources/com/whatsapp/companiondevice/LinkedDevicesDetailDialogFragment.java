package com.whatsapp.companiondevice;

import X.AnonymousClass029;
import X.C002301c;
import X.C018508q;
import X.C019208x;
import X.C0AT;
import X.C0CG;
import X.C0JV;
import X.C1PP;
import X.C2J1;
import X.C41711uO;
import X.C41741uR;
import X.C41991uq;
import X.C42881wU;
import X.C46W;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.google.android.search.verification.client.R;
import java.util.Map;

/* loaded from: classes2.dex */
public class LinkedDevicesDetailDialogFragment extends Hilt_LinkedDevicesDetailDialogFragment implements C0CG {
    public DialogInterface.OnDismissListener A00;
    public View A01;
    public C018508q A02;
    public C002301c A03;
    public C0JV A04;
    public C41711uO A05;
    public C41741uR A06;
    public C1PP A07;
    public C41991uq A08;
    public C42881wU A09;
    public Boolean A0A;
    public final C2J1 A0B;

    public LinkedDevicesDetailDialogFragment(C0JV c0jv, C2J1 c2j1) {
        this.A04 = c0jv;
        this.A0B = c2j1;
    }

    public LinkedDevicesDetailDialogFragment(C1PP c1pp, C2J1 c2j1) {
        this.A07 = c1pp;
        this.A0B = c2j1;
    }

    public LinkedDevicesDetailDialogFragment(C42881wU c42881wU, C2J1 c2j1) {
        this.A09 = c42881wU;
        this.A0B = c2j1;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0z(Bundle bundle) {
        this.A01 = LayoutInflater.from(((Hilt_LinkedDevicesDetailDialogFragment) this).A00).inflate(R.layout.linked_devices_detail_dialog, (ViewGroup) null, false);
        this.A0A = null;
        C41741uR c41741uR = this.A06;
        c41741uR.A02.execute(new RunnableEBaseShape0S0300000_I0_0(c41741uR, this, this.A02.A06, 20));
        A18();
        C019208x c019208x = new C019208x(A09());
        c019208x.A07(this.A01);
        return c019208x.A00();
    }

    public final void A18() {
        C42881wU c42881wU = this.A09;
        if (c42881wU != null) {
            boolean A0L = this.A08.A0L(c42881wU.A0F);
            String A05 = C46W.A05(this.A09, A09());
            C42881wU c42881wU2 = this.A09;
            A19(A05, C46W.A01(c42881wU2), AnonymousClass029.A0V(this.A03, c42881wU2.A04, A0L), A0L, this.A09.A09, new ViewOnClickEBaseShape0S0100000_I0_0(this, 39), true, A0F(R.string.log_out), null);
            return;
        }
        C0JV c0jv = this.A04;
        if (c0jv != null) {
            boolean contains = this.A05.A0L.contains(c0jv.A05);
            String A04 = C46W.A04(this.A04, A09());
            C0JV c0jv2 = this.A04;
            int A00 = C46W.A00(c0jv2);
            CharSequence A0V = AnonymousClass029.A0V(this.A03, c0jv2.A00, contains);
            C0JV c0jv3 = this.A04;
            String str = c0jv3.A02;
            ViewOnClickEBaseShape0S0100000_I0_0 viewOnClickEBaseShape0S0100000_I0_0 = new ViewOnClickEBaseShape0S0100000_I0_0(this, 42);
            boolean A002 = c0jv3.A00();
            int i = R.string.log_out;
            if (A002) {
                i = R.string.linked_device_remove;
            }
            A19(A04, A00, A0V, contains, str, viewOnClickEBaseShape0S0100000_I0_0, A002, A0F(i), this.A04.A00() ? A0G(R.string.linked_device_logged_out_helper_text, 30) : null);
            return;
        }
        C1PP c1pp = this.A07;
        if (c1pp == null) {
            return;
        }
        if (((Hilt_LinkedDevicesDetailDialogFragment) this).A00 != null) {
            String A0F = A0F(c1pp.A01);
            C1PP c1pp2 = this.A07;
            A19(A0F, c1pp2.A00, AnonymousClass029.A0S(this.A03, c1pp2.A02), true, null, new ViewOnClickEBaseShape0S0100000_I0_0(this, 41), true, A0F(R.string.unlink), null);
            return;
        }
        throw null;
    }

    public final void A19(String str, int i, CharSequence charSequence, boolean z, String str2, View.OnClickListener onClickListener, boolean z2, String str3, String str4) {
        View view = this.A01;
        if (view != null) {
            ImageView imageView = (ImageView) C0AT.A0D(view, R.id.device_icon);
            View A0D = C0AT.A0D(this.A01, R.id.status_icon);
            View A0D2 = C0AT.A0D(this.A01, R.id.location_container);
            View A0D3 = C0AT.A0D(this.A01, R.id.location_icon);
            TextView textView = (TextView) C0AT.A0D(this.A01, R.id.location_text);
            View A0D4 = C0AT.A0D(this.A01, R.id.sync_container);
            View A0D5 = C0AT.A0D(this.A01, R.id.sync_icon);
            TextView textView2 = (TextView) C0AT.A0D(this.A01, R.id.sync_text);
            TextView textView3 = (TextView) C0AT.A0D(this.A01, R.id.logout_text);
            View A0D6 = C0AT.A0D(this.A01, R.id.close_text);
            TextView textView4 = (TextView) C0AT.A0D(this.A01, R.id.logged_out_device_hint);
            ((TextView) C0AT.A0D(this.A01, R.id.device_name_text)).setText(str);
            imageView.setImageResource(i);
            C46W.A06(imageView, z2);
            ((TextView) C0AT.A0D(this.A01, R.id.status_text)).setText(charSequence);
            int i2 = R.drawable.linked_devices_detail_icon_inactive_background;
            if (z) {
                i2 = R.drawable.linked_devices_detail_icon_active_background;
            }
            A0D.setBackgroundResource(i2);
            if (!TextUtils.isEmpty(str2)) {
                A0D2.setVisibility(0);
                textView.setText(A0G(R.string.linked_device_location, str2));
                int i3 = R.drawable.linked_devices_detail_icon_inactive_background;
                if (z) {
                    i3 = R.drawable.linked_devices_detail_icon_active_background;
                }
                A0D3.setBackgroundResource(i3);
            } else {
                A0D2.setVisibility(8);
            }
            if (this.A0A != null) {
                A0D4.setVisibility(0);
                boolean booleanValue = this.A0A.booleanValue();
                int i4 = R.string.linked_device_not_syncing;
                if (booleanValue) {
                    i4 = R.string.linked_device_syncing;
                }
                textView2.setText(i4);
                boolean booleanValue2 = this.A0A.booleanValue();
                int i5 = R.drawable.linked_devices_detail_icon_inactive_background;
                if (booleanValue2) {
                    i5 = R.drawable.linked_devices_detail_icon_active_background;
                }
                A0D5.setBackgroundResource(i5);
            } else {
                A0D4.setVisibility(8);
            }
            textView4.setVisibility(str4 == null ? 8 : 0);
            if (str4 != null) {
                textView4.setText(str4);
            }
            textView3.setText(str3);
            textView3.setOnClickListener(onClickListener);
            A0D6.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 40));
            return;
        }
        throw null;
    }

    @Override // X.C0CG
    public void A54(Object obj) {
        Map map = (Map) obj;
        C0JV c0jv = this.A04;
        if (c0jv != null) {
            Boolean bool = (Boolean) map.get(c0jv.A05);
            this.A0A = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            A18();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!((DialogFragment) this).A0C) {
            A16(true, true);
        }
        DialogInterface.OnDismissListener onDismissListener = this.A00;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        this.A06.A00.A02(this);
    }
}
