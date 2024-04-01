package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.bloks.ui.BloksDialogFragment;
import com.whatsapp.migration.android.view.GoogleMigrateImporterActivity;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.AbstractList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: X.4Ku */
/* loaded from: classes3.dex */
public abstract class C4Ku extends C4Kh implements InterfaceC04910Mk {
    public C02L A00;
    public C06870Vj A01;
    public C46Z A02;
    public C45X A03;
    public C04630Le A04;
    public C0E7 A05;
    public AnonymousClass012 A06;
    public C02F A07;
    public C0C9 A08;
    public C0EG A09;
    public C895347j A0A;
    public C0GZ A0B;
    public C28S A0C;
    public C03550Gd A0D;
    public C0EU A0E;
    public C463026g A0F;
    public C0GR A0G;
    public C47302Ar A0H;
    public C0DV A0I;
    public C895947p A0J;
    public C897648i A0K;
    public C899048w A0L;
    public C2Lw A0M;
    public C48z A0O;
    public AnonymousClass493 A0P;
    public AnonymousClass498 A0Q;
    public AnonymousClass499 A0R;
    public C49682Lx A0S;
    public C2OR A0T;
    public C49692Lz A0U;
    public C40071rX A0V;
    public InterfaceC002901k A0W;
    public C014406v A0N = C014406v.A00("PayBloksActivity", "bloks", "COMMON");
    public boolean A0X = false;

    @Override // X.InterfaceC04910Mk
    public void AOi(int i, int i2) {
    }

    public static void A01(Map map, int i, C45T c45t) {
        if (map == null) {
            map = new HashMap();
        }
        map.put("error_code", String.valueOf(i));
        c45t.A03("on_failure", map);
    }

