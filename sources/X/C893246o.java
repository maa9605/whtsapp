package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.46o  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C893246o extends AbstractC04890Mh {
    public int A00 = -1;
    public final LayoutInflater A01;
    public final C09P A02;
    public final C647434n A03;
    public final AnonymousClass241 A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final JSONArray A0C;
    public final boolean A0D;
    public final boolean A0E;

    public C893246o(C647434n c647434n, LayoutInflater layoutInflater, AnonymousClass241 anonymousClass241, JSONArray jSONArray, C09P c09p, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2) {
        this.A0C = jSONArray;
        this.A09 = str;
        this.A0A = str2;
        this.A08 = str3;
        this.A0B = str4;
        this.A05 = str5;
        this.A06 = str6;
        this.A07 = str7;
        this.A0E = z;
        this.A0D = z2;
        this.A04 = anonymousClass241;
        this.A01 = layoutInflater;
        this.A02 = c09p;
        this.A03 = c647434n;
    }

    @Override // X.AbstractC04890Mh
    public int A0C() {
        return this.A0C.length();
    }

    @Override // X.AbstractC04890Mh
    public C0TS A0E(ViewGroup viewGroup, int i) {
        View inflate = this.A01.inflate(R.layout.wa_list_view_row, viewGroup, false);
        if (this.A0E) {
            TypedValue typedValue = new TypedValue();
            viewGroup.getContext().getTheme().resolveAttribute(16843534, typedValue, true);
            inflate.setBackgroundResource(typedValue.resourceId);
        }
        return new C893146n(this, inflate);
    }

    @Override // X.AbstractC04890Mh
    public void A0F(C0TS c0ts, int i) {
        C893146n c893146n = (C893146n) c0ts;
        if (c893146n != null) {
            try {
                C893246o c893246o = c893146n.A06;
                JSONObject jSONObject = c893246o.A0C.getJSONObject(c893146n.A00());
                c893146n.A02.setText(jSONObject.getString(c893246o.A0B));
                boolean optBoolean = jSONObject.optBoolean(c893246o.A06, false);
                View view = c893146n.A0H;
                view.setAlpha(optBoolean ? 0.38f : 1.0f);
                view.setFocusable(optBoolean ? false : true);
                view.setClickable(optBoolean ? false : true);
                String str = c893246o.A09;
                if (str != null) {
                    if (str.equals("radio")) {
                        c893146n.A0C(true);
                    } else {
                        if (str.equals("image")) {
                            String str2 = c893246o.A07;
                            if (!TextUtils.isEmpty(str2)) {
                                c893146n.A03.setVisibility(8);
                                String str3 = c893246o.A08;
                                if (TextUtils.isEmpty(str3) || (str3 != null && str3.equals("url"))) {
                                    c893146n.A05.setVisibility(0);
                                    if (str2 != null) {
                                        c893246o.A04.A01(jSONObject.getString(str2), c893146n.A05);
                                    } else {
                                        throw null;
                                    }
                                } else if (!TextUtils.isEmpty(str3) && str3 != null && str3.equals("file_path")) {
                                    if (str2 != null) {
                                        String string = jSONObject.getString(str2);
                                        if (new File(string).exists()) {
                                            c893146n.A05.setVisibility(0);
                                            c893146n.A05.setImageURI(Uri.parse(string));
                                        } else {
                                            c893146n.A05.setVisibility(8);
                                        }
                                    } else {
                                        throw null;
                                    }
                                }
                            }
                        }
                        c893146n.A05.setVisibility(8);
                        c893146n.A03.setVisibility(8);
                    }
                } else {
                    c893146n.A05.setVisibility(8);
                    c893146n.A03.setVisibility(8);
                }
                String str4 = c893246o.A05;
                if (str4 != null && !TextUtils.isEmpty(jSONObject.optString(str4))) {
                    c893146n.A01.setText(jSONObject.optString(str4));
                    c893146n.A01.setVisibility(0);
                } else {
                    c893146n.A01.setVisibility(8);
                }
                String str5 = c893246o.A0A;
                if (str5 != null && str5.equals("radio")) {
                    c893146n.A0C(false);
                } else {
                    c893146n.A04.setVisibility(8);
                }
                view.setOnClickListener(new View$OnClickListenerC56732nu(this, c893146n, i));
                boolean z = this.A0D;
                if (!z && i != A0C() - 1) {
                    c893146n.A00.setVisibility(0);
                    return;
                } else {
                    c893146n.A00.setVisibility(z ? 8 : 4);
                    return;
                }
            } catch (JSONException unused) {
                StringBuilder sb = new StringBuilder("WaListViewBinder/ListViewHolder/decorate: property not found at position ");
                sb.append(c893146n.A00());
                sb.append(":");
                sb.append(c893146n.A06.A0C.toString());
                Log.e(sb.toString());
                throw new InvalidParameterException(sb.toString());
            }
        }
        throw null;
    }

    public void A0G(C893146n c893146n, int i) {
        C893246o c893246o;
        int i2;
        boolean z = false;
        try {
            C893246o c893246o2 = c893146n.A06;
            z = c893246o2.A0C.getJSONObject(c893146n.A00()).optBoolean(c893246o2.A06, false);
        } catch (JSONException unused) {
        }
        if (z) {
            return;
        }
        try {
            JSONObject jSONObject = this.A0C.getJSONObject(i);
            C09P c09p = this.A02;
            if (c09p != null) {
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.get(next).toString());
                }
                C647434n c647434n = this.A03;
                ArrayList arrayList = new ArrayList();
                InterfaceC020509l A0f = AnonymousClass088.A0f(C45Q.A08(hashMap));
                if (arrayList.size() == 0) {
                    arrayList.add(A0f);
                    C25031Du.A00(((AbstractC016907v) c647434n.A01).A00, c09p, new C021109r(arrayList), c647434n.A00);
                } else {
                    throw new IllegalArgumentException("arguments have to be continuous");
                }
            }
        } catch (JSONException e) {
            StringBuilder A0P = C000200d.A0P("WaListViewBinder/SingleTextSelectionAdapter/notifyPositionTapped : ");
            A0P.append(e.getMessage());
            Log.e(A0P.toString());
        }
        boolean z2 = false;
        try {
            C893246o c893246o3 = c893146n.A06;
            z2 = c893246o3.A0C.getJSONObject(c893146n.A00()).optBoolean(c893246o3.A06, false);
        } catch (JSONException unused2) {
        }
        if (z2 || (i2 = (c893246o = c893146n.A06).A00) == c893146n.A00()) {
            return;
        }
        c893246o.A02(i2);
        int A00 = c893146n.A00();
        c893246o.A00 = A00;
        c893246o.A02(A00);
    }
}
