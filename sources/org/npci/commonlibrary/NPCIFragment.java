package org.npci.commonlibrary;

import X.ActivityC02330At;
import X.C002301c;
import X.C02160Ac;
import X.C0BA;
import X.C4BR;
import X.C4GH;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.npci.commonlibrary.NPCIFragment;

/* loaded from: classes3.dex */
public abstract class NPCIFragment extends C0BA implements C4BR {
    public Context A01;
    public Handler A02;
    public PopupWindow A03;
    public Runnable A04;
    public Timer A05;
    public final C002301c A0B = C002301c.A00();
    public JSONObject A08 = null;
    public JSONObject A09 = null;
    public JSONArray A07 = null;
    public boolean A0A = false;
    public final ArrayList A0C = new ArrayList();
    public int A00 = -1;
    public Timer A06 = null;

    @Override // X.C0BA
    public void A0q() {
        Runnable runnable;
        this.A0U = true;
        Timer timer = this.A06;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = this.A05;
        if (timer2 != null) {
            timer2.cancel();
        }
        Handler handler = this.A02;
        if (handler != null && (runnable = this.A04) != null) {
            handler.removeCallbacks(runnable);
        }
        PopupWindow popupWindow = this.A03;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    @Override // X.C0BA
    public void A0u(Context context) {
        super.A0u(context);
        this.A01 = context;
    }

    @Override // X.C0BA
    public void A0w(View view, Bundle bundle) {
        ActivityC02330At A09 = A09();
        if (A09 instanceof GetCredential) {
            ((GetCredential) A09).A0C = this;
        }
    }

    public final int A0x(float f) {
        return (int) (f * (A01().getDisplayMetrics().densityDpi / 160));
    }

    public C4GH A0y(String str, int i, int i2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        C4GH c4gh = new C4GH(A09());
        if (this.A07.length() == 1) {
            c4gh.setActionBarPositionTop(true);
            layoutParams.width = A0x(300.0f);
            layoutParams.topMargin = A0x(40.0f);
            c4gh.A0A.setCharSize(0.0f);
            c4gh.A0A.setSpace(A0x(15.0f));
            c4gh.A0A.setFontSize(A0x(22.0f));
            c4gh.A0A.setPadding(0, A0x(32.0f), 0, 0);
            c4gh.A0A.setMargin(new int[]{0, A0x(32.0f), 0, 0});
            c4gh.A0A.setLineStrokeCentered(true);
            c4gh.A0A.setLineStrokeSelected(A0x(2.0f));
            c4gh.A0A.setColorStates(C02160Ac.A02(A09(), R.color.form_item_input_colors_transparent));
        }
        c4gh.setLayoutParams(layoutParams);
        c4gh.setInputLength(i2);
        c4gh.A0B = this;
        c4gh.setTitle(str);
        c4gh.A01 = i;
        return c4gh;
    }

    public void A0z() {
        String string;
        Bundle bundle = super.A06;
        if (bundle != null) {
            try {
                String string2 = bundle.getString("configuration");
                if (string2 != null) {
                    this.A08 = new JSONObject(string2);
                }
                String string3 = bundle.getString("controls");
                if (string3 != null && (string = new JSONObject(string3).getString("CredAllowed")) != null) {
                    this.A07 = new JSONArray(string);
                    ArrayList arrayList = new ArrayList();
                    JSONObject jSONObject = null;
                    JSONObject jSONObject2 = null;
                    JSONObject jSONObject3 = null;
                    JSONObject jSONObject4 = null;
                    for (int i = 0; i < this.A07.length(); i++) {
                        try {
                            String optString = ((JSONObject) this.A07.get(i)).optString("subtype", "");
                            if (optString.equals("ATMPIN")) {
                                jSONObject = this.A07.getJSONObject(i);
                            }
                            if (optString.matches("OTP|SMS|HOTP|TOTP")) {
                                jSONObject2 = this.A07.getJSONObject(i);
                            }
                            if (optString.equals("MPIN")) {
                                jSONObject3 = this.A07.getJSONObject(i);
                            }
                            if (optString.equals("NMPIN")) {
                                jSONObject4 = this.A07.getJSONObject(i);
                            }
                        } catch (JSONException unused) {
                            Log.e("PAY: sortCredAllowedString failed");
                        }
                    }
                    if (this.A07.length() == 3 && jSONObject != null && jSONObject2 != null && jSONObject3 != null) {
                        arrayList.add(jSONObject2);
                        arrayList.add(jSONObject);
                        arrayList.add(jSONObject3);
                    }
                    if (this.A07.length() == 2 && jSONObject2 != null && jSONObject3 != null) {
                        arrayList.add(jSONObject2);
                        arrayList.add(jSONObject3);
                    }
                    if (this.A07.length() == 2 && jSONObject3 != null && jSONObject4 != null) {
                        arrayList.add(jSONObject3);
                        arrayList.add(jSONObject4);
                    }
                    if (arrayList.size() > 0) {
                        this.A07 = new JSONArray((Collection) arrayList);
                    }
                }
                String string4 = bundle.getString("salt");
                if (string4 != null) {
                    this.A09 = new JSONObject(string4);
                }
                String string5 = bundle.getString("payInfo");
                if (string5 != null) {
                    new JSONArray(string5);
                }
            } catch (JSONException e) {
                Log.e("PAY: Error while reading Arguments", e);
            }
        }
    }

    public void A10(View view, String str) {
        PopupWindow popupWindow = this.A03;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        View inflate = A09().getLayoutInflater().inflate(R.layout.npci_layout_popup_view, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.popup_text)).setText(str);
        PopupWindow popupWindow2 = new PopupWindow(inflate, -2, A0x(60.0f));
        this.A03 = popupWindow2;
        popupWindow2.setAnimationStyle(R.style.PopupAnimation);
        this.A03.showAtLocation(view, 17, 0, 0);
        inflate.findViewById(R.id.popup_button).setOnClickListener(new View.OnClickListener() { // from class: X.4BC
            {
                NPCIFragment.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                NPCIFragment.this.A03.dismiss();
            }
        });
        this.A05 = new Timer();
        Handler handler = new Handler(Looper.getMainLooper());
        this.A02 = handler;
        Runnable runnable = new Runnable() { // from class: X.4BD
            {
                NPCIFragment.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                NPCIFragment.this.A03.dismiss();
            }
        };
        this.A04 = runnable;
        handler.postDelayed(runnable, 3000L);
    }

    public void A11(C4GH c4gh) {
        Timer timer = new Timer();
        this.A06 = timer;
        timer.schedule(new TimerTask() { // from class: X.4BG
            {
                NPCIFragment.this = this;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                NPCIFragment nPCIFragment = NPCIFragment.this;
                if (nPCIFragment.A08.optString("resendOTPFeature", "false").equals("false") || nPCIFragment.A0A) {
                    return;
                }
                nPCIFragment.A09().runOnUiThread(new C4BF(nPCIFragment));
            }
        }, 45000L);
        c4gh.AVc("", null, null, 0, false, false);
        c4gh.A00(c4gh.A03, false);
        c4gh.A01(this.A0B.A06(R.string.npci_detecting_otp), true);
        c4gh.A02(true);
    }
}
