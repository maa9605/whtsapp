package X;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1dR  reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32091dR implements C0AF, C0AG, C0AH, C19C {
    public final C0AD A00;
    public final C1CP A01;
    public final Executor A02;

    public C32091dR(Executor executor, C1CP c1cp, C0AD c0ad) {
        this.A02 = executor;
        this.A01 = c1cp;
        this.A00 = c0ad;
    }

    @Override // X.C0AF
    public final void AIG() {
        this.A00.A06();
    }

    @Override // X.C19C
    public final void AIm(final C0AC c0ac) {
        this.A02.execute(new Runnable() { // from class: X.19B
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C32091dR c32091dR = C32091dR.this;
                    C1CP c1cp = c32091dR.A01;
                    Object A04 = c0ac.A04();
                    FirebaseInstanceId firebaseInstanceId = c1cp.A00;
                    String str = c1cp.A01;
                    String str2 = c1cp.A02;
                    String str3 = (String) A04;
                    C02400Ba c02400Ba = FirebaseInstanceId.A08;
                    String A042 = firebaseInstanceId.A04.A04();
                    synchronized (c02400Ba) {
                        long currentTimeMillis = System.currentTimeMillis();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("token", str3);
                            jSONObject.put("appVersion", A042);
                            jSONObject.put("timestamp", currentTimeMillis);
                            String obj = jSONObject.toString();
                            if (obj != null) {
                                SharedPreferences.Editor edit = c02400Ba.A01.edit();
                                edit.putString(C02400Ba.A01(str, str2), obj);
                                edit.commit();
                            }
                        } catch (JSONException e) {
                            String valueOf = String.valueOf(e);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
                            sb.append("Failed to encode token: ");
                            sb.append(valueOf);
                            Log.w("FirebaseInstanceId", sb.toString());
                        }
                    }
                    C32941f5 c32941f5 = new C32941f5(str3);
                    C0AD c0ad = new C0AD();
                    c0ad.A09(c32941f5);
                    Executor executor = C0AI.A01;
                    c0ad.A02(executor, c32091dR);
                    c0ad.A01(executor, c32091dR);
                    c0ad.A00(executor, c32091dR);
                } catch (AnonymousClass193 e2) {
                    if (e2.getCause() instanceof Exception) {
                        C32091dR.this.A00.A08((Exception) e2.getCause());
                        return;
                    }
                    C32091dR.this.A00.A08(e2);
                } catch (CancellationException unused) {
                    C32091dR.this.A00.A06();
                } catch (Exception e3) {
                    C32091dR.this.A00.A08(e3);
                }
            }
        });
    }

    @Override // X.C0AG
    public final void AKE(Exception exc) {
        this.A00.A08(exc);
    }

    @Override // X.C0AH
    public final void APH(Object obj) {
        this.A00.A09(obj);
    }
}
