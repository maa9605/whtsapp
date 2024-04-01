package com.whatsapp.camera;

import X.AbstractC005302j;
import X.AbstractC50702Sv;
import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.ActivityC02310Ar;
import X.AnonymousClass011;
import X.AnonymousClass075;
import X.C000400f;
import X.C001200o;
import X.C003101m;
import X.C003701t;
import X.C011005l;
import X.C011605s;
import X.C012005w;
import X.C018308n;
import X.C01B;
import X.C01C;
import X.C02C;
import X.C02E;
import X.C02F;
import X.C02L;
import X.C02O;
import X.C04480Ki;
import X.C05480Ox;
import X.C05E;
import X.C05G;
import X.C05W;
import X.C05Y;
import X.C0AT;
import X.C0CA;
import X.C0DV;
import X.C0DW;
import X.C0L6;
import X.C0V5;
import X.C29X;
import X.C2AQ;
import X.C2F8;
import X.C2Gx;
import X.C2L9;
import X.C2Lp;
import X.C2NB;
import X.C41681uL;
import X.C42371vd;
import X.C52122a6;
import X.InterfaceC002901k;
import X.InterfaceC05800Qh;
import X.InterfaceC05810Qi;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.Main;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.camera.CameraActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class CameraActivity extends C2NB implements InterfaceC05800Qh, InterfaceC05810Qi {
    public C04480Ki A00;
    public C012005w A01;
    public C02L A02;
    public C01B A03;
    public C011605s A04;
    public C2Lp A05;
    public C29X A06;
    public C05W A07;
    public C42371vd A08;
    public AnonymousClass075 A09;
    public C2L9 A0A;
    public C000400f A0B;
    public C02E A0C;
    public C001200o A0D;
    public C02F A0E;
    public C0CA A0F;
    public C05E A0G;
    public C003701t A0H;
    public AnonymousClass011 A0I;
    public C05Y A0J;
    public C41681uL A0K;
    public C0DW A0L;
    public C0DV A0M;
    public C2F8 A0N;
    public C2AQ A0O;
    public C02O A0P;
    public C05G A0Q;
    public C02C A0R;
    public InterfaceC002901k A0S;
    public WhatsAppLibLoader A0T;
    public C05480Ox A0U;
    public C0L6 A0V;
    public final Rect A0W = new Rect();

    @Override // X.InterfaceC05800Qh
    public C29X A8l() {
        return this.A06;
    }

    @Override // X.InterfaceC05810Qi
    public void ANV() {
        ((AbstractC50702Sv) this.A06.A0X).A0D = false;
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 30) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.A06.A08();
        } else {
            finish();
        }
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        if (this.A06.A0V()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // X.C2NB, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        C2Gx c2Gx;
        super.onCreate(bundle);
        this.A06 = new C52122a6(this, this.A0D, ((ActivityC02270An) this).A08, this.A04, this.A0H, ((ActivityC02290Ap) this).A0A, ((ActivityC02290Ap) this).A08, this.A02, this.A0S, this.A01, this.A0I, this.A03, ((ActivityC02270An) this).A01, this.A0U, this.A0J, this.A0V, this.A07, this.A0C, ((ActivityC02310Ar) this).A01, this.A00, this.A0M, this.A0A, this.A0O, ((ActivityC02290Ap) this).A0D, this.A09, this.A0E, ((ActivityC02290Ap) this).A0F, this.A0F, this.A0R, this.A0L, this.A0K, this.A05, this.A0P, this.A08);
        setTitle(R.string.camera_shortcut);
        C02L c02l = this.A02;
        c02l.A05();
        ArrayList arrayList = null;
        if (c02l.A00 != null) {
            C05E c05e = this.A0G;
            c05e.A05();
            if (c05e.A01 && this.A0Q.A02()) {
                if (!this.A0T.A04()) {
                    Log.i("aborting due to native libraries missing");
                    finish();
                    return;
                } else if ("android.intent.action.CREATE_SHORTCUT".equals(getIntent().getAction())) {
                    Intent intent = new Intent(this, LauncherCameraActivity.class);
                    intent.addFlags(268435456);
                    Intent intent2 = new Intent();
                    intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
                    intent2.putExtra("android.intent.extra.shortcut.NAME", R.string.camera_shortcut);
                    intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(this, R.drawable.launcher_camera));
                    setResult(-1, intent2);
                    finish();
                    return;
                } else if (this.A0B.A02() < ((this.A03.A07(C01C.A3Y) << 10) << 10)) {
                    ((ActivityC02290Ap) this).A0A.A05(R.string.error_no_disc_space, 1);
                    finish();
                    return;
                } else if ((getIntent().getFlags() & 1073741824) != 0) {
                    Log.i("cameraactivity/create/restart-old-shortcut");
                    Intent intent3 = new Intent(this, LauncherCameraActivity.class);
                    intent3.addFlags(268435456);
                    intent3.putExtra("origin", 1);
                    startActivity(intent3);
                    finish();
                    return;
                } else {
                    getWindow().setBackgroundDrawable(new ColorDrawable(-16777216));
                    C018308n.A05(getWindow());
                    setContentView(R.layout.camera);
                    View findViewById = findViewById(R.id.root_view);
                    findViewById.setSystemUiVisibility(4);
                    if (Build.VERSION.SDK_INT >= 21) {
                        getWindow().addFlags(134217728);
                        C0AT.A0d(findViewById, new C0V5() { // from class: X.34s
                            {
                                CameraActivity.this = this;
                            }

                            @Override // X.C0V5
                            public final C07110Wv AHK(View view, C07110Wv c07110Wv) {
                                CameraActivity.this.A0W.set(c07110Wv.A02(), c07110Wv.A04(), c07110Wv.A03(), c07110Wv.A01());
                                return c07110Wv;
                            }
                        });
                    }
                    if (getIntent() != null && getIntent().getExtras() != null && getIntent().getExtras().containsKey("media_preview_params")) {
                        c2Gx = new C2Gx();
                        c2Gx.A02(getIntent().getExtras());
                    } else {
                        c2Gx = null;
                    }
                    C29X c29x = this.A06;
                    AbstractC005302j A02 = AbstractC005302j.A02(getIntent().getStringExtra("jid"));
                    long longExtra = getIntent().getLongExtra("quoted_message_row_id", 0L);
                    C011005l A04 = C011005l.A04(getIntent().getStringExtra("quoted_group_jid"));
                    boolean booleanExtra = getIntent().getBooleanExtra("chat_opened_from_url", false);
                    String stringExtra = getIntent().getStringExtra("android.intent.extra.TEXT");
                    List A0F = C003101m.A0F(UserJid.class, getIntent().getStringArrayListExtra("mentions"));
                    if (bundle == null) {
                        arrayList = getIntent().getParcelableArrayListExtra("uris");
                    } else {
                        c2Gx = null;
                    }
                    c29x.A0H(this, A02, longExtra, A04, booleanExtra, stringExtra, A0F, arrayList, c2Gx, !(this instanceof LauncherCameraActivity) ? false : this.A03.A0E(C01C.A25), getIntent().getBooleanExtra("add_more_image", false));
                    if (RequestPermissionActivity.A0N(this, this.A0E, 30)) {
                        this.A06.A08();
                        return;
                    } else {
                        this.A06.A0x.A01 = 0L;
                        return;
                    }
                }
            }
        }
        Log.i("cameraactivity/create/no-me-or-msgstore-db");
        if (((ActivityC02290Ap) this).A0A != null) {
            startActivity(new Intent(this, Main.class));
            finish();
            return;
        }
        throw null;
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A06.A03();
        this.A04.A03().A00.A07(-1);
    }

    @Override // X.ActivityC02270An, X.ActivityC02320As, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.A06.A0X(i) || super.onKeyDown(i, keyEvent);
    }

    @Override // X.ActivityC02270An, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.A06.A0Y(i) || super.onKeyUp(i, keyEvent);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onPause() {
        super.onPause();
        this.A0N.A01();
        this.A06.A04();
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A06.A0F(bundle);
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        this.A06.A05();
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.A06.A0G(bundle);
    }
}