    @Override // X.C47V
    public InterfaceC021309t A1P() {
        return new InterfaceC021309t(super.A1P()) { // from class: X.46f
            public final InterfaceC021309t A00;

            {
                this.A00 = r1;
            }

            /* JADX WARN: Code restructure failed: missing block: B:85:0x001f, code lost:
                if (r2.equals("wa.action.CheckCpfCnpj") == false) goto L69;
             */
            /* JADX WARN: Code restructure failed: missing block: B:96:0x0051, code lost:
                if (r2.equals("wa.action.CheckCardNumber") == false) goto L69;
             */
            /* JADX WARN: Code restructure failed: missing block: B:99:0x005b, code lost:
                if (r2.equals("wa.action.CheckPin") == false) goto L69;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC021309t
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public X.InterfaceC020509l A7h(X.C33971gl r12, X.C021109r r13, X.C021209s r14) {
                /*
                    Method dump skipped, instructions count: 283
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C892346f.A7h(X.1gl, X.09r, X.09s):X.09l");
            }
        };
    }

    public final void A1R() {
        if (!(!super.A0M)) {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                String string = extras.getString("screen_name");
                AbstractC02800Cx A0N = A0N();
                ((C47V) this).A09 = A8Y(string, (HashMap) extras.getSerializable("screen_params"));
                if (A0N.A03() == 0) {
                    C02820Cz c02820Cz = new C02820Cz(A0N);
                    c02820Cz.A01(R.id.bloks_fragment_container, ((C47V) this).A09, null);
                    c02820Cz.A03(string);
                    c02820Cz.A05();
                    return;
                }
                A1Q();
                return;
            }
            throw null;
        }
        this.A0X = true;
    }

    public void A1S(C45T c45t) {
        C897648i c897648i = this.A0K;
        C4E0 c4e0 = new C4E0(this, c45t);
        c897648i.A00 = "PENDING";
        C48J c48j = new C48J(c897648i.A03.A00, c897648i.A01, c897648i.A06, c897648i.A02, c897648i.A05, c897648i.A04);
        final C4CS c4cs = new C4CS(c897648i, c4e0);
        c48j.A04.A0F("get", new C02590Ca("account", new C04P[]{new C04P("action", "get-account-eligibility-state", null, (byte) 0)}, null, null), new C28V(c48j.A00, c48j.A01, c48j.A02, c48j.A03) { // from class: X.4Gj
            @Override // X.C28V
            public void A02(C28Q c28q) {
                c4cs.A00(c28q);
            }

            @Override // X.C28V
            public void A03(C28Q c28q) {
                c4cs.A00(c28q);
            }

            /* JADX WARN: Code restructure failed: missing block: B:45:0x0040, code lost:
                if (r3.equals("COMPLETED") != false) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x0049, code lost:
                if (r3.equals("PENDING") != false) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x0052, code lost:
                if (r3.equals("NEEDS_MORE_INFO") != false) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x005b, code lost:
                if (r3.equals("UNSUPPORTED") != false) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x005d, code lost:
                r4.A00 = r3;
                r1 = r5.A01;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x0061, code lost:
                if (r1 == null) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x0063, code lost:
                r2 = new java.util.HashMap();
                r2.put("compliance_status", r3);
                r1.A00.A03("on_success", r2);
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x0074, code lost:
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x0075, code lost:
                throw null;
             */
            @Override // X.C28V
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void A04(X.C02590Ca r8) {
                /*
                    r7 = this;
                    if (r8 == 0) goto L76
                    r0 = 0
                    X.0Ca r1 = r8.A0C(r0)
                    if (r1 == 0) goto L76
                    java.lang.String r0 = "account-eligibility-state"
                    X.04P r0 = r1.A0A(r0)
                    r2 = 0
                    if (r0 == 0) goto L76
                    java.lang.String r3 = r0.A03
                    if (r3 == 0) goto L76
                    X.4CS r5 = r5
                    X.48i r4 = r5.A00
                    X.06v r1 = r4.A07
                    java.lang.String r6 = "getComplianceStatus onStatus: "
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>(r6)
                    r0.append(r3)
                    java.lang.String r0 = r0.toString()
                    r1.A07(r2, r0, r2)
                    int r0 = r3.hashCode()
                    switch(r0) {
                        case -2093369835: goto L55;
                        case -1753873386: goto L4c;
                        case 35394935: goto L43;
                        case 1383663147: goto L3a;
                        default: goto L34;
                    }
                L34:
                    java.lang.String r0 = "Compliance state unknown"
                    r1.A07(r2, r0, r2)
                    return
                L3a:
                    java.lang.String r0 = "COMPLETED"
                    boolean r0 = r3.equals(r0)
                    if (r0 == 0) goto L34
                    goto L5d
                L43:
                    java.lang.String r0 = "PENDING"
                    boolean r0 = r3.equals(r0)
                    if (r0 == 0) goto L34
                    goto L5d
                L4c:
                    java.lang.String r0 = "NEEDS_MORE_INFO"
                    boolean r0 = r3.equals(r0)
                    if (r0 == 0) goto L34
                    goto L5d
                L55:
                    java.lang.String r0 = "UNSUPPORTED"
                    boolean r0 = r3.equals(r0)
                    if (r0 == 0) goto L34
                L5d:
                    r4.A00 = r3
                    X.4E0 r1 = r5.A01
                    if (r1 == 0) goto L75
                    java.util.HashMap r2 = new java.util.HashMap
                    r2.<init>()
                    java.lang.String r0 = "compliance_status"
                    r2.put(r0, r3)
                    X.45T r1 = r1.A00
                    java.lang.String r0 = "on_success"
                    r1.A03(r0, r2)
                    return
                L75:
                    throw r2
                L76:
                    X.4CS r1 = r5
                    X.28Q r0 = new X.28Q
                    r0.<init>()
                    r1.A00(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C91814Gj.A04(X.0Ca):void");
            }
        }, 0L);
    }

    public void A1T(C45T c45t, C28Q c28q) {
        if (c28q != null) {
            HashMap hashMap = new HashMap();
            int i = c28q.A00;
            if (i == 1440) {
                hashMap.put("remaining_retries", String.valueOf(c28q.A01));
                c45t.A03("pin_incorrect", hashMap);
                return;
            } else if (i == 1441) {
                hashMap.put("next_retry_ts", String.valueOf(c28q.A02));
                c45t.A03("pin_rate_limited", hashMap);
                return;
            } else {
                A01(hashMap, i, c45t);
                return;
            }
        }
        c45t.A00("on_success");
    }

    public /* synthetic */ void A1U(C45T c45t, C28Q c28q) {
        if (c28q == null) {
            c45t.A00("on_success");
        } else {
            A01(null, c28q.A00, c45t);
        }
    }

    public /* synthetic */ void A1V(C45T c45t, C28Q c28q) {
        if (c28q == null) {
            c45t.A00("on_success");
        } else {
            A01(null, c28q.A00, c45t);
        }
    }

    public /* synthetic */ void A1W(C45T c45t, C28Q c28q) {
        if (c28q == null) {
            c45t.A00("on_success");
        } else {
            A01(null, c28q.A00, c45t);
        }
    }

    @Override // X.C46I
    public void A64() {
        RequestPermissionActivity.A0N(this, this.A07, 30);
    }

    @Override // X.C46I
    public BloksDialogFragment A8Y(String str, HashMap hashMap) {
        BloksDialogFragment bloksDialogFragment = new BloksDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("screen_name", str);
        bundle.putSerializable("screen_params", hashMap);
        bundle.putBoolean("hot_reload", false);
        bloksDialogFragment.A0P(bundle);
        return bloksDialogFragment;
    }

    @Override // X.C46I
    public long AA7() {
        return this.A0M.A01();
    }

    @Override // X.C46I
    public String AA8() {
        C2Lw c2Lw = this.A0M;
        String str = c2Lw.A02;
        if (str == null) {
            return c2Lw.A02();
        }
        return str;
    }

    @Override // X.C46I
    public boolean AEB(int i) {
        if (i == 404 || i == 440 || i == 449) {
            C014406v c014406v = this.A0N;
            StringBuilder sb = new StringBuilder("handleError/error=");
            sb.append(i);
            c014406v.A07(null, sb.toString(), null);
            this.A0H.A02(true, false);
            C019208x c019208x = new C019208x(this);
            c019208x.A02(R.string.payments_generic_error);
            c019208x.A01.A0J = false;
            c019208x.A06(R.string.ok, new DialogInterface.OnClickListener() { // from class: X.3QT
                {
                    C4Ku.this = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    C4Ku.this.finish();
                }
            });
            c019208x.A01();
            return true;
        }
        return false;
    }

    @Override // X.C46I
    public void AQj(String str, Map map, final C45T c45t) {
        C0We c0We;
        BloksDialogFragment bloksDialogFragment;
        Boolean bool;
        if (TextUtils.isEmpty(str)) {
            c45t.A00("");
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2131583866:
                if (str.equals("change_pin")) {
                    c = 3;
                    break;
                }
                break;
            case -1828362259:
                if (str.equals("get_compliance_status")) {
                    c = 4;
                    break;
                }
                break;
            case -1432382994:
                if (str.equals("get_oldest_credential")) {
                    c = 7;
                    break;
                }
                break;
            case -1371677349:
                if (str.equals("remove_completed_step")) {
                    c = 15;
                    break;
                }
                break;
            case -1032682289:
                if (str.equals("verify_pin")) {
                    c = 2;
                    break;
                }
                break;
            case -457979232:
                if (str.equals("set_action_bar_title")) {
                    c = '\n';
                    break;
                }
                break;
            case -214858504:
                if (str.equals("compliance_name_check")) {
                    c = 5;
                    break;
                }
                break;
            case 20864489:
                if (str.equals("reinitialize_payments")) {
                    c = '\r';
                    break;
                }
                break;
            case 205988285:
                if (str.equals("set_completed_step")) {
                    c = '\t';
                    break;
                }
                break;
            case 254954716:
                if (str.equals("compliance_dob_check")) {
                    c = 6;
                    break;
                }
                break;
            case 761629426:
                if (str.equals("remove_credential")) {
                    c = '\b';
                    break;
                }
                break;
            case 927713295:
                if (str.equals("forward_to_payment_screen")) {
                    c = '\f';
                    break;
                }
                break;
            case 1032047561:
                if (str.equals("get_methods")) {
                    c = 14;
                    break;
                }
                break;
            case 1369547730:
                if (str.equals("create_pin")) {
                    c = 0;
                    break;
                }
                break;
            case 1853333482:
                if (str.equals("set_sandbox")) {
                    c = 11;
                    break;
                }
                break;
            case 1877943783:
                if (str.equals("set_navigation_icon")) {
                    c = 16;
                    break;
                }
                break;
            case 1985308587:
                if (str.equals("set_bio")) {
                    c = 1;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                final AnonymousClass498 anonymousClass498 = this.A0Q;
                Object obj = map.get("provider");
                if (obj != null) {
                    String str2 = (String) obj;
                    Object obj2 = map.get("pin");
                    if (obj2 != null) {
                        final String str3 = (String) obj2;
                        final AnonymousClass496 anonymousClass496 = new AnonymousClass496() { // from class: X.3jV
                            {
                                C4Ku.this = this;
                            }

                            @Override // X.AnonymousClass496
                            public final void AO5(C28Q c28q) {
                                C4Ku.this.A1U(c45t, c28q);
                            }
                        };
                        anonymousClass498.A01(str2, new AnonymousClass495() { // from class: X.3iM
                            @Override // X.AnonymousClass495
                            public final void AO7(C49A c49a) {
                                anonymousClass498.A02(str3, anonymousClass496, c49a);
                            }
                        }, anonymousClass496);
                        return;
                    }
                    throw null;
                }
                throw null;
            case 1:
                AnonymousClass498 anonymousClass4982 = this.A0Q;
                Object obj3 = map.get("provider");
                if (obj3 != null) {
                    String str4 = (String) obj3;
                    Object obj4 = map.get("pin");
                    if (obj4 != null) {
                        AnonymousClass496 anonymousClass4962 = new AnonymousClass496() { // from class: X.3jU
                            {
                                C4Ku.this = this;
                            }

                            @Override // X.AnonymousClass496
                            public final void AO5(C28Q c28q) {
                                C4Ku.this.A1V(c45t, c28q);
                            }
                        };
                        anonymousClass4982.A01(str4, new C77513iK(anonymousClass4982, (String) obj4, anonymousClass4962), anonymousClass4962);
                        return;
                    }
                    throw null;
                }
                throw null;
            case 2:
                final AnonymousClass498 anonymousClass4983 = this.A0Q;
                Object obj5 = map.get("provider");
                if (obj5 != null) {
                    String str5 = (String) obj5;
                    Object obj6 = map.get("pin");
                    if (obj6 != null) {
                        final String str6 = (String) obj6;
                        final AnonymousClass496 anonymousClass4963 = new AnonymousClass496() { // from class: X.3jW
                            {
                                C4Ku.this = this;
                            }

                            @Override // X.AnonymousClass496
                            public final void AO5(C28Q c28q) {
                                C4Ku.this.A1T(c45t, c28q);
                            }
                        };
                        anonymousClass4983.A01(str5, new AnonymousClass495() { // from class: X.3iG
                            @Override // X.AnonymousClass495
                            public final void AO7(C49A c49a) {
                                anonymousClass4983.A05(str6, anonymousClass4963, c49a);
                            }
                        }, anonymousClass4963);
                        return;
                    }
                    throw null;
                }
                throw null;
            case 3:
                final AnonymousClass498 anonymousClass4984 = this.A0Q;
                Object obj7 = map.get("provider");
                if (obj7 != null) {
                    String str7 = (String) obj7;
                    Object obj8 = map.get("old_pin");
                    if (obj8 != null) {
                        final String str8 = (String) obj8;
                        Object obj9 = map.get("new_pin");
                        if (obj9 != null) {
                            final String str9 = (String) obj9;
                            final AnonymousClass496 anonymousClass4964 = new AnonymousClass496() { // from class: X.3jX
                                {
                                    C4Ku.this = this;
                                }

                                @Override // X.AnonymousClass496
                                public final void AO5(C28Q c28q) {
                                    C4Ku.this.A1W(c45t, c28q);
                                }
                            };
                            anonymousClass4984.A01(str7, new AnonymousClass495() { // from class: X.3iL
                                @Override // X.AnonymousClass495
                                public final void AO7(C49A c49a) {
                                    anonymousClass4984.A07(str8, str9, anonymousClass4964, c49a);
                                }
                            }, anonymousClass4964);
                            return;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            case 4:
                A1S(c45t);
                return;
            case 5:
                CharSequence charSequence = (CharSequence) map.get("full_name");
                C000700j.A03(charSequence);
                String str10 = (String) charSequence;
                String str11 = (String) map.get("compliance_reason");
                C000700j.A03(str11);
                C897648i c897648i = this.A0K;
                C91154Dv c91154Dv = new C91154Dv(c45t);
                if (c897648i.A00.equals("UNSUPPORTED")) {
                    c91154Dv.A00.A00("on_success");
                    return;
                }
                C48J c48j = new C48J(c897648i.A03.A00, c897648i.A01, c897648i.A06, c897648i.A02, c897648i.A05, c897648i.A04);
                final C4CT c4ct = new C4CT(c897648i, c91154Dv, this);
                C000700j.A03(str10);
                c48j.A04.A0F("get", new C02590Ca("account", new C04P[]{new C04P("action", "check-account-eligibility", null, (byte) 0), new C04P("action-type", str11, null, (byte) 0)}, new C02590Ca("name", new C04P[]{new C04P("full", str10, null, (byte) 0)}, null, null)), new C28V(c48j.A00, c48j.A01, c48j.A02, c48j.A03) { // from class: X.4Gk
                    @Override // X.C28V
                    public void A02(C28Q c28q) {
                        c4ct.A00(c28q);
                    }

                    @Override // X.C28V
                    public void A03(C28Q c28q) {
                        if (c28q.A00 == 10756) {
                            c4ct.A01(false);
                        } else {
                            c4ct.A00(c28q);
                        }
                    }

                    @Override // X.C28V
                    public void A04(C02590Ca c02590Ca) {
                        c4ct.A01(true);
                    }
                }, 0L);
                return;
            case 6:
                Object obj10 = map.get("dob");
                if (obj10 != null) {
                    int[] A0S = C45Q.A0S((String) obj10);
                    int i = A0S[0];
                    int i2 = A0S[1];
                    int i3 = A0S[2];
                    CharSequence charSequence2 = (CharSequence) map.get("compliance_reason");
                    C000700j.A03(charSequence2);
                    String str12 = (String) charSequence2;
                    C897648i c897648i2 = this.A0K;
                    C91164Dw c91164Dw = new C91164Dw(c45t);
                    if (c897648i2.A00.equals("UNSUPPORTED")) {
                        c91164Dw.A00.A00("on_success");
                        return;
                    }
                    final C48J c48j2 = new C48J(c897648i2.A03.A00, c897648i2.A01, c897648i2.A06, c897648i2.A02, c897648i2.A05, c897648i2.A04);
                    final C4CU c4cu = new C4CU(c897648i2, c91164Dw, this);
                    c48j2.A04.A0F("get", new C02590Ca("account", new C04P[]{new C04P("action", "check-account-eligibility", null, (byte) 0), new C04P("action-type", str12, null, (byte) 0)}, c48j2.A05.A01(i3, i2, i)), new C28V(c48j2.A00, c48j2.A01, c48j2.A02, c48j2.A03) { // from class: X.4Gl
                        @Override // X.C28V
                        public void A02(C28Q c28q) {
                            c4cu.A00(c28q);
                        }

                        @Override // X.C28V
                        public void A03(C28Q c28q) {
                            C014406v c014406v = c48j2.A06;
                            StringBuilder sb = new StringBuilder("performDobComplianceCheck onResponseError: ");
                            sb.append(c28q);
                            c014406v.A04(sb.toString());
                            c4cu.A00(c28q);
                        }

                        @Override // X.C28V
                        public void A04(C02590Ca c02590Ca) {
                            C4CU c4cu2 = c4cu;
                            C014406v c014406v = c4cu2.A01.A07;
                            StringBuilder sb = new StringBuilder("performDobComplianceCheck onDobCheckComplete, eligible: ");
                            sb.append(true);
                            c014406v.A07(null, sb.toString(), null);
                            c4cu2.A02.A00.A00("on_success");
                        }
                    }, 0L);
                    return;
                }
                throw null;
            case 7:
                this.A0W.ARy(new C0HS(this.A0I, c45t) { // from class: X.4E2
                    public final C45T A00;
                    public final C0DV A01;

                    {
                        this.A01 = r1;
                        this.A00 = c45t;
                    }

                    @Override // X.C0HS
                    public Object A07(Object[] objArr) {
                        C0DV c0dv = this.A01;
                        c0dv.A04();
                        List A0B = c0dv.A08.A0B();
                        AbstractList abstractList = (AbstractList) A0B;
                        if (abstractList.size() > 0) {
                            Collections.sort(A0B, new Comparator() { // from class: X.3QS
                                {
                                    C4E2.this = this;
                                }

                                @Override // java.util.Comparator
                                public final int compare(Object obj11, Object obj12) {
                                    C0N2 c0n2 = (C0N2) obj12;
                                    C0N8 c0n8 = (C0N8) ((C0N2) obj11).A06;
                                    long j = Long.MAX_VALUE;
                                    if (c0n8 != null) {
                                        long j2 = c0n8.A06;
                                        if (j2 >= 0) {
                                            j = j2;
                                        }
                                    }
                                    C0N8 c0n82 = (C0N8) c0n2.A06;
                                    long j3 = Long.MAX_VALUE;
                                    if (c0n82 != null) {
                                        long j4 = c0n82.A06;
                                        if (j4 >= 0) {
                                            j3 = j4;
                                        }
                                    }
                                    return (j > j3 ? 1 : (j == j3 ? 0 : -1));
                                }
                            });
                            C0N2 c0n2 = (C0N2) abstractList.get(0);
                            C0N0 c0n0 = c0n2.A06;
                            if (c0n0 == null || ((C0N8) c0n0).A06 < 0) {
                                return null;
                            }
                            return new C0FK(Integer.valueOf(abstractList.size()), c0n2);
                        }
                        return null;
                    }

                    @Override // X.C0HS
                    public void A09(Object obj11) {
                        String str13;
                        C0FK c0fk = (C0FK) obj11;
                        if (c0fk != null) {
                            Object obj12 = c0fk.A01;
                            if (obj12 != null) {
                                C0N2 c0n2 = (C0N2) obj12;
                                HashMap hashMap = new HashMap();
                                hashMap.put("credential_id", c0n2.A07);
                                hashMap.put("last4", c0n2.A0A);
                                StringBuilder sb = new StringBuilder("");
                                sb.append(c0fk.A00);
                                hashMap.put("remaining_cards", sb.toString());
                                C0N8 c0n8 = (C0N8) c0n2.A06;
                                if (c0n8 != null) {
                                    StringBuilder A0P = C000200d.A0P("");
                                    A0P.append(c0n8.A04);
                                    str13 = A0P.toString();
                                } else {
                                    str13 = "-1";
                                }
                                hashMap.put("remaining_retries", str13);
                                this.A00.A03("on_success", hashMap);
                                return;
                            }
                            throw null;
                        }
                        this.A00.A00("on_failure");
                    }
                }, new Void[0]);
                return;
            case '\b':
                InterfaceC03640Gm interfaceC03640Gm = new InterfaceC03640Gm() { // from class: X.4Dx
                    {
                        C4Ku.this = this;
                    }

                    @Override // X.InterfaceC03640Gm
                    public void ANw(C28Q c28q) {
                        C4Ku.A01(null, c28q.A00, c45t);
                    }

                    @Override // X.InterfaceC03640Gm
                    public void AO1(C28Q c28q) {
                        C4Ku.A01(null, c28q.A00, c45t);
                    }

                    @Override // X.InterfaceC03640Gm
                    public void AO2(C468228k c468228k) {
                        c45t.A00("on_success");
                    }
                };
                if (AnonymousClass024.A01((String) map.get("remaining_cards"), 0) <= 1) {
                    new C48I(this, ((ActivityC02290Ap) this).A0A, this.A0W, this.A0S, this.A0I, this.A08, this.A0E, this.A05, this.A0F, this.A0H, this.A0C).A00(interfaceC03640Gm);
                    return;
                } else {
                    this.A0F.A0D((String) map.get("credential_id"), interfaceC03640Gm, null, null);
                    return;
                }
            case '\t':
                String str13 = (String) map.get("completed_step");
                if ("1".equals(map.get("is_merchant"))) {
                    C03550Gd c03550Gd = this.A0D;
                    c03550Gd.A05(c03550Gd.A01(str13));
                    return;
                }
                C0GZ c0gz = this.A0B;
                c0gz.A05(c0gz.A01(str13));
                return;
            case '\n':
                C0U1 A0c = A0c();
                if (A0c == null || (bloksDialogFragment = ((C47V) this).A09) == null || (bool = bloksDialogFragment.A06) == null || bool.booleanValue()) {
                    return;
                }
                A0c.A0H((CharSequence) map.get("action_bar_title"));
                return;
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                C000200d.A0l(this.A0E, "payments_sandbox", "1".equals(map.get("is_sandbox")));
                return;
            case '\f':
                Intent intent = new Intent(getApplicationContext(), this.A0I.A03().AD3());
                Intent intent2 = getIntent();
                intent.putExtra("extra_conversation_message_type", intent2.getIntExtra("extra_conversation_message_type", 0));
                intent.putExtra("extra_jid", intent2.getStringExtra("extra_jid"));
                intent.putExtra("extra_receiver_jid", intent2.getStringExtra("extra_receiver_jid"));
                intent.putExtra("extra_quoted_msg_row_id", intent2.getLongExtra("extra_quoted_msg_row_id", 0L));
                intent.putExtra("extra_payment_preset_amount", intent2.getStringExtra("extra_payment_preset_amount"));
                intent.putExtra("extra_transaction_id", intent2.getStringExtra("extra_transaction_id"));
                intent.putExtra("extra_payment_preset_min_amount", intent2.getStringExtra("extra_payment_preset_min_amount"));
                intent.putExtra("extra_request_message_key", intent2.getStringExtra("extra_request_message_key"));
                intent.putExtra("extra_is_pay_money_only", intent2.getBooleanExtra("extra_is_pay_money_only", true));
                intent.putExtra("extra_payment_note", intent2.getStringExtra("extra_payment_note"));
                intent.putStringArrayListExtra("extra_mentioned_jids", intent2.getStringArrayListExtra("extra_mentioned_jids"));
                intent.putExtra("extra_inviter_jid", intent2.getStringExtra("extra_inviter_jid"));
                A14(intent);
                finish();
                return;
            case '\r':
                this.A0H.A02("1".equals(map.get("remove_tos")), false);
                return;
            case 14:
                this.A0F.A05(2, new InterfaceC03640Gm() { // from class: X.4Dy
                    {
                        C4Ku.this = this;
                    }

                    @Override // X.InterfaceC03640Gm
                    public void ANw(C28Q c28q) {
                        C4Ku.A01(null, c28q.A00, c45t);
                    }

                    @Override // X.InterfaceC03640Gm
                    public void AO1(C28Q c28q) {
                        C4Ku.A01(null, c28q.A00, c45t);
                    }

                    @Override // X.InterfaceC03640Gm
                    public void AO2(C468228k c468228k) {
                        c45t.A00("on_success");
                    }
                });
                return;
            case 15:
                String str14 = (String) map.get("completed_step");
                if ("1".equals(map.get("is_merchant"))) {
                    C03550Gd c03550Gd2 = this.A0D;
                    c03550Gd2.A04(c03550Gd2.A01(str14));
                    return;
                }
                C0GZ c0gz2 = this.A0B;
                c0gz2.A04(c0gz2.A01(str14));
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                boolean equals = "close".equals(map.get("navigation_icon"));
                C002301c c002301c = ((ActivityC02310Ar) this).A01;
                if (equals) {
                    c0We = new C0We(c002301c, C02160Ac.A03(this, R.drawable.ic_close));
                } else {
                    c0We = new C0We(c002301c, C02160Ac.A03(this, R.drawable.ic_back_teal));
                }
                c0We.setColorFilter(getResources().getColor(R.color.dark_gray), PorterDuff.Mode.SRC_ATOP);
                ((Toolbar) findViewById(R.id.toolbar)).setNavigationIcon(c0We);
                return;
            default:
                return;
        }
    }

    @Override // X.C46I
    public String AQk(Map map, String str) {
        BloksDialogFragment bloksDialogFragment;
        Boolean bool;
        int length;
        String str2 = (String) map.remove("case");
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        char c = 65535;
        boolean z = false;
        switch (str2.hashCode()) {
            case -2090067461:
                if (str2.equals("hide_toolbar_title_and_logo")) {
                    c = 19;
                    break;
                }
                break;
            case -1486928264:
                if (str2.equals("enable_secure_flag")) {
                    c = 17;
                    break;
                }
                break;
            case -1344002586:
                if (str2.equals("get_phone_last_n_digits")) {
                    c = 16;
                    break;
                }
                break;
            case -1145142119:
                if (str2.equals("exp_date_check")) {
                    c = 1;
                    break;
                }
                break;
            case -1060255204:
                if (str2.equals("get_tos_uri")) {
                    c = 3;
                    break;
                }
                break;
            case -1003060006:
                if (str2.equals("get_faq_uri")) {
                    c = '\f';
                    break;
                }
                break;
            case -975395056:
                if (str2.equals("regex_check")) {
                    c = 0;
                    break;
                }
                break;
            case -919584206:
                if (str2.equals("get_button_info")) {
                    c = 5;
                    break;
                }
                break;
            case -848949171:
                if (str2.equals("is_step_completed")) {
                    c = '\r';
                    break;
                }
                break;
            case -840371252:
                if (str2.equals("show_action_bar_icon")) {
                    c = 21;
                    break;
                }
                break;
            case -594428356:
                if (str2.equals("can_set_bio")) {
                    c = 2;
                    break;
                }
                break;
            case -314691285:
                if (str2.equals("get_screen_density_bucket")) {
                    c = 18;
                    break;
                }
                break;
            case 1809539:
                if (str2.equals("current_server_time")) {
                    c = 11;
                    break;
                }
                break;
            case 329749850:
                if (str2.equals("get_formatted_date")) {
                    c = '\b';
                    break;
                }
                break;
            case 425265908:
                if (str2.equals("string_upper")) {
                    c = '\t';
                    break;
                }
                break;
            case 540049915:
                if (str2.equals("get_device_id")) {
                    c = '\n';
                    break;
                }
                break;
            case 580608584:
                if (str2.equals("get_card_network")) {
                    c = 6;
                    break;
                }
                break;
            case 674867313:
                if (str2.equals("get_error_string")) {
                    c = 4;
                    break;
                }
                break;
            case 1518694893:
                if (str2.equals("is_debug_build")) {
                    c = 20;
                    break;
                }
                break;
            case 1785060649:
                if (str2.equals("get_pin_retry_ts")) {
                    c = 7;
                    break;
                }
                break;
            case 1976375430:
                if (str2.equals("string_replace")) {
                    c = 15;
                    break;
                }
                break;
            case 1999013019:
                if (str2.equals("get_merchant_fees")) {
                    c = 14;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                String str3 = (String) map.get("regex");
                if (str3 != null) {
                    try {
                        return !Pattern.compile(str3, 2).matcher(str).find() ? "on_failure" : "on_success";
                    } catch (PatternSyntaxException unused) {
                        return "on_exception";
                    }
                }
                throw null;
            case 1:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/yy", Locale.US);
                Calendar calendar = Calendar.getInstance();
                calendar.set(calendar.get(1), calendar.get(2), 0, 23, 59, 59);
                try {
                    Date parse = simpleDateFormat.parse(str);
                    if (parse != null) {
                        if (!parse.before(calendar.getTime())) {
                            z = true;
                        }
                    }
                } catch (ParseException unused2) {
                }
                return z ? "on_success" : "on_failure";
            case 2:
                return (!this.A0P.A05() || this.A0P.A01() == 1) ? "0" : "1";
            case 3:
                return this.A01.A00(str).toString();
            case 4:
                String str4 = (String) map.get(str);
                return TextUtils.isEmpty(str4) ? (String) map.get("100") : str4;
            case 5:
                String str5 = (String) map.get(str);
                return !TextUtils.isEmpty(str5) ? str5 : "";
            case 6:
                String replaceAll = str.replaceAll("\\s", "");
                for (Map.Entry entry : map.entrySet()) {
                    if (Pattern.compile((String) entry.getValue()).matcher(replaceAll).find()) {
                        return (String) entry.getKey();
                    }
                }
                return "";
            case 7:
                return String.valueOf(this.A0R.A01());
            case '\b':
                Object obj = map.get("date");
                if (obj != null) {
                    Date A07 = C45Q.A07((String) obj);
                    return A07 != null ? DateFormat.getDateInstance(1).format(A07) : "";
                }
                throw null;
            case '\t':
                return str.toUpperCase(((ActivityC02310Ar) this).A01.A0I());
            case '\n':
                return this.A0S.A02();
            case GoogleMigrateImporterActivity.A0E /* 11 */:
                return String.valueOf(this.A06.A05());
            case '\f':
                String str6 = (String) map.get("platform");
                if (TextUtils.isEmpty(str6)) {
                    str6 = "payments";
                }
                return this.A0V.A03(str6, (String) map.get("article_id"), null).toString();
            case '\r':
                String str7 = (String) map.get("completed_step");
                boolean equals = "1".equals(map.get("is_merchant"));
                AbstractC03520Ga abstractC03520Ga = this.A0B;
                if (equals) {
                    abstractC03520Ga = this.A0D;
                }
                return abstractC03520Ga.A0B(str7) ? "1" : "0";
            case 14:
                this.A0G.A01();
                C895347j c895347j = this.A0A;
                if (c895347j == null) {
                    c895347j = new C895347j();
                    this.A0A = c895347j;
                }
                C01B c01b = ((ActivityC02290Ap) this).A0B;
                if (c895347j != null) {
                    if (c01b != null) {
                        throw new UnsupportedOperationException();
                    }
                    throw null;
                }
                throw null;
            case 15:
                if (str != null) {
                    String str8 = (String) map.get("string_to_replace");
                    String str9 = (String) map.get("string_replacement");
                    return (TextUtils.isEmpty(str8) || str9 == null) ? str : str.replaceAll(str8, str9);
                }
                return null;
            case GlVideoRenderer.CAP_RENDER_I420 /* 16 */:
                String str10 = (String) map.get("num_of_digits");
                if (!TextUtils.isEmpty(str10)) {
                    try {
                        int parseInt = Integer.parseInt(str10);
                        C02L c02l = this.A00;
                        C04630Le c04630Le = this.A04;
                        c02l.A05();
                        C0K1 c0k1 = c02l.A01;
                        if (c04630Le != null) {
                            String A01 = C04630Le.A01((AbstractC005302j) c0k1.A03(AbstractC005302j.class));
                            return (TextUtils.isEmpty(A01) || (length = A01.length()) <= parseInt) ? A01 : A01.substring(length - parseInt);
                        }
                        throw null;
                    } catch (NumberFormatException e) {
                        this.A0N.A08("performDataProcessingAction: REQUESTED_CASE_GET_PHONE_LAST_N_DIGITS: illegal num_of_digits", e);
                    }
                }
                return str;
            case 17:
                getWindow().setFlags(8192, 8192);
                return "";
            case 18:
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                return displayMetrics.densityDpi <= 240 ? "hdpi_or_smaller" : "larger_than_hdpi";
            case 19:
                Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
                if (toolbar != null) {
                    toolbar.setLogo((Drawable) null);
                    toolbar.setTitle((CharSequence) null);
                }
                return null;
            case C0M6.A01 /* 20 */:
                return "0";
            case 21:
                C0U1 A0c = A0c();
                if (A0c != null && (bloksDialogFragment = ((C47V) this).A09) != null && (bool = bloksDialogFragment.A06) != null && !bool.booleanValue()) {
                    A0c.A0C(null);
                }
                return null;
            default:
                return "";
        }
    }

    @Override // X.C46I
    public void ARj() {
        this.A0M.A03();
    }

    @Override // X.C46I
    public void AUz() {
        this.A0M.A04();
    }

    @Override // X.ActivityC02330At, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 30) {
            if (i2 == -1) {
                A1Q();
            } else {
                finish();
            }
        }
    }

    @Override // X.C4Kh, X.C47V, X.C47U, X.ActivityC02270An, X.AbstractActivityC02280Ao, X.ActivityC02290Ap, X.AbstractActivityC02300Aq, X.ActivityC02310Ar, X.ActivityC02320As, X.ActivityC02330At, X.ActivityC02340Au, X.ActivityC02350Av, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setSoftInputMode(16);
    }

    @Override // X.C47V, X.ActivityC02270An, X.ActivityC02290Ap, X.ActivityC02330At, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.A0X) {
            A1R();
            this.A0X = false;
        }
    }
}
