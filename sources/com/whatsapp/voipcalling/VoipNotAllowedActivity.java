package com.whatsapp.voipcalling;

import X.AbstractActivityC50132Qb;
import X.AbstractC005302j;
import X.ActivityC02310Ar;
import X.AnonymousClass029;
import X.C000700j;
import X.C003101m;
import X.C003301p;
import X.C018708s;
import X.C01B;
import X.C01C;
import X.C05480Ox;
import X.C05490Oy;
import X.C05W;
import X.C40071rX;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape0S1100000_I0;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I0_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VoipNotAllowedActivity;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class VoipNotAllowedActivity extends AbstractActivityC50132Qb {
    public C01B A00;
    public C05W A01;
    public C018708s A02;
    public C40071rX A03;
    public C05480Ox A04;
    public final C05490Oy A05 = new C05490Oy() { // from class: X.3uc
        {
            VoipNotAllowedActivity.this = this;
        }

        @Override // X.C05490Oy
        public void A04(C0D3 c0d3) {
            Log.i("voipnotallowedactivity/onCallStarted finish this activity");
            VoipNotAllowedActivity.this.finish();
        }
    };

    public /* synthetic */ void lambda$onCreate$2679$VoipNotAllowedActivity(View view) {
        finish();
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View findViewById = findViewById(R.id.content);
        if (findViewById != null) {
            LinearLayout linearLayout = (LinearLayout) findViewById;
            if (configuration.orientation == 1) {
                linearLayout.setOrientation(1);
                return;
            } else {
                linearLayout.setOrientation(0);
                return;
            }
        }
        throw null;
    }

    @Override // X.AbstractActivityC50132Qb, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        String A0o;
        super.onCreate(bundle);
        setContentView(R.layout.voip_not_allowed);
        getWindow().addFlags(524288);
        View findViewById = findViewById(R.id.title);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            C003301p.A06(textView);
            AbstractList abstractList = (AbstractList) C003101m.A0F(UserJid.class, getIntent().getStringArrayListExtra("jids"));
            C000700j.A08(!abstractList.isEmpty(), "Missing jids");
            int intExtra = getIntent().getIntExtra("reason", 0);
            ArrayList arrayList = new ArrayList(abstractList.size());
            if (intExtra != 0 && intExtra != 12 && intExtra != 14) {
                C000700j.A08(abstractList.size() == 1, "Incorrect number of arguments");
                A0o = this.A02.A04(this.A01.A0A((AbstractC005302j) abstractList.get(0)));
            } else {
                Iterator it = abstractList.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.A02.A04(this.A01.A0A((AbstractC005302j) it.next())));
                }
                A0o = AnonymousClass029.A0o(this.A02.A04, true, arrayList);
            }
            View findViewById2 = findViewById(R.id.message);
            if (findViewById2 != null) {
                TextView textView2 = (TextView) findViewById2;
                String str = null;
                switch (intExtra) {
                    case 1:
                        textView2.setText(getString(R.string.voip_not_allowed_needs_update, A0o));
                        break;
                    case 2:
                        textView2.setText(getString(R.string.voip_not_allowed_never, A0o));
                        break;
                    case 3:
                        textView2.setText(R.string.voip_not_allowed_caller_country);
                        str = this.A03.A03("general", "28030008", null).toString();
                        break;
                    case 4:
                        textView2.setText(getString(R.string.voip_not_allowed_callee_country, A0o));
                        str = this.A03.A03("general", "28030008", null).toString();
                        break;
                    case 5:
                        textView.setText(R.string.voip_not_connected_title);
                        textView2.setText(getIntent().getStringExtra("message"));
                        break;
                    case 6:
                        textView.setText(R.string.voip_not_connected_title);
                        textView2.setText(getString(R.string.voip_not_connected_peer_fail, A0o));
                        break;
                    case 7:
                        textView2.setText(R.string.voip_video_not_enabled_for_caller);
                        break;
                    case 8:
                        textView2.setText(getString(R.string.voip_video_not_allowed_at_this_time, A0o));
                        break;
                    case 9:
                        textView2.setText(getString(R.string.voip_video_call_app_needs_update, A0o));
                        break;
                    case 10:
                        textView2.setText(getString(R.string.voip_video_call_old_os_ver, A0o));
                        break;
                    case GoogleMigrateImporterActivity.A0E /* 11 */:
                        textView2.setText(getString(R.string.voip_video_call_old_os_ver, A0o));
                        break;
                    case 12:
                        textView2.setText(((ActivityC02310Ar) this).A01.A0A(R.plurals.voip_group_call_not_supported_plural, abstractList.size(), A0o));
                        break;
                    case 13:
                        textView2.setText(getString(R.string.voip_group_call_old_os_ver, A0o));
                        break;
                    case 14:
                        int A07 = this.A00.A07(C01C.A34);
                        textView2.setText(((ActivityC02310Ar) this).A01.A0A(R.plurals.voip_group_call_reach_maximum, A07, Integer.valueOf(A07)));
                        break;
                    case 15:
                        textView2.setText(getString(R.string.unable_to_add_participant_to_group_call, A0o));
                        break;
                    case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                        textView2.setText(getString(R.string.voip_peer_not_registered, A0o));
                        break;
                    default:
                        textView2.setText(((ActivityC02310Ar) this).A01.A0A(R.plurals.voip_not_allowed_at_this_time_plural, abstractList.size(), A0o));
                        break;
                }
                View findViewById3 = findViewById(R.id.ok);
                if (findViewById3 != null) {
                    TextView textView3 = (TextView) findViewById3;
                    View findViewById4 = findViewById(R.id.more);
                    if (findViewById4 != null) {
                        if (str == null) {
                            findViewById4.setVisibility(8);
                            textView3.setText(R.string.ok);
                        } else {
                            findViewById4.setVisibility(0);
                            findViewById4.setOnClickListener(new ViewOnClickEBaseShape0S1100000_I0(this, str, 5));
                            textView3.setText(R.string.ok_got_it);
                        }
                        textView3.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I0_6(this, 35));
                        View findViewById5 = findViewById(R.id.content);
                        if (findViewById5 != null) {
                            LinearLayout linearLayout = (LinearLayout) findViewById5;
                            if (getResources().getConfiguration().orientation == 1) {
                                linearLayout.setOrientation(1);
                            } else {
                                linearLayout.setOrientation(0);
                            }
                            this.A04.A01(this.A05);
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

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A04.A00(this.A05);
    }
}
