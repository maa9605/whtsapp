package com.whatsapp.payments.ui;

import X.AbstractActivityC92444Kp;
import X.AnonymousClass031;
import X.AnonymousClass487;
import X.AnonymousClass489;
import X.C000200d;
import X.C001200o;
import X.C013606n;
import X.C014406v;
import X.C018508q;
import X.C02590Ca;
import X.C02F;
import X.C02L;
import X.C04P;
import X.C0E7;
import X.C0EU;
import X.C0GR;
import X.C0GS;
import X.C0HS;
import X.C0N5;
import X.C0VJ;
import X.C28Q;
import X.C28S;
import X.C2Lw;
import X.C36991lh;
import X.C37001li;
import X.C37051ln;
import X.C37061lo;
import X.C37311mD;
import X.C3NV;
import X.C463026g;
import X.C49682Lx;
import X.C49692Lz;
import X.C4AT;
import X.C4CV;
import X.C4CW;
import X.C4DX;
import X.C4DY;
import X.C4DZ;
import X.C4IA;
import X.C4LA;
import X.C894947f;
import X.C895147h;
import X.C90564Bm;
import X.C90944Da;
import X.C91754Gd;
import X.InterfaceC895047g;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public class IndiaUpiDeviceBindActivity extends C4LA implements AnonymousClass487 {
    public static InterfaceC895047g A0d = new InterfaceC895047g() { // from class: X.4DW
        @Override // X.InterfaceC895047g
        public void AKi() {
            Log.e(C014406v.A01("IndiaUpiDeviceBindActivity", "onGetChallengeFailure"));
        }

        @Override // X.InterfaceC895047g
        public void AKo(boolean z, C28Q c28q) {
            StringBuilder sb = new StringBuilder("onToken success: ");
            sb.append(z);
            sb.append(" error: ");
            sb.append(c28q);
            Log.i(C014406v.A01("IndiaUpiDeviceBindActivity", sb.toString()));
        }

        @Override // X.InterfaceC895047g
        public void ANj(boolean z) {
            StringBuilder sb = new StringBuilder("/onRegisterApp registered: ");
            sb.append(z);
            Log.i(C014406v.A01("IndiaUpiDeviceBindActivity", sb.toString()));
        }
    };
    public int A00;
    public PendingIntent A02;
    public Button A03;
    public TextView A04;
    public TextView A05;
    public AnonymousClass031 A06;
    public C018508q A07;
    public C02L A08;
    public C0E7 A09;
    public C001200o A0A;
    public C02F A0B;
    public C013606n A0C;
    public C4IA A0F;
    public C894947f A0G;
    public C90564Bm A0H;
    public C895147h A0I;
    public C28S A0J;
    public C3NV A0K;
    public C0EU A0L;
    public C463026g A0M;
    public C0GR A0N;
    public C0GS A0O;
    public AnonymousClass489 A0P;
    public C4CV A0Q;
    public C2Lw A0R;
    public C4CW A0S;
    public C4DX A0T;
    public C4DY A0U;
    public C4DZ A0V;
    public C4AT A0W;
    public C49682Lx A0X;
    public C49692Lz A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public int A01 = -1;
    public C37061lo A0D = new C37061lo();
    public C37311mD A0E = new C37311mD();
    public final C014406v A0c = C014406v.A00("IndiaUpiDeviceBindActivity", "onboarding", "IN");

    @Override // X.AbstractActivityC92444Kp, X.ActivityC02290Ap
    public void A10(int i) {
        if (i == R.string.payments_sms_permission_msg) {
            this.A0b = false;
            finish();
            return;
        }
        A1W();
        finish();
    }

    public final void A1a() {
        if (this.A0B.A02("android.permission.RECEIVE_SMS") == 0 || this.A0B.A02("android.permission.SEND_SMS") != 0) {
            return;
        }
        C0VJ.A0H(this, new String[]{"android.permission.RECEIVE_SMS"}, 100);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0010, code lost:
        if (r0.getSimState() != 5) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0HS, X.4DY] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1b() {
        /*
            r5 = this;
            X.02E r0 = r5.A0E
            android.telephony.TelephonyManager r0 = r0.A0G()
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L12
            int r2 = r0.getSimState()
            r0 = 5
            r1 = 1
            if (r2 == r0) goto L13
        L12:
            r1 = 0
        L13:
            boolean r0 = X.C0E7.A02(r5)
            if (r0 == 0) goto L20
            r0 = 2131888738(0x7f120a62, float:1.941212E38)
            r5.A1g(r0, r4)
            return
        L20:
            if (r1 != 0) goto L29
            r0 = 2131888740(0x7f120a64, float:1.9412124E38)
            r5.A1g(r0, r4)
            return
        L29:
            android.widget.TextView r1 = r5.A05
            r0 = 2131888733(0x7f120a5d, float:1.941211E38)
            java.lang.String r0 = r5.getString(r0)
            r1.setText(r0)
            r5.A1Y()
            X.4DY r2 = new X.4DY
            r2.<init>()
            r5.A0U = r2
            X.01k r1 = r5.A06
            java.lang.Void[] r0 = new java.lang.Void[r3]
            r1.ARy(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiDeviceBindActivity.A1b():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0HS, X.4DX] */
    public final void A1c() {
        C02F c02f = this.A0B;
        if ((c02f.A02("android.permission.SEND_SMS") == 0) && c02f.A08()) {
            A1a();
            ?? r2 = new C0HS() { // from class: X.4DX
                {
                    IndiaUpiDeviceBindActivity.this = this;
                }

                @Override // X.C0HS
                public Object A07(Object[] objArr) {
                    IndiaUpiDeviceBindActivity indiaUpiDeviceBindActivity;
                    List<SubscriptionInfo> list;
                    if (Build.VERSION.SDK_INT >= 22) {
                        IndiaUpiDeviceBindActivity indiaUpiDeviceBindActivity2 = IndiaUpiDeviceBindActivity.this;
                        indiaUpiDeviceBindActivity = indiaUpiDeviceBindActivity2;
                        if (indiaUpiDeviceBindActivity2.A0B.A02("android.permission.READ_PHONE_STATE") == 0) {
                            list = SubscriptionManager.from(indiaUpiDeviceBindActivity2).getActiveSubscriptionInfoList();
                            C014406v c014406v = indiaUpiDeviceBindActivity.A0c;
                            StringBuilder A0P = C000200d.A0P("educateAndSendDeviceBinding found sdk version: ");
                            A0P.append(Build.VERSION.SDK_INT);
                            A0P.append(" subscription info: ");
                            A0P.append(list);
                            c014406v.A07(null, A0P.toString(), null);
                            return list;
                        }
                    }
                    indiaUpiDeviceBindActivity = IndiaUpiDeviceBindActivity.this;
                    indiaUpiDeviceBindActivity.A0c.A07(null, "educateAndSendDeviceBinding read_phone_state permission not granted", null);
                    list = null;
                    C014406v c014406v2 = indiaUpiDeviceBindActivity.A0c;
                    StringBuilder A0P2 = C000200d.A0P("educateAndSendDeviceBinding found sdk version: ");
                    A0P2.append(Build.VERSION.SDK_INT);
                    A0P2.append(" subscription info: ");
                    A0P2.append(list);
                    c014406v2.A07(null, A0P2.toString(), null);
                    return list;
                }

                @Override // X.C0HS
                public void A09(Object obj) {
                    TextView textView;
                    String string;
                    TextView textView2;
                    View findViewById;
                    ImageView imageView;
                    FrameLayout frameLayout;
                    List list = (List) obj;
                    synchronized (this) {
                        IndiaUpiDeviceBindActivity.this.A0T = null;
                        char c = 0;
                        int size = list == null ? 0 : list.size();
                        C014406v c014406v = IndiaUpiDeviceBindActivity.this.A0c;
                        StringBuilder sb = new StringBuilder();
                        sb.append("num of sims detected: ");
                        sb.append(size);
                        c014406v.A07(null, sb.toString(), null);
                        int i = 1;
                        IndiaUpiDeviceBindActivity.this.A0G.A05 = Boolean.valueOf(size > 1);
                        if (list != null && list.size() != 1) {
                            if (Build.VERSION.SDK_INT >= 22) {
                                int i2 = 2;
                                if (list.size() == 2) {
                                    if (IndiaUpiDeviceBindActivity.this != null) {
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("airtel", Integer.valueOf((int) R.drawable.mob_airtel));
                                        hashMap.put("aircel", Integer.valueOf((int) R.drawable.mob_aircel));
                                        hashMap.put("bsnl", Integer.valueOf((int) R.drawable.mob_bsnl));
                                        hashMap.put("idea", Integer.valueOf((int) R.drawable.mob_idea));
                                        hashMap.put("jio", Integer.valueOf((int) R.drawable.mob_jio));
                                        hashMap.put("mtnl", Integer.valueOf((int) R.drawable.mob_mtnl));
                                        hashMap.put("nttdocomo", Integer.valueOf((int) R.drawable.mob_nttdocomo));
                                        hashMap.put("reliance", Integer.valueOf((int) R.drawable.mob_reliance));
                                        hashMap.put("telenor", Integer.valueOf((int) R.drawable.mob_telenor));
                                        hashMap.put("vodafone", Integer.valueOf((int) R.drawable.mob_vodafone));
                                        int i3 = 0;
                                        do {
                                            SubscriptionInfo subscriptionInfo = (SubscriptionInfo) list.get(i3);
                                            C02L c02l = IndiaUpiDeviceBindActivity.this.A08;
                                            c02l.A05();
                                            UserJid userJid = c02l.A03;
                                            String number = subscriptionInfo.getNumber();
                                            if (number != null && userJid != null) {
                                                if (C002701i.A0i(IndiaUpiDeviceBindActivity.this.A06, C002701i.A0s(userJid.user), number.replaceAll("\\D", "")).equalsIgnoreCase(userJid.user)) {
                                                    IndiaUpiDeviceBindActivity.this.A01 = subscriptionInfo.getSubscriptionId();
                                                    IndiaUpiDeviceBindActivity.this.A1b();
                                                    return;
                                                }
                                            }
                                            int simSlotIndex = subscriptionInfo.getSimSlotIndex();
                                            C014406v c014406v2 = IndiaUpiDeviceBindActivity.this.A0c;
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("educateAndSendDeviceBinding setting sim slot: ");
                                            sb2.append(simSlotIndex);
                                            sb2.append(": ");
                                            sb2.append(subscriptionInfo);
                                            c014406v2.A07(null, sb2.toString(), null);
                                            if (simSlotIndex == 0) {
                                                textView = (TextView) IndiaUpiDeviceBindActivity.this.findViewById(R.id.sim1_label);
                                                IndiaUpiDeviceBindActivity indiaUpiDeviceBindActivity = IndiaUpiDeviceBindActivity.this;
                                                Object[] objArr = new Object[i];
                                                objArr[c] = Integer.valueOf(i);
                                                string = indiaUpiDeviceBindActivity.getString(R.string.sim_1_with_placeholder, objArr);
                                                textView2 = (TextView) IndiaUpiDeviceBindActivity.this.findViewById(R.id.carrier_name_sim1);
                                                findViewById = IndiaUpiDeviceBindActivity.this.findViewById(R.id.sim_1_container);
                                                imageView = (ImageView) IndiaUpiDeviceBindActivity.this.findViewById(R.id.sim1_drawable);
                                                frameLayout = (FrameLayout) IndiaUpiDeviceBindActivity.this.findViewById(R.id.sim1_drawable_container);
                                            } else {
                                                if (simSlotIndex == i) {
                                                    textView = (TextView) IndiaUpiDeviceBindActivity.this.findViewById(R.id.sim2_label);
                                                    IndiaUpiDeviceBindActivity indiaUpiDeviceBindActivity2 = IndiaUpiDeviceBindActivity.this;
                                                    Object[] objArr2 = new Object[i];
                                                    objArr2[c] = Integer.valueOf(i2);
                                                    string = indiaUpiDeviceBindActivity2.getString(R.string.sim_2_with_placeholder, objArr2);
                                                    textView2 = (TextView) IndiaUpiDeviceBindActivity.this.findViewById(R.id.carrier_name_sim2);
                                                    findViewById = IndiaUpiDeviceBindActivity.this.findViewById(R.id.sim_2_container);
                                                    imageView = (ImageView) IndiaUpiDeviceBindActivity.this.findViewById(R.id.sim2_drawable);
                                                    frameLayout = (FrameLayout) IndiaUpiDeviceBindActivity.this.findViewById(R.id.sim2_drawable_container);
                                                }
                                                i3++;
                                                c = 0;
                                                i2 = 2;
                                                i = 1;
                                            }
                                            if (textView2 != null && findViewById != null) {
                                                textView.setText(string);
                                                textView2.setText(subscriptionInfo.getDisplayName());
                                                HashMap hashMap2 = hashMap;
                                                Iterator it = hashMap2.keySet().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        String str = (String) it.next();
                                                        C014406v c014406v3 = IndiaUpiDeviceBindActivity.this.A0c;
                                                        StringBuilder sb3 = new StringBuilder();
                                                        sb3.append("Searching drawable map for operator/carrier name ");
                                                        sb3.append(str);
                                                        sb3.append(" ");
                                                        sb3.append((Object) textView2.getText());
                                                        c014406v3.A07(null, sb3.toString(), null);
                                                        if (str.contains(textView2.getText().toString().toLowerCase(Locale.US))) {
                                                            Drawable background = frameLayout.getBackground();
                                                            background.setTint(C02160Ac.A00(IndiaUpiDeviceBindActivity.this, R.color.body_light_gray));
                                                            frameLayout.setBackground(background);
                                                            imageView.setImageDrawable(IndiaUpiDeviceBindActivity.this.getDrawable(((Integer) hashMap2.get(str)).intValue()));
                                                            C014406v c014406v4 = IndiaUpiDeviceBindActivity.this.A0c;
                                                            StringBuilder sb4 = new StringBuilder();
                                                            sb4.append("Found drawable for operator/carrier name ");
                                                            sb4.append(str);
                                                            sb4.append(" ");
                                                            sb4.append((Object) textView2.getText());
                                                            c014406v4.A07(null, sb4.toString(), null);
                                                            break;
                                                        }
                                                    } else {
                                                        frameLayout.setBackground(IndiaUpiDeviceBindActivity.this.getDrawable(R.drawable.ic_hero_sim));
                                                        break;
                                                    }
                                                }
                                                IndiaUpiDeviceBindActivity indiaUpiDeviceBindActivity3 = IndiaUpiDeviceBindActivity.this;
                                                int subscriptionId = subscriptionInfo.getSubscriptionId();
                                                if (indiaUpiDeviceBindActivity3 != null) {
                                                    findViewById.setOnClickListener(new C3PE(indiaUpiDeviceBindActivity3, subscriptionId, i3));
                                                } else {
                                                    throw null;
                                                }
                                            }
                                            i3++;
                                            c = 0;
                                            i2 = 2;
                                            i = 1;
                                        } while (i3 < 2);
                                        IndiaUpiDeviceBindActivity.this.A04.setVisibility(8);
                                        IndiaUpiDeviceBindActivity.this.A03.setVisibility(8);
                                        IndiaUpiDeviceBindActivity.this.findViewById(R.id.progress).setVisibility(8);
                                        TextView textView3 = (TextView) IndiaUpiDeviceBindActivity.this.findViewById(R.id.payments_sms_education_dual_sim);
                                        C02L c02l2 = IndiaUpiDeviceBindActivity.this.A08;
                                        c02l2.A05();
                                        C0K1 c0k1 = c02l2.A01;
                                        if (c0k1 != null) {
                                            String A00 = C04630Le.A00(c0k1);
                                            if (A00 != null) {
                                                textView3.setText(IndiaUpiDeviceBindActivity.this.getString(R.string.payments_sms_education_dual_sim, A00));
                                            }
                                            IndiaUpiDeviceBindActivity.this.findViewById(R.id.dual_sim_picker).setVisibility(0);
                                        } else {
                                            throw null;
                                        }
                                    } else {
                                        throw null;
                                    }
                                }
                            }
                        } else {
                            IndiaUpiDeviceBindActivity.this.A1b();
                        }
                    }
                }
            };
            this.A0T = r2;
            ((AbstractActivityC92444Kp) this).A06.ARy(r2, new Void[0]);
            return;
        }
        this.A0b = true;
        RequestPermissionActivity.A0E(this, this.A0B, 153);
    }

    public /* synthetic */ void A1d() {
        this.A05.setText(getString(R.string.payments_device_bind_verifying));
        this.A04.setText(getString(R.string.register_wait_message));
        this.A03.setVisibility(8);
        A1Y();
    }

    public final void A1e(int i) {
        int A00 = C90944Da.A00(i, this.A0K);
        C014406v c014406v = this.A0c;
        StringBuilder A0P = C000200d.A0P("onDeviceBinding failure. showErrorAndFinish: ");
        A0P.append(this.A0K.A00("upi-bind-device"));
        c014406v.A07(null, A0P.toString(), null);
        if (A00 != R.string.payments_bank_generic_error && A00 != R.string.no_internet_message) {
            A1g(A00, true);
        } else {
            A1g(A00, false);
        }
    }

    public /* synthetic */ void A1f(int i, int i2) {
        this.A01 = i;
        findViewById(R.id.dual_sim_picker).setVisibility(8);
        this.A04.setText(getString(R.string.register_wait_message));
        this.A04.setVisibility(0);
        A1b();
        C37051ln c37051ln = new C37051ln();
        c37051ln.A01 = this.A0R.A02;
        c37051ln.A00 = Long.valueOf(i2);
        ((AbstractActivityC92444Kp) this).A04.A07(c37051ln);
    }

    public final void A1g(int i, boolean z) {
        C014406v c014406v = this.A0c;
        StringBuilder sb = new StringBuilder("IndiaUpiDeviceBindActivity showErrorAndFinish: ");
        sb.append(i);
        c014406v.A07(null, sb.toString(), null);
        A1X();
        if (i == 0) {
            i = R.string.payments_setup_error;
            String str = this.A0K.A03;
            if ("upi-bind-device".equalsIgnoreCase(str)) {
                i = R.string.device_binding_failure_reasons_bullet_list_title;
            }
            if ("upi-get-accounts".equalsIgnoreCase(str)) {
                this.A00 = 1;
                i = R.string.get_accounts_failure_reason;
            }
        }
        if (z) {
            C3NV c3nv = this.A0K;
            if (c3nv != null) {
                c3nv.A01();
                StringBuilder A0P = C000200d.A0P("clearStates: ");
                A0P.append(this.A0K);
                c014406v.A07(null, A0P.toString(), null);
            }
            C894947f c894947f = this.A0G;
            if (c894947f != null) {
                c894947f.A04 = new C3NV();
                Intent intent = new Intent(this, IndiaUpiBankAccountLinkingRetryActivity.class);
                intent.putExtra("error", i);
                intent.putExtra("error_type", this.A00);
                int i2 = this.A00;
                if (i2 >= 1 && i2 <= 6) {
                    intent.putExtra("extra_bank_account", this.A0F);
                }
                if (!((AbstractActivityC92444Kp) this).A0G) {
                    intent.putExtra("try_again", 1);
                }
                intent.addFlags(335544320);
                A1Z(intent);
                A14(intent);
                finish();
                return;
            }
            throw null;
        }
        AUj(i);
    }

    public void A1h(C28Q c28q) {
        String A04;
        String A042;
        int i;
        this.A0Z = false;
        if (!TextUtils.isEmpty(this.A0H.A03())) {
            A04 = this.A0H.A03();
        } else {
            A04 = this.A0G.A04(this.A0F);
        }
        C4CV c4cv = this.A0Q;
        c4cv.A04(A04);
        C2Lw c2Lw = c4cv.A03;
        String str = c2Lw.A02;
        if (str == null) {
            str = c2Lw.A02();
        }
        C37001li c37001li = new C37001li();
        c37001li.A01 = c4cv.A00;
        c37001li.A0A = str;
        c37001li.A03 = Long.valueOf(c4cv.A03.A01());
        c37001li.A07 = this.A0F.A09;
        if (c28q != null) {
            c37001li.A08 = String.valueOf(c28q.A00);
            c37001li.A09 = c28q.A06;
        }
        AnonymousClass489 anonymousClass489 = this.A0P;
        int i2 = anonymousClass489.A00;
        int i3 = i2 - 1;
        if (i2 == 0) {
            i3 = 0;
        }
        c37001li.A04 = Long.valueOf(i3);
        c37001li.A05 = Long.valueOf(anonymousClass489.A00());
        c37001li.A06 = Long.valueOf(this.A0G.A02);
        String A07 = this.A0H.A07();
        if (A07 == null) {
            A07 = this.A0G.A03(this.A0F);
        }
        c37001li.A0B = A07;
        c37001li.A00 = this.A0G.A05;
        c37001li.A02 = Integer.valueOf(c28q != null ? 2 : 1);
        C014406v c014406v = this.A0c;
        StringBuilder A0P = C000200d.A0P("PaymentUserActionEvent devicebind event:");
        A0P.append(c37001li.toString());
        c014406v.A07(null, A0P.toString(), null);
        ((AbstractActivityC92444Kp) this).A04.A0B(c37001li, null, false);
        if (!TextUtils.isEmpty(this.A0H.A03())) {
            A042 = this.A0H.A03();
        } else {
            A042 = this.A0G.A04(this.A0F);
        }
        C4CW c4cw = this.A0S;
        c4cw.A04(A042);
        C37311mD A00 = c4cw.A00();
        C4IA c4ia = this.A0F;
        A00.A0I = c4ia.A09;
        if (c28q != null) {
            A00.A0M = String.valueOf(c28q.A00);
            A00.A0N = c28q.A06;
        }
        AnonymousClass489 anonymousClass4892 = this.A0P;
        int i4 = anonymousClass4892.A00;
        int i5 = i4 - 1;
        if (i4 == 0) {
            i5 = 0;
        }
        A00.A0E = Long.valueOf(i5);
        A00.A0F = Long.valueOf(anonymousClass4892.A00());
        C894947f c894947f = this.A0G;
        A00.A0G = Long.valueOf(c894947f.A02);
        A00.A0H = c894947f.A03(c4ia);
        A00.A03 = this.A0G.A05;
        A00.A07 = Integer.valueOf(c28q != null ? 2 : 1);
        A00.A0P = "device_binding";
        StringBuilder A0P2 = C000200d.A0P("PaymentUserActionEvent devicebind event:");
        A0P2.append(A00.toString());
        c014406v.A07(null, A0P2.toString(), null);
        ((AbstractActivityC92444Kp) this).A04.A0B(A00, null, false);
        StringBuilder A0P3 = C000200d.A0P("IndiaUpiDeviceBindActivity: onDeviceBinding: ");
        A0P3.append(c28q == null);
        c014406v.A07(null, A0P3.toString(), null);
        if (c28q != null && (i = c28q.A00) != 11453) {
            if (!C90944Da.A03(this, "upi-bind-device", i, true)) {
                int i6 = c28q.A00;
                if (i6 == 476) {
                    this.A0H.A0D(this.A0G.A04(this.A0F));
                    A1g(R.string.upi_twenty_four_hour_multiple_phone_number_device_bind_error, false);
                    return;
                } else if (i6 != 11452) {
                    if (i6 != 11477 && i6 != 11544) {
                        if (i6 == 11469) {
                            if (this.A0K.A07("upi-bind-device")) {
                                this.A0Z = true;
                                StringBuilder A0P4 = C000200d.A0P("onDeviceBinding failure. Retry delayedDeviceVerifIqHandlerMessage at error: ");
                                A0P4.append(this.A0K.A00("upi-bind-device"));
                                c014406v.A07(null, A0P4.toString(), null);
                                this.A04.setText(getString(R.string.register_wait_message));
                                this.A0P.A01();
                                return;
                            } else if (this.A0K.A00("upi-bind-device") < 3) {
                                return;
                            } else {
                                this.A0H.A0D(this.A0G.A04(this.A0F));
                                this.A00 = 4;
                                A1e(this.A0K.A00);
                                this.A0G.A07();
                                return;
                            }
                        } else if (i6 != 11470) {
                            StringBuilder A0P5 = C000200d.A0P("onDeviceBinding failure. showErrorAndFinish at error: ");
                            A0P5.append(this.A0K.A00("upi-bind-device"));
                            c014406v.A07(null, A0P5.toString(), null);
                            this.A00 = 2;
                            A1e(c28q.A00);
                            return;
                        }
                    }
                    this.A0H.A0D(this.A0G.A04(this.A0F));
                    this.A00 = 3;
                    A1e(c28q.A00);
                    return;
                } else {
                    this.A0H.A0D(this.A0G.A04(this.A0F));
                    this.A00 = 4;
                    A1e(c28q.A00);
                    return;
                }
            }
            return;
        }
        String A03 = this.A0H.A03();
        if (!this.A0K.A06.contains("upi-get-challenge") && this.A0H.A0K() == null) {
            this.A0K.A03("upi-get-challenge");
            C895147h c895147h = new C895147h(this, this.A07, this.A08, ((AbstractActivityC92444Kp) this).A06, this.A0X, this.A0L, this.A09, this.A0M, this.A0N, this.A0O, this.A0Q, this.A0J, this.A0H, getApplicationContext(), A0d, this.A0K);
            this.A0I = c895147h;
            c895147h.A00();
        }
        this.A05.setText(getString(R.string.payments_progress_getting_accounts));
        this.A03.setVisibility(8);
        A1Y();
        A1i(A03);
    }

    public final void A1i(String str) {
        String A04;
        C014406v c014406v = this.A0c;
        StringBuilder A0P = C000200d.A0P("getAccountsAfterDeviceBinding: bank picked and calling sendGetBankAccounts for: ");
        C4IA c4ia = this.A0F;
        A0P.append(((C0N5) c4ia).A05);
        A0P.append(" accountProvider:");
        c014406v.A07(null, C000200d.A0M(A0P, c4ia.A07, " psp: ", str), null);
        final AnonymousClass489 anonymousClass489 = this.A0P;
        C4IA c4ia2 = this.A0F;
        if (anonymousClass489 != null) {
            Log.i("PAY: sendGetBankAccounts called");
            C3NV c3nv = anonymousClass489.A0D;
            c3nv.A04("upi-get-accounts");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C04P("action", "upi-get-accounts", null, (byte) 0));
            arrayList.add(new C04P("device-id", anonymousClass489.A0G.A02(), null, (byte) 0));
            arrayList.add(new C04P("bank-ref-id", c4ia2.A07, null, (byte) 0));
            C90564Bm c90564Bm = anonymousClass489.A0B;
            if (!TextUtils.isEmpty(c90564Bm.A03())) {
                A04 = c90564Bm.A03();
            } else {
                A04 = anonymousClass489.A0A.A04(c4ia2);
            }
            if (!TextUtils.isEmpty(A04)) {
                arrayList.add(new C04P("code", c4ia2.A09, null, (byte) 0));
                C000200d.A1A("provider-type", A04, arrayList);
            }
            anonymousClass489.A0E.A0F("get", new C02590Ca("account", (C04P[]) arrayList.toArray(new C04P[0]), null, null), new C91754Gd(anonymousClass489.A08.A00, anonymousClass489.A06, anonymousClass489.A07, anonymousClass489.A0C, c3nv) { // from class: X.4IM
                @Override // X.C91754Gd, X.C28V
                public void A02(C28Q c28q) {
                    super.A02(c28q);
                    StringBuilder sb = new StringBuilder("PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onRequestError: ");
                    sb.append(c28q);
                    Log.i(sb.toString());
                    AnonymousClass487 anonymousClass487 = anonymousClass489.A02;
                    if (anonymousClass487 != null) {
                        ((IndiaUpiDeviceBindActivity) anonymousClass487).A1j(null, c28q);
                    }
                }

                @Override // X.C91754Gd, X.C28V
                public void A03(C28Q c28q) {
                    super.A03(c28q);
                    StringBuilder sb = new StringBuilder("PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onResponseError: ");
                    sb.append(c28q);
                    Log.i(sb.toString());
                    AnonymousClass487 anonymousClass487 = anonymousClass489.A02;
                    if (anonymousClass487 != null) {
                        ((IndiaUpiDeviceBindActivity) anonymousClass487).A1j(null, c28q);
                    }
                }

                @Override // X.C91754Gd, X.C28V
                public void A04(C02590Ca c02590Ca) {
                    C02590Ca[] c02590CaArr;
                    super.A04(c02590Ca);
                    AnonymousClass489 anonymousClass4892 = anonymousClass489;
                    if (anonymousClass4892.A02 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        C02590Ca A0D = c02590Ca.A0D("account");
                        if (A0D != null && (c02590CaArr = A0D.A03) != null) {
                            for (C02590Ca c02590Ca2 : c02590CaArr) {
                                if (c02590Ca2 != null && "upi".equals(c02590Ca2.A00)) {
                                    C4IA c4ia3 = new C4IA();
                                    c4ia3.A03(anonymousClass4892.A09, 3, c02590Ca2);
                                    arrayList2.add(c4ia3);
                                }
                            }
                        }
                        ((IndiaUpiDeviceBindActivity) anonymousClass4892.A02).A1j(arrayList2, null);
                    }
                }
            }, 0L);
            this.A0Q.A03.A04();
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00db, code lost:
        if (r11.size() <= 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x007e, code lost:
        if (r11.size() <= 0) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1j(java.util.ArrayList r11, X.C28Q r12) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiDeviceBindActivity.A1j(java.util.ArrayList, X.28Q):void");
    }

    public final void A1k(boolean z) {
        String A04;
        String A042;
        if (!TextUtils.isEmpty(this.A0H.A03())) {
            A04 = this.A0H.A03();
        } else {
            A04 = this.A0G.A04(this.A0F);
        }
        C4CV c4cv = this.A0Q;
        c4cv.A04(A04);
        C2Lw c2Lw = c4cv.A03;
        String str = c2Lw.A02;
        if (str == null) {
            str = c2Lw.A02();
        }
        C36991lh c36991lh = new C36991lh();
        c36991lh.A01 = c4cv.A00;
        c36991lh.A03 = str;
        c36991lh.A02 = this.A0F.A09;
        c36991lh.A00 = Boolean.valueOf(z);
        C014406v c014406v = this.A0c;
        StringBuilder A0P = C000200d.A0P("PaymentWamEvent smsSent event: ");
        A0P.append(c36991lh.toString());
        c014406v.A07(null, A0P.toString(), null);
        ((AbstractActivityC92444Kp) this).A04.A0B(c36991lh, null, false);
        if (!TextUtils.isEmpty(this.A0H.A03())) {
            A042 = this.A0H.A03();
        } else {
            A042 = this.A0G.A04(this.A0F);
        }
        C4CW c4cw = this.A0S;
        c4cw.A04(A042);
        C37311mD A00 = c4cw.A00();
        A00.A0I = this.A0F.A09;
        A00.A0P = "db_sms_sent";
        A00.A04 = Integer.valueOf(z ? 27 : 28);
        StringBuilder A0P2 = C000200d.A0P("PaymentUserActionEvent smsSent event: ");
        A0P2.append(A00.toString());
        c014406v.A07(null, A0P2.toString(), null);
        ((AbstractActivityC92444Kp) this).A04.A0B(A00, null, false);
    }

    public void lambda$onCreate$131$IndiaUpiDeviceBindActivity(View view) {
        this.A03.setVisibility(8);
        A1Y();
        A1c();
        C37061lo c37061lo = this.A0D;
        c37061lo.A01 = Boolean.TRUE;
        ((AbstractActivityC92444Kp) this).A04.A07(c37061lo);
        C37311mD c37311mD = this.A0E;
        c37311mD.A04 = 5;
        c37311mD.A05 = 1;
        ((AbstractActivityC92444Kp) this).A04.A07(c37311mD);
    }

    @Override // X.AbstractActivityC92444Kp, X.C4KG, X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 153) {
            if (i2 == -1) {
                A1c();
            } else {
                AUj(R.string.payments_sms_permission_msg);
            }
        } else if (i != 154) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            A1a();
            A1b();
        } else {
            AUj(R.string.payments_sms_permission_msg);
        }
    }

    @Override // X.AbstractActivityC92444Kp, X.ActivityC02290Ap, X.ActivityC02340Au, android.app.Activity
    public void onBackPressed() {
        C014406v c014406v = this.A0c;
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" onBackPressed");
        c014406v.A07(null, sb.toString(), null);
        ArrayList<? extends Parcelable> arrayList = this.A0G.A06;
        if (arrayList != null) {
            Intent intent = new Intent(this, IndiaUpiBankPickerActivity.class);
            intent.putParcelableArrayListExtra("extra_banks_list", arrayList);
            A1Z(intent);
            startActivity(intent);
        }
        finish();
        C37061lo c37061lo = this.A0D;
        c37061lo.A00 = Boolean.TRUE;
        ((AbstractActivityC92444Kp) this).A04.A0B(c37061lo, null, false);
        C37311mD c37311mD = this.A0E;
        c37311mD.A04 = 1;
        c37311mD.A05 = 1;
        ((AbstractActivityC92444Kp) this).A04.A07(c37311mD);
    }

    @Override // X.ActivityC02290Ap, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        findViewById(R.id.hero_sms).setVisibility(configuration.orientation == 2 ? 8 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
        if (r2.A0J(r3) == false) goto L27;
     */
    @Override // X.C4LA, X.AbstractActivityC92444Kp, X.AbstractActivityC92384Kc, X.C4KG, X.C4K0, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiDeviceBindActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.C4KG, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AnonymousClass489 anonymousClass489 = this.A0P;
        anonymousClass489.A02 = null;
        anonymousClass489.A03.removeCallbacksAndMessages(null);
        anonymousClass489.A01.quit();
        C4DZ c4dz = this.A0V;
        if (c4dz != null) {
            unregisterReceiver(c4dz);
            this.A0V = null;
        }
        PendingIntent pendingIntent = this.A02;
        if (pendingIntent != null) {
            pendingIntent.cancel();
            this.A02 = null;
        }
        C4DX c4dx = this.A0T;
        if (c4dx != null) {
            c4dx.A05(false);
        }
        C4DY c4dy = this.A0U;
        if (c4dy != null) {
            c4dy.A05(false);
        }
    }

    @Override // X.AbstractActivityC92444Kp, X.ActivityC02290Ap, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        C014406v c014406v = this.A0c;
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" action bar home");
        c014406v.A07(null, sb.toString(), null);
        ArrayList<? extends Parcelable> arrayList = this.A0G.A06;
        if (arrayList != null) {
            Intent intent = new Intent(this, IndiaUpiBankPickerActivity.class);
            intent.putParcelableArrayListExtra("extra_banks_list", arrayList);
            A1Z(intent);
            startActivity(intent);
        }
        finish();
        return true;
    }

    @Override // X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.A0a) {
            A1g(R.string.payments_error_sms_backgrounded, true);
        }
    }

    @Override // X.ActivityC02320As, X.ActivityC02330At, android.app.Activity
    public void onStop() {
        super.onStop();
        if (this.A0Z) {
            this.A0c.A07(null, "IndiaUpiDeviceBindActivity: device binding canceled", null);
            this.A0a = true;
            this.A0P.A02 = null;
            this.A0H.A0D(this.A0G.A04(this.A0F));
        }
    }
}
