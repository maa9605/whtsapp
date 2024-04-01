package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.4G5 */
/* loaded from: classes3.dex */
public abstract class C4G5 extends C06020Rf {
    public int A00;
    public ViewGroup A01;
    public ImageView A02;
    public TextView A03;
    public String A04;
    public String A05;
    public final WaBloksActivity A06;

    public C4G5(WaBloksActivity waBloksActivity, int i) {
        this.A06 = waBloksActivity;
        this.A00 = i;
    }

    public void A00(int i, AnonymousClass081 anonymousClass081) {
        if (!(this instanceof C4I8)) {
            try {
                this.A05 = anonymousClass081.ADJ(AnonymousClass460.A01);
                C0U1 A0c = this.A06.A0c();
                if (A0c != null) {
                    A0c.A0H(this.A05);
                    return;
                }
                throw null;
            } catch (ClassCastException e) {
                StringBuilder sb = new StringBuilder("Bloks: Invalid navigation bar type");
                sb.append(e);
                Log.e(sb.toString());
                return;
            }
        }
        try {
            AnonymousClass144 anonymousClass144 = new AnonymousClass144(13642, anonymousClass081.AF7());
            AnonymousClass084 anonymousClass084 = C891645y.A05;
            anonymousClass144.A01.A02(anonymousClass084, anonymousClass081.ADJ(anonymousClass084));
            AnonymousClass084 anonymousClass0842 = C891645y.A04;
            anonymousClass144.A01.A02(anonymousClass0842, Boolean.valueOf(anonymousClass081.A8Z(anonymousClass0842, false)));
            AnonymousClass084 anonymousClass0843 = C891645y.A03;
            anonymousClass144.A01.A02(anonymousClass0843, Boolean.valueOf(anonymousClass081.A8Z(anonymousClass0843, false)));
            AnonymousClass084 anonymousClass0844 = C891645y.A01;
            anonymousClass144.A01.A02(anonymousClass0844, anonymousClass081.ABT(anonymousClass0844));
            AnonymousClass084 anonymousClass0845 = C891645y.A02;
            anonymousClass144.A01.A02(anonymousClass0845, anonymousClass081.ABT(anonymousClass0845));
            AnonymousClass084 anonymousClass0846 = C891645y.A00;
            anonymousClass144.A01.A02(anonymousClass0846, anonymousClass081.ADJ(anonymousClass0846));
            this.A05 = (String) anonymousClass144.A01.A00(C45v.A02);
            String str = (String) anonymousClass144.A01.A00(anonymousClass0846);
            if (str == null) {
                str = "";
            }
            this.A04 = str;
            A01(this.A05, str);
        } catch (ClassCastException e2) {
            StringBuilder sb2 = new StringBuilder("Bloks: Invalid navigation bar type");
            sb2.append(e2);
            Log.e(sb2.toString());
        }
    }

    public void A01(String str, String str2) {
        String str3;
        if (!(this instanceof C4I8)) {
            return;
        }
        C4I8 c4i8 = (C4I8) this;
        TextView textView = c4i8.A03;
        if (textView != null) {
            textView.setText(str);
            c4i8.A03.setVisibility(0);
        }
        ImageView imageView = c4i8.A02;
        if (imageView == null || (str3 = c4i8.A04) == null) {
            return;
        }
        c4i8.A00.A00(str3, str3, imageView);
        c4i8.A02.setVisibility(0);
    }

    @Override // X.C06020Rf, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        int i = this.A00;
        if (i == 0) {
            C0U1 A0c = this.A06.A0c();
            if (A0c != null) {
                A0c.A0H(this.A05);
                return;
            }
            throw null;
        } else if (i != 1) {
        } else {
            WaBloksActivity waBloksActivity = this.A06;
            C0U1 A0c2 = waBloksActivity.A0c();
            if (A0c2 != null) {
                A0c2.A0H("");
                C0U1 A0c3 = waBloksActivity.A0c();
                if (A0c3 != null) {
                    ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(A0c3.A02()).inflate(R.layout.bk_navigation_bar, (ViewGroup) waBloksActivity.findViewById(R.id.bk_navigation_custom_view), false);
                    this.A01 = viewGroup;
                    this.A02 = (ImageView) viewGroup.findViewById(R.id.bk_navigation_logo);
                    TextView textView = (TextView) this.A01.findViewById(R.id.bk_navigation_title);
                    this.A03 = textView;
                    if (this.A01 != null) {
                        if (this.A02 != null) {
                            if (textView != null) {
                                if (bundle != null) {
                                    this.A05 = bundle.getString("bk_navigation_bar_title");
                                    String string = bundle.getString("bk_navigation_bar_logo");
                                    this.A04 = string;
                                    A01(this.A05, string);
                                }
                                C0U1 A0c4 = waBloksActivity.A0c();
                                if (A0c4 != null) {
                                    A0c4.A0M(true);
                                    C0U1 A0c5 = waBloksActivity.A0c();
                                    if (A0c5 != null) {
                                        A0c5.A0D(this.A01);
                                        return;
                                    }
                                    throw null;
                                }
                                throw null;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
    }

    @Override // X.C06020Rf, android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        bundle.putString("bk_navigation_bar_title", this.A05);
        bundle.putString("bk_navigation_bar_logo", this.A04);
    }
}
