package com.whatsapp.accountsync;

import X.ActivityC02270An;
import X.ActivityC02290Ap;
import X.C000200d;
import X.C002701i;
import X.C02F;
import X.C02L;
import X.C05E;
import X.C06C;
import X.C0DS;
import X.C0HS;
import X.C0WP;
import X.C2MG;
import X.C35811jm;
import X.InterfaceC002901k;
import android.content.Intent;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.accountsync.ProfileActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;

/* loaded from: classes.dex */
public class ProfileActivity extends C0WP {
    public C02L A00;
    public C35811jm A01 = null;
    public C02F A02;
    public C05E A03;
    public C2MG A04;
    public InterfaceC002901k A05;
    public WhatsAppLibLoader A06;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.1jm, X.0HS] */
    @Override // X.C0DS
    public void A1P() {
        if (!((C0DS) this).A0L.A0m) {
            A1V();
            return;
        }
        C35811jm c35811jm = this.A01;
        if (c35811jm == null || c35811jm.A00() != AsyncTask.Status.RUNNING) {
            ?? r2 = new C0HS() { // from class: X.1jm
                {
                    ProfileActivity.this = this;
                }

                @Override // X.C0HS
                public void A06() {
                    C002701i.A19(ProfileActivity.this, 104);
                }

                @Override // X.C0HS
                public Object A07(Object[] objArr) {
                    ProfileActivity profileActivity;
                    int i = 0;
                    while (true) {
                        profileActivity = ProfileActivity.this;
                        if (!((C0DS) profileActivity).A0L.A0m || i >= 45000) {
                            break;
                        }
                        i += 200;
                        SystemClock.sleep(200L);
                    }
                    if (i < 45000 || !((C0DS) profileActivity).A0L.A0m) {
                        return null;
                    }
                    ((C0DS) profileActivity).A0L.A09(3);
                    return null;
                }

                @Override // X.C0HS
                public void A09(Object obj) {
                    ProfileActivity profileActivity = ProfileActivity.this;
                    C002701i.A18(profileActivity, 104);
                    profileActivity.A1V();
                }
            };
            this.A01 = r2;
            this.A05.ARy(r2, new Void[0]);
        }
    }

    public final void A1V() {
        Cursor query;
        if (AFE()) {
            Log.w("sync profile activity already finishing, ignoring gotoActivity call");
        } else if (!this.A02.A03()) {
            if (!isFinishing()) {
                startActivityForResult(RequestPermissionActivity.A00(this, R.string.permission_contacts_access_request, R.string.permission_contacts_needed, true), 150);
            }
        } else {
            if (getIntent().getData() != null && (query = getContentResolver().query(getIntent().getData(), null, null, null, null)) != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndex("mimetype"));
                        UserJid nullable = UserJid.getNullable(query.getString(query.getColumnIndex("data1")));
                        if (nullable != null && A1W(nullable, string)) {
                            finish();
                            return;
                        }
                    }
                    query.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        try {
                            query.close();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
            StringBuilder A0P = C000200d.A0P("failed to go anywhere from sync profile activity; intent=");
            A0P.append(getIntent());
            Log.e(A0P.toString());
            finish();
        }
    }

    public boolean A1W(UserJid userJid, String str) {
        C06C A0A = ((C0DS) this).A04.A0A(userJid);
        if ("vnd.android.cursor.item/vnd.com.whatsapp.profile".equals(str)) {
            ((ActivityC02270An) this).A00.A07(this, Conversation.A00(this, A0A));
            return true;
        }
        return false;
    }

    @Override // X.C0DS, X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 150) {
            if (i2 == -1) {
                A1V();
            } else {
                Log.w("profileactivity/contact access denied");
                finish();
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.C0WP, X.C0DS, X.C0DT, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.A06.A04()) {
            Log.i("aborting due to native libraries missing");
            finish();
            return;
        }
        C02L c02l = this.A00;
        c02l.A05();
        if (c02l.A00 != null && this.A0Q.A02()) {
            C05E c05e = this.A03;
            c05e.A05();
            if (!c05e.A01) {
                if (A1U()) {
                    int A06 = ((C0DS) this).A0E.A06();
                    C000200d.A0q("profileactivity/create/backupfilesfound ", A06);
                    if (A06 > 0) {
                        C002701i.A19(this, 105);
                        return;
                    } else {
                        A1T(false);
                        return;
                    }
                }
                return;
            }
            A1P();
            return;
        }
        ((ActivityC02290Ap) this).A0A.A07(R.string.finish_registration_first, 1);
        finish();
    }
}
