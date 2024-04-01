package org.npci.commonlibrary;

import X.C002301c;
import X.C02160Ac;
import X.C02180Ae;
import X.C4B3;
import X.C4B7;
import X.C4BA;
import X.C4BB;
import X.C4BK;
import X.C4BR;
import X.C4GF;
import X.C4GH;
import X.C90404Aw;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewSwitcher;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ATMPinFragment extends NPCIFragment implements C4BR {
    public final HashMap A03 = new HashMap();
    public int A00 = 0;
    public boolean A02 = false;
    public ViewSwitcher A01 = null;

    @Override // X.C0BA
    public View A0p(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.npci_fragment_atmpin, viewGroup, false);
    }

    @Override // org.npci.commonlibrary.NPCIFragment, X.C0BA
    public void A0w(View view, Bundle bundle) {
        String A06;
        super.A0w(view, bundle);
        A0z();
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.switcherLayout1);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.switcherLayout2);
        this.A01 = (ViewSwitcher) view.findViewById(R.id.view_switcher);
        if (((NPCIFragment) this).A07 != null) {
            boolean z = false;
            for (int i = 0; i < ((NPCIFragment) this).A07.length(); i++) {
                try {
                    JSONObject jSONObject = ((NPCIFragment) this).A07.getJSONObject(i);
                    String string = jSONObject.getString("subtype");
                    int optInt = jSONObject.optInt("dLength") == 0 ? 6 : jSONObject.optInt("dLength");
                    if (string.equals("MPIN")) {
                        C002301c c002301c = ((NPCIFragment) this).A0B;
                        C4GH A0y = A0y(c002301c.A06(R.string.npci_set_mpin_title), i, optInt);
                        C4GH A0y2 = A0y(c002301c.A06(R.string.npci_confirm_mpin_title), i, optInt);
                        if (!z) {
                            A0y.A7v();
                            z = true;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(A0y);
                        arrayList.add(A0y2);
                        C4GF c4gf = new C4GF(A09());
                        c4gf.A00(arrayList, this);
                        c4gf.A02 = jSONObject;
                        ((NPCIFragment) this).A0C.add(c4gf);
                        viewGroup2.addView(c4gf);
                    } else {
                        if (string.equals("ATMPIN")) {
                            A06 = ((NPCIFragment) this).A0B.A06(R.string.npci_atm_title);
                        } else if ("OTP".equals(string) || "SMS".equals(string) || "EMAIL".equals(string) || "HOTP".equals(string) || "TOTP".equals(string)) {
                            A06 = ((NPCIFragment) this).A0B.A06(R.string.npci_otp_title);
                            ((NPCIFragment) this).A00 = i;
                        } else {
                            A06 = "";
                        }
                        C4GH A0y3 = A0y(A06, i, optInt);
                        if (!z) {
                            A0y3.A7v();
                            z = true;
                        }
                        A0y3.A07 = jSONObject;
                        ((NPCIFragment) this).A0C.add(A0y3);
                        viewGroup.addView(A0y3);
                    }
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        int i2 = ((NPCIFragment) this).A00;
        if (i2 != -1) {
            ArrayList arrayList2 = ((NPCIFragment) this).A0C;
            if (arrayList2.get(i2) instanceof C4GH) {
                C4GH c4gh = (C4GH) arrayList2.get(i2);
                A11(c4gh);
                c4gh.A0C = true;
            }
        }
        ArrayList arrayList3 = ((NPCIFragment) this).A0C;
        int size = arrayList3.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 != ((NPCIFragment) this).A00) {
                final C4BK c4bk = (C4BK) arrayList3.get(i3);
                final Drawable A03 = C02160Ac.A03(A09(), R.drawable.ic_visibility_on);
                final Drawable A032 = C02160Ac.A03(A09(), R.drawable.ic_visibility_off);
                C002301c c002301c2 = ((NPCIFragment) this).A0B;
                final String A062 = c002301c2.A06(R.string.npci_action_hide);
                final String A063 = c002301c2.A06(R.string.npci_action_show);
                c4bk.AVc(A063, A03, new View.OnClickListener() { // from class: X.4Au
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        String str;
                        Drawable drawable;
                        C4BK c4bk2 = C4BK.this;
                        if (c4bk2.AVd()) {
                            str = A062;
                            drawable = A032;
                        } else {
                            str = A063;
                            drawable = A03;
                        }
                        c4bk2.AVc(str, drawable, this, 0, true, true);
                    }
                }, 0, true, true);
            }
        }
    }

    public final void A12() {
        C4BA c4ba;
        C4GH c4gh;
        String inputValue;
        int i = ((NPCIFragment) this).A00;
        if (i != -1) {
            ArrayList arrayList = ((NPCIFragment) this).A0C;
            if ((arrayList.get(i) instanceof C4GH) && ((inputValue = (c4gh = (C4GH) arrayList.get(i)).getInputValue()) == null || inputValue.length() != c4gh.A00)) {
                A10(c4gh, ((NPCIFragment) this).A0B.A06(R.string.npci_invalid_otp));
                return;
            }
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = ((NPCIFragment) this).A0C;
            if (i2 < arrayList2.size()) {
                if (arrayList2.get(i2) instanceof C4GH) {
                    C4GH c4gh2 = (C4GH) arrayList2.get(i2);
                    if (c4gh2.getInputValue().length() != c4gh2.A00) {
                        A10(c4gh2, ((NPCIFragment) this).A0B.A06(R.string.npci_component_message));
                        return;
                    }
                }
                i2++;
            } else if (this.A02) {
                return;
            } else {
                this.A02 = true;
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    JSONObject jSONObject = (JSONObject) ((C4BK) arrayList2.get(i3)).getFormDataTag();
                    try {
                        String string = jSONObject.getString("type");
                        String string2 = jSONObject.getString("subtype");
                        ((NPCIFragment) this).A09.put("credential", ((C4BK) arrayList2.get(i3)).getInputValue());
                        String A00 = ((GetCredential) ((NPCIFragment) this).A01).A0A.A04.A00(((NPCIFragment) this).A09);
                        C90404Aw c90404Aw = ((GetCredential) ((NPCIFragment) this).A01).A0A;
                        C4B7 c4b7 = c90404Aw.A01;
                        if (c4b7 == null && (c4ba = c90404Aw.A05) != null) {
                            C4B3 c4b3 = c4ba.A03;
                            c90404Aw.A00 = c4b3;
                            c4b7 = new C4B7(c4b3, c4ba.A00);
                            c90404Aw.A01 = c4b7;
                        }
                        C4BB A002 = c4b7.A00(A0a(), A00, string, string2, ((NPCIFragment) this).A09);
                        if (A002 != null) {
                            HashMap hashMap = this.A03;
                            StringBuilder sb = new StringBuilder();
                            C02180Ae.A1C(A002, sb);
                            hashMap.put(string2, sb.toString());
                        }
                    } catch (JSONException e) {
                        throw new RuntimeException(e);
                    }
                }
                Intent intent = new Intent();
                intent.putExtra("credBlocks", this.A03);
                ((Activity) ((NPCIFragment) this).A01).setResult(250, intent);
                ((Activity) ((NPCIFragment) this).A01).finish();
                return;
            }
        }
    }

    @Override // X.C4BR
    public void AKb(int i) {
        if (((NPCIFragment) this).A0C.get(i) instanceof C4GF) {
            return;
        }
        this.A00 = i;
    }

    @Override // X.C4BR
    public void AKc(int i, String str) {
        int i2 = ((NPCIFragment) this).A00;
        if (i2 != -1 && i2 == i) {
            ArrayList arrayList = ((NPCIFragment) this).A0C;
            if (arrayList.get(i2) instanceof C4GH) {
                Timer timer = ((NPCIFragment) this).A06;
                if (timer != null) {
                    timer.cancel();
                }
                ((C4GH) arrayList.get(((NPCIFragment) this).A00)).A02(false);
                ((C4GH) arrayList.get(((NPCIFragment) this).A00)).A01("", false);
                C4GH c4gh = (C4GH) arrayList.get(((NPCIFragment) this).A00);
                Drawable A03 = C02160Ac.A03(A09(), R.drawable.ic_tick_ok);
                if (A03 != null) {
                    c4gh.A03.setImageDrawable(A03);
                }
                c4gh.A00(c4gh.A03, true);
            }
        }
    }

    @Override // X.C4BR
    public void AKd(View view, String str) {
        A10(view, str);
    }
}
